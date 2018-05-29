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
public class THeartbeatResult implements org.apache.thrift.TBase<THeartbeatResult, THeartbeatResult._Fields>, java.io.Serializable, Cloneable, Comparable<THeartbeatResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("THeartbeatResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BACKEND_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("backend_info", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new THeartbeatResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new THeartbeatResultTupleSchemeFactory());
  }

  public com.baidu.palo.thrift.TStatus status; // required
  public TBackendInfo backend_info; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    BACKEND_INFO((short)2, "backend_info");

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
        case 1: // STATUS
          return STATUS;
        case 2: // BACKEND_INFO
          return BACKEND_INFO;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TStatus.class)));
    tmpMap.put(_Fields.BACKEND_INFO, new org.apache.thrift.meta_data.FieldMetaData("backend_info", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBackendInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(THeartbeatResult.class, metaDataMap);
  }

  public THeartbeatResult() {
  }

  public THeartbeatResult(
    com.baidu.palo.thrift.TStatus status,
    TBackendInfo backend_info)
  {
    this();
    this.status = status;
    this.backend_info = backend_info;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public THeartbeatResult(THeartbeatResult other) {
    if (other.isSetStatus()) {
      this.status = new com.baidu.palo.thrift.TStatus(other.status);
    }
    if (other.isSetBackend_info()) {
      this.backend_info = new TBackendInfo(other.backend_info);
    }
  }

  public THeartbeatResult deepCopy() {
    return new THeartbeatResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.backend_info = null;
  }

  public com.baidu.palo.thrift.TStatus getStatus() {
    return this.status;
  }

  public THeartbeatResult setStatus(com.baidu.palo.thrift.TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public TBackendInfo getBackend_info() {
    return this.backend_info;
  }

  public THeartbeatResult setBackend_info(TBackendInfo backend_info) {
    this.backend_info = backend_info;
    return this;
  }

  public void unsetBackend_info() {
    this.backend_info = null;
  }

  /** Returns true if field backend_info is set (has been assigned a value) and false otherwise */
  public boolean isSetBackend_info() {
    return this.backend_info != null;
  }

  public void setBackend_infoIsSet(boolean value) {
    if (!value) {
      this.backend_info = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((com.baidu.palo.thrift.TStatus)value);
      }
      break;

    case BACKEND_INFO:
      if (value == null) {
        unsetBackend_info();
      } else {
        setBackend_info((TBackendInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case BACKEND_INFO:
      return getBackend_info();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case BACKEND_INFO:
      return isSetBackend_info();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof THeartbeatResult)
      return this.equals((THeartbeatResult)that);
    return false;
  }

  public boolean equals(THeartbeatResult that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_backend_info = true && this.isSetBackend_info();
    boolean that_present_backend_info = true && that.isSetBackend_info();
    if (this_present_backend_info || that_present_backend_info) {
      if (!(this_present_backend_info && that_present_backend_info))
        return false;
      if (!this.backend_info.equals(that.backend_info))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status);

    boolean present_backend_info = true && (isSetBackend_info());
    list.add(present_backend_info);
    if (present_backend_info)
      list.add(backend_info);

    return list.hashCode();
  }

  @Override
  public int compareTo(THeartbeatResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBackend_info()).compareTo(other.isSetBackend_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBackend_info()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.backend_info, other.backend_info);
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
    StringBuilder sb = new StringBuilder("THeartbeatResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("backend_info:");
    if (this.backend_info == null) {
      sb.append("null");
    } else {
      sb.append(this.backend_info);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    if (backend_info == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'backend_info' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (backend_info != null) {
      backend_info.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class THeartbeatResultStandardSchemeFactory implements SchemeFactory {
    public THeartbeatResultStandardScheme getScheme() {
      return new THeartbeatResultStandardScheme();
    }
  }

  private static class THeartbeatResultStandardScheme extends StandardScheme<THeartbeatResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, THeartbeatResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new com.baidu.palo.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BACKEND_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.backend_info = new TBackendInfo();
              struct.backend_info.read(iprot);
              struct.setBackend_infoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, THeartbeatResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.backend_info != null) {
        oprot.writeFieldBegin(BACKEND_INFO_FIELD_DESC);
        struct.backend_info.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class THeartbeatResultTupleSchemeFactory implements SchemeFactory {
    public THeartbeatResultTupleScheme getScheme() {
      return new THeartbeatResultTupleScheme();
    }
  }

  private static class THeartbeatResultTupleScheme extends TupleScheme<THeartbeatResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, THeartbeatResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.status.write(oprot);
      struct.backend_info.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, THeartbeatResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = new com.baidu.palo.thrift.TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      struct.backend_info = new TBackendInfo();
      struct.backend_info.read(iprot);
      struct.setBackend_infoIsSet(true);
    }
  }

}
