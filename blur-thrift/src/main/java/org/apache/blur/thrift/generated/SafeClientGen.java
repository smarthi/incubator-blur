/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.blur.thrift.generated;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import org.apache.blur.thirdparty.thrift_0_9_0.scheme.IScheme;
import org.apache.blur.thirdparty.thrift_0_9_0.scheme.SchemeFactory;
import org.apache.blur.thirdparty.thrift_0_9_0.scheme.StandardScheme;

import org.apache.blur.thirdparty.thrift_0_9_0.scheme.TupleScheme;
import org.apache.blur.thirdparty.thrift_0_9_0.protocol.TTupleProtocol;
import org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocolException;
import org.apache.blur.thirdparty.thrift_0_9_0.EncodingUtils;
import org.apache.blur.thirdparty.thrift_0_9_0.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class SafeClientGen extends org.apache.blur.thrift.generated.Blur.Client {

private final org.apache.blur.thrift.ClientLock _lock = new org.apache.blur.thrift.ClientLock("client");

public SafeClientGen(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocol iprot, org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocol oprot) {
super(iprot, oprot);
}

public SafeClientGen(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocol prot) {
super(prot);
}

@Override
public void optimize(java.lang.String arg0, int arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.optimize(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.BlurResults query(java.lang.String arg0, org.apache.blur.thrift.generated.BlurQuery arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.query(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void createTable(org.apache.blur.thrift.generated.TableDescriptor arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.createTable(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_createTable(org.apache.blur.thrift.generated.TableDescriptor arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_createTable(arg0);
  } finally {_lock.unlock();}
}

@Override
public void recv_createTable() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_createTable();
  } finally {_lock.unlock();}
}

@Override
public void enableTable(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.enableTable(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_enableTable(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_enableTable(arg0);
  } finally {_lock.unlock();}
}

@Override
public void recv_enableTable() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_enableTable();
  } finally {_lock.unlock();}
}

@Override
public void disableTable(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.disableTable(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_disableTable(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_disableTable(arg0);
  } finally {_lock.unlock();}
}

@Override
public void recv_disableTable() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_disableTable();
  } finally {_lock.unlock();}
}

@Override
public void removeTable(java.lang.String arg0, boolean arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.removeTable(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_removeTable(java.lang.String arg0, boolean arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_removeTable(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void recv_removeTable() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_removeTable();
  } finally {_lock.unlock();}
}

@Override
public boolean addColumnDefinition(java.lang.String arg0, org.apache.blur.thrift.generated.ColumnDefinition arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.addColumnDefinition(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_addColumnDefinition(java.lang.String arg0, org.apache.blur.thrift.generated.ColumnDefinition arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_addColumnDefinition(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public boolean recv_addColumnDefinition() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_addColumnDefinition();
  } finally {_lock.unlock();}
}

@Override
public java.util.List tableList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.tableList();
  } finally {_lock.unlock();}
}

@Override
public void send_tableList() throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_tableList();
  } finally {_lock.unlock();}
}

@Override
public java.util.List recv_tableList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_tableList();
  } finally {_lock.unlock();}
}

