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
public class TTransmitDataParams implements org.apache.thrift.TBase<TTransmitDataParams, TTransmitDataParams._Fields>, java.io.Serializable, Cloneable, Comparable<TTransmitDataParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTransmitDataParams");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DEST_FRAGMENT_INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dest_fragment_instance_id", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField DEST_NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dest_node_id", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ROW_BATCH_FIELD_DESC = new org.apache.thrift.protocol.TField("row_batch", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField EOS_FIELD_DESC = new org.apache.thrift.protocol.TField("eos", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField BE_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("be_number", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField PACKET_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("packet_seq", org.apache.thrift.protocol.TType.I64, (short)8);
  private static final org.apache.thrift.protocol.TField SENDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sender_id", org.apache.thrift.protocol.TType.I32, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTransmitDataParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTransmitDataParamsTupleSchemeFactory());
  }

  /**
   * 
   * @see PaloInternalServiceVersion
   */
  public PaloInternalServiceVersion protocol_version; // required
  public com.baidu.palo.thrift.TUniqueId dest_fragment_instance_id; // optional
  public int dest_node_id; // optional
  public com.baidu.palo.thrift.TRowBatch row_batch; // optional
  public boolean eos; // optional
  public int be_number; // optional
  public long packet_seq; // optional
  public int sender_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see PaloInternalServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocol_version"),
    DEST_FRAGMENT_INSTANCE_ID((short)2, "dest_fragment_instance_id"),
    DEST_NODE_ID((short)4, "dest_node_id"),
    ROW_BATCH((short)5, "row_batch"),
    EOS((short)6, "eos"),
    BE_NUMBER((short)7, "be_number"),
    PACKET_SEQ((short)8, "packet_seq"),
    SENDER_ID((short)9, "sender_id");

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
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // DEST_FRAGMENT_INSTANCE_ID
          return DEST_FRAGMENT_INSTANCE_ID;
        case 4: // DEST_NODE_ID
          return DEST_NODE_ID;
        case 5: // ROW_BATCH
          return ROW_BATCH;
        case 6: // EOS
          return EOS;
        case 7: // BE_NUMBER
          return BE_NUMBER;
        case 8: // PACKET_SEQ
          return PACKET_SEQ;
        case 9: // SENDER_ID
          return SENDER_ID;
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
  private static final int __DEST_NODE_ID_ISSET_ID = 0;
  private static final int __EOS_ISSET_ID = 1;
  private static final int __BE_NUMBER_ISSET_ID = 2;
  private static final int __PACKET_SEQ_ISSET_ID = 3;
  private static final int __SENDER_ID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DEST_FRAGMENT_INSTANCE_ID,_Fields.DEST_NODE_ID,_Fields.ROW_BATCH,_Fields.EOS,_Fields.BE_NUMBER,_Fields.PACKET_SEQ,_Fields.SENDER_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PaloInternalServiceVersion.class)));
    tmpMap.put(_Fields.DEST_FRAGMENT_INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("dest_fragment_instance_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.DEST_NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("dest_node_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPlanNodeId")));
    tmpMap.put(_Fields.ROW_BATCH, new org.apache.thrift.meta_data.FieldMetaData("row_batch", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TRowBatch.class)));
    tmpMap.put(_Fields.EOS, new org.apache.thrift.meta_data.FieldMetaData("eos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.BE_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("be_number", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PACKET_SEQ, new org.apache.thrift.meta_data.FieldMetaData("packet_seq", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SENDER_ID, new org.apache.thrift.meta_data.FieldMetaData("sender_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTransmitDataParams.class, metaDataMap);
  }

  public TTransmitDataParams() {
  }

  public TTransmitDataParams(
    PaloInternalServiceVersion protocol_version)
  {
    this();
    this.protocol_version = protocol_version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTransmitDataParams(TTransmitDataParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProtocol_version()) {
      this.protocol_version = other.protocol_version;
    }
    if (other.isSetDest_fragment_instance_id()) {
      this.dest_fragment_instance_id = new com.baidu.palo.thrift.TUniqueId(other.dest_fragment_instance_id);
    }
    this.dest_node_id = other.dest_node_id;
    if (other.isSetRow_batch()) {
      this.row_batch = new com.baidu.palo.thrift.TRowBatch(other.row_batch);
    }
    this.eos = other.eos;
    this.be_number = other.be_number;
    this.packet_seq = other.packet_seq;
    this.sender_id = other.sender_id;
  }

  public TTransmitDataParams deepCopy() {
    return new TTransmitDataParams(this);
  }

  @Override
  public void clear() {
    this.protocol_version = null;
    this.dest_fragment_instance_id = null;
    setDest_node_idIsSet(false);
    this.dest_node_id = 0;
    this.row_batch = null;
    setEosIsSet(false);
    this.eos = false;
    setBe_numberIsSet(false);
    this.be_number = 0;
    setPacket_seqIsSet(false);
    this.packet_seq = 0;
    setSender_idIsSet(false);
    this.sender_id = 0;
  }

  /**
   * 
   * @see PaloInternalServiceVersion
   */
  public PaloInternalServiceVersion getProtocol_version() {
    return this.protocol_version;
  }

  /**
   * 
   * @see PaloInternalServiceVersion
   */
  public TTransmitDataParams setProtocol_version(PaloInternalServiceVersion protocol_version) {
    this.protocol_version = protocol_version;
    return this;
  }

  public void unsetProtocol_version() {
    this.protocol_version = null;
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol_version() {
    return this.protocol_version != null;
  }

  public void setProtocol_versionIsSet(boolean value) {
    if (!value) {
      this.protocol_version = null;
    }
  }

  public com.baidu.palo.thrift.TUniqueId getDest_fragment_instance_id() {
    return this.dest_fragment_instance_id;
  }

  public TTransmitDataParams setDest_fragment_instance_id(com.baidu.palo.thrift.TUniqueId dest_fragment_instance_id) {
    this.dest_fragment_instance_id = dest_fragment_instance_id;
    return this;
  }

  public void unsetDest_fragment_instance_id() {
    this.dest_fragment_instance_id = null;
  }

  /** Returns true if field dest_fragment_instance_id is set (has been assigned a value) and false otherwise */
  public boolean isSetDest_fragment_instance_id() {
    return this.dest_fragment_instance_id != null;
  }

  public void setDest_fragment_instance_idIsSet(boolean value) {
    if (!value) {
      this.dest_fragment_instance_id = null;
    }
  }

  public int getDest_node_id() {
    return this.dest_node_id;
  }

  public TTransmitDataParams setDest_node_id(int dest_node_id) {
    this.dest_node_id = dest_node_id;
    setDest_node_idIsSet(true);
    return this;
  }

  public void unsetDest_node_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEST_NODE_ID_ISSET_ID);
  }

  /** Returns true if field dest_node_id is set (has been assigned a value) and false otherwise */
  public boolean isSetDest_node_id() {
    return EncodingUtils.testBit(__isset_bitfield, __DEST_NODE_ID_ISSET_ID);
  }

  public void setDest_node_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEST_NODE_ID_ISSET_ID, value);
  }

  public com.baidu.palo.thrift.TRowBatch getRow_batch() {
    return this.row_batch;
  }

  public TTransmitDataParams setRow_batch(com.baidu.palo.thrift.TRowBatch row_batch) {
    this.row_batch = row_batch;
    return this;
  }

  public void unsetRow_batch() {
    this.row_batch = null;
  }

  /** Returns true if field row_batch is set (has been assigned a value) and false otherwise */
  public boolean isSetRow_batch() {
    return this.row_batch != null;
  }

  public void setRow_batchIsSet(boolean value) {
    if (!value) {
      this.row_batch = null;
    }
  }

  public boolean isEos() {
    return this.eos;
  }

  public TTransmitDataParams setEos(boolean eos) {
    this.eos = eos;
    setEosIsSet(true);
    return this;
  }

  public void unsetEos() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EOS_ISSET_ID);
  }

  /** Returns true if field eos is set (has been assigned a value) and false otherwise */
  public boolean isSetEos() {
    return EncodingUtils.testBit(__isset_bitfield, __EOS_ISSET_ID);
  }

  public void setEosIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EOS_ISSET_ID, value);
  }

  public int getBe_number() {
    return this.be_number;
  }

  public TTransmitDataParams setBe_number(int be_number) {
    this.be_number = be_number;
    setBe_numberIsSet(true);
    return this;
  }

  public void unsetBe_number() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BE_NUMBER_ISSET_ID);
  }

  /** Returns true if field be_number is set (has been assigned a value) and false otherwise */
  public boolean isSetBe_number() {
    return EncodingUtils.testBit(__isset_bitfield, __BE_NUMBER_ISSET_ID);
  }

  public void setBe_numberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BE_NUMBER_ISSET_ID, value);
  }

  public long getPacket_seq() {
    return this.packet_seq;
  }

  public TTransmitDataParams setPacket_seq(long packet_seq) {
    this.packet_seq = packet_seq;
    setPacket_seqIsSet(true);
    return this;
  }

  public void unsetPacket_seq() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PACKET_SEQ_ISSET_ID);
  }

  /** Returns true if field packet_seq is set (has been assigned a value) and false otherwise */
  public boolean isSetPacket_seq() {
    return EncodingUtils.testBit(__isset_bitfield, __PACKET_SEQ_ISSET_ID);
  }

  public void setPacket_seqIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PACKET_SEQ_ISSET_ID, value);
  }

  public int getSender_id() {
    return this.sender_id;
  }

  public TTransmitDataParams setSender_id(int sender_id) {
    this.sender_id = sender_id;
    setSender_idIsSet(true);
    return this;
  }

  public void unsetSender_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SENDER_ID_ISSET_ID);
  }

  /** Returns true if field sender_id is set (has been assigned a value) and false otherwise */
  public boolean isSetSender_id() {
    return EncodingUtils.testBit(__isset_bitfield, __SENDER_ID_ISSET_ID);
  }

  public void setSender_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SENDER_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((PaloInternalServiceVersion)value);
      }
      break;

    case DEST_FRAGMENT_INSTANCE_ID:
      if (value == null) {
        unsetDest_fragment_instance_id();
      } else {
        setDest_fragment_instance_id((com.baidu.palo.thrift.TUniqueId)value);
      }
      break;

    case DEST_NODE_ID:
      if (value == null) {
        unsetDest_node_id();
      } else {
        setDest_node_id((Integer)value);
      }
      break;

    case ROW_BATCH:
      if (value == null) {
        unsetRow_batch();
      } else {
        setRow_batch((com.baidu.palo.thrift.TRowBatch)value);
      }
      break;

    case EOS:
      if (value == null) {
        unsetEos();
      } else {
        setEos((Boolean)value);
      }
      break;

    case BE_NUMBER:
      if (value == null) {
        unsetBe_number();
      } else {
        setBe_number((Integer)value);
      }
      break;

    case PACKET_SEQ:
      if (value == null) {
        unsetPacket_seq();
      } else {
        setPacket_seq((Long)value);
      }
      break;

    case SENDER_ID:
      if (value == null) {
        unsetSender_id();
      } else {
        setSender_id((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocol_version();

    case DEST_FRAGMENT_INSTANCE_ID:
      return getDest_fragment_instance_id();

    case DEST_NODE_ID:
      return getDest_node_id();

    case ROW_BATCH:
      return getRow_batch();

    case EOS:
      return isEos();

    case BE_NUMBER:
      return getBe_number();

    case PACKET_SEQ:
      return getPacket_seq();

    case SENDER_ID:
      return getSender_id();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocol_version();
    case DEST_FRAGMENT_INSTANCE_ID:
      return isSetDest_fragment_instance_id();
    case DEST_NODE_ID:
      return isSetDest_node_id();
    case ROW_BATCH:
      return isSetRow_batch();
    case EOS:
      return isSetEos();
    case BE_NUMBER:
      return isSetBe_number();
    case PACKET_SEQ:
      return isSetPacket_seq();
    case SENDER_ID:
      return isSetSender_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTransmitDataParams)
      return this.equals((TTransmitDataParams)that);
    return false;
  }

  public boolean equals(TTransmitDataParams that) {
    if (that == null)
      return false;

    boolean this_present_protocol_version = true && this.isSetProtocol_version();
    boolean that_present_protocol_version = true && that.isSetProtocol_version();
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (!this.protocol_version.equals(that.protocol_version))
        return false;
    }

    boolean this_present_dest_fragment_instance_id = true && this.isSetDest_fragment_instance_id();
    boolean that_present_dest_fragment_instance_id = true && that.isSetDest_fragment_instance_id();
    if (this_present_dest_fragment_instance_id || that_present_dest_fragment_instance_id) {
      if (!(this_present_dest_fragment_instance_id && that_present_dest_fragment_instance_id))
        return false;
      if (!this.dest_fragment_instance_id.equals(that.dest_fragment_instance_id))
        return false;
    }

    boolean this_present_dest_node_id = true && this.isSetDest_node_id();
    boolean that_present_dest_node_id = true && that.isSetDest_node_id();
    if (this_present_dest_node_id || that_present_dest_node_id) {
      if (!(this_present_dest_node_id && that_present_dest_node_id))
        return false;
      if (this.dest_node_id != that.dest_node_id)
        return false;
    }

    boolean this_present_row_batch = true && this.isSetRow_batch();
    boolean that_present_row_batch = true && that.isSetRow_batch();
    if (this_present_row_batch || that_present_row_batch) {
      if (!(this_present_row_batch && that_present_row_batch))
        return false;
      if (!this.row_batch.equals(that.row_batch))
        return false;
    }

    boolean this_present_eos = true && this.isSetEos();
    boolean that_present_eos = true && that.isSetEos();
    if (this_present_eos || that_present_eos) {
      if (!(this_present_eos && that_present_eos))
        return false;
      if (this.eos != that.eos)
        return false;
    }

    boolean this_present_be_number = true && this.isSetBe_number();
    boolean that_present_be_number = true && that.isSetBe_number();
    if (this_present_be_number || that_present_be_number) {
      if (!(this_present_be_number && that_present_be_number))
        return false;
      if (this.be_number != that.be_number)
        return false;
    }

    boolean this_present_packet_seq = true && this.isSetPacket_seq();
    boolean that_present_packet_seq = true && that.isSetPacket_seq();
    if (this_present_packet_seq || that_present_packet_seq) {
      if (!(this_present_packet_seq && that_present_packet_seq))
        return false;
      if (this.packet_seq != that.packet_seq)
        return false;
    }

    boolean this_present_sender_id = true && this.isSetSender_id();
    boolean that_present_sender_id = true && that.isSetSender_id();
    if (this_present_sender_id || that_present_sender_id) {
      if (!(this_present_sender_id && that_present_sender_id))
        return false;
      if (this.sender_id != that.sender_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_protocol_version = true && (isSetProtocol_version());
    list.add(present_protocol_version);
    if (present_protocol_version)
      list.add(protocol_version.getValue());

    boolean present_dest_fragment_instance_id = true && (isSetDest_fragment_instance_id());
    list.add(present_dest_fragment_instance_id);
    if (present_dest_fragment_instance_id)
      list.add(dest_fragment_instance_id);

    boolean present_dest_node_id = true && (isSetDest_node_id());
    list.add(present_dest_node_id);
    if (present_dest_node_id)
      list.add(dest_node_id);

    boolean present_row_batch = true && (isSetRow_batch());
    list.add(present_row_batch);
    if (present_row_batch)
      list.add(row_batch);

    boolean present_eos = true && (isSetEos());
    list.add(present_eos);
    if (present_eos)
      list.add(eos);

    boolean present_be_number = true && (isSetBe_number());
    list.add(present_be_number);
    if (present_be_number)
      list.add(be_number);

    boolean present_packet_seq = true && (isSetPacket_seq());
    list.add(present_packet_seq);
    if (present_packet_seq)
      list.add(packet_seq);

    boolean present_sender_id = true && (isSetSender_id());
    list.add(present_sender_id);
    if (present_sender_id)
      list.add(sender_id);

    return list.hashCode();
  }

  @Override
  public int compareTo(TTransmitDataParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProtocol_version()).compareTo(other.isSetProtocol_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, other.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDest_fragment_instance_id()).compareTo(other.isSetDest_fragment_instance_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDest_fragment_instance_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dest_fragment_instance_id, other.dest_fragment_instance_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDest_node_id()).compareTo(other.isSetDest_node_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDest_node_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dest_node_id, other.dest_node_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRow_batch()).compareTo(other.isSetRow_batch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow_batch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row_batch, other.row_batch);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEos()).compareTo(other.isSetEos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eos, other.eos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBe_number()).compareTo(other.isSetBe_number());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBe_number()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.be_number, other.be_number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPacket_seq()).compareTo(other.isSetPacket_seq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPacket_seq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.packet_seq, other.packet_seq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSender_id()).compareTo(other.isSetSender_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSender_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sender_id, other.sender_id);
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
    StringBuilder sb = new StringBuilder("TTransmitDataParams(");
    boolean first = true;

    sb.append("protocol_version:");
    if (this.protocol_version == null) {
      sb.append("null");
    } else {
      sb.append(this.protocol_version);
    }
    first = false;
    if (isSetDest_fragment_instance_id()) {
      if (!first) sb.append(", ");
      sb.append("dest_fragment_instance_id:");
      if (this.dest_fragment_instance_id == null) {
        sb.append("null");
      } else {
        sb.append(this.dest_fragment_instance_id);
      }
      first = false;
    }
    if (isSetDest_node_id()) {
      if (!first) sb.append(", ");
      sb.append("dest_node_id:");
      sb.append(this.dest_node_id);
      first = false;
    }
    if (isSetRow_batch()) {
      if (!first) sb.append(", ");
      sb.append("row_batch:");
      if (this.row_batch == null) {
        sb.append("null");
      } else {
        sb.append(this.row_batch);
      }
      first = false;
    }
    if (isSetEos()) {
      if (!first) sb.append(", ");
      sb.append("eos:");
      sb.append(this.eos);
      first = false;
    }
    if (isSetBe_number()) {
      if (!first) sb.append(", ");
      sb.append("be_number:");
      sb.append(this.be_number);
      first = false;
    }
    if (isSetPacket_seq()) {
      if (!first) sb.append(", ");
      sb.append("packet_seq:");
      sb.append(this.packet_seq);
      first = false;
    }
    if (isSetSender_id()) {
      if (!first) sb.append(", ");
      sb.append("sender_id:");
      sb.append(this.sender_id);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (protocol_version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (dest_fragment_instance_id != null) {
      dest_fragment_instance_id.validate();
    }
    if (row_batch != null) {
      row_batch.validate();
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

  private static class TTransmitDataParamsStandardSchemeFactory implements SchemeFactory {
    public TTransmitDataParamsStandardScheme getScheme() {
      return new TTransmitDataParamsStandardScheme();
    }
  }

  private static class TTransmitDataParamsStandardScheme extends StandardScheme<TTransmitDataParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTransmitDataParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocol_version = com.baidu.palo.thrift.PaloInternalServiceVersion.findByValue(iprot.readI32());
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEST_FRAGMENT_INSTANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.dest_fragment_instance_id = new com.baidu.palo.thrift.TUniqueId();
              struct.dest_fragment_instance_id.read(iprot);
              struct.setDest_fragment_instance_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEST_NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.dest_node_id = iprot.readI32();
              struct.setDest_node_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ROW_BATCH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.row_batch = new com.baidu.palo.thrift.TRowBatch();
              struct.row_batch.read(iprot);
              struct.setRow_batchIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EOS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.eos = iprot.readBool();
              struct.setEosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // BE_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.be_number = iprot.readI32();
              struct.setBe_numberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // PACKET_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.packet_seq = iprot.readI64();
              struct.setPacket_seqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // SENDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sender_id = iprot.readI32();
              struct.setSender_idIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTransmitDataParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocol_version != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocol_version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.dest_fragment_instance_id != null) {
        if (struct.isSetDest_fragment_instance_id()) {
          oprot.writeFieldBegin(DEST_FRAGMENT_INSTANCE_ID_FIELD_DESC);
          struct.dest_fragment_instance_id.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDest_node_id()) {
        oprot.writeFieldBegin(DEST_NODE_ID_FIELD_DESC);
        oprot.writeI32(struct.dest_node_id);
        oprot.writeFieldEnd();
      }
      if (struct.row_batch != null) {
        if (struct.isSetRow_batch()) {
          oprot.writeFieldBegin(ROW_BATCH_FIELD_DESC);
          struct.row_batch.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetEos()) {
        oprot.writeFieldBegin(EOS_FIELD_DESC);
        oprot.writeBool(struct.eos);
        oprot.writeFieldEnd();
      }
      if (struct.isSetBe_number()) {
        oprot.writeFieldBegin(BE_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.be_number);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPacket_seq()) {
        oprot.writeFieldBegin(PACKET_SEQ_FIELD_DESC);
        oprot.writeI64(struct.packet_seq);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSender_id()) {
        oprot.writeFieldBegin(SENDER_ID_FIELD_DESC);
        oprot.writeI32(struct.sender_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTransmitDataParamsTupleSchemeFactory implements SchemeFactory {
    public TTransmitDataParamsTupleScheme getScheme() {
      return new TTransmitDataParamsTupleScheme();
    }
  }

  private static class TTransmitDataParamsTupleScheme extends TupleScheme<TTransmitDataParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTransmitDataParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetDest_fragment_instance_id()) {
        optionals.set(0);
      }
      if (struct.isSetDest_node_id()) {
        optionals.set(1);
      }
      if (struct.isSetRow_batch()) {
        optionals.set(2);
      }
      if (struct.isSetEos()) {
        optionals.set(3);
      }
      if (struct.isSetBe_number()) {
        optionals.set(4);
      }
      if (struct.isSetPacket_seq()) {
        optionals.set(5);
      }
      if (struct.isSetSender_id()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetDest_fragment_instance_id()) {
        struct.dest_fragment_instance_id.write(oprot);
      }
      if (struct.isSetDest_node_id()) {
        oprot.writeI32(struct.dest_node_id);
      }
      if (struct.isSetRow_batch()) {
        struct.row_batch.write(oprot);
      }
      if (struct.isSetEos()) {
        oprot.writeBool(struct.eos);
      }
      if (struct.isSetBe_number()) {
        oprot.writeI32(struct.be_number);
      }
      if (struct.isSetPacket_seq()) {
        oprot.writeI64(struct.packet_seq);
      }
      if (struct.isSetSender_id()) {
        oprot.writeI32(struct.sender_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTransmitDataParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = com.baidu.palo.thrift.PaloInternalServiceVersion.findByValue(iprot.readI32());
      struct.setProtocol_versionIsSet(true);
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.dest_fragment_instance_id = new com.baidu.palo.thrift.TUniqueId();
        struct.dest_fragment_instance_id.read(iprot);
        struct.setDest_fragment_instance_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dest_node_id = iprot.readI32();
        struct.setDest_node_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.row_batch = new com.baidu.palo.thrift.TRowBatch();
        struct.row_batch.read(iprot);
        struct.setRow_batchIsSet(true);
      }
      if (incoming.get(3)) {
        struct.eos = iprot.readBool();
        struct.setEosIsSet(true);
      }
      if (incoming.get(4)) {
        struct.be_number = iprot.readI32();
        struct.setBe_numberIsSet(true);
      }
      if (incoming.get(5)) {
        struct.packet_seq = iprot.readI64();
        struct.setPacket_seqIsSet(true);
      }
      if (incoming.get(6)) {
        struct.sender_id = iprot.readI32();
        struct.setSender_idIsSet(true);
      }
    }
  }

}
