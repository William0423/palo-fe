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
public class TScanRangeParams implements org.apache.thrift.TBase<TScanRangeParams, TScanRangeParams._Fields>, java.io.Serializable, Cloneable, Comparable<TScanRangeParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScanRangeParams");

  private static final org.apache.thrift.protocol.TField SCAN_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("scan_range", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VOLUME_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("volume_id", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TScanRangeParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TScanRangeParamsTupleSchemeFactory());
  }

  public com.baidu.palo.thrift.TScanRange scan_range; // required
  public int volume_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCAN_RANGE((short)1, "scan_range"),
    VOLUME_ID((short)2, "volume_id");

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
        case 1: // SCAN_RANGE
          return SCAN_RANGE;
        case 2: // VOLUME_ID
          return VOLUME_ID;
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
  private static final int __VOLUME_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.VOLUME_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCAN_RANGE, new org.apache.thrift.meta_data.FieldMetaData("scan_range", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TScanRange.class)));
    tmpMap.put(_Fields.VOLUME_ID, new org.apache.thrift.meta_data.FieldMetaData("volume_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScanRangeParams.class, metaDataMap);
  }

  public TScanRangeParams() {
    this.volume_id = -1;

  }

  public TScanRangeParams(
    com.baidu.palo.thrift.TScanRange scan_range)
  {
    this();
    this.scan_range = scan_range;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScanRangeParams(TScanRangeParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetScan_range()) {
      this.scan_range = new com.baidu.palo.thrift.TScanRange(other.scan_range);
    }
    this.volume_id = other.volume_id;
  }

  public TScanRangeParams deepCopy() {
    return new TScanRangeParams(this);
  }

  @Override
  public void clear() {
    this.scan_range = null;
    this.volume_id = -1;

  }

  public com.baidu.palo.thrift.TScanRange getScan_range() {
    return this.scan_range;
  }

  public TScanRangeParams setScan_range(com.baidu.palo.thrift.TScanRange scan_range) {
    this.scan_range = scan_range;
    return this;
  }

  public void unsetScan_range() {
    this.scan_range = null;
  }

  /** Returns true if field scan_range is set (has been assigned a value) and false otherwise */
  public boolean isSetScan_range() {
    return this.scan_range != null;
  }

  public void setScan_rangeIsSet(boolean value) {
    if (!value) {
      this.scan_range = null;
    }
  }

  public int getVolume_id() {
    return this.volume_id;
  }

  public TScanRangeParams setVolume_id(int volume_id) {
    this.volume_id = volume_id;
    setVolume_idIsSet(true);
    return this;
  }

  public void unsetVolume_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VOLUME_ID_ISSET_ID);
  }

  /** Returns true if field volume_id is set (has been assigned a value) and false otherwise */
  public boolean isSetVolume_id() {
    return EncodingUtils.testBit(__isset_bitfield, __VOLUME_ID_ISSET_ID);
  }

  public void setVolume_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VOLUME_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCAN_RANGE:
      if (value == null) {
        unsetScan_range();
      } else {
        setScan_range((com.baidu.palo.thrift.TScanRange)value);
      }
      break;

    case VOLUME_ID:
      if (value == null) {
        unsetVolume_id();
      } else {
        setVolume_id((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCAN_RANGE:
      return getScan_range();

    case VOLUME_ID:
      return getVolume_id();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCAN_RANGE:
      return isSetScan_range();
    case VOLUME_ID:
      return isSetVolume_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TScanRangeParams)
      return this.equals((TScanRangeParams)that);
    return false;
  }

  public boolean equals(TScanRangeParams that) {
    if (that == null)
      return false;

    boolean this_present_scan_range = true && this.isSetScan_range();
    boolean that_present_scan_range = true && that.isSetScan_range();
    if (this_present_scan_range || that_present_scan_range) {
      if (!(this_present_scan_range && that_present_scan_range))
        return false;
      if (!this.scan_range.equals(that.scan_range))
        return false;
    }

    boolean this_present_volume_id = true && this.isSetVolume_id();
    boolean that_present_volume_id = true && that.isSetVolume_id();
    if (this_present_volume_id || that_present_volume_id) {
      if (!(this_present_volume_id && that_present_volume_id))
        return false;
      if (this.volume_id != that.volume_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_scan_range = true && (isSetScan_range());
    list.add(present_scan_range);
    if (present_scan_range)
      list.add(scan_range);

    boolean present_volume_id = true && (isSetVolume_id());
    list.add(present_volume_id);
    if (present_volume_id)
      list.add(volume_id);

    return list.hashCode();
  }

  @Override
  public int compareTo(TScanRangeParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetScan_range()).compareTo(other.isSetScan_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScan_range()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scan_range, other.scan_range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVolume_id()).compareTo(other.isSetVolume_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVolume_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.volume_id, other.volume_id);
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
    StringBuilder sb = new StringBuilder("TScanRangeParams(");
    boolean first = true;

    sb.append("scan_range:");
    if (this.scan_range == null) {
      sb.append("null");
    } else {
      sb.append(this.scan_range);
    }
    first = false;
    if (isSetVolume_id()) {
      if (!first) sb.append(", ");
      sb.append("volume_id:");
      sb.append(this.volume_id);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (scan_range == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'scan_range' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (scan_range != null) {
      scan_range.validate();
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

  private static class TScanRangeParamsStandardSchemeFactory implements SchemeFactory {
    public TScanRangeParamsStandardScheme getScheme() {
      return new TScanRangeParamsStandardScheme();
    }
  }

  private static class TScanRangeParamsStandardScheme extends StandardScheme<TScanRangeParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TScanRangeParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCAN_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.scan_range = new com.baidu.palo.thrift.TScanRange();
              struct.scan_range.read(iprot);
              struct.setScan_rangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VOLUME_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.volume_id = iprot.readI32();
              struct.setVolume_idIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TScanRangeParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.scan_range != null) {
        oprot.writeFieldBegin(SCAN_RANGE_FIELD_DESC);
        struct.scan_range.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetVolume_id()) {
        oprot.writeFieldBegin(VOLUME_ID_FIELD_DESC);
        oprot.writeI32(struct.volume_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScanRangeParamsTupleSchemeFactory implements SchemeFactory {
    public TScanRangeParamsTupleScheme getScheme() {
      return new TScanRangeParamsTupleScheme();
    }
  }

  private static class TScanRangeParamsTupleScheme extends TupleScheme<TScanRangeParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScanRangeParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.scan_range.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetVolume_id()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetVolume_id()) {
        oprot.writeI32(struct.volume_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScanRangeParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.scan_range = new com.baidu.palo.thrift.TScanRange();
      struct.scan_range.read(iprot);
      struct.setScan_rangeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.volume_id = iprot.readI32();
        struct.setVolume_idIsSet(true);
      }
    }
  }

}

