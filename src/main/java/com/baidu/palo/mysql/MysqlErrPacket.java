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

package com.baidu.palo.mysql;

import com.baidu.palo.common.ErrorCode;
import com.baidu.palo.qe.QueryState;

// MySQL protocol error packet
public class MysqlErrPacket extends MysqlPacket {
    private static final int ERROR_PACKET_INDICATOR = 0XFF;
    // only first FIVE char is useful in SQL STATE
    private byte[] sqlState = {'H', 'Y', '0', '0', '0'};
    // TODO(zhaochun): Now 1064
    private int errorCode = 1064;
    private String errorMessage;

    // new one packet from
    public MysqlErrPacket(QueryState state) {
        errorMessage = state.getErrorMessage();
        ErrorCode code = state.getErrorCode();
        if (code != null) {
            errorCode = code.getCode();
            sqlState = code.getSqlState();
        }
    }

    @Override
    public void writeTo(MysqlSerializer serializer) {
        MysqlCapability capability = serializer.getCapability();

        serializer.writeInt1(ERROR_PACKET_INDICATOR);
        serializer.writeInt2(errorCode);
        if (capability.isProtocol41()) {
            serializer.writeByte((byte) '#');
            serializer.writeBytes(sqlState, 0, 5);
        }
        if (errorMessage == null || errorMessage.isEmpty()) {
            // NOTICE: if write "" or "\0", the client will be show "Query OK"
            // SO we need write no-empty string
            serializer.writeEofString(" ");
        } else {
            serializer.writeEofString(errorMessage);
        }
    }
}
