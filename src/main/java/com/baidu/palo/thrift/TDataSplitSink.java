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
public class TDataSplitSink implements org.apache.thrift.TBase<TDataSplitSink, TDataSplitSink._Fields>, java.io.Serializable, Cloneable, Comparable<TDataSplitSink> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDataSplitSink");

  private static final org.apache.thrift.protocol.TField PARTITION_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_exprs", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField PARTITION_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_infos", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ROLLUP_SCHEMAS_FIELD_DESC = new org.apache.thrift.protocol.TField("rollup_schemas", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDataSplitSinkStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDataSplitSinkTupleSchemeFactory());
  }

  public List<com.baidu.palo.thrift.TExpr> partition_exprs; // required
  public List<com.baidu.palo.thrift.TRangePartition> partition_infos; // required
  public Map<String,TRollupSchema> rollup_schemas; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION_EXPRS((short)1, "partition_exprs"),
    PARTITION_INFOS((short)2, "partition_infos"),
    ROLLUP_SCHEMAS((short)4, "rollup_schemas");

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
        case 1: // PARTITION_EXPRS
          return PARTITION_EXPRS;
        case 2: // PARTITION_INFOS
          return PARTITION_INFOS;
        case 4: // ROLLUP_SCHEMAS
          return ROLLUP_SCHEMAS;
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
    tmpMap.put(_Fields.PARTITION_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("partition_exprs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TExpr.class))));
    tmpMap.put(_Fields.PARTITION_INFOS, new org.apache.thrift.meta_data.FieldMetaData("partition_infos", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TRangePartition.class))));
    tmpMap.put(_Fields.ROLLUP_SCHEMAS, new org.apache.thrift.meta_data.FieldMetaData("rollup_schemas", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRollupSchema.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDataSplitSink.class, metaDataMap);
  }

  public TDataSplitSink() {
  }

  public TDataSplitSink(
    List<com.baidu.palo.thrift.TExpr> partition_exprs,
    List<com.baidu.palo.thrift.TRangePartition> partition_infos,
    Map<String,TRollupSchema> rollup_schemas)
  {
    this();
    this.partition_exprs = partition_exprs;
    this.partition_infos = partition_infos;
    this.rollup_schemas = rollup_schemas;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDataSplitSink(TDataSplitSink other) {
    if (other.isSetPartition_exprs()) {
      List<com.baidu.palo.thrift.TExpr> __this__partition_exprs = new ArrayList<com.baidu.palo.thrift.TExpr>(other.partition_exprs.size());
      for (com.baidu.palo.thrift.TExpr other_element : other.partition_exprs) {
        __this__partition_exprs.add(new com.baidu.palo.thrift.TExpr(other_element));
      }
      this.partition_exprs = __this__partition_exprs;
    }
    if (other.isSetPartition_infos()) {
      List<com.baidu.palo.thrift.TRangePartition> __this__partition_infos = new ArrayList<com.baidu.palo.thrift.TRangePartition>(other.partition_infos.size());
      for (com.baidu.palo.thrift.TRangePartition other_element : other.partition_infos) {
        __this__partition_infos.add(new com.baidu.palo.thrift.TRangePartition(other_element));
      }
      this.partition_infos = __this__partition_infos;
    }
    if (other.isSetRollup_schemas()) {
      Map<String,TRollupSchema> __this__rollup_schemas = new HashMap<String,TRollupSchema>(other.rollup_schemas.size());
      for (Map.Entry<String, TRollupSchema> other_element : other.rollup_schemas.entrySet()) {

        String other_element_key = other_element.getKey();
        TRollupSchema other_element_value = other_element.getValue();

        String __this__rollup_schemas_copy_key = other_element_key;

        TRollupSchema __this__rollup_schemas_copy_value = new TRollupSchema(other_element_value);

        __this__rollup_schemas.put(__this__rollup_schemas_copy_key, __this__rollup_schemas_copy_value);
      }
      this.rollup_schemas = __this__rollup_schemas;
    }
  }

  public TDataSplitSink deepCopy() {
    return new TDataSplitSink(this);
  }

  @Override
  public void clear() {
    this.partition_exprs = null;
    this.partition_infos = null;
    this.rollup_schemas = null;
  }

  public int getPartition_exprsSize() {
    return (this.partition_exprs == null) ? 0 : this.partition_exprs.size();
  }

  public java.util.Iterator<com.baidu.palo.thrift.TExpr> getPartition_exprsIterator() {
    return (this.partition_exprs == null) ? null : this.partition_exprs.iterator();
  }

  public void addToPartition_exprs(com.baidu.palo.thrift.TExpr elem) {
    if (this.partition_exprs == null) {
      this.partition_exprs = new ArrayList<com.baidu.palo.thrift.TExpr>();
    }
    this.partition_exprs.add(elem);
  }

  public List<com.baidu.palo.thrift.TExpr> getPartition_exprs() {
    return this.partition_exprs;
  }

  public TDataSplitSink setPartition_exprs(List<com.baidu.palo.thrift.TExpr> partition_exprs) {
    this.partition_exprs = partition_exprs;
    return this;
  }

  public void unsetPartition_exprs() {
    this.partition_exprs = null;
  }

  /** Returns true if field partition_exprs is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_exprs() {
    return this.partition_exprs != null;
  }

  public void setPartition_exprsIsSet(boolean value) {
    if (!value) {
      this.partition_exprs = null;
    }
  }

  public int getPartition_infosSize() {
    return (this.partition_infos == null) ? 0 : this.partition_infos.size();
  }

  public java.util.Iterator<com.baidu.palo.thrift.TRangePartition> getPartition_infosIterator() {
    return (this.partition_infos == null) ? null : this.partition_infos.iterator();
  }

  public void addToPartition_infos(com.baidu.palo.thrift.TRangePartition elem) {
    if (this.partition_infos == null) {
      this.partition_infos = new ArrayList<com.baidu.palo.thrift.TRangePartition>();
    }
    this.partition_infos.add(elem);
  }

  public List<com.baidu.palo.thrift.TRangePartition> getPartition_infos() {
    return this.partition_infos;
  }

  public TDataSplitSink setPartition_infos(List<com.baidu.palo.thrift.TRangePartition> partition_infos) {
    this.partition_infos = partition_infos;
    return this;
  }

  public void unsetPartition_infos() {
    this.partition_infos = null;
  }

  /** Returns true if field partition_infos is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_infos() {
    return this.partition_infos != null;
  }

  public void setPartition_infosIsSet(boolean value) {
    if (!value) {
      this.partition_infos = null;
    }
  }

  public int getRollup_schemasSize() {
    return (this.rollup_schemas == null) ? 0 : this.rollup_schemas.size();
  }

  public void putToRollup_schemas(String key, TRollupSchema val) {
    if (this.rollup_schemas == null) {
      this.rollup_schemas = new HashMap<String,TRollupSchema>();
    }
    this.rollup_schemas.put(key, val);
  }

  public Map<String,TRollupSchema> getRollup_schemas() {
    return this.rollup_schemas;
  }

  public TDataSplitSink setRollup_schemas(Map<String,TRollupSchema> rollup_schemas) {
    this.rollup_schemas = rollup_schemas;
    return this;
  }

  public void unsetRollup_schemas() {
    this.rollup_schemas = null;
  }

  /** Returns true if field rollup_schemas is set (has been assigned a value) and false otherwise */
  public boolean isSetRollup_schemas() {
    return this.rollup_schemas != null;
  }

  public void setRollup_schemasIsSet(boolean value) {
    if (!value) {
      this.rollup_schemas = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITION_EXPRS:
      if (value == null) {
        unsetPartition_exprs();
      } else {
        setPartition_exprs((List<com.baidu.palo.thrift.TExpr>)value);
      }
      break;

    case PARTITION_INFOS:
      if (value == null) {
        unsetPartition_infos();
      } else {
        setPartition_infos((List<com.baidu.palo.thrift.TRangePartition>)value);
      }
      break;

    case ROLLUP_SCHEMAS:
      if (value == null) {
        unsetRollup_schemas();
      } else {
        setRollup_schemas((Map<String,TRollupSchema>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_EXPRS:
      return getPartition_exprs();

    case PARTITION_INFOS:
      return getPartition_infos();

    case ROLLUP_SCHEMAS:
      return getRollup_schemas();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_EXPRS:
      return isSetPartition_exprs();
    case PARTITION_INFOS:
      return isSetPartition_infos();
    case ROLLUP_SCHEMAS:
      return isSetRollup_schemas();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDataSplitSink)
      return this.equals((TDataSplitSink)that);
    return false;
  }

  public boolean equals(TDataSplitSink that) {
    if (that == null)
      return false;

    boolean this_present_partition_exprs = true && this.isSetPartition_exprs();
    boolean that_present_partition_exprs = true && that.isSetPartition_exprs();
    if (this_present_partition_exprs || that_present_partition_exprs) {
      if (!(this_present_partition_exprs && that_present_partition_exprs))
        return false;
      if (!this.partition_exprs.equals(that.partition_exprs))
        return false;
    }

    boolean this_present_partition_infos = true && this.isSetPartition_infos();
    boolean that_present_partition_infos = true && that.isSetPartition_infos();
    if (this_present_partition_infos || that_present_partition_infos) {
      if (!(this_present_partition_infos && that_present_partition_infos))
        return false;
      if (!this.partition_infos.equals(that.partition_infos))
        return false;
    }

    boolean this_present_rollup_schemas = true && this.isSetRollup_schemas();
    boolean that_present_rollup_schemas = true && that.isSetRollup_schemas();
    if (this_present_rollup_schemas || that_present_rollup_schemas) {
      if (!(this_present_rollup_schemas && that_present_rollup_schemas))
        return false;
      if (!this.rollup_schemas.equals(that.rollup_schemas))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_partition_exprs = true && (isSetPartition_exprs());
    list.add(present_partition_exprs);
    if (present_partition_exprs)
      list.add(partition_exprs);

    boolean present_partition_infos = true && (isSetPartition_infos());
    list.add(present_partition_infos);
    if (present_partition_infos)
      list.add(partition_infos);

    boolean present_rollup_schemas = true && (isSetRollup_schemas());
    list.add(present_rollup_schemas);
    if (present_rollup_schemas)
      list.add(rollup_schemas);

    return list.hashCode();
  }

  @Override
  public int compareTo(TDataSplitSink other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartition_exprs()).compareTo(other.isSetPartition_exprs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_exprs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_exprs, other.partition_exprs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartition_infos()).compareTo(other.isSetPartition_infos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_infos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_infos, other.partition_infos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRollup_schemas()).compareTo(other.isSetRollup_schemas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRollup_schemas()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rollup_schemas, other.rollup_schemas);
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
    StringBuilder sb = new StringBuilder("TDataSplitSink(");
    boolean first = true;

    sb.append("partition_exprs:");
    if (this.partition_exprs == null) {
      sb.append("null");
    } else {
      sb.append(this.partition_exprs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partition_infos:");
    if (this.partition_infos == null) {
      sb.append("null");
    } else {
      sb.append(this.partition_infos);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rollup_schemas:");
    if (this.rollup_schemas == null) {
      sb.append("null");
    } else {
      sb.append(this.rollup_schemas);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (partition_exprs == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partition_exprs' was not present! Struct: " + toString());
    }
    if (partition_infos == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partition_infos' was not present! Struct: " + toString());
    }
    if (rollup_schemas == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rollup_schemas' was not present! Struct: " + toString());
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

  private static class TDataSplitSinkStandardSchemeFactory implements SchemeFactory {
    public TDataSplitSinkStandardScheme getScheme() {
      return new TDataSplitSinkStandardScheme();
    }
  }

  private static class TDataSplitSinkStandardScheme extends StandardScheme<TDataSplitSink> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDataSplitSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.partition_exprs = new ArrayList<com.baidu.palo.thrift.TExpr>(_list24.size);
                com.baidu.palo.thrift.TExpr _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new com.baidu.palo.thrift.TExpr();
                  _elem25.read(iprot);
                  struct.partition_exprs.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setPartition_exprsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list27 = iprot.readListBegin();
                struct.partition_infos = new ArrayList<com.baidu.palo.thrift.TRangePartition>(_list27.size);
                com.baidu.palo.thrift.TRangePartition _elem28;
                for (int _i29 = 0; _i29 < _list27.size; ++_i29)
                {
                  _elem28 = new com.baidu.palo.thrift.TRangePartition();
                  _elem28.read(iprot);
                  struct.partition_infos.add(_elem28);
                }
                iprot.readListEnd();
              }
              struct.setPartition_infosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROLLUP_SCHEMAS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map30 = iprot.readMapBegin();
                struct.rollup_schemas = new HashMap<String,TRollupSchema>(2*_map30.size);
                String _key31;
                TRollupSchema _val32;
                for (int _i33 = 0; _i33 < _map30.size; ++_i33)
                {
                  _key31 = iprot.readString();
                  _val32 = new TRollupSchema();
                  _val32.read(iprot);
                  struct.rollup_schemas.put(_key31, _val32);
                }
                iprot.readMapEnd();
              }
              struct.setRollup_schemasIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDataSplitSink struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partition_exprs != null) {
        oprot.writeFieldBegin(PARTITION_EXPRS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_exprs.size()));
          for (com.baidu.palo.thrift.TExpr _iter34 : struct.partition_exprs)
          {
            _iter34.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.partition_infos != null) {
        oprot.writeFieldBegin(PARTITION_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_infos.size()));
          for (com.baidu.palo.thrift.TRangePartition _iter35 : struct.partition_infos)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.rollup_schemas != null) {
        oprot.writeFieldBegin(ROLLUP_SCHEMAS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.rollup_schemas.size()));
          for (Map.Entry<String, TRollupSchema> _iter36 : struct.rollup_schemas.entrySet())
          {
            oprot.writeString(_iter36.getKey());
            _iter36.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDataSplitSinkTupleSchemeFactory implements SchemeFactory {
    public TDataSplitSinkTupleScheme getScheme() {
      return new TDataSplitSinkTupleScheme();
    }
  }

  private static class TDataSplitSinkTupleScheme extends TupleScheme<TDataSplitSink> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDataSplitSink struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.partition_exprs.size());
        for (com.baidu.palo.thrift.TExpr _iter37 : struct.partition_exprs)
        {
          _iter37.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.partition_infos.size());
        for (com.baidu.palo.thrift.TRangePartition _iter38 : struct.partition_infos)
        {
          _iter38.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.rollup_schemas.size());
        for (Map.Entry<String, TRollupSchema> _iter39 : struct.rollup_schemas.entrySet())
        {
          oprot.writeString(_iter39.getKey());
          _iter39.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDataSplitSink struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list40 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.partition_exprs = new ArrayList<com.baidu.palo.thrift.TExpr>(_list40.size);
        com.baidu.palo.thrift.TExpr _elem41;
        for (int _i42 = 0; _i42 < _list40.size; ++_i42)
        {
          _elem41 = new com.baidu.palo.thrift.TExpr();
          _elem41.read(iprot);
          struct.partition_exprs.add(_elem41);
        }
      }
      struct.setPartition_exprsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list43 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.partition_infos = new ArrayList<com.baidu.palo.thrift.TRangePartition>(_list43.size);
        com.baidu.palo.thrift.TRangePartition _elem44;
        for (int _i45 = 0; _i45 < _list43.size; ++_i45)
        {
          _elem44 = new com.baidu.palo.thrift.TRangePartition();
          _elem44.read(iprot);
          struct.partition_infos.add(_elem44);
        }
      }
      struct.setPartition_infosIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map46 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.rollup_schemas = new HashMap<String,TRollupSchema>(2*_map46.size);
        String _key47;
        TRollupSchema _val48;
        for (int _i49 = 0; _i49 < _map46.size; ++_i49)
        {
          _key47 = iprot.readString();
          _val48 = new TRollupSchema();
          _val48.read(iprot);
          struct.rollup_schemas.put(_key47, _val48);
        }
      }
      struct.setRollup_schemasIsSet(true);
    }
  }

}

