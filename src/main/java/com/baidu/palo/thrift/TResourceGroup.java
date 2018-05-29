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
public class TResourceGroup implements org.apache.thrift.TBase<TResourceGroup, TResourceGroup._Fields>, java.io.Serializable, Cloneable, Comparable<TResourceGroup> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResourceGroup");

  private static final org.apache.thrift.protocol.TField RESOURCE_BY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceByType", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TResourceGroupStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TResourceGroupTupleSchemeFactory());
  }

  public Map<TResourceType,Integer> resourceByType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_BY_TYPE((short)1, "resourceByType");

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
        case 1: // RESOURCE_BY_TYPE
          return RESOURCE_BY_TYPE;
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
    tmpMap.put(_Fields.RESOURCE_BY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("resourceByType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TResourceType.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResourceGroup.class, metaDataMap);
  }

  public TResourceGroup() {
  }

  public TResourceGroup(
    Map<TResourceType,Integer> resourceByType)
  {
    this();
    this.resourceByType = resourceByType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResourceGroup(TResourceGroup other) {
    if (other.isSetResourceByType()) {
      Map<TResourceType,Integer> __this__resourceByType = new HashMap<TResourceType,Integer>(other.resourceByType.size());
      for (Map.Entry<TResourceType, Integer> other_element : other.resourceByType.entrySet()) {

        TResourceType other_element_key = other_element.getKey();
        Integer other_element_value = other_element.getValue();

        TResourceType __this__resourceByType_copy_key = other_element_key;

        Integer __this__resourceByType_copy_value = other_element_value;

        __this__resourceByType.put(__this__resourceByType_copy_key, __this__resourceByType_copy_value);
      }
      this.resourceByType = __this__resourceByType;
    }
  }

  public TResourceGroup deepCopy() {
    return new TResourceGroup(this);
  }

  @Override
  public void clear() {
    this.resourceByType = null;
  }

  public int getResourceByTypeSize() {
    return (this.resourceByType == null) ? 0 : this.resourceByType.size();
  }

  public void putToResourceByType(TResourceType key, int val) {
    if (this.resourceByType == null) {
      this.resourceByType = new HashMap<TResourceType,Integer>();
    }
    this.resourceByType.put(key, val);
  }

  public Map<TResourceType,Integer> getResourceByType() {
    return this.resourceByType;
  }

  public TResourceGroup setResourceByType(Map<TResourceType,Integer> resourceByType) {
    this.resourceByType = resourceByType;
    return this;
  }

  public void unsetResourceByType() {
    this.resourceByType = null;
  }

  /** Returns true if field resourceByType is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceByType() {
    return this.resourceByType != null;
  }

  public void setResourceByTypeIsSet(boolean value) {
    if (!value) {
      this.resourceByType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESOURCE_BY_TYPE:
      if (value == null) {
        unsetResourceByType();
      } else {
        setResourceByType((Map<TResourceType,Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_BY_TYPE:
      return getResourceByType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_BY_TYPE:
      return isSetResourceByType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TResourceGroup)
      return this.equals((TResourceGroup)that);
    return false;
  }

  public boolean equals(TResourceGroup that) {
    if (that == null)
      return false;

    boolean this_present_resourceByType = true && this.isSetResourceByType();
    boolean that_present_resourceByType = true && that.isSetResourceByType();
    if (this_present_resourceByType || that_present_resourceByType) {
      if (!(this_present_resourceByType && that_present_resourceByType))
        return false;
      if (!this.resourceByType.equals(that.resourceByType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resourceByType = true && (isSetResourceByType());
    list.add(present_resourceByType);
    if (present_resourceByType)
      list.add(resourceByType);

    return list.hashCode();
  }

  @Override
  public int compareTo(TResourceGroup other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResourceByType()).compareTo(other.isSetResourceByType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceByType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceByType, other.resourceByType);
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
    StringBuilder sb = new StringBuilder("TResourceGroup(");
    boolean first = true;

    sb.append("resourceByType:");
    if (this.resourceByType == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceByType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (resourceByType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resourceByType' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TResourceGroupStandardSchemeFactory implements SchemeFactory {
    public TResourceGroupStandardScheme getScheme() {
      return new TResourceGroupStandardScheme();
    }
  }

  private static class TResourceGroupStandardScheme extends StandardScheme<TResourceGroup> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResourceGroup struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_BY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map54 = iprot.readMapBegin();
                struct.resourceByType = new HashMap<TResourceType,Integer>(2*_map54.size);
                TResourceType _key55;
                int _val56;
                for (int _i57 = 0; _i57 < _map54.size; ++_i57)
                {
                  _key55 = com.baidu.palo.thrift.TResourceType.findByValue(iprot.readI32());
                  _val56 = iprot.readI32();
                  struct.resourceByType.put(_key55, _val56);
                }
                iprot.readMapEnd();
              }
              struct.setResourceByTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResourceGroup struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourceByType != null) {
        oprot.writeFieldBegin(RESOURCE_BY_TYPE_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I32, struct.resourceByType.size()));
          for (Map.Entry<TResourceType, Integer> _iter58 : struct.resourceByType.entrySet())
          {
            oprot.writeI32(_iter58.getKey().getValue());
            oprot.writeI32(_iter58.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResourceGroupTupleSchemeFactory implements SchemeFactory {
    public TResourceGroupTupleScheme getScheme() {
      return new TResourceGroupTupleScheme();
    }
  }

  private static class TResourceGroupTupleScheme extends TupleScheme<TResourceGroup> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResourceGroup struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.resourceByType.size());
        for (Map.Entry<TResourceType, Integer> _iter59 : struct.resourceByType.entrySet())
        {
          oprot.writeI32(_iter59.getKey().getValue());
          oprot.writeI32(_iter59.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResourceGroup struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map60 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.resourceByType = new HashMap<TResourceType,Integer>(2*_map60.size);
        TResourceType _key61;
        int _val62;
        for (int _i63 = 0; _i63 < _map60.size; ++_i63)
        {
          _key61 = com.baidu.palo.thrift.TResourceType.findByValue(iprot.readI32());
          _val62 = iprot.readI32();
          struct.resourceByType.put(_key61, _val62);
        }
      }
      struct.setResourceByTypeIsSet(true);
    }
  }

}

