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

import com.baidu.palo.catalog.Function;
import com.baidu.palo.catalog.FunctionSet;
import com.baidu.palo.catalog.ScalarFunction;
import com.baidu.palo.catalog.Type;
import com.baidu.palo.common.AnalysisException;
import com.baidu.palo.thrift.TExprNode;
import com.baidu.palo.thrift.TExprNodeType;
import com.baidu.palo.thrift.TExprOpcode;
import com.baidu.palo.thrift.TLikePredicate;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class LikePredicate extends Predicate {

    enum Operator {
        LIKE("LIKE"),
        REGEXP("REGEXP");

        private final String description;

        Operator(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public static void initBuiltins(FunctionSet functionSet) {
        functionSet.addBuiltin(ScalarFunction.createBuiltin(
                Operator.LIKE.name(), Lists.<Type>newArrayList(Type.VARCHAR, Type.VARCHAR),
                false, Type.BOOLEAN,
                "_ZN4palo13LikePredicate4likeEPN8palo_udf15FunctionContextERKNS1_9StringValES6_",
                "_ZN4palo13LikePredicate12like_prepareEPN8palo_udf15FunctionContextENS2_18FunctionStateScopeE",
                "_ZN4palo13LikePredicate10like_closeEPN8palo_udf15FunctionContextENS2_18FunctionStateScopeE", true));
        functionSet.addBuiltin(ScalarFunction.createBuiltin(
                Operator.REGEXP.name(), Lists.<Type>newArrayList(Type.VARCHAR, Type.VARCHAR),
                false, Type.BOOLEAN,
                "_ZN4palo13LikePredicate5regexEPN8palo_udf15FunctionContextERKNS1_9StringValES6_",
                "_ZN4palo13LikePredicate13regex_prepareEPN8palo_udf15FunctionContextENS2_18FunctionStateScopeE",
                "_ZN4palo13LikePredicate11regex_closeEPN8palo_udf15FunctionContextENS2_18FunctionStateScopeE", true));
    }

    private final Operator op;

    public LikePredicate(Operator op, Expr e1, Expr e2) {
        super();
        this.op = op;
        Preconditions.checkNotNull(e1);
        children.add(e1);
        Preconditions.checkNotNull(e2);
        children.add(e2);
        // TODO: improve with histograms?
        selectivity = 0.1;
    }

    protected LikePredicate(LikePredicate other) {
        super(other);
        op = other.op;
    }

    @Override
    public Expr clone() {
        return new LikePredicate(this);
    }

    public Operator getOp() {
        return this.op;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return ((LikePredicate) obj).op == op;
    }

    @Override
    public String toSql() {
        return getChild(0).toSql() + " " + op.toString() + " " + getChild(1).toSql();
    }

    @Override
    protected void toThrift(TExprNode msg) {
        msg.node_type = TExprNodeType.FUNCTION_CALL;
    }

    @Override
    public void analyzeImpl(Analyzer analyzer) throws AnalysisException {
        super.analyzeImpl(analyzer);
        if (!getChild(0).getType().isStringType() && !getChild(0).getType().isNull()) {
            throw new AnalysisException(
              "left operand of " + op.toString() + " must be of type STRING: " + toSql());
        }
        if (!getChild(1).getType().isStringType() && !getChild(1).getType().isNull()) {
            throw new AnalysisException(
              "right operand of " + op.toString() + " must be of type STRING: " + toSql());
        }

        fn = getBuiltinFunction(analyzer, op.toString(),
                collectChildReturnTypes(), Function.CompareMode.IS_NONSTRICT_SUPERTYPE_OF);
        if (!getChild(1).getType().isNull() && getChild(1).isLiteral() && (op == Operator.REGEXP)) {
            // let's make sure the pattern works
            // TODO: this checks that it's a Java-supported regex, but the syntax supported
            // by the backend is Posix; add a call to the backend to check the re syntax
            try {
                Pattern.compile(((StringLiteral) getChild(1)).getValue());
            } catch (PatternSyntaxException e) {
                throw new AnalysisException("Invalid regular expression in '" + this.toSql() + "'");
            }
        }
    }
}
