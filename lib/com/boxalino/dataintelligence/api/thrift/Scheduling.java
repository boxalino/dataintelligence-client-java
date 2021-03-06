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
 * This structure defines a task Scheduling. A scheduling is a collection of process tasks to be executed one after the other by the system.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-31")
public class Scheduling implements org.apache.thrift.TBase<Scheduling, Scheduling._Fields>, java.io.Serializable, Cloneable, Comparable<Scheduling> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Scheduling");

  private static final org.apache.thrift.protocol.TField SCHEDULING_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("schedulingId", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SchedulingStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SchedulingTupleSchemeFactory());
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String schedulingId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
     */
    SCHEDULING_ID((short)1, "schedulingId");

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
        case 1: // SCHEDULING_ID
          return SCHEDULING_ID;
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
    tmpMap.put(_Fields.SCHEDULING_ID, new org.apache.thrift.meta_data.FieldMetaData("schedulingId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Scheduling.class, metaDataMap);
  }

  public Scheduling() {
  }

  public Scheduling(
    String schedulingId)
  {
    this();
    this.schedulingId = schedulingId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Scheduling(Scheduling other) {
    if (other.isSetSchedulingId()) {
      this.schedulingId = other.schedulingId;
    }
  }

  public Scheduling deepCopy() {
    return new Scheduling(this);
  }

  @Override
  public void clear() {
    this.schedulingId = null;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String getSchedulingId() {
    return this.schedulingId;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public Scheduling setSchedulingId(String schedulingId) {
    this.schedulingId = schedulingId;
    return this;
  }

  public void unsetSchedulingId() {
    this.schedulingId = null;
  }

  /** Returns true if field schedulingId is set (has been assigned a value) and false otherwise */
  public boolean isSetSchedulingId() {
    return this.schedulingId != null;
  }

  public void setSchedulingIdIsSet(boolean value) {
    if (!value) {
      this.schedulingId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCHEDULING_ID:
      if (value == null) {
        unsetSchedulingId();
      } else {
        setSchedulingId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEDULING_ID:
      return getSchedulingId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCHEDULING_ID:
      return isSetSchedulingId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Scheduling)
      return this.equals((Scheduling)that);
    return false;
  }

  public boolean equals(Scheduling that) {
    if (that == null)
      return false;

    boolean this_present_schedulingId = true && this.isSetSchedulingId();
    boolean that_present_schedulingId = true && that.isSetSchedulingId();
    if (this_present_schedulingId || that_present_schedulingId) {
      if (!(this_present_schedulingId && that_present_schedulingId))
        return false;
      if (!this.schedulingId.equals(that.schedulingId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_schedulingId = true && (isSetSchedulingId());
    list.add(present_schedulingId);
    if (present_schedulingId)
      list.add(schedulingId);

    return list.hashCode();
  }

  @Override
  public int compareTo(Scheduling other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSchedulingId()).compareTo(other.isSetSchedulingId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchedulingId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schedulingId, other.schedulingId);
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
    StringBuilder sb = new StringBuilder("Scheduling(");
    boolean first = true;

    sb.append("schedulingId:");
    if (this.schedulingId == null) {
      sb.append("null");
    } else {
      sb.append(this.schedulingId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (schedulingId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'schedulingId' was not present! Struct: " + toString());
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

  private static class SchedulingStandardSchemeFactory implements SchemeFactory {
    public SchedulingStandardScheme getScheme() {
      return new SchedulingStandardScheme();
    }
  }

  private static class SchedulingStandardScheme extends StandardScheme<Scheduling> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Scheduling struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEDULING_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.schedulingId = iprot.readString();
              struct.setSchedulingIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Scheduling struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.schedulingId != null) {
        oprot.writeFieldBegin(SCHEDULING_ID_FIELD_DESC);
        oprot.writeString(struct.schedulingId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SchedulingTupleSchemeFactory implements SchemeFactory {
    public SchedulingTupleScheme getScheme() {
      return new SchedulingTupleScheme();
    }
  }

  private static class SchedulingTupleScheme extends TupleScheme<Scheduling> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Scheduling struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.schedulingId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Scheduling struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.schedulingId = iprot.readString();
      struct.setSchedulingIdIsSet(true);
    }
  }

}

