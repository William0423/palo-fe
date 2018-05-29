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
import com.baidu.palo.catalog.PrimitiveType;
import com.baidu.palo.common.AnalysisException;

import com.google.common.collect.Lists;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class AddColumnsClauseTest {
    private static Analyzer analyzer;

    @BeforeClass
    public static void setUp() {
        analyzer = AccessTestUtil.fetchAdminAnalyzer(false);
    }

    @Test
    public void testNormal() throws AnalysisException {
        List<Column> columns = Lists.newArrayList();
        Column definition = new Column("col1", ColumnType.createType(PrimitiveType.INT),
                                       true, null, "0", "");
        columns.add(definition);
        definition = new Column("col2", ColumnType.createType(PrimitiveType.INT), true, null, "0", "");
        columns.add(definition);
        AddColumnsClause clause = new AddColumnsClause(columns, null, null);
        clause.analyze(analyzer);
        Assert.assertEquals("ADD COLUMN (`col1` int(11) NOT NULL DEFAULT \"0\" COMMENT \"\", "
                + "`col2` int(11) NOT NULL DEFAULT \"0\" COMMENT \"\")", clause.toString());

        clause = new AddColumnsClause(columns, "", null);
        clause.analyze(analyzer);
        Assert.assertEquals("ADD COLUMN (`col1` int(11) NOT NULL DEFAULT \"0\" COMMENT \"\", "
                + "`col2` int(11) NOT NULL DEFAULT \"0\" COMMENT \"\")",
                            clause.toString());
        Assert.assertNull(clause.getRollupName());

        clause = new AddColumnsClause(columns, "testTable", null);
        clause.analyze(analyzer);

        Assert.assertEquals("ADD COLUMN (`col1` int(11) NOT NULL DEFAULT \"0\" COMMENT \"\", "
                + "`col2` int(11) NOT NULL DEFAULT \"0\" COMMENT \"\") IN `testTable`",
                clause.toString());
        Assert.assertNull(clause.getProperties());
        Assert.assertEquals("testTable", clause.getRollupName());
        Assert.assertEquals(columns, clause.getColumns());
    }

    @Test(expected = AnalysisException.class)
    public void testNoDefault() throws AnalysisException {
        List<Column> columns = Lists.newArrayList();
        Column definition = new Column("col1", ColumnType.createType(PrimitiveType.INT));
        columns.add(definition);
        definition = new Column("col2", ColumnType.createType(PrimitiveType.INT));
        columns.add(definition);
        AddColumnsClause clause = new AddColumnsClause(columns, null, null);

        clause.analyze(analyzer);
        Assert.fail("No exception throws.");
    }

    @Test(expected = AnalysisException.class)
    public void testNoColumn() throws AnalysisException {
        AddColumnsClause clause = new AddColumnsClause(null, null, null);

        clause.analyze(analyzer);
        Assert.fail("No exception throws.");
    }
}
