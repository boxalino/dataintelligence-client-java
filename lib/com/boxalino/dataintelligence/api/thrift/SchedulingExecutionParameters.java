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
 * This structure defines a schedulings execution parameters. A scheduling is a collection of process tasks to be executed one after the other by the system.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-1-14")
public class SchedulingExecutionParameters implements org.apache.thrift.TBase<SchedulingExecutionParameters, SchedulingExecutionParameters._Fields>, java.io.Serializable, Cloneable, Comparable<SchedulingExecutionParameters> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SchedulingExecutionParameters");

  private static final org.apache.thrift.protocol.TField SCHEDULING_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("schedulingId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DEVELOPMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("development", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField DELTA_FIELD_DESC = new org.apache.thrift.protocol.TField("delta", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField FORCE_START_FIELD_DESC = new org.apache.thrift.protocol.TField("forceStart", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SchedulingExecutionParametersStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SchedulingExecutionParametersTupleSchemeFactory());
  }

  /**
   * the scheduling id to execute
   */
  public String schedulingId; // required
  /**
   * should the process tasks run with development version data
   */
  public boolean development; // required
  /**
   * are the process tasks incremental processes (or full)
   */
  public boolean delta; // required
  /**
   * if similar process tasks are already running, the forceStart will make the new ones run, otherwise, the execution will be aborted
   */
  public boolean forceStart; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the scheduling id to execute
     */
    SCHEDULING_ID((short)1, "schedulingId"),
    /**
     * should the process tasks run with development version data
     */
    DEVELOPMENT((short)2, "development"),
    /**
     * are the process tasks incremental processes (or full)
     */
    DELTA((short)3, "delta"),
    /**
     * if similar process tasks are already running, the forceStart will make the new ones run, otherwise, the execution will be aborted
     */
    FORCE_START((short)4, "forceStart");

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
        case 2: // DEVELOPMENT
          return DEVELOPMENT;
        case 3: // DELTA
          return DELTA;
        case 4: // FORCE_START
          return FORCE_START;
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
  private static final int __DEVELOPMENT_ISSET_ID = 0;
  private static final int __DELTA_ISSET_ID = 1;
  private static final int __FORCESTART_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCHEDULING_ID, new org.apache.thrift.meta_data.FieldMetaData("schedulingId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEVELOPMENT, new org.apache.thrift.meta_data.FieldMetaData("development", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DELTA, new org.apache.thrift.meta_data.FieldMetaData("delta", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FORCE_START, new org.apache.thrift.meta_data.FieldMetaData("forceStart", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SchedulingExecutionParameters.class, metaDataMap);
  }

  public SchedulingExecutionParameters() {
  }

  public SchedulingExecutionParameters(
    String schedulingId,
    boolean development,
    boolean delta,
    boolean forceStart)
  {
    this();
    this.schedulingId = schedulingId;
    this.development = development;
    setDevelopmentIsSet(true);
    this.delta = delta;
    setDeltaIsSet(true);
    this.forceStart = forceStart;
    setForceStartIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SchedulingExecutionParameters(SchedulingExecutionParameters other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSchedulingId()) {
      this.schedulingId = other.schedulingId;
    }
    this.development = other.development;
    this.delta = other.delta;
    this.forceStart = other.forceStart;
  }

  public SchedulingExecutionParameters deepCopy() {
    return new SchedulingExecutionParameters(this);
  }

  @Override
  public void clear() {
    this.schedulingId = null;
    setDevelopmentIsSet(false);
    this.development = false;
    setDeltaIsSet(false);
    this.delta = false;
    setForceStartIsSet(false);
    this.forceStart = false;
  }

  /**
   * the scheduling id to execute
   */
  public String getSchedulingId() {
    return this.schedulingId;
  }

  /**
   * the scheduling id to execute
   */
  public SchedulingExecutionParameters setSchedulingId(String schedulingId) {
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

  /**
   * should the process tasks run with development version data
   */
  public boolean isDevelopment() {
    return this.development;
  }

  /**
   * should the process tasks run with development version data
   */
  public SchedulingExecutionParameters setDevelopment(boolean development) {
    this.development = development;
    setDevelopmentIsSet(true);
    return this;
  }

  public void unsetDevelopment() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEVELOPMENT_ISSET_ID);
  }

  /** Returns true if field development is set (has been assigned a value) and false otherwise */
  public boolean isSetDevelopment() {
    return EncodingUtils.testBit(__isset_bitfield, __DEVELOPMENT_ISSET_ID);
  }

  public void setDevelopmentIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEVELOPMENT_ISSET_ID, value);
  }

  /**
   * are the process tasks incremental processes (or full)
   */
  public boolean isDelta() {
    return this.delta;
  }

  /**
   * are the process tasks incremental processes (or full)
   */
  public SchedulingExecutionParameters setDelta(boolean delta) {
    this.delta = delta;
    setDeltaIsSet(true);
    return this;
  }

  public void unsetDelta() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DELTA_ISSET_ID);
  }

  /** Returns true if field delta is set (has been assigned a value) and false otherwise */
  public boolean isSetDelta() {
    return EncodingUtils.testBit(__isset_bitfield, __DELTA_ISSET_ID);
  }

  public void setDeltaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DELTA_ISSET_ID, value);
  }

  /**
   * if similar process tasks are already running, the forceStart will make the new ones run, otherwise, the execution will be aborted
   */
  public boolean isForceStart() {
    return this.forceStart;
  }

  /**
   * if similar process tasks are already running, the forceStart will make the new ones run, otherwise, the execution will be aborted
   */
  public SchedulingExecutionParameters setForceStart(boolean forceStart) {
    this.forceStart = forceStart;
    setForceStartIsSet(true);
    return this;
  }

  public void unsetForceStart() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FORCESTART_ISSET_ID);
  }

  /** Returns true if field forceStart is set (has been assigned a value) and false otherwise */
  public boolean isSetForceStart() {
    return EncodingUtils.testBit(__isset_bitfield, __FORCESTART_ISSET_ID);
  }

  public void setForceStartIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FORCESTART_ISSET_ID, value);
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

    case DEVELOPMENT:
      if (value == null) {
        unsetDevelopment();
      } else {
        setDevelopment((Boolean)value);
      }
      break;

    case DELTA:
      if (value == null) {
        unsetDelta();
      } else {
        setDelta((Boolean)value);
      }
      break;

    case FORCE_START:
      if (value == null) {
        unsetForceStart();
      } else {
        setForceStart((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEDULING_ID:
      return getSchedulingId();

    case DEVELOPMENT:
      return Boolean.valueOf(isDevelopment());

    case DELTA:
      return Boolean.valueOf(isDelta());

    case FORCE_START:
      return Boolean.valueOf(isForceStart());

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
    case DEVELOPMENT:
      return isSetDevelopment();
    case DELTA:
      return isSetDelta();
    case FORCE_START:
      return isSetForceStart();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SchedulingExecutionParameters)
      return this.equals((SchedulingExecutionParameters)that);
    return false;
  }

  public boolean equals(SchedulingExecutionParameters that) {
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

    boolean this_present_development = true;
    boolean that_present_development = true;
    if (this_present_development || that_present_development) {
      if (!(this_present_development && that_present_development))
        return false;
      if (this.development != that.development)
        return false;
    }

    boolean this_present_delta = true;
    boolean that_present_delta = true;
    if (this_present_delta || that_present_delta) {
      if (!(this_present_delta && that_present_delta))
        return false;
      if (this.delta != that.delta)
        return false;
    }

    boolean this_present_forceStart = true;
    boolean that_present_forceStart = true;
    if (this_present_forceStart || that_present_forceStart) {
      if (!(this_present_forceStart && that_present_forceStart))
        return false;
      if (this.forceStart != that.forceStart)
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

    boolean present_development = true;
    list.add(present_development);
    if (present_development)
      list.add(development);

    boolean present_delta = true;
    list.add(present_delta);
    if (present_delta)
      list.add(delta);

    boolean present_forceStart = true;
    list.add(present_forceStart);
    if (present_forceStart)
      list.add(forceStart);

    return list.hashCode();
  }

  @Override
  public int compareTo(SchedulingExecutionParameters other) {
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
    lastComparison = Boolean.valueOf(isSetDevelopment()).compareTo(other.isSetDevelopment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDevelopment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.development, other.development);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDelta()).compareTo(other.isSetDelta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDelta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.delta, other.delta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetForceStart()).compareTo(other.isSetForceStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForceStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.forceStart, other.forceStart);
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
    StringBuilder sb = new StringBuilder("SchedulingExecutionParameters(");
    boolean first = true;

    sb.append("schedulingId:");
    if (this.schedulingId == null) {
      sb.append("null");
    } else {
      sb.append(this.schedulingId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("development:");
    sb.append(this.development);
    first = false;
    if (!first) sb.append(", ");
    sb.append("delta:");
    sb.append(this.delta);
    first = false;
    if (!first) sb.append(", ");
    sb.append("forceStart:");
    sb.append(this.forceStart);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (schedulingId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'schedulingId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'development' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'delta' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'forceStart' because it's a primitive and you chose the non-beans generator.
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

  private static class SchedulingExecutionParametersStandardSchemeFactory implements SchemeFactory {
    public SchedulingExecutionParametersStandardScheme getScheme() {
      return new SchedulingExecutionParametersStandardScheme();
    }
  }

  private static class SchedulingExecutionParametersStandardScheme extends StandardScheme<SchedulingExecutionParameters> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SchedulingExecutionParameters struct) throws org.apache.thrift.TException {
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
          case 2: // DEVELOPMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.development = iprot.readBool();
              struct.setDevelopmentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DELTA
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.delta = iprot.readBool();
              struct.setDeltaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FORCE_START
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.forceStart = iprot.readBool();
              struct.setForceStartIsSet(true);
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
      if (!struct.isSetDevelopment()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'development' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetDelta()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'delta' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetForceStart()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'forceStart' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SchedulingExecutionParameters struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.schedulingId != null) {
        oprot.writeFieldBegin(SCHEDULING_ID_FIELD_DESC);
        oprot.writeString(struct.schedulingId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DEVELOPMENT_FIELD_DESC);
      oprot.writeBool(struct.development);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DELTA_FIELD_DESC);
      oprot.writeBool(struct.delta);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FORCE_START_FIELD_DESC);
      oprot.writeBool(struct.forceStart);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SchedulingExecutionParametersTupleSchemeFactory implements SchemeFactory {
    public SchedulingExecutionParametersTupleScheme getScheme() {
      return new SchedulingExecutionParametersTupleScheme();
    }
  }

  private static class SchedulingExecutionParametersTupleScheme extends TupleScheme<SchedulingExecutionParameters> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SchedulingExecutionParameters struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.schedulingId);
      oprot.writeBool(struct.development);
      oprot.writeBool(struct.delta);
      oprot.writeBool(struct.forceStart);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SchedulingExecutionParameters struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.schedulingId = iprot.readString();
      struct.setSchedulingIdIsSet(true);
      struct.development = iprot.readBool();
      struct.setDevelopmentIsSet(true);
      struct.delta = iprot.readBool();
      struct.setDeltaIsSet(true);
      struct.forceStart = iprot.readBool();
      struct.setForceStartIsSet(true);
    }
  }

}

