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

package com.baidu.palo.persist;

import com.baidu.palo.catalog.Catalog;
import com.baidu.palo.catalog.Database.DbState;
import com.baidu.palo.common.FeMetaVersion;
import com.baidu.palo.common.io.Text;
import com.baidu.palo.common.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class DatabaseInfo implements Writable {

    private String dbName;
    private String newDbName;
    private long quota;
    private String clusterName;
    private DbState dbState;

    public DatabaseInfo() {
        // for persist
        this.dbName = "";
        this.newDbName = "";
        this.quota = 0;
        this.clusterName = "";
        this.dbState = DbState.NORMAL;
    }

    public DatabaseInfo(String dbName, String newDbName, long quota) {
        this.dbName = dbName;
        this.newDbName = newDbName;
        this.quota = quota;
        this.clusterName = "";
        this.dbState = DbState.NORMAL;
    }

    public String getDbName() {
        return dbName;
    }

    public String getNewDbName() {
        return newDbName;
    }

    public long getQuota() {
        return quota;
    }

    public static DatabaseInfo read(DataInput in) throws IOException {
        DatabaseInfo dbInfo = new DatabaseInfo();
        dbInfo.readFields(in);
        return dbInfo;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        Text.writeString(out, dbName);
        Text.writeString(out, newDbName);
        out.writeLong(quota);
        Text.writeString(out, this.clusterName);
        Text.writeString(out, this.dbState.name());
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.dbName = Text.readString(in);
        if (Catalog.getCurrentCatalogJournalVersion() >= FeMetaVersion.VERSION_10) {
            newDbName = Text.readString(in);
        }
        this.quota = in.readLong();
        if (Catalog.getCurrentCatalogJournalVersion() >= FeMetaVersion.VERSION_30) {
            this.clusterName = Text.readString(in);
            this.dbState = DbState.valueOf(Text.readString(in));
        }
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public DbState getDbState() {
        return dbState;
    }

    public void setDbState(DbState dbState) {
        this.dbState = dbState;
    }

}
