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
public class TAuthenticateParams implements org.apache.thrift.TBase<TAuthenticateParams, TAuthenticateParams._Fields>, java.io.Serializable, Cloneable, Comparable<TAuthenticateParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAuthenticateParams");

  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PASSWD_FIELD_DESC = new org.apache.thrift.protocol.TField("passwd", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAuthenticateParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAuthenticateParamsTupleSchemeFactory());
  }

  public String user; // required
  public String passwd; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER((short)1, "user"),
    PASSWD((short)2, "passwd");

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
        case 1: // USER
          return USER;
        case 2: // PASSWD
          return PASSWD;
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
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWD, new org.apache.thrift.meta_data.FieldMetaData("passwd", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAuthenticateParams.class, metaDataMap);
  }

  public TAuthenticateParams() {
  }

  public TAuthenticateParams(
    String user,
    String passwd)
  {
    this();
    this.user = user;
    this.passwd = passwd;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAuthenticateParams(TAuthenticateParams other) {
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetPasswd()) {
      this.passwd = other.passwd;
    }
  }

  public TAuthenticateParams deepCopy() {
    return new TAuthenticateParams(this);
  }

  @Override
  public void clear() {
    this.user = null;
    this.passwd = null;
  }

  public String getUser() {
    return this.user;
  }

  public TAuthenticateParams setUser(String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public String getPasswd() {
    return this.passwd;
  }

  public TAuthenticateParams setPasswd(String passwd) {
    this.passwd = passwd;
    return this;
  }

  public void unsetPasswd() {
    this.passwd = null;
  }

  /** Returns true if field passwd is set (has been assigned a value) and false otherwise */
  public boolean isSetPasswd() {
    return this.passwd != null;
  }

  public void setPasswdIsSet(boolean value) {
    if (!value) {
      this.passwd = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case PASSWD:
      if (value == null) {
        unsetPasswd();
      } else {
        setPasswd((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER:
      return getUser();

    case PASSWD:
      return getPasswd();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER:
      return isSetUser();
    case PASSWD:
      return isSetPasswd();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAuthenticateParams)
      return this.equals((TAuthenticateParams)that);
    return false;
  }

  public boolean equals(TAuthenticateParams that) {
    if (that == null)
      return false;

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_passwd = true && this.isSetPasswd();
    boolean that_present_passwd = true && that.isSetPasswd();
    if (this_present_passwd || that_present_passwd) {
      if (!(this_present_passwd && that_present_passwd))
        return false;
      if (!this.passwd.equals(that.passwd))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_user = true && (isSetUser());
    list.add(present_user);
    if (present_user)
      list.add(user);

    boolean present_passwd = true && (isSetPasswd());
    list.add(present_passwd);
    if (present_passwd)
      list.add(passwd);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAuthenticateParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPasswd()).compareTo(other.isSetPasswd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPasswd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.passwd, other.passwd);
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
    StringBuilder sb = new StringBuilder("TAuthenticateParams(");
    boolean first = true;

    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("passwd:");
    if (this.passwd == null) {
      sb.append("null");
    } else {
      sb.append(this.passwd);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (user == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user' was not present! Struct: " + toString());
    }
    if (passwd == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'passwd' was not present! Struct: " + toString());
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

  private static class TAuthenticateParamsStandardSchemeFactory implements SchemeFactory {
    public TAuthenticateParamsStandardScheme getScheme() {
      return new TAuthenticateParamsStandardScheme();
    }
  }

  private static class TAuthenticateParamsStandardScheme extends StandardScheme<TAuthenticateParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAuthenticateParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PASSWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.passwd = iprot.readString();
              struct.setPasswdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAuthenticateParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      if (struct.passwd != null) {
        oprot.writeFieldBegin(PASSWD_FIELD_DESC);
        oprot.writeString(struct.passwd);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAuthenticateParamsTupleSchemeFactory implements SchemeFactory {
    public TAuthenticateParamsTupleScheme getScheme() {
      return new TAuthenticateParamsTupleScheme();
    }
  }

  private static class TAuthenticateParamsTupleScheme extends TupleScheme<TAuthenticateParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAuthenticateParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.user);
      oprot.writeString(struct.passwd);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAuthenticateParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.user = iprot.readString();
      struct.setUserIsSet(true);
      struct.passwd = iprot.readString();
      struct.setPasswdIsSet(true);
    }
  }

}

