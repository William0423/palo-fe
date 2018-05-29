/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.baidu.palo.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-05-01")
public class TReportRequest implements org.apache.thrift.TBase<TReportRequest, TReportRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TReportRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TReportRequest");

  private static final org.apache.thrift.protocol.TField BACKEND_FIELD_DESC = new org.apache.thrift.protocol.TField("backend", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField REPORT_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("report_version", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TASKS_FIELD_DESC = new org.apache.thrift.protocol.TField("tasks", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField TABLETS_FIELD_DESC = new org.apache.thrift.protocol.TField("tablets", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField DISKS_FIELD_DESC = new org.apache.thrift.protocol.TField("disks", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TReportRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TReportRequestTupleSchemeFactory());
  }

  public com.baidu.palo.thrift.TBackend backend; // required
  public long report_version; // optional
  public Map<com.baidu.palo.thrift.TTaskType,Set<Long>> tasks; // optional
  public Map<Long,TTablet> tablets; // optional
  public Map<String,TDisk> disks; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BACKEND((short)1, "backend"),
    REPORT_VERSION((short)2, "report_version"),
    TASKS((short)3, "tasks"),
    TABLETS((short)4, "tablets"),
    DISKS((short)5, "disks");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BACKEND
          return BACKEND;
        case 2: // REPORT_VERSION
          return REPORT_VERSION;
        case 3: // TASKS
          return TASKS;
        case 4: // TABLETS
          return TABLETS;
        case 5: // DISKS
          return DISKS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __REPORT_VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.REPORT_VERSION,_Fields.TASKS,_Fields.TABLETS,_Fields.DISKS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BACKEND, new org.apache.thrift.meta_data.FieldMetaData("backend", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TBackend.class)));
    tmpMap.put(_Fields.REPORT_VERSION, new org.apache.thrift.meta_data.FieldMetaData("report_version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TASKS, new org.apache.thrift.meta_data.FieldMetaData("tasks", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.baidu.palo.thrift.TTaskType.class), 
            new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)))));
    tmpMap.put(_Fields.TABLETS, new org.apache.thrift.meta_data.FieldMetaData("tablets", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64            , "TTabletId"), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTablet.class))));
    tmpMap.put(_Fields.DISKS, new org.apache.thrift.meta_data.FieldMetaData("disks", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDisk.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TReportRequest.class, metaDataMap);
  }

  public TReportRequest() {
  }

  public TReportRequest(
    com.baidu.palo.thrift.TBackend backend)
  {
    this();
    this.backend = backend;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TReportRequest(TReportRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBackend()) {
      this.backend = new com.baidu.palo.thrift.TBackend(other.backend);
    }
    this.report_version = other.report_version;
    if (other.isSetTasks()) {
      Map<com.baidu.palo.thrift.TTaskType,Set<Long>> __this__tasks = new HashMap<com.baidu.palo.thrift.TTaskType,Set<Long>>(other.tasks.size());
      for (Map.Entry<com.baidu.palo.thrift.TTaskType, Set<Long>> other_element : other.tasks.entrySet()) {

        com.baidu.palo.thrift.TTaskType other_element_key = other_element.getKey();
        Set<Long> other_element_value = other_element.getValue();

        com.baidu.palo.thrift.TTaskType __this__tasks_copy_key = other_element_key;

        Set<Long> __this__tasks_copy_value = new HashSet<Long>(other_element_value);

        __this__tasks.put(__this__tasks_copy_key, __this__tasks_copy_value);
      }
      this.tasks = __this__tasks;
    }
    if (other.isSetTablets()) {
      Map<Long,TTablet> __this__tablets = new HashMap<Long,TTablet>(other.tablets.size());
      for (Map.Entry<Long, TTablet> other_element : other.tablets.entrySet()) {

        Long other_element_key = other_element.getKey();
        TTablet other_element_value = other_element.getValue();

        Long __this__tablets_copy_key = other_element_key;

        TTablet __this__tablets_copy_value = new TTablet(other_element_value);

        __this__tablets.put(__this__tablets_copy_key, __this__tablets_copy_value);
      }
      this.tablets = __this__tablets;
    }
    if (other.isSetDisks()) {
      Map<String,TDisk> __this__disks = new HashMap<String,TDisk>(other.disks.size());
      for (Map.Entry<String, TDisk> other_element : other.disks.entrySet()) {

        String other_element_key = other_element.getKey();
        TDisk other_element_value = other_element.getValue();

        String __this__disks_copy_key = other_element_key;

        TDisk __this__disks_copy_value = new TDisk(other_element_value);

        __this__disks.put(__this__disks_copy_key, __this__disks_copy_value);
      }
      this.disks = __this__disks;
    }
  }

  public TReportRequest deepCopy() {
    return new TReportRequest(this);
  }

  @Override
  public void clear() {
    this.backend = null;
    setReport_versionIsSet(false);
    this.report_version = 0;
    this.tasks = null;
    this.tablets = null;
    this.disks = null;
  }

  public com.baidu.palo.thrift.TBackend getBackend() {
    return this.backend;
  }

  public TReportRequest setBackend(com.baidu.palo.thrift.TBackend backend) {
    this.backend = backend;
    return this;
  }

  public void unsetBackend() {
    this.backend = null;
  }

  /** Returns true if field backend is set (has been assigned a value) and false otherwise */
  public boolean isSetBackend() {
    return this.backend != null;
  }

  public void setBackendIsSet(boolean value) {
    if (!value) {
      this.backend = null;
    }
  }

  public long getReport_version() {
    return this.report_version;
  }

  public TReportRequest setReport_version(long report_version) {
    this.report_version = report_version;
    setReport_versionIsSet(true);
    return this;
  }

  public void unsetReport_version() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REPORT_VERSION_ISSET_ID);
  }

  /** Returns true if field report_version is set (has been assigned a value) and false otherwise */
  public boolean isSetReport_version() {
    return EncodingUtils.testBit(__isset_bitfield, __REPORT_VERSION_ISSET_ID);
  }

  public void setReport_versionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REPORT_VERSION_ISSET_ID, value);
  }

  public int getTasksSize() {
    return (this.tasks == null) ? 0 : this.tasks.size();
  }

  public void putToTasks(com.baidu.palo.thrift.TTaskType key, Set<Long> val) {
    if (this.tasks == null) {
      this.tasks = new HashMap<com.baidu.palo.thrift.TTaskType,Set<Long>>();
    }
    this.tasks.put(key, val);
  }

  public Map<com.baidu.palo.thrift.TTaskType,Set<Long>> getTasks() {
    return this.tasks;
  }

  public TReportRequest setTasks(Map<com.baidu.palo.thrift.TTaskType,Set<Long>> tasks) {
    this.tasks = tasks;
    return this;
  }

  public void unsetTasks() {
    this.tasks = null;
  }

  /** Returns true if field tasks is set (has been assigned a value) and false otherwise */
  public boolean isSetTasks() {
    return this.tasks != null;
  }

  public void setTasksIsSet(boolean value) {
    if (!value) {
      this.tasks = null;
    }
  }

  public int getTabletsSize() {
    return (this.tablets == null) ? 0 : this.tablets.size();
  }

  public void putToTablets(long key, TTablet val) {
    if (this.tablets == null) {
      this.tablets = new HashMap<Long,TTablet>();
    }
    this.tablets.put(key, val);
  }

  public Map<Long,TTablet> getTablets() {
    return this.tablets;
  }

  public TReportRequest setTablets(Map<Long,TTablet> tablets) {
    this.tablets = tablets;
    return this;
  }

  public void unsetTablets() {
    this.tablets = null;
  }

  /** Returns true if field tablets is set (has been assigned a value) and false otherwise */
  public boolean isSetTablets() {
    return this.tablets != null;
  }

  public void setTabletsIsSet(boolean value) {
    if (!value) {
      this.tablets = null;
    }
  }

  public int getDisksSize() {
    return (this.disks == null) ? 0 : this.disks.size();
  }

  public void putToDisks(String key, TDisk val) {
    if (this.disks == null) {
      this.disks = new HashMap<String,TDisk>();
    }
    this.disks.put(key, val);
  }

  public Map<String,TDisk> getDisks() {
    return this.disks;
  }

  public TReportRequest setDisks(Map<String,TDisk> disks) {
    this.disks = disks;
    return this;
  }

  public void unsetDisks() {
    this.disks = null;
  }

  /** Returns true if field disks is set (has been assigned a value) and false otherwise */
  public boolean isSetDisks() {
    return this.disks != null;
  }

  public void setDisksIsSet(boolean value) {
    if (!value) {
      this.disks = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BACKEND:
      if (value == null) {
        unsetBackend();
      } else {
        setBackend((com.baidu.palo.thrift.TBackend)value);
      }
      break;

    case REPORT_VERSION:
      if (value == null) {
        unsetReport_version();
      } else {
        setReport_version((Long)value);
      }
      break;

    case TASKS:
      if (value == null) {
        unsetTasks();
      } else {
        setTasks((Map<com.baidu.palo.thrift.TTaskType,Set<Long>>)value);
      }
      break;

    case TABLETS:
      if (value == null) {
        unsetTablets();
      } else {
        setTablets((Map<Long,TTablet>)value);
      }
      break;

    case DISKS:
      if (value == null) {
        unsetDisks();
      } else {
        setDisks((Map<String,TDisk>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BACKEND:
      return getBackend();

    case REPORT_VERSION:
      return getReport_version();

    case TASKS:
      return getTasks();

    case TABLETS:
      return getTablets();

    case DISKS:
      return getDisks();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BACKEND:
      return isSetBackend();
    case REPORT_VERSION:
      return isSetReport_version();
    case TASKS:
      return isSetTasks();
    case TABLETS:
      return isSetTablets();
    case DISKS:
      return isSetDisks();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TReportRequest)
      return this.equals((TReportRequest)that);
    return false;
  }

  public boolean equals(TReportRequest that) {
    if (that == null)
      return false;

    boolean this_present_backend = true && this.isSetBackend();
    boolean that_present_backend = true && that.isSetBackend();
    if (this_present_backend || that_present_backend) {
      if (!(this_present_backend && that_present_backend))
        return false;
      if (!this.backend.equals(that.backend))
        return false;
    }

    boolean this_present_report_version = true && this.isSetReport_version();
    boolean that_present_report_version = true && that.isSetReport_version();
    if (this_present_report_version || that_present_report_version) {
      if (!(this_present_report_version && that_present_report_version))
        return false;
      if (this.report_version != that.report_version)
        return false;
    }

    boolean this_present_tasks = true && this.isSetTasks();
    boolean that_present_tasks = true && that.isSetTasks();
    if (this_present_tasks || that_present_tasks) {
      if (!(this_present_tasks && that_present_tasks))
        return false;
      if (!this.tasks.equals(that.tasks))
        return false;
    }

    boolean this_present_tablets = true && this.isSetTablets();
    boolean that_present_tablets = true && that.isSetTablets();
    if (this_present_tablets || that_present_tablets) {
      if (!(this_present_tablets && that_present_tablets))
        return false;
      if (!this.tablets.equals(that.tablets))
        return false;
    }

    boolean this_present_disks = true && this.isSetDisks();
    boolean that_present_disks = true && that.isSetDisks();
    if (this_present_disks || that_present_disks) {
      if (!(this_present_disks && that_present_disks))
        return false;
      if (!this.disks.equals(that.disks))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_backend = true && (isSetBackend());
    list.add(present_backend);
    if (present_backend)
      list.add(backend);

    boolean present_report_version = true && (isSetReport_version());
    list.add(present_report_version);
    if (present_report_version)
      list.add(report_version);

    boolean present_tasks = true && (isSetTasks());
    list.add(present_tasks);
    if (present_tasks)
      list.add(tasks);

    boolean present_tablets = true && (isSetTablets());
    list.add(present_tablets);
    if (present_tablets)
      list.add(tablets);

    boolean present_disks = true && (isSetDisks());
    list.add(present_disks);
    if (present_disks)
      list.add(disks);

    return list.hashCode();
  }

  @Override
  public int compareTo(TReportRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBackend()).compareTo(other.isSetBackend());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBackend()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.backend, other.backend);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReport_version()).compareTo(other.isSetReport_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReport_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.report_version, other.report_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTasks()).compareTo(other.isSetTasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTasks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tasks, other.tasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTablets()).compareTo(other.isSetTablets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablets, other.tablets);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisks()).compareTo(other.isSetDisks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.disks, other.disks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TReportRequest(");
    boolean first = true;

    sb.append("backend:");
    if (this.backend == null) {
      sb.append("null");
    } else {
      sb.append(this.backend);
    }
    first = false;
    if (isSetReport_version()) {
      if (!first) sb.append(", ");
      sb.append("report_version:");
      sb.append(this.report_version);
      first = false;
    }
    if (isSetTasks()) {
      if (!first) sb.append(", ");
      sb.append("tasks:");
      if (this.tasks == null) {
        sb.append("null");
      } else {
        sb.append(this.tasks);
      }
      first = false;
    }
    if (isSetTablets()) {
      if (!first) sb.append(", ");
      sb.append("tablets:");
      if (this.tablets == null) {
        sb.append("null");
      } else {
        sb.append(this.tablets);
      }
      first = false;
    }
    if (isSetDisks()) {
      if (!first) sb.append(", ");
      sb.append("disks:");
      if (this.disks == null) {
        sb.append("null");
      } else {
        sb.append(this.disks);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (backend == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'backend' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (backend != null) {
      backend.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TReportRequestStandardSchemeFactory implements SchemeFactory {
    public TReportRequestStandardScheme getScheme() {
      return new TReportRequestStandardScheme();
    }
  }

  private static class TReportRequestStandardScheme extends StandardScheme<TReportRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TReportRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BACKEND
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.backend = new com.baidu.palo.thrift.TBackend();
              struct.backend.read(iprot);
              struct.setBackendIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REPORT_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.report_version = iprot.readI64();
              struct.setReport_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TASKS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map16 = iprot.readMapBegin();
                struct.tasks = new HashMap<com.baidu.palo.thrift.TTaskType,Set<Long>>(2*_map16.size);
                com.baidu.palo.thrift.TTaskType _key17;
                Set<Long> _val18;
                for (int _i19 = 0; _i19 < _map16.size; ++_i19)
                {
                  _key17 = com.baidu.palo.thrift.TTaskType.findByValue(iprot.readI32());
                  {
                    org.apache.thrift.protocol.TSet _set20 = iprot.readSetBegin();
                    _val18 = new HashSet<Long>(2*_set20.size);
                    long _elem21;
                    for (int _i22 = 0; _i22 < _set20.size; ++_i22)
                    {
                      _elem21 = iprot.readI64();
                      _val18.add(_elem21);
                    }
                    iprot.readSetEnd();
                  }
                  struct.tasks.put(_key17, _val18);
                }
                iprot.readMapEnd();
              }
              struct.setTasksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLETS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map23 = iprot.readMapBegin();
                struct.tablets = new HashMap<Long,TTablet>(2*_map23.size);
                long _key24;
                TTablet _val25;
                for (int _i26 = 0; _i26 < _map23.size; ++_i26)
                {
                  _key24 = iprot.readI64();
                  _val25 = new TTablet();
                  _val25.read(iprot);
                  struct.tablets.put(_key24, _val25);
                }
                iprot.readMapEnd();
              }
              struct.setTabletsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DISKS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map27 = iprot.readMapBegin();
                struct.disks = new HashMap<String,TDisk>(2*_map27.size);
                String _key28;
                TDisk _val29;
                for (int _i30 = 0; _i30 < _map27.size; ++_i30)
                {
                  _key28 = iprot.readString();
                  _val29 = new TDisk();
                  _val29.read(iprot);
                  struct.disks.put(_key28, _val29);
                }
                iprot.readMapEnd();
              }
              struct.setDisksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TReportRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.backend != null) {
        oprot.writeFieldBegin(BACKEND_FIELD_DESC);
        struct.backend.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetReport_version()) {
        oprot.writeFieldBegin(REPORT_VERSION_FIELD_DESC);
        oprot.writeI64(struct.report_version);
        oprot.writeFieldEnd();
      }
      if (struct.tasks != null) {
        if (struct.isSetTasks()) {
          oprot.writeFieldBegin(TASKS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.SET, struct.tasks.size()));
            for (Map.Entry<com.baidu.palo.thrift.TTaskType, Set<Long>> _iter31 : struct.tasks.entrySet())
            {
              oprot.writeI32(_iter31.getKey().getValue());
              {
                oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, _iter31.getValue().size()));
                for (long _iter32 : _iter31.getValue())
                {
                  oprot.writeI64(_iter32);
                }
                oprot.writeSetEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.tablets != null) {
        if (struct.isSetTablets()) {
          oprot.writeFieldBegin(TABLETS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRUCT, struct.tablets.size()));
            for (Map.Entry<Long, TTablet> _iter33 : struct.tablets.entrySet())
            {
              oprot.writeI64(_iter33.getKey());
              _iter33.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.disks != null) {
        if (struct.isSetDisks()) {
          oprot.writeFieldBegin(DISKS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.disks.size()));
            for (Map.Entry<String, TDisk> _iter34 : struct.disks.entrySet())
            {
              oprot.writeString(_iter34.getKey());
              _iter34.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TReportRequestTupleSchemeFactory implements SchemeFactory {
    public TReportRequestTupleScheme getScheme() {
      return new TReportRequestTupleScheme();
    }
  }

  private static class TReportRequestTupleScheme extends TupleScheme<TReportRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TReportRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.backend.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetReport_version()) {
        optionals.set(0);
      }
      if (struct.isSetTasks()) {
        optionals.set(1);
      }
      if (struct.isSetTablets()) {
        optionals.set(2);
      }
      if (struct.isSetDisks()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetReport_version()) {
        oprot.writeI64(struct.report_version);
      }
      if (struct.isSetTasks()) {
        {
          oprot.writeI32(struct.tasks.size());
          for (Map.Entry<com.baidu.palo.thrift.TTaskType, Set<Long>> _iter35 : struct.tasks.entrySet())
          {
            oprot.writeI32(_iter35.getKey().getValue());
            {
              oprot.writeI32(_iter35.getValue().size());
              for (long _iter36 : _iter35.getValue())
              {
                oprot.writeI64(_iter36);
              }
            }
          }
        }
      }
      if (struct.isSetTablets()) {
        {
          oprot.writeI32(struct.tablets.size());
          for (Map.Entry<Long, TTablet> _iter37 : struct.tablets.entrySet())
          {
            oprot.writeI64(_iter37.getKey());
            _iter37.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetDisks()) {
        {
          oprot.writeI32(struct.disks.size());
          for (Map.Entry<String, TDisk> _iter38 : struct.disks.entrySet())
          {
            oprot.writeString(_iter38.getKey());
            _iter38.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TReportRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.backend = new com.baidu.palo.thrift.TBackend();
      struct.backend.read(iprot);
      struct.setBackendIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.report_version = iprot.readI64();
        struct.setReport_versionIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map39 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.SET, iprot.readI32());
          struct.tasks = new HashMap<com.baidu.palo.thrift.TTaskType,Set<Long>>(2*_map39.size);
          com.baidu.palo.thrift.TTaskType _key40;
          Set<Long> _val41;
          for (int _i42 = 0; _i42 < _map39.size; ++_i42)
          {
            _key40 = com.baidu.palo.thrift.TTaskType.findByValue(iprot.readI32());
            {
              org.apache.thrift.protocol.TSet _set43 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, iprot.readI32());
              _val41 = new HashSet<Long>(2*_set43.size);
              long _elem44;
              for (int _i45 = 0; _i45 < _set43.size; ++_i45)
              {
                _elem44 = iprot.readI64();
                _val41.add(_elem44);
              }
            }
            struct.tasks.put(_key40, _val41);
          }
        }
        struct.setTasksIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map46 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.tablets = new HashMap<Long,TTablet>(2*_map46.size);
          long _key47;
          TTablet _val48;
          for (int _i49 = 0; _i49 < _map46.size; ++_i49)
          {
            _key47 = iprot.readI64();
            _val48 = new TTablet();
            _val48.read(iprot);
            struct.tablets.put(_key47, _val48);
          }
        }
        struct.setTabletsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map50 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.disks = new HashMap<String,TDisk>(2*_map50.size);
          String _key51;
          TDisk _val52;
          for (int _i53 = 0; _i53 < _map50.size; ++_i53)
          {
            _key51 = iprot.readString();
            _val52 = new TDisk();
            _val52.read(iprot);
            struct.disks.put(_key51, _val52);
          }
        }
        struct.setDisksIsSet(true);
      }
    }
  }

}