@Override
public java.util.List tableListByCluster(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.tableListByCluster(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_tableListByCluster(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_tableListByCluster(arg0);
  } finally {_lock.unlock();}
}

@Override
public java.util.List recv_tableListByCluster() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_tableListByCluster();
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.TableDescriptor describe(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.describe(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_describe(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_describe(arg0);
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.TableDescriptor recv_describe() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_describe();
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.Schema schema(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.schema(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_schema(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_schema(arg0);
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.Schema recv_schema() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_schema();
  } finally {_lock.unlock();}
}

@Override
public java.lang.String parseQuery(java.lang.String arg0, org.apache.blur.thrift.generated.Query arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.parseQuery(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_parseQuery(java.lang.String arg0, org.apache.blur.thrift.generated.Query arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_parseQuery(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public java.lang.String recv_parseQuery() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_parseQuery();
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.TableStats tableStats(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.tableStats(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_tableStats(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_tableStats(arg0);
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.TableStats recv_tableStats() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_tableStats();
  } finally {_lock.unlock();}
}

@Override
public void send_optimize(java.lang.String arg0, int arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_optimize(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void recv_optimize() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_optimize();
  } finally {_lock.unlock();}
}

@Override
public void createSnapshot(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.createSnapshot(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_createSnapshot(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_createSnapshot(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void recv_createSnapshot() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_createSnapshot();
  } finally {_lock.unlock();}
}

@Override
public void removeSnapshot(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.removeSnapshot(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_removeSnapshot(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_removeSnapshot(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void recv_removeSnapshot() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_removeSnapshot();
  } finally {_lock.unlock();}
}

@Override
public java.util.Map listSnapshots(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.listSnapshots(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_listSnapshots(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_listSnapshots(arg0);
  } finally {_lock.unlock();}
}

@Override
public java.util.Map recv_listSnapshots() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_listSnapshots();
  } finally {_lock.unlock();}
}

@Override
public void setUser(org.apache.blur.thrift.generated.User arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.setUser(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_setUser(org.apache.blur.thrift.generated.User arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_setUser(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_query(java.lang.String arg0, org.apache.blur.thrift.generated.BlurQuery arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_query(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.BlurResults recv_query() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_query();
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.FetchResult fetchRow(java.lang.String arg0, org.apache.blur.thrift.generated.Selector arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.fetchRow(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_fetchRow(java.lang.String arg0, org.apache.blur.thrift.generated.Selector arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_fetchRow(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.FetchResult recv_fetchRow() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_fetchRow();
  } finally {_lock.unlock();}
}

@Override
public java.util.List fetchRowBatch(java.lang.String arg0, java.util.List arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.fetchRowBatch(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_fetchRowBatch(java.lang.String arg0, java.util.List arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_fetchRowBatch(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public java.util.List recv_fetchRowBatch() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_fetchRowBatch();
  } finally {_lock.unlock();}
}

@Override
public void mutate(org.apache.blur.thrift.generated.RowMutation arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.mutate(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_mutate(org.apache.blur.thrift.generated.RowMutation arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_mutate(arg0);
  } finally {_lock.unlock();}
}

@Override
public void recv_mutate() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_mutate();
  } finally {_lock.unlock();}
}

@Override
public void mutateBatch(java.util.List arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.mutateBatch(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_mutateBatch(java.util.List arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_mutateBatch(arg0);
  } finally {_lock.unlock();}
}

@Override
public void recv_mutateBatch() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_mutateBatch();
  } finally {_lock.unlock();}
}

@Override
public void cancelQuery(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.cancelQuery(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_cancelQuery(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_cancelQuery(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void recv_cancelQuery() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_cancelQuery();
  } finally {_lock.unlock();}
}

@Override
public java.util.List queryStatusIdList(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.queryStatusIdList(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_queryStatusIdList(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_queryStatusIdList(arg0);
  } finally {_lock.unlock();}
}

@Override
public java.util.List recv_queryStatusIdList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_queryStatusIdList();
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.BlurQueryStatus queryStatusById(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.queryStatusById(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_queryStatusById(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_queryStatusById(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public org.apache.blur.thrift.generated.BlurQueryStatus recv_queryStatusById() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_queryStatusById();
  } finally {_lock.unlock();}
}

@Override
public java.util.List terms(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, short arg4) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.terms(arg0, arg1, arg2, arg3, arg4);
  } finally {_lock.unlock();}
}

@Override
public void send_terms(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, short arg4) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_terms(arg0, arg1, arg2, arg3, arg4);
  } finally {_lock.unlock();}
}

@Override
public java.util.List recv_terms() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_terms();
  } finally {_lock.unlock();}
}

@Override
public long recordFrequency(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recordFrequency(arg0, arg1, arg2, arg3);
  } finally {_lock.unlock();}
}

@Override
public void send_recordFrequency(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_recordFrequency(arg0, arg1, arg2, arg3);
  } finally {_lock.unlock();}
}

@Override
public long recv_recordFrequency() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_recordFrequency();
  } finally {_lock.unlock();}
}

@Override
public java.util.List shardClusterList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.shardClusterList();
  } finally {_lock.unlock();}
}

@Override
public void send_shardClusterList() throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_shardClusterList();
  } finally {_lock.unlock();}
}

@Override
public java.util.List recv_shardClusterList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_shardClusterList();
  } finally {_lock.unlock();}
}

@Override
public java.util.List shardServerList(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.shardServerList(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_shardServerList(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_shardServerList(arg0);
  } finally {_lock.unlock();}
}

@Override
public java.util.List recv_shardServerList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_shardServerList();
  } finally {_lock.unlock();}
}

@Override
public java.util.List controllerServerList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.controllerServerList();
  } finally {_lock.unlock();}
}

@Override
public void send_controllerServerList() throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_controllerServerList();
  } finally {_lock.unlock();}
}

@Override
public java.util.List recv_controllerServerList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_controllerServerList();
  } finally {_lock.unlock();}
}

@Override
public java.util.Map shardServerLayout(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.shardServerLayout(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_shardServerLayout(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_shardServerLayout(arg0);
  } finally {_lock.unlock();}
}

@Override
public java.util.Map recv_shardServerLayout() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_shardServerLayout();
  } finally {_lock.unlock();}
}

@Override
public java.util.Map shardServerLayoutState(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.shardServerLayoutState(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_shardServerLayoutState(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_shardServerLayoutState(arg0);
  } finally {_lock.unlock();}
}

@Override
public java.util.Map recv_shardServerLayoutState() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_shardServerLayoutState();
  } finally {_lock.unlock();}
}

@Override
public boolean isInSafeMode(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.isInSafeMode(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_isInSafeMode(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_isInSafeMode(arg0);
  } finally {_lock.unlock();}
}

@Override
public boolean recv_isInSafeMode() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_isInSafeMode();
  } finally {_lock.unlock();}
}

