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
public class TFunctionCallExpr implements org.apache.thrift.TBase<TFunctionCallExpr, TFunctionCallExpr._Fields>, java.io.Serializable, Cloneable, Comparable<TFunctionCallExpr> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFunctionCallExpr");

  private static final org.apache.thrift.protocol.TField FN_FIELD_DESC = new org.apache.thrift.protocol.TField("fn", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VARARG_START_IDX_FIELD_DESC = new org.apache.thrift.protocol.TField("vararg_start_idx", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TFunctionCallExprStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TFunctionCallExprTupleSchemeFactory());
  }

  public com.baidu.palo.thrift.TFunction fn; // required
  public int vararg_start_idx; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FN((short)1, "fn"),
    VARARG_START_IDX((short)2, "vararg_start_idx");

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
        case 1: // FN
          return FN;
        case 2: // VARARG_START_IDX
          return VARARG_START_IDX;
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
  private static final int __VARARG_START_IDX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.VARARG_START_IDX};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FN, new org.apache.thrift.meta_data.FieldMetaData("fn", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TFunction.class)));
    tmpMap.put(_Fields.VARARG_START_IDX, new org.apache.thrift.meta_data.FieldMetaData("vararg_start_idx", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFunctionCallExpr.class, metaDataMap);
  }

  public TFunctionCallExpr() {
  }

  public TFunctionCallExpr(
    com.baidu.palo.thrift.TFunction fn)
  {
    this();
    this.fn = fn;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFunctionCallExpr(TFunctionCallExpr other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFn()) {
      this.fn = new com.baidu.palo.thrift.TFunction(other.fn);
    }
    this.vararg_start_idx = other.vararg_start_idx;
  }

  public TFunctionCallExpr deepCopy() {
    return new TFunctionCallExpr(this);
  }

  @Override
  public void clear() {
    this.fn = null;
    setVararg_start_idxIsSet(false);
    this.vararg_start_idx = 0;
  }

  public com.baidu.palo.thrift.TFunction getFn() {
    return this.fn;
  }

  public TFunctionCallExpr setFn(com.baidu.palo.thrift.TFunction fn) {
    this.fn = fn;
    return this;
  }

  public void unsetFn() {
    this.fn = null;
  }

  /** Returns true if field fn is set (has been assigned a value) and false otherwise */
  public boolean isSetFn() {
    return this.fn != null;
  }

  public void setFnIsSet(boolean value) {
    if (!value) {
      this.fn = null;
    }
  }

  public int getVararg_start_idx() {
    return this.vararg_start_idx;
  }

  public TFunctionCallExpr setVararg_start_idx(int vararg_start_idx) {
    this.vararg_start_idx = vararg_start_idx;
    setVararg_start_idxIsSet(true);
    return this;
  }

  public void unsetVararg_start_idx() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VARARG_START_IDX_ISSET_ID);
  }

  /** Returns true if field vararg_start_idx is set (has been assigned a value) and false otherwise */
  public boolean isSetVararg_start_idx() {
    return EncodingUtils.testBit(__isset_bitfield, __VARARG_START_IDX_ISSET_ID);
  }

  public void setVararg_start_idxIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VARARG_START_IDX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FN:
      if (value == null) {
        unsetFn();
      } else {
        setFn((com.baidu.palo.thrift.TFunction)value);
      }
      break;

    case VARARG_START_IDX:
      if (value == null) {
        unsetVararg_start_idx();
      } else {
        setVararg_start_idx((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FN:
      return getFn();

    case VARARG_START_IDX:
      return getVararg_start_idx();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FN:
      return isSetFn();
    case VARARG_START_IDX:
      return isSetVararg_start_idx();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TFunctionCallExpr)
      return this.equals((TFunctionCallExpr)that);
    return false;
  }

  public boolean equals(TFunctionCallExpr that) {
    if (that == null)
      return false;

    boolean this_present_fn = true && this.isSetFn();
    boolean that_present_fn = true && that.isSetFn();
    if (this_present_fn || that_present_fn) {
      if (!(this_present_fn && that_present_fn))
        return false;
      if (!this.fn.equals(that.fn))
        return false;
    }

    boolean this_present_vararg_start_idx = true && this.isSetVararg_start_idx();
    boolean that_present_vararg_start_idx = true && that.isSetVararg_start_idx();
    if (this_present_vararg_start_idx || that_present_vararg_start_idx) {
      if (!(this_present_vararg_start_idx && that_present_vararg_start_idx))
        return false;
      if (this.vararg_start_idx != that.vararg_start_idx)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fn = true && (isSetFn());
    list.add(present_fn);
    if (present_fn)
      list.add(fn);

    boolean present_vararg_start_idx = true && (isSetVararg_start_idx());
    list.add(present_vararg_start_idx);
    if (present_vararg_start_idx)
      list.add(vararg_start_idx);

    return list.hashCode();
  }

  @Override
  public int compareTo(TFunctionCallExpr other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFn()).compareTo(other.isSetFn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fn, other.fn);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVararg_start_idx()).compareTo(other.isSetVararg_start_idx());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVararg_start_idx()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vararg_start_idx, other.vararg_start_idx);
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
    StringBuilder sb = new StringBuilder("TFunctionCallExpr(");
    boolean first = true;

    sb.append("fn:");
    if (this.fn == null) {
      sb.append("null");
    } else {
      sb.append(this.fn);
    }
    first = false;
    if (isSetVararg_start_idx()) {
      if (!first) sb.append(", ");
      sb.append("vararg_start_idx:");
      sb.append(this.vararg_start_idx);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (fn == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fn' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (fn != null) {
      fn.validate();
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

  private static class TFunctionCallExprStandardSchemeFactory implements SchemeFactory {
    public TFunctionCallExprStandardScheme getScheme() {
      return new TFunctionCallExprStandardScheme();
    }
  }

  private static class TFunctionCallExprStandardScheme extends StandardScheme<TFunctionCallExpr> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFunctionCallExpr struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fn = new com.baidu.palo.thrift.TFunction();
              struct.fn.read(iprot);
              struct.setFnIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VARARG_START_IDX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.vararg_start_idx = iprot.readI32();
              struct.setVararg_start_idxIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFunctionCallExpr struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fn != null) {
        oprot.writeFieldBegin(FN_FIELD_DESC);
        struct.fn.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetVararg_start_idx()) {
        oprot.writeFieldBegin(VARARG_START_IDX_FIELD_DESC);
        oprot.writeI32(struct.vararg_start_idx);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFunctionCallExprTupleSchemeFactory implements SchemeFactory {
    public TFunctionCallExprTupleScheme getScheme() {
      return new TFunctionCallExprTupleScheme();
    }
  }

  private static class TFunctionCallExprTupleScheme extends TupleScheme<TFunctionCallExpr> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFunctionCallExpr struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.fn.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetVararg_start_idx()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetVararg_start_idx()) {
        oprot.writeI32(struct.vararg_start_idx);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFunctionCallExpr struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.fn = new com.baidu.palo.thrift.TFunction();
      struct.fn.read(iprot);
      struct.setFnIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.vararg_start_idx = iprot.readI32();
        struct.setVararg_start_idxIsSet(true);
      }
    }
  }

}
