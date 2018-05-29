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
public class TDisk implements org.apache.thrift.TBase<TDisk, TDisk._Fields>, java.io.Serializable, Cloneable, Comparable<TDisk> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDisk");

  private static final org.apache.thrift.protocol.TField ROOT_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("root_path", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DISK_TOTAL_CAPACITY_FIELD_DESC = new org.apache.thrift.protocol.TField("disk_total_capacity", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_USED_CAPACITY_FIELD_DESC = new org.apache.thrift.protocol.TField("data_used_capacity", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField USED_FIELD_DESC = new org.apache.thrift.protocol.TField("used", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField DISK_AVAILABLE_CAPACITY_FIELD_DESC = new org.apache.thrift.protocol.TField("disk_available_capacity", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDiskStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDiskTupleSchemeFactory());
  }

  public String root_path; // required
  public long disk_total_capacity; // required
  public long data_used_capacity; // required
  public boolean used; // required
  public long disk_available_capacity; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROOT_PATH((short)1, "root_path"),
    DISK_TOTAL_CAPACITY((short)2, "disk_total_capacity"),
    DATA_USED_CAPACITY((short)3, "data_used_capacity"),
    USED((short)4, "used"),
    DISK_AVAILABLE_CAPACITY((short)5, "disk_available_capacity");

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
        case 1: // ROOT_PATH
          return ROOT_PATH;
        case 2: // DISK_TOTAL_CAPACITY
          return DISK_TOTAL_CAPACITY;
        case 3: // DATA_USED_CAPACITY
          return DATA_USED_CAPACITY;
        case 4: // USED
          return USED;
        case 5: // DISK_AVAILABLE_CAPACITY
          return DISK_AVAILABLE_CAPACITY;
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
  private static final int __DISK_TOTAL_CAPACITY_ISSET_ID = 0;
  private static final int __DATA_USED_CAPACITY_ISSET_ID = 1;
  private static final int __USED_ISSET_ID = 2;
  private static final int __DISK_AVAILABLE_CAPACITY_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DISK_AVAILABLE_CAPACITY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROOT_PATH, new org.apache.thrift.meta_data.FieldMetaData("root_path", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISK_TOTAL_CAPACITY, new org.apache.thrift.meta_data.FieldMetaData("disk_total_capacity", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TSize")));
    tmpMap.put(_Fields.DATA_USED_CAPACITY, new org.apache.thrift.meta_data.FieldMetaData("data_used_capacity", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TSize")));
    tmpMap.put(_Fields.USED, new org.apache.thrift.meta_data.FieldMetaData("used", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DISK_AVAILABLE_CAPACITY, new org.apache.thrift.meta_data.FieldMetaData("disk_available_capacity", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TSize")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDisk.class, metaDataMap);
  }

  public TDisk() {
  }

  public TDisk(
    String root_path,
    long disk_total_capacity,
    long data_used_capacity,
    boolean used)
  {
    this();
    this.root_path = root_path;
    this.disk_total_capacity = disk_total_capacity;
    setDisk_total_capacityIsSet(true);
    this.data_used_capacity = data_used_capacity;
    setData_used_capacityIsSet(true);
    this.used = used;
    setUsedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDisk(TDisk other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRoot_path()) {
      this.root_path = other.root_path;
    }
    this.disk_total_capacity = other.disk_total_capacity;
    this.data_used_capacity = other.data_used_capacity;
    this.used = other.used;
    this.disk_available_capacity = other.disk_available_capacity;
  }

  public TDisk deepCopy() {
    return new TDisk(this);
  }

  @Override
  public void clear() {
    this.root_path = null;
    setDisk_total_capacityIsSet(false);
    this.disk_total_capacity = 0;
    setData_used_capacityIsSet(false);
    this.data_used_capacity = 0;
    setUsedIsSet(false);
    this.used = false;
    setDisk_available_capacityIsSet(false);
    this.disk_available_capacity = 0;
  }

  public String getRoot_path() {
    return this.root_path;
  }

  public TDisk setRoot_path(String root_path) {
    this.root_path = root_path;
    return this;
  }

  public void unsetRoot_path() {
    this.root_path = null;
  }

  /** Returns true if field root_path is set (has been assigned a value) and false otherwise */
  public boolean isSetRoot_path() {
    return this.root_path != null;
  }

  public void setRoot_pathIsSet(boolean value) {
    if (!value) {
      this.root_path = null;
    }
  }

  public long getDisk_total_capacity() {
    return this.disk_total_capacity;
  }

  public TDisk setDisk_total_capacity(long disk_total_capacity) {
    this.disk_total_capacity = disk_total_capacity;
    setDisk_total_capacityIsSet(true);
    return this;
  }

  public void unsetDisk_total_capacity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DISK_TOTAL_CAPACITY_ISSET_ID);
  }

  /** Returns true if field disk_total_capacity is set (has been assigned a value) and false otherwise */
  public boolean isSetDisk_total_capacity() {
    return EncodingUtils.testBit(__isset_bitfield, __DISK_TOTAL_CAPACITY_ISSET_ID);
  }

  public void setDisk_total_capacityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DISK_TOTAL_CAPACITY_ISSET_ID, value);
  }

  public long getData_used_capacity() {
    return this.data_used_capacity;
  }

  public TDisk setData_used_capacity(long data_used_capacity) {
    this.data_used_capacity = data_used_capacity;
    setData_used_capacityIsSet(true);
    return this;
  }

  public void unsetData_used_capacity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATA_USED_CAPACITY_ISSET_ID);
  }

  /** Returns true if field data_used_capacity is set (has been assigned a value) and false otherwise */
  public boolean isSetData_used_capacity() {
    return EncodingUtils.testBit(__isset_bitfield, __DATA_USED_CAPACITY_ISSET_ID);
  }

  public void setData_used_capacityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATA_USED_CAPACITY_ISSET_ID, value);
  }

  public boolean isUsed() {
    return this.used;
  }

  public TDisk setUsed(boolean used) {
    this.used = used;
    setUsedIsSet(true);
    return this;
  }

  public void unsetUsed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USED_ISSET_ID);
  }

  /** Returns true if field used is set (has been assigned a value) and false otherwise */
  public boolean isSetUsed() {
    return EncodingUtils.testBit(__isset_bitfield, __USED_ISSET_ID);
  }

  public void setUsedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USED_ISSET_ID, value);
  }

  public long getDisk_available_capacity() {
    return this.disk_available_capacity;
  }

  public TDisk setDisk_available_capacity(long disk_available_capacity) {
    this.disk_available_capacity = disk_available_capacity;
    setDisk_available_capacityIsSet(true);
    return this;
  }

  public void unsetDisk_available_capacity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DISK_AVAILABLE_CAPACITY_ISSET_ID);
  }

  /** Returns true if field disk_available_capacity is set (has been assigned a value) and false otherwise */
  public boolean isSetDisk_available_capacity() {
    return EncodingUtils.testBit(__isset_bitfield, __DISK_AVAILABLE_CAPACITY_ISSET_ID);
  }

  public void setDisk_available_capacityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DISK_AVAILABLE_CAPACITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROOT_PATH:
      if (value == null) {
        unsetRoot_path();
      } else {
        setRoot_path((String)value);
      }
      break;

    case DISK_TOTAL_CAPACITY:
      if (value == null) {
        unsetDisk_total_capacity();
      } else {
        setDisk_total_capacity((Long)value);
      }
      break;

    case DATA_USED_CAPACITY:
      if (value == null) {
        unsetData_used_capacity();
      } else {
        setData_used_capacity((Long)value);
      }
      break;

    case USED:
      if (value == null) {
        unsetUsed();
      } else {
        setUsed((Boolean)value);
      }
      break;

    case DISK_AVAILABLE_CAPACITY:
      if (value == null) {
        unsetDisk_available_capacity();
      } else {
        setDisk_available_capacity((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROOT_PATH:
      return getRoot_path();

    case DISK_TOTAL_CAPACITY:
      return getDisk_total_capacity();

    case DATA_USED_CAPACITY:
      return getData_used_capacity();

    case USED:
      return isUsed();

    case DISK_AVAILABLE_CAPACITY:
      return getDisk_available_capacity();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROOT_PATH:
      return isSetRoot_path();
    case DISK_TOTAL_CAPACITY:
      return isSetDisk_total_capacity();
    case DATA_USED_CAPACITY:
      return isSetData_used_capacity();
    case USED:
      return isSetUsed();
    case DISK_AVAILABLE_CAPACITY:
      return isSetDisk_available_capacity();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDisk)
      return this.equals((TDisk)that);
    return false;
  }

  public boolean equals(TDisk that) {
    if (that == null)
      return false;

    boolean this_present_root_path = true && this.isSetRoot_path();
    boolean that_present_root_path = true && that.isSetRoot_path();
    if (this_present_root_path || that_present_root_path) {
      if (!(this_present_root_path && that_present_root_path))
        return false;
      if (!this.root_path.equals(that.root_path))
        return false;
    }

    boolean this_present_disk_total_capacity = true;
    boolean that_present_disk_total_capacity = true;
    if (this_present_disk_total_capacity || that_present_disk_total_capacity) {
      if (!(this_present_disk_total_capacity && that_present_disk_total_capacity))
        return false;
      if (this.disk_total_capacity != that.disk_total_capacity)
        return false;
    }

    boolean this_present_data_used_capacity = true;
    boolean that_present_data_used_capacity = true;
    if (this_present_data_used_capacity || that_present_data_used_capacity) {
      if (!(this_present_data_used_capacity && that_present_data_used_capacity))
        return false;
      if (this.data_used_capacity != that.data_used_capacity)
        return false;
    }

    boolean this_present_used = true;
    boolean that_present_used = true;
    if (this_present_used || that_present_used) {
      if (!(this_present_used && that_present_used))
        return false;
      if (this.used != that.used)
        return false;
    }

    boolean this_present_disk_available_capacity = true && this.isSetDisk_available_capacity();
    boolean that_present_disk_available_capacity = true && that.isSetDisk_available_capacity();
    if (this_present_disk_available_capacity || that_present_disk_available_capacity) {
      if (!(this_present_disk_available_capacity && that_present_disk_available_capacity))
        return false;
      if (this.disk_available_capacity != that.disk_available_capacity)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_root_path = true && (isSetRoot_path());
    list.add(present_root_path);
    if (present_root_path)
      list.add(root_path);

    boolean present_disk_total_capacity = true;
    list.add(present_disk_total_capacity);
    if (present_disk_total_capacity)
      list.add(disk_total_capacity);

    boolean present_data_used_capacity = true;
    list.add(present_data_used_capacity);
    if (present_data_used_capacity)
      list.add(data_used_capacity);

    boolean present_used = true;
    list.add(present_used);
    if (present_used)
      list.add(used);

    boolean present_disk_available_capacity = true && (isSetDisk_available_capacity());
    list.add(present_disk_available_capacity);
    if (present_disk_available_capacity)
      list.add(disk_available_capacity);

    return list.hashCode();
  }

  @Override
  public int compareTo(TDisk other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRoot_path()).compareTo(other.isSetRoot_path());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoot_path()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.root_path, other.root_path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisk_total_capacity()).compareTo(other.isSetDisk_total_capacity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisk_total_capacity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.disk_total_capacity, other.disk_total_capacity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData_used_capacity()).compareTo(other.isSetData_used_capacity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData_used_capacity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data_used_capacity, other.data_used_capacity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsed()).compareTo(other.isSetUsed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.used, other.used);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisk_available_capacity()).compareTo(other.isSetDisk_available_capacity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisk_available_capacity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.disk_available_capacity, other.disk_available_capacity);
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
    StringBuilder sb = new StringBuilder("TDisk(");
    boolean first = true;

    sb.append("root_path:");
    if (this.root_path == null) {
      sb.append("null");
    } else {
      sb.append(this.root_path);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("disk_total_capacity:");
    sb.append(this.disk_total_capacity);
    first = false;
    if (!first) sb.append(", ");
    sb.append("data_used_capacity:");
    sb.append(this.data_used_capacity);
    first = false;
    if (!first) sb.append(", ");
    sb.append("used:");
    sb.append(this.used);
    first = false;
    if (isSetDisk_available_capacity()) {
      if (!first) sb.append(", ");
      sb.append("disk_available_capacity:");
      sb.append(this.disk_available_capacity);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (root_path == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'root_path' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'disk_total_capacity' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'data_used_capacity' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'used' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
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

  private static class TDiskStandardSchemeFactory implements SchemeFactory {
    public TDiskStandardScheme getScheme() {
      return new TDiskStandardScheme();
    }
  }

  private static class TDiskStandardScheme extends StandardScheme<TDisk> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDisk struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROOT_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.root_path = iprot.readString();
              struct.setRoot_pathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DISK_TOTAL_CAPACITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.disk_total_capacity = iprot.readI64();
              struct.setDisk_total_capacityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA_USED_CAPACITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.data_used_capacity = iprot.readI64();
              struct.setData_used_capacityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.used = iprot.readBool();
              struct.setUsedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DISK_AVAILABLE_CAPACITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.disk_available_capacity = iprot.readI64();
              struct.setDisk_available_capacityIsSet(true);
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
      if (!struct.isSetDisk_total_capacity()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'disk_total_capacity' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetData_used_capacity()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'data_used_capacity' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetUsed()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'used' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDisk struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.root_path != null) {
        oprot.writeFieldBegin(ROOT_PATH_FIELD_DESC);
        oprot.writeString(struct.root_path);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DISK_TOTAL_CAPACITY_FIELD_DESC);
      oprot.writeI64(struct.disk_total_capacity);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DATA_USED_CAPACITY_FIELD_DESC);
      oprot.writeI64(struct.data_used_capacity);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USED_FIELD_DESC);
      oprot.writeBool(struct.used);
      oprot.writeFieldEnd();
      if (struct.isSetDisk_available_capacity()) {
        oprot.writeFieldBegin(DISK_AVAILABLE_CAPACITY_FIELD_DESC);
        oprot.writeI64(struct.disk_available_capacity);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDiskTupleSchemeFactory implements SchemeFactory {
    public TDiskTupleScheme getScheme() {
      return new TDiskTupleScheme();
    }
  }

  private static class TDiskTupleScheme extends TupleScheme<TDisk> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDisk struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.root_path);
      oprot.writeI64(struct.disk_total_capacity);
      oprot.writeI64(struct.data_used_capacity);
      oprot.writeBool(struct.used);
      BitSet optionals = new BitSet();
      if (struct.isSetDisk_available_capacity()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDisk_available_capacity()) {
        oprot.writeI64(struct.disk_available_capacity);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDisk struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.root_path = iprot.readString();
      struct.setRoot_pathIsSet(true);
      struct.disk_total_capacity = iprot.readI64();
      struct.setDisk_total_capacityIsSet(true);
      struct.data_used_capacity = iprot.readI64();
      struct.setData_used_capacityIsSet(true);
      struct.used = iprot.readBool();
      struct.setUsedIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.disk_available_capacity = iprot.readI64();
        struct.setDisk_available_capacityIsSet(true);
      }
    }
  }

}

