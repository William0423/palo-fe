// Modifications copyright (C) 2017, Baidu.com, Inc.
// Copyright 2017 The Apache Software Foundation

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.baidu.palo.analysis;

import com.baidu.palo.catalog.Column;
import com.baidu.palo.catalog.ColumnType;
import com.baidu.palo.catalog.Table;
import com.baidu.palo.common.AnalysisException;
import com.baidu.palo.common.DdlException;
import com.baidu.palo.common.ErrorCode;
import com.baidu.palo.common.ErrorReport;
import com.baidu.palo.common.InternalException;

import java.util.List;

/**
 * Represents a CREATE TABLE AS SELECT (CTAS) statement
 *  Syntax:
 *      CREATE TABLE table_name [( column_name_list )]
 *          opt_engine opt_partition opt_properties KW_AS query_stmt
 */
public class CreateTableAsSelectStmt extends StatementBase {
    private final CreateTableStmt createTableStmt;
    private final List<String> columnNames;
    private final QueryStmt queryStmt;
    private final InsertStmt insertStmt;

    public CreateTableAsSelectStmt(CreateTableStmt createTableStmt,
                                   List<String> columnNames,
                                   QueryStmt queryStmt) {
        this.createTableStmt = createTableStmt;
        this.columnNames = columnNames;
        this.queryStmt = queryStmt;
        this.insertStmt = new InsertStmt(createTableStmt.getDbTbl(), queryStmt);
    }

    @Override
    public void analyze(Analyzer analyzer) throws InternalException, AnalysisException {
        // first: we analyze queryStmt before create table.
        // To avoid duplicate registrations of table/colRefs,
        // create a new root analyzer and clone the query statement for this initial pass.
        Analyzer dummyRootAnalyzer = new Analyzer(analyzer.getCatalog(), analyzer.getContext());
        QueryStmt tmpStmt = queryStmt.clone();
        tmpStmt.analyze(dummyRootAnalyzer);

        // TODO(zc): support char, varchar and decimal
        for (Expr expr : tmpStmt.getResultExprs()) {
            if (expr.getType().isDecimal() || expr.getType().isStringType()) {
                ErrorReport.reportAnalysisException(ErrorCode.ERR_UNSUPPORTED_TYPE_IN_CTAS, expr.getType());
            }
        }

        // Check columnNames
        if (columnNames != null) {
            if (columnNames.size() != tmpStmt.getColLabels().size()) {
                ErrorReport.report(ErrorCode.ERR_COL_NUMBER_NOT_MATCH);
            }
            for (int i = 0; i < columnNames.size(); ++i) {
                createTableStmt
                        .addColumn(
                        new Column(
                                columnNames.get(i),
                                ColumnType.createType(tmpStmt.getResultExprs().get(i).getType().getPrimitiveType())));
            }
        } else {
            for (int i = 0; i < tmpStmt.getColLabels().size(); ++i) {
                createTableStmt
                        .addColumn(
                        new Column(
                                tmpStmt.getColLabels().get(i),
                                ColumnType.createType(tmpStmt.getResultExprs().get(i).getType().getPrimitiveType())));
            }
        }

        // Analyze create table statement
        createTableStmt.analyze(analyzer);

        // Analyze insert
        Table newTable = null;
        insertStmt.setTargetTable(newTable);
        insertStmt.analyze(analyzer);
    }

    public void createTable(Analyzer analyzer) throws AnalysisException {
        // TODO(zc): Support create table later.
        // Create table
        try {
            analyzer.getCatalog().createTable(createTableStmt);
        } catch (DdlException e) {
            throw new AnalysisException(e.getMessage());
        }
    }

    public InsertStmt getInsertStmt() {
        return insertStmt;
    }

    @Override
    public RedirectStatus getRedirectStatus() {
        return RedirectStatus.FORWARD_WITH_SYNC;
    }
}
