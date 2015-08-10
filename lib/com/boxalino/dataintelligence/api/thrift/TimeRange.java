/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.boxalino.dataintelligence.api.thrift;

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
/**
 * This structure defines a time range
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-10")
public class TimeRange implements org.apache.thrift.TBase<TimeRange, TimeRange._Fields>, java.io.Serializable, Cloneable, Comparable<TimeRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimeRange");

  private static final org.apache.thrift.protocol.TField FROM_FIELD_DESC = new org.apache.thrift.protocol.TField("from", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField TO_FIELD_DESC = new org.apache.thrift.protocol.TField("to", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimeRangeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimeRangeTupleSchemeFactory());
  }

  /**
   * UNIX timestamp of a lower boundary of the range
   */
  public long from; // required
  /**
   * UNIX timestamp of a upper boundary of the range
   */
  public long to; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * UNIX timestamp of a lower boundary of the range
     */
    FROM((short)1, "from"),
    /**
     * UNIX timestamp of a upper boundary of the range
     */
    TO((short)2, "to");

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
        case 1: // FROM
          return FROM;
        case 2: // TO
          return TO;
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
  private static final int __FROM_ISSET_ID = 0;
  private static final int __TO_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FROM, new org.apache.thrift.meta_data.FieldMetaData("from", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TO, new org.apache.thrift.meta_data.FieldMetaData("to", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimeRange.class, metaDataMap);
  }

  public TimeRange() {
  }

  public TimeRange(
    long from,
    long to)
  {
    this();
    this.from = from;
    setFromIsSet(true);
    this.to = to;
    setToIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimeRange(TimeRange other) {
    __isset_bitfield = other.__isset_bitfield;
    this.from = other.from;
    this.to = other.to;
  }

  public TimeRange deepCopy() {
    return new TimeRange(this);
  }

  @Override
  public void clear() {
    setFromIsSet(false);
    this.from = 0;
    setToIsSet(false);
    this.to = 0;
  }

  /**
   * UNIX timestamp of a lower boundary of the range
   */
  public long getFrom() {
    return this.from;
  }

  /**
   * UNIX timestamp of a lower boundary of the range
   */
  public TimeRange setFrom(long from) {
    this.from = from;
    setFromIsSet(true);
    return this;
  }

  public void unsetFrom() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FROM_ISSET_ID);
  }

  /** Returns true if field from is set (has been assigned a value) and false otherwise */
  public boolean isSetFrom() {
    return EncodingUtils.testBit(__isset_bitfield, __FROM_ISSET_ID);
  }

  public void setFromIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FROM_ISSET_ID, value);
  }

  /**
   * UNIX timestamp of a upper boundary of the range
   */
  public long getTo() {
    return this.to;
  }

  /**
   * UNIX timestamp of a upper boundary of the range
   */
  public TimeRange setTo(long to) {
    this.to = to;
    setToIsSet(true);
    return this;
  }

  public void unsetTo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TO_ISSET_ID);
  }

  /** Returns true if field to is set (has been assigned a value) and false otherwise */
  public boolean isSetTo() {
    return EncodingUtils.testBit(__isset_bitfield, __TO_ISSET_ID);
  }

  public void setToIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FROM:
      if (value == null) {
        unsetFrom();
      } else {
        setFrom((Long)value);
      }
      break;

    case TO:
      if (value == null) {
        unsetTo();
      } else {
        setTo((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FROM:
      return Long.valueOf(getFrom());

    case TO:
      return Long.valueOf(getTo());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FROM:
      return isSetFrom();
    case TO:
      return isSetTo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimeRange)
      return this.equals((TimeRange)that);
    return false;
  }

  public boolean equals(TimeRange that) {
    if (that == null)
      return false;

    boolean this_present_from = true;
    boolean that_present_from = true;
    if (this_present_from || that_present_from) {
      if (!(this_present_from && that_present_from))
        return false;
      if (this.from != that.from)
        return false;
    }

    boolean this_present_to = true;
    boolean that_present_to = true;
    if (this_present_to || that_present_to) {
      if (!(this_present_to && that_present_to))
        return false;
      if (this.to != that.to)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_from = true;
    list.add(present_from);
    if (present_from)
      list.add(from);

    boolean present_to = true;
    list.add(present_to);
    if (present_to)
      list.add(to);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimeRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFrom()).compareTo(other.isSetFrom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFrom()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.from, other.from);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTo()).compareTo(other.isSetTo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.to, other.to);
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
    StringBuilder sb = new StringBuilder("TimeRange(");
    boolean first = true;

    sb.append("from:");
    sb.append(this.from);
    first = false;
    if (!first) sb.append(", ");
    sb.append("to:");
    sb.append(this.to);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'from' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'to' because it's a primitive and you chose the non-beans generator.
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

  private static class TimeRangeStandardSchemeFactory implements SchemeFactory {
    public TimeRangeStandardScheme getScheme() {
      return new TimeRangeStandardScheme();
    }
  }

  private static class TimeRangeStandardScheme extends StandardScheme<TimeRange> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TimeRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FROM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.from = iprot.readI64();
              struct.setFromIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TO
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.to = iprot.readI64();
              struct.setToIsSet(true);
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
      if (!struct.isSetFrom()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'from' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetTo()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'to' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TimeRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FROM_FIELD_DESC);
      oprot.writeI64(struct.from);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TO_FIELD_DESC);
      oprot.writeI64(struct.to);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimeRangeTupleSchemeFactory implements SchemeFactory {
    public TimeRangeTupleScheme getScheme() {
      return new TimeRangeTupleScheme();
    }
  }

  private static class TimeRangeTupleScheme extends TupleScheme<TimeRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TimeRange struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.from);
      oprot.writeI64(struct.to);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TimeRange struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.from = iprot.readI64();
      struct.setFromIsSet(true);
      struct.to = iprot.readI64();
      struct.setToIsSet(true);
    }
  }

}