@Override
public void send_configuration() throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_configuration();
  } finally {_lock.unlock();}
}

@Override
public java.util.Map recv_configuration() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_configuration();
  } finally {_lock.unlock();}
}

@Override
public java.util.Map metrics(java.util.Set arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.metrics(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_metrics(java.util.Set arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_metrics(arg0);
  } finally {_lock.unlock();}
}

@Override
public java.util.Map recv_metrics() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_metrics();
  } finally {_lock.unlock();}
}

@Override
public void startTrace(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.startTrace(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_startTrace(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_startTrace(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public java.util.List traceList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.traceList();
  } finally {_lock.unlock();}
}

@Override
public void send_traceList() throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_traceList();
  } finally {_lock.unlock();}
}

@Override
public java.util.List recv_traceList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_traceList();
  } finally {_lock.unlock();}
}

@Override
public java.util.List traceRequestList(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.traceRequestList(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_traceRequestList(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_traceRequestList(arg0);
  } finally {_lock.unlock();}
}

@Override
public java.util.List recv_traceRequestList() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_traceRequestList();
  } finally {_lock.unlock();}
}

@Override
public java.lang.String traceRequestFetch(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.traceRequestFetch(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public void send_traceRequestFetch(java.lang.String arg0, java.lang.String arg1) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_traceRequestFetch(arg0, arg1);
  } finally {_lock.unlock();}
}

@Override
public java.lang.String recv_traceRequestFetch() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.recv_traceRequestFetch();
  } finally {_lock.unlock();}
}

@Override
public void traceRemove(java.lang.String arg0) throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.traceRemove(arg0);
  } finally {_lock.unlock();}
}

@Override
public void send_traceRemove(java.lang.String arg0) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_traceRemove(arg0);
  } finally {_lock.unlock();}
}

@Override
public void recv_traceRemove() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_traceRemove();
  } finally {_lock.unlock();}
}

@Override
public void ping() throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.ping();
  } finally {_lock.unlock();}
}

@Override
public void send_ping() throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.send_ping();
  } finally {_lock.unlock();}
}

@Override
public void recv_ping() throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    super.recv_ping();
  } finally {_lock.unlock();}
}

@Override
public java.util.Map configuration() throws org.apache.blur.thrift.generated.BlurException, org.apache.blur.thirdparty.thrift_0_9_0.TException {
  _lock.errorFailLock(); try {
    return super.configuration();
  } finally {_lock.unlock();}
}

}
