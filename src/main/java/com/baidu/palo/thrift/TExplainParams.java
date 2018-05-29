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
public class TExplainParams implements org.apache.thrift.TBase<TExplainParams, TExplainParams._Fields>, java.io.Serializable, Cloneable, Comparable<TExplainParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TExplainParams");

  private static final org.apache.thrift.protocol.TField EXPLAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("explain", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TExplainParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TExplainParamsTupleSchemeFactory());
  }

  public String explain; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPLAIN((short)1, "explain");

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
        case 1: // EXPLAIN
          return EXPLAIN;
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
    tmpMap.put(_Fields.EXPLAIN, new org.apache.thrift.meta_data.FieldMetaData("explain", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TExplainParams.class, metaDataMap);
  }

  public TExplainParams() {
  }

  public TExplainParams(
    String explain)
  {
    this();
    this.explain = explain;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TExplainParams(TExplainParams other) {
    if (other.isSetExplain()) {
      this.explain = other.explain;
    }
  }

  public TExplainParams deepCopy() {
    return new TExplainParams(this);
  }

  @Override
  public void clear() {
    this.explain = null;
  }

  public String getExplain() {
    return this.explain;
  }

  public TExplainParams setExplain(String explain) {
    this.explain = explain;
    return this;
  }

  public void unsetExplain() {
    this.explain = null;
  }

  /** Returns true if field explain is set (has been assigned a value) and false otherwise */
  public boolean isSetExplain() {
    return this.explain != null;
  }

  public void setExplainIsSet(boolean value) {
    if (!value) {
      this.explain = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXPLAIN:
      if (value == null) {
        unsetExplain();
      } else {
        setExplain((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPLAIN:
      return getExplain();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXPLAIN:
      return isSetExplain();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TExplainParams)
      return this.equals((TExplainParams)that);
    return false;
  }

  public boolean equals(TExplainParams that) {
    if (that == null)
      return false;

    boolean this_present_explain = true && this.isSetExplain();
    boolean that_present_explain = true && that.isSetExplain();
    if (this_present_explain || that_present_explain) {
      if (!(this_present_explain && that_present_explain))
        return false;
      if (!this.explain.equals(that.explain))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_explain = true && (isSetExplain());
    list.add(present_explain);
    if (present_explain)
      list.add(explain);

    return list.hashCode();
  }

  @Override
  public int compareTo(TExplainParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExplain()).compareTo(other.isSetExplain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExplain()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.explain, other.explain);
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
    StringBuilder sb = new StringBuilder("TExplainParams(");
    boolean first = true;

    sb.append("explain:");
    if (this.explain == null) {
      sb.append("null");
    } else {
      sb.append(this.explain);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (explain == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'explain' was not present! Struct: " + toString());
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

  private static class TExplainParamsStandardSchemeFactory implements SchemeFactory {
    public TExplainParamsStandardScheme getScheme() {
      return new TExplainParamsStandardScheme();
    }
  }

  private static class TExplainParamsStandardScheme extends StandardScheme<TExplainParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TExplainParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPLAIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.explain = iprot.readString();
              struct.setExplainIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TExplainParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.explain != null) {
        oprot.writeFieldBegin(EXPLAIN_FIELD_DESC);
        oprot.writeString(struct.explain);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TExplainParamsTupleSchemeFactory implements SchemeFactory {
    public TExplainParamsTupleScheme getScheme() {
      return new TExplainParamsTupleScheme();
    }
  }

  private static class TExplainParamsTupleScheme extends TupleScheme<TExplainParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TExplainParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.explain);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TExplainParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.explain = iprot.readString();
      struct.setExplainIsSet(true);
    }
  }

}

