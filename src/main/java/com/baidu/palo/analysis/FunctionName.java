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

import com.baidu.palo.common.AnalysisException;
import com.baidu.palo.common.io.Text;
import com.baidu.palo.common.io.Writable;
import com.baidu.palo.load.PullLoadSourceInfo;
import com.baidu.palo.thrift.TFunctionName;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Class to represent a function name. Function names are specified as
 * db.function_name.
 */
public class FunctionName implements Writable {
    private static final Logger LOG = LogManager.getLogger(FunctionName.class);

    private String db_;
    private String fn_;

    private FunctionName() {
    }

    public FunctionName(String db, String fn) {
        db_ = db;
        fn_ = fn.toLowerCase();
        if (db_ != null) {
            db_ = db_.toLowerCase();
        }
    }

    public FunctionName(String fn) {
        db_ = null;
        fn_ = fn.toLowerCase();
    }

    public FunctionName(TFunctionName thriftName) {
        db_ = thriftName.db_name.toLowerCase();
        fn_ = thriftName.function_name.toLowerCase();
    }

    // Same as FunctionName but for builtins and we'll leave the case
    // as is since we aren't matching by string.
    public static FunctionName CreateBuiltinName(String fn) {
        FunctionName name = new FunctionName(fn);
        name.fn_ = fn;
        return name;
    }

    public static FunctionName fromThrift(TFunctionName fnName) {
        return new FunctionName(fnName.getDb_name(), fnName.getFunction_name());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof FunctionName)) {
            return false;
        }
        FunctionName o = (FunctionName) obj;
        if ((db_ == null || o.db_ == null) && (db_ != o.db_)) {
            if (db_ == null && o.db_ != null) {
                return false;
            }
            if (db_ != null && o.db_ == null) {
                return false;
            }
            if (!db_.equalsIgnoreCase(o.db_)) {
                return false;
            }
        }
        return fn_.equalsIgnoreCase(o.fn_);
    }

    public String getDb() {
        return db_;
    }

    public void setDb(String db) {
        db_ = db;
    }

    public String getFunction() {
        return fn_;
    }

    public boolean isFullyQualified() {
        return db_ != null;
    }

    @Override
    public String toString() {
        if (db_ == null) {
            return fn_;
        }
        return db_ + "." + fn_;
    }

    public void analyze(Analyzer analyzer) throws AnalysisException {
        if (fn_.length() == 0) {
            throw new AnalysisException("Function name can not be empty.");
        }
        for (int i = 0; i < fn_.length(); ++i) {
            if (!isValidCharacter(fn_.charAt(i))) {
                throw new AnalysisException(
                  "Function names must be all alphanumeric or underscore. " +
                    "Invalid name: " + fn_);
            }
        }
        if (Character.isDigit(fn_.charAt(0))) {
            throw new AnalysisException("Function cannot start with a digit: " + fn_);
        }

        // If the function name is not fully qualified, it must not be the same as a builtin
//        if (!isFullyQualified() && OpcodeRegistry.instance().getFunctionOperator(
//          getFunction()) != FunctionOperator.INVALID_OPERATOR) {
//            throw new AnalysisException(
//              "Function cannot have the same name as a builtin: " + getFunction());
//        }
    }

    private boolean isValidCharacter(char c) {
        return Character.isLetterOrDigit(c) || c == '_';
    }

    public TFunctionName toThrift() {
        TFunctionName name = new TFunctionName(fn_);
        name.setDb_name(db_);
        name.setFunction_name(fn_);
        return name;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        if (db_ != null) {
            out.writeBoolean(true);
            Text.writeString(out, db_);
        } else {
            out.writeBoolean(false);
        }
        Text.writeString(out, fn_);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        if (in.readBoolean()) {
            db_ = Text.readString(in);
        }
        fn_ = Text.readString(in);
    }

    public static FunctionName read(DataInput in) throws IOException{
        FunctionName functionName = new FunctionName();
        functionName.readFields(in);
        return functionName;
    }
}
