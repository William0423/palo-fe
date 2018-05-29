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

package com.baidu.palo.common.proc;

import com.baidu.palo.common.AnalysisException;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class IncompleteTabletsProcNode implements ProcNodeInterface {
    public static final ImmutableList<String> TITLE_NAMES = new ImmutableList.Builder<String>()
            .add("IncompleteTablets").add("InconsistentTablets")
            .build();

    private static final Joiner JOINER = Joiner.on(",");

    Collection<Long> incompleteTabletIds;
    Collection<Long> inconsistentTabletIds;

    public IncompleteTabletsProcNode(Collection<Long> incompleteTabletIds, Collection<Long> inconsistentTabletIds) {
        this.incompleteTabletIds = incompleteTabletIds;
        this.inconsistentTabletIds = inconsistentTabletIds;
    }

    @Override
    public ProcResult fetchResult() throws AnalysisException {
        BaseProcResult result = new BaseProcResult();

        result.setNames(TITLE_NAMES);

        List<String> row = new ArrayList<String>(1);

        String incompleteTablets = JOINER.join(Arrays.asList(incompleteTabletIds));
        String inconsistentTablets = JOINER.join(Arrays.asList(inconsistentTabletIds));
        row.add(incompleteTablets);
        row.add(inconsistentTablets);

        result.addRow(row);

        return result;
    }

}
