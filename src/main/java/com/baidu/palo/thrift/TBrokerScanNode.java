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
public class TBrokerScanNode implements org.apache.thrift.TBase<TBrokerScanNode, TBrokerScanNode._Fields>, java.io.Serializable, Cloneable, Comparable<TBrokerScanNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBrokerScanNode");

  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PARTITION_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_exprs", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField PARTITION_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_infos", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TBrokerScanNodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TBrokerScanNodeTupleSchemeFactory());
  }

  public int tuple_id; // required
  public List<com.baidu.palo.thrift.TExpr> partition_exprs; // optional
  public List<com.baidu.palo.thrift.TRangePartition> partition_infos; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_ID((short)1, "tuple_id"),
    PARTITION_EXPRS((short)2, "partition_exprs"),
    PARTITION_INFOS((short)3, "partition_infos");

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
        case 1: // TUPLE_ID
          return TUPLE_ID;
        case 2: // PARTITION_EXPRS
          return PARTITION_EXPRS;
        case 3: // PARTITION_INFOS
          return PARTITION_INFOS;
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
  private static final int __TUPLE_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARTITION_EXPRS,_Fields.PARTITION_INFOS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.PARTITION_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("partition_exprs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TExpr.class))));
    tmpMap.put(_Fields.PARTITION_INFOS, new org.apache.thrift.meta_data.FieldMetaData("partition_infos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TRangePartition.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBrokerScanNode.class, metaDataMap);
  }

  public TBrokerScanNode() {
  }

  public TBrokerScanNode(
    int tuple_id)
  {
    this();
    this.tuple_id = tuple_id;
    setTuple_idIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBrokerScanNode(TBrokerScanNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tuple_id = other.tuple_id;
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
  }

  public TBrokerScanNode deepCopy() {
    return new TBrokerScanNode(this);
  }

  @Override
  public void clear() {
    setTuple_idIsSet(false);
    this.tuple_id = 0;
    this.partition_exprs = null;
    this.partition_infos = null;
  }

  public int getTuple_id() {
    return this.tuple_id;
  }

  public TBrokerScanNode setTuple_id(int tuple_id) {
    this.tuple_id = tuple_id;
    setTuple_idIsSet(true);
    return this;
  }

  public void unsetTuple_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  /** Returns true if field tuple_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTuple_id() {
    return EncodingUtils.testBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  public void setTuple_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TUPLE_ID_ISSET_ID, value);
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

  public TBrokerScanNode setPartition_exprs(List<com.baidu.palo.thrift.TExpr> partition_exprs) {
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

  public TBrokerScanNode setPartition_infos(List<com.baidu.palo.thrift.TRangePartition> partition_infos) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TUPLE_ID:
      if (value == null) {
        unsetTuple_id();
      } else {
        setTuple_id((Integer)value);
      }
      break;

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

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_ID:
      return getTuple_id();

    case PARTITION_EXPRS:
      return getPartition_exprs();

    case PARTITION_INFOS:
      return getPartition_infos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TUPLE_ID:
      return isSetTuple_id();
    case PARTITION_EXPRS:
      return isSetPartition_exprs();
    case PARTITION_INFOS:
      return isSetPartition_infos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TBrokerScanNode)
      return this.equals((TBrokerScanNode)that);
    return false;
  }

  public boolean equals(TBrokerScanNode that) {
    if (that == null)
      return false;

    boolean this_present_tuple_id = true;
    boolean that_present_tuple_id = true;
    if (this_present_tuple_id || that_present_tuple_id) {
      if (!(this_present_tuple_id && that_present_tuple_id))
        return false;
      if (this.tuple_id != that.tuple_id)
        return false;
    }

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

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tuple_id = true;
    list.add(present_tuple_id);
    if (present_tuple_id)
      list.add(tuple_id);

    boolean present_partition_exprs = true && (isSetPartition_exprs());
    list.add(present_partition_exprs);
    if (present_partition_exprs)
      list.add(partition_exprs);

    boolean present_partition_infos = true && (isSetPartition_infos());
    list.add(present_partition_infos);
    if (present_partition_infos)
      list.add(partition_infos);

    return list.hashCode();
  }

  @Override
  public int compareTo(TBrokerScanNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTuple_id()).compareTo(other.isSetTuple_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTuple_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_id, other.tuple_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    StringBuilder sb = new StringBuilder("TBrokerScanNode(");
    boolean first = true;

    sb.append("tuple_id:");
    sb.append(this.tuple_id);
    first = false;
    if (isSetPartition_exprs()) {
      if (!first) sb.append(", ");
      sb.append("partition_exprs:");
      if (this.partition_exprs == null) {
        sb.append("null");
      } else {
        sb.append(this.partition_exprs);
      }
      first = false;
    }
    if (isSetPartition_infos()) {
      if (!first) sb.append(", ");
      sb.append("partition_infos:");
      if (this.partition_infos == null) {
        sb.append("null");
      } else {
        sb.append(this.partition_infos);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tuple_id' because it's a primitive and you chose the non-beans generator.
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

  private static class TBrokerScanNodeStandardSchemeFactory implements SchemeFactory {
    public TBrokerScanNodeStandardScheme getScheme() {
      return new TBrokerScanNodeStandardScheme();
    }
  }

  private static class TBrokerScanNodeStandardScheme extends StandardScheme<TBrokerScanNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TBrokerScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TUPLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tuple_id = iprot.readI32();
              struct.setTuple_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list84 = iprot.readListBegin();
                struct.partition_exprs = new ArrayList<com.baidu.palo.thrift.TExpr>(_list84.size);
                com.baidu.palo.thrift.TExpr _elem85;
                for (int _i86 = 0; _i86 < _list84.size; ++_i86)
                {
                  _elem85 = new com.baidu.palo.thrift.TExpr();
                  _elem85.read(iprot);
                  struct.partition_exprs.add(_elem85);
                }
                iprot.readListEnd();
              }
              struct.setPartition_exprsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARTITION_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list87 = iprot.readListBegin();
                struct.partition_infos = new ArrayList<com.baidu.palo.thrift.TRangePartition>(_list87.size);
                com.baidu.palo.thrift.TRangePartition _elem88;
                for (int _i89 = 0; _i89 < _list87.size; ++_i89)
                {
                  _elem88 = new com.baidu.palo.thrift.TRangePartition();
                  _elem88.read(iprot);
                  struct.partition_infos.add(_elem88);
                }
                iprot.readListEnd();
              }
              struct.setPartition_infosIsSet(true);
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
      if (!struct.isSetTuple_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TBrokerScanNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
      oprot.writeI32(struct.tuple_id);
      oprot.writeFieldEnd();
      if (struct.partition_exprs != null) {
        if (struct.isSetPartition_exprs()) {
          oprot.writeFieldBegin(PARTITION_EXPRS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_exprs.size()));
            for (com.baidu.palo.thrift.TExpr _iter90 : struct.partition_exprs)
            {
              _iter90.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.partition_infos != null) {
        if (struct.isSetPartition_infos()) {
          oprot.writeFieldBegin(PARTITION_INFOS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_infos.size()));
            for (com.baidu.palo.thrift.TRangePartition _iter91 : struct.partition_infos)
            {
              _iter91.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBrokerScanNodeTupleSchemeFactory implements SchemeFactory {
    public TBrokerScanNodeTupleScheme getScheme() {
      return new TBrokerScanNodeTupleScheme();
    }
  }

  private static class TBrokerScanNodeTupleScheme extends TupleScheme<TBrokerScanNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBrokerScanNode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.tuple_id);
      BitSet optionals = new BitSet();
      if (struct.isSetPartition_exprs()) {
        optionals.set(0);
      }
      if (struct.isSetPartition_infos()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPartition_exprs()) {
        {
          oprot.writeI32(struct.partition_exprs.size());
          for (com.baidu.palo.thrift.TExpr _iter92 : struct.partition_exprs)
          {
            _iter92.write(oprot);
          }
        }
      }
      if (struct.isSetPartition_infos()) {
        {
          oprot.writeI32(struct.partition_infos.size());
          for (com.baidu.palo.thrift.TRangePartition _iter93 : struct.partition_infos)
          {
            _iter93.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBrokerScanNode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.tuple_id = iprot.readI32();
      struct.setTuple_idIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list94 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.partition_exprs = new ArrayList<com.baidu.palo.thrift.TExpr>(_list94.size);
          com.baidu.palo.thrift.TExpr _elem95;
          for (int _i96 = 0; _i96 < _list94.size; ++_i96)
          {
            _elem95 = new com.baidu.palo.thrift.TExpr();
            _elem95.read(iprot);
            struct.partition_exprs.add(_elem95);
          }
        }
        struct.setPartition_exprsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list97 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.partition_infos = new ArrayList<com.baidu.palo.thrift.TRangePartition>(_list97.size);
          com.baidu.palo.thrift.TRangePartition _elem98;
          for (int _i99 = 0; _i99 < _list97.size; ++_i99)
          {
            _elem98 = new com.baidu.palo.thrift.TRangePartition();
            _elem98.read(iprot);
            struct.partition_infos.add(_elem98);
          }
        }
        struct.setPartition_infosIsSet(true);
      }
    }
  }

}

