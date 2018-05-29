// Copyright (c) 2017, Baidu.com, Inc. All Rights Reserved

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.baidu.palo.http.rest;

import com.baidu.palo.catalog.Catalog;
import com.baidu.palo.catalog.Database;
import com.baidu.palo.catalog.MaterializedIndex;
import com.baidu.palo.catalog.OlapTable;
import com.baidu.palo.catalog.Partition;
import com.baidu.palo.catalog.Replica;
import com.baidu.palo.catalog.Table;
import com.baidu.palo.catalog.Table.TableType;
import com.baidu.palo.catalog.Tablet;
import com.baidu.palo.common.DdlException;
import com.baidu.palo.common.util.ListComparator;
import com.baidu.palo.http.ActionController;
import com.baidu.palo.http.BaseRequest;
import com.baidu.palo.http.BaseResponse;
import com.baidu.palo.http.IllegalArgException;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import io.netty.handler.codec.http.HttpMethod;

import java.util.Collections;
import java.util.List;

/*
 * used to get table's sorted tablet info
 * eg:
 *  fe_host:http_port/api/_migration?db=xxx&tbl=yyy
 */
public class MigrationAction extends RestBaseAction {
    private static final Logger LOG = LogManager.getLogger(MigrationAction.class);
    private static final String DB_PARAM = "db";
    private static final String TABLE_PARAM = "tbl";

    public MigrationAction(ActionController controller) {
        super(controller);
    }

    public static void registerAction(ActionController controller) throws IllegalArgException {
        MigrationAction action = new MigrationAction(controller);
        controller.registerHandler(HttpMethod.GET, "/api/_migration", action);
    }

    @Override
    public void execute(BaseRequest request, BaseResponse response) throws DdlException {
        checkAdmin(request);

        String dbName = request.getSingleParameter(DB_PARAM);
        String tableName = request.getSingleParameter(TABLE_PARAM);

        if (Strings.isNullOrEmpty(dbName)) {
            throw new DdlException("Missing params. Need database name");
        }

        Database db = Catalog.getInstance().getDb(dbName);
        if (db == null) {
            throw new DdlException("Database[" + dbName + "] does not exist");
        }

        List<List<Comparable>> rows = Lists.newArrayList();
        db.readLock();
        try {
            if (!Strings.isNullOrEmpty(tableName)) {
                Table table = db.getTable(tableName);
                if (table == null) {
                    throw new DdlException("Table[" + tableName + "] does not exist");
                }

                if (table.getType() != TableType.OLAP) {
                    throw new DdlException("Table[" + tableName + "] is not OlapTable");
                }

                OlapTable olapTable = (OlapTable) table;

                for (Partition partition : olapTable.getPartitions()) {
                    String partitionName = partition.getName();
                    MaterializedIndex baseIndex = partition.getBaseIndex();
                    for (Tablet tablet : baseIndex.getTablets()) {
                        List<Comparable> row = Lists.newArrayList();
                        row.add(tableName);
                        row.add(partitionName);
                        row.add(tablet.getId());
                        row.add(olapTable.getSchemaHashByIndexId(baseIndex.getId()));
                        for (Replica replica : tablet.getReplicas()) {
                            row.add(replica.getBackendId());
                            break;
                        }
                        rows.add(row);
                    }
                }
            } else {
                // get all olap table
                for (Table table : db.getTables()) {
                    if (table.getType() != TableType.OLAP) {
                        continue;
                    }

                    OlapTable olapTable = (OlapTable) table;
                    tableName = table.getName();

                    for (Partition partition : olapTable.getPartitions()) {
                        String partitionName = partition.getName();
                        MaterializedIndex baseIndex = partition.getBaseIndex();
                        for (Tablet tablet : baseIndex.getTablets()) {
                            List<Comparable> row = Lists.newArrayList();
                            row.add(tableName);
                            row.add(partitionName);
                            row.add(tablet.getId());
                            row.add(olapTable.getSchemaHashByIndexId(baseIndex.getId()));
                            for (Replica replica : tablet.getReplicas()) {
                                row.add(replica.getBackendId());
                                break;
                            }
                            rows.add(row);
                        }
                    }
                }
            }

        } finally {
            db.readUnlock();
        }

        ListComparator<List<Comparable>> comparator = new ListComparator<List<Comparable>>(0, 1, 2);
        Collections.sort(rows, comparator);

        // to json response
        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            result = mapper.writeValueAsString(rows);
        } catch (Exception e) {
            //  do nothing
        }

        // send result
        response.setContentType("application/json");
        response.getContent().append(result);
        sendResult(request, response);
    }

    public static void print(String msg) {
        System.out.println(System.currentTimeMillis() + " " + msg);
    }
}
