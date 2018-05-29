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
public class TMergeNode implements org.apache.thrift.TBase<TMergeNode, TMergeNode._Fields>, java.io.Serializable, Cloneable, Comparable<TMergeNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMergeNode");

  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RESULT_EXPR_LISTS_FIELD_DESC = new org.apache.thrift.protocol.TField("result_expr_lists", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField CONST_EXPR_LISTS_FIELD_DESC = new org.apache.thrift.protocol.TField("const_expr_lists", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TMergeNodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TMergeNodeTupleSchemeFactory());
  }

  public int tuple_id; // required
  public List<List<com.baidu.palo.thrift.TExpr>> result_expr_lists; // required
  public List<List<com.baidu.palo.thrift.TExpr>> const_expr_lists; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_ID((short)1, "tuple_id"),
    RESULT_EXPR_LISTS((short)2, "result_expr_lists"),
    CONST_EXPR_LISTS((short)3, "const_expr_lists");

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
        case 2: // RESULT_EXPR_LISTS
          return RESULT_EXPR_LISTS;
        case 3: // CONST_EXPR_LISTS
          return CONST_EXPR_LISTS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.RESULT_EXPR_LISTS, new org.apache.thrift.meta_data.FieldMetaData("result_expr_lists", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TExpr.class)))));
    tmpMap.put(_Fields.CONST_EXPR_LISTS, new org.apache.thrift.meta_data.FieldMetaData("const_expr_lists", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TExpr.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMergeNode.class, metaDataMap);
  }

  public TMergeNode() {
  }

  public TMergeNode(
    int tuple_id,
    List<List<com.baidu.palo.thrift.TExpr>> result_expr_lists,
    List<List<com.baidu.palo.thrift.TExpr>> const_expr_lists)
  {
    this();
    this.tuple_id = tuple_id;
    setTuple_idIsSet(true);
    this.result_expr_lists = result_expr_lists;
    this.const_expr_lists = const_expr_lists;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMergeNode(TMergeNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tuple_id = other.tuple_id;
    if (other.isSetResult_expr_lists()) {
      List<List<com.baidu.palo.thrift.TExpr>> __this__result_expr_lists = new ArrayList<List<com.baidu.palo.thrift.TExpr>>(other.result_expr_lists.size());
      for (List<com.baidu.palo.thrift.TExpr> other_element : other.result_expr_lists) {
        List<com.baidu.palo.thrift.TExpr> __this__result_expr_lists_copy = new ArrayList<com.baidu.palo.thrift.TExpr>(other_element.size());
        for (com.baidu.palo.thrift.TExpr other_element_element : other_element) {
          __this__result_expr_lists_copy.add(new com.baidu.palo.thrift.TExpr(other_element_element));
        }
        __this__result_expr_lists.add(__this__result_expr_lists_copy);
      }
      this.result_expr_lists = __this__result_expr_lists;
    }
    if (other.isSetConst_expr_lists()) {
      List<List<com.baidu.palo.thrift.TExpr>> __this__const_expr_lists = new ArrayList<List<com.baidu.palo.thrift.TExpr>>(other.const_expr_lists.size());
      for (List<com.baidu.palo.thrift.TExpr> other_element : other.const_expr_lists) {
        List<com.baidu.palo.thrift.TExpr> __this__const_expr_lists_copy = new ArrayList<com.baidu.palo.thrift.TExpr>(other_element.size());
        for (com.baidu.palo.thrift.TExpr other_element_element : other_element) {
          __this__const_expr_lists_copy.add(new com.baidu.palo.thrift.TExpr(other_element_element));
        }
        __this__const_expr_lists.add(__this__const_expr_lists_copy);
      }
      this.const_expr_lists = __this__const_expr_lists;
    }
  }

  public TMergeNode deepCopy() {
    return new TMergeNode(this);
  }

  @Override
  public void clear() {
    setTuple_idIsSet(false);
    this.tuple_id = 0;
    this.result_expr_lists = null;
    this.const_expr_lists = null;
  }

  public int getTuple_id() {
    return this.tuple_id;
  }

  public TMergeNode setTuple_id(int tuple_id) {
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

  public int getResult_expr_listsSize() {
    return (this.result_expr_lists == null) ? 0 : this.result_expr_lists.size();
  }

  public java.util.Iterator<List<com.baidu.palo.thrift.TExpr>> getResult_expr_listsIterator() {
    return (this.result_expr_lists == null) ? null : this.result_expr_lists.iterator();
  }

  public void addToResult_expr_lists(List<com.baidu.palo.thrift.TExpr> elem) {
    if (this.result_expr_lists == null) {
      this.result_expr_lists = new ArrayList<List<com.baidu.palo.thrift.TExpr>>();
    }
    this.result_expr_lists.add(elem);
  }

  public List<List<com.baidu.palo.thrift.TExpr>> getResult_expr_lists() {
    return this.result_expr_lists;
  }

  public TMergeNode setResult_expr_lists(List<List<com.baidu.palo.thrift.TExpr>> result_expr_lists) {
    this.result_expr_lists = result_expr_lists;
    return this;
  }

  public void unsetResult_expr_lists() {
    this.result_expr_lists = null;
  }

  /** Returns true if field result_expr_lists is set (has been assigned a value) and false otherwise */
  public boolean isSetResult_expr_lists() {
    return this.result_expr_lists != null;
  }

  public void setResult_expr_listsIsSet(boolean value) {
    if (!value) {
      this.result_expr_lists = null;
    }
  }

  public int getConst_expr_listsSize() {
    return (this.const_expr_lists == null) ? 0 : this.const_expr_lists.size();
  }

  public java.util.Iterator<List<com.baidu.palo.thrift.TExpr>> getConst_expr_listsIterator() {
    return (this.const_expr_lists == null) ? null : this.const_expr_lists.iterator();
  }

  public void addToConst_expr_lists(List<com.baidu.palo.thrift.TExpr> elem) {
    if (this.const_expr_lists == null) {
      this.const_expr_lists = new ArrayList<List<com.baidu.palo.thrift.TExpr>>();
    }
    this.const_expr_lists.add(elem);
  }

  public List<List<com.baidu.palo.thrift.TExpr>> getConst_expr_lists() {
    return this.const_expr_lists;
  }

  public TMergeNode setConst_expr_lists(List<List<com.baidu.palo.thrift.TExpr>> const_expr_lists) {
    this.const_expr_lists = const_expr_lists;
    return this;
  }

  public void unsetConst_expr_lists() {
    this.const_expr_lists = null;
  }

  /** Returns true if field const_expr_lists is set (has been assigned a value) and false otherwise */
  public boolean isSetConst_expr_lists() {
    return this.const_expr_lists != null;
  }

  public void setConst_expr_listsIsSet(boolean value) {
    if (!value) {
      this.const_expr_lists = null;
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

    case RESULT_EXPR_LISTS:
      if (value == null) {
        unsetResult_expr_lists();
      } else {
        setResult_expr_lists((List<List<com.baidu.palo.thrift.TExpr>>)value);
      }
      break;

    case CONST_EXPR_LISTS:
      if (value == null) {
        unsetConst_expr_lists();
      } else {
        setConst_expr_lists((List<List<com.baidu.palo.thrift.TExpr>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_ID:
      return getTuple_id();

    case RESULT_EXPR_LISTS:
      return getResult_expr_lists();

    case CONST_EXPR_LISTS:
      return getConst_expr_lists();

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
    case RESULT_EXPR_LISTS:
      return isSetResult_expr_lists();
    case CONST_EXPR_LISTS:
      return isSetConst_expr_lists();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMergeNode)
      return this.equals((TMergeNode)that);
    return false;
  }

  public boolean equals(TMergeNode that) {
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

    boolean this_present_result_expr_lists = true && this.isSetResult_expr_lists();
    boolean that_present_result_expr_lists = true && that.isSetResult_expr_lists();
    if (this_present_result_expr_lists || that_present_result_expr_lists) {
      if (!(this_present_result_expr_lists && that_present_result_expr_lists))
        return false;
      if (!this.result_expr_lists.equals(that.result_expr_lists))
        return false;
    }

    boolean this_present_const_expr_lists = true && this.isSetConst_expr_lists();
    boolean that_present_const_expr_lists = true && that.isSetConst_expr_lists();
    if (this_present_const_expr_lists || that_present_const_expr_lists) {
      if (!(this_present_const_expr_lists && that_present_const_expr_lists))
        return false;
      if (!this.const_expr_lists.equals(that.const_expr_lists))
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

    boolean present_result_expr_lists = true && (isSetResult_expr_lists());
    list.add(present_result_expr_lists);
    if (present_result_expr_lists)
      list.add(result_expr_lists);

    boolean present_const_expr_lists = true && (isSetConst_expr_lists());
    list.add(present_const_expr_lists);
    if (present_const_expr_lists)
      list.add(const_expr_lists);

    return list.hashCode();
  }

  @Override
  public int compareTo(TMergeNode other) {
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
    lastComparison = Boolean.valueOf(isSetResult_expr_lists()).compareTo(other.isSetResult_expr_lists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult_expr_lists()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result_expr_lists, other.result_expr_lists);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConst_expr_lists()).compareTo(other.isSetConst_expr_lists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConst_expr_lists()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.const_expr_lists, other.const_expr_lists);
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
    StringBuilder sb = new StringBuilder("TMergeNode(");
    boolean first = true;

    sb.append("tuple_id:");
    sb.append(this.tuple_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("result_expr_lists:");
    if (this.result_expr_lists == null) {
      sb.append("null");
    } else {
      sb.append(this.result_expr_lists);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("const_expr_lists:");
    if (this.const_expr_lists == null) {
      sb.append("null");
    } else {
      sb.append(this.const_expr_lists);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tuple_id' because it's a primitive and you chose the non-beans generator.
    if (result_expr_lists == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'result_expr_lists' was not present! Struct: " + toString());
    }
    if (const_expr_lists == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'const_expr_lists' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TMergeNodeStandardSchemeFactory implements SchemeFactory {
    public TMergeNodeStandardScheme getScheme() {
      return new TMergeNodeStandardScheme();
    }
  }

  private static class TMergeNodeStandardScheme extends StandardScheme<TMergeNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMergeNode struct) throws org.apache.thrift.TException {
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
          case 2: // RESULT_EXPR_LISTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list320 = iprot.readListBegin();
                struct.result_expr_lists = new ArrayList<List<com.baidu.palo.thrift.TExpr>>(_list320.size);
                List<com.baidu.palo.thrift.TExpr> _elem321;
                for (int _i322 = 0; _i322 < _list320.size; ++_i322)
                {
                  {
                    org.apache.thrift.protocol.TList _list323 = iprot.readListBegin();
                    _elem321 = new ArrayList<com.baidu.palo.thrift.TExpr>(_list323.size);
                    com.baidu.palo.thrift.TExpr _elem324;
                    for (int _i325 = 0; _i325 < _list323.size; ++_i325)
                    {
                      _elem324 = new com.baidu.palo.thrift.TExpr();
                      _elem324.read(iprot);
                      _elem321.add(_elem324);
                    }
                    iprot.readListEnd();
                  }
                  struct.result_expr_lists.add(_elem321);
                }
                iprot.readListEnd();
              }
              struct.setResult_expr_listsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONST_EXPR_LISTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list326 = iprot.readListBegin();
                struct.const_expr_lists = new ArrayList<List<com.baidu.palo.thrift.TExpr>>(_list326.size);
                List<com.baidu.palo.thrift.TExpr> _elem327;
                for (int _i328 = 0; _i328 < _list326.size; ++_i328)
                {
                  {
                    org.apache.thrift.protocol.TList _list329 = iprot.readListBegin();
                    _elem327 = new ArrayList<com.baidu.palo.thrift.TExpr>(_list329.size);
                    com.baidu.palo.thrift.TExpr _elem330;
                    for (int _i331 = 0; _i331 < _list329.size; ++_i331)
                    {
                      _elem330 = new com.baidu.palo.thrift.TExpr();
                      _elem330.read(iprot);
                      _elem327.add(_elem330);
                    }
                    iprot.readListEnd();
                  }
                  struct.const_expr_lists.add(_elem327);
                }
                iprot.readListEnd();
              }
              struct.setConst_expr_listsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMergeNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
      oprot.writeI32(struct.tuple_id);
      oprot.writeFieldEnd();
      if (struct.result_expr_lists != null) {
        oprot.writeFieldBegin(RESULT_EXPR_LISTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.result_expr_lists.size()));
          for (List<com.baidu.palo.thrift.TExpr> _iter332 : struct.result_expr_lists)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter332.size()));
              for (com.baidu.palo.thrift.TExpr _iter333 : _iter332)
              {
                _iter333.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.const_expr_lists != null) {
        oprot.writeFieldBegin(CONST_EXPR_LISTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.const_expr_lists.size()));
          for (List<com.baidu.palo.thrift.TExpr> _iter334 : struct.const_expr_lists)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter334.size()));
              for (com.baidu.palo.thrift.TExpr _iter335 : _iter334)
              {
                _iter335.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMergeNodeTupleSchemeFactory implements SchemeFactory {
    public TMergeNodeTupleScheme getScheme() {
      return new TMergeNodeTupleScheme();
    }
  }

  private static class TMergeNodeTupleScheme extends TupleScheme<TMergeNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMergeNode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.tuple_id);
      {
        oprot.writeI32(struct.result_expr_lists.size());
        for (List<com.baidu.palo.thrift.TExpr> _iter336 : struct.result_expr_lists)
        {
          {
            oprot.writeI32(_iter336.size());
            for (com.baidu.palo.thrift.TExpr _iter337 : _iter336)
            {
              _iter337.write(oprot);
            }
          }
        }
      }
      {
        oprot.writeI32(struct.const_expr_lists.size());
        for (List<com.baidu.palo.thrift.TExpr> _iter338 : struct.const_expr_lists)
        {
          {
            oprot.writeI32(_iter338.size());
            for (com.baidu.palo.thrift.TExpr _iter339 : _iter338)
            {
              _iter339.write(oprot);
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMergeNode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.tuple_id = iprot.readI32();
      struct.setTuple_idIsSet(true);
      {
        org.apache.thrift.protocol.TList _list340 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
        struct.result_expr_lists = new ArrayList<List<com.baidu.palo.thrift.TExpr>>(_list340.size);
        List<com.baidu.palo.thrift.TExpr> _elem341;
        for (int _i342 = 0; _i342 < _list340.size; ++_i342)
        {
          {
            org.apache.thrift.protocol.TList _list343 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
            _elem341 = new ArrayList<com.baidu.palo.thrift.TExpr>(_list343.size);
            com.baidu.palo.thrift.TExpr _elem344;
            for (int _i345 = 0; _i345 < _list343.size; ++_i345)
            {
              _elem344 = new com.baidu.palo.thrift.TExpr();
              _elem344.read(iprot);
              _elem341.add(_elem344);
            }
          }
          struct.result_expr_lists.add(_elem341);
        }
      }
      struct.setResult_expr_listsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list346 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
        struct.const_expr_lists = new ArrayList<List<com.baidu.palo.thrift.TExpr>>(_list346.size);
        List<com.baidu.palo.thrift.TExpr> _elem347;
        for (int _i348 = 0; _i348 < _list346.size; ++_i348)
        {
          {
            org.apache.thrift.protocol.TList _list349 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
            _elem347 = new ArrayList<com.baidu.palo.thrift.TExpr>(_list349.size);
            com.baidu.palo.thrift.TExpr _elem350;
            for (int _i351 = 0; _i351 < _list349.size; ++_i351)
            {
              _elem350 = new com.baidu.palo.thrift.TExpr();
              _elem350.read(iprot);
              _elem347.add(_elem350);
            }
          }
          struct.const_expr_lists.add(_elem347);
        }
      }
      struct.setConst_expr_listsIsSet(true);
    }
  }

}

