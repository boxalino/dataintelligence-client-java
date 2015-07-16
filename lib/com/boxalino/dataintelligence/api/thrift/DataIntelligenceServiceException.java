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
 * This exception is raised by all the BoxalinoDataIntelligence service function in case of a problem
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-16")
public class DataIntelligenceServiceException extends TException implements org.apache.thrift.TBase<DataIntelligenceServiceException, DataIntelligenceServiceException._Fields>, java.io.Serializable, Cloneable, Comparable<DataIntelligenceServiceException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataIntelligenceServiceException");

  private static final org.apache.thrift.protocol.TField EXCEPTION_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("exceptionNumber", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DataIntelligenceServiceExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DataIntelligenceServiceExceptionTupleSchemeFactory());
  }

  /**
   * indicate the exception number based on the enumeration DataIntelligenceServiceExceptionNumber
   * 
   * @see DataIntelligenceServiceExceptionNumber
   */
  public DataIntelligenceServiceExceptionNumber exceptionNumber; // required
  /**
   * a textual message to explain the error conditions more in details
   */
  public String message; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * indicate the exception number based on the enumeration DataIntelligenceServiceExceptionNumber
     * 
     * @see DataIntelligenceServiceExceptionNumber
     */
    EXCEPTION_NUMBER((short)1, "exceptionNumber"),
    /**
     * a textual message to explain the error conditions more in details
     */
    MESSAGE((short)2, "message");

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
        case 1: // EXCEPTION_NUMBER
          return EXCEPTION_NUMBER;
        case 2: // MESSAGE
          return MESSAGE;
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
    tmpMap.put(_Fields.EXCEPTION_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("exceptionNumber", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DataIntelligenceServiceExceptionNumber.class)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataIntelligenceServiceException.class, metaDataMap);
  }

  public DataIntelligenceServiceException() {
  }

  public DataIntelligenceServiceException(
    DataIntelligenceServiceExceptionNumber exceptionNumber,
    String message)
  {
    this();
    this.exceptionNumber = exceptionNumber;
    this.message = message;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataIntelligenceServiceException(DataIntelligenceServiceException other) {
    if (other.isSetExceptionNumber()) {
      this.exceptionNumber = other.exceptionNumber;
    }
    if (other.isSetMessage()) {
      this.message = other.message;
    }
  }

  public DataIntelligenceServiceException deepCopy() {
    return new DataIntelligenceServiceException(this);
  }

  @Override
  public void clear() {
    this.exceptionNumber = null;
    this.message = null;
  }

  /**
   * indicate the exception number based on the enumeration DataIntelligenceServiceExceptionNumber
   * 
   * @see DataIntelligenceServiceExceptionNumber
   */
  public DataIntelligenceServiceExceptionNumber getExceptionNumber() {
    return this.exceptionNumber;
  }

  /**
   * indicate the exception number based on the enumeration DataIntelligenceServiceExceptionNumber
   * 
   * @see DataIntelligenceServiceExceptionNumber
   */
  public DataIntelligenceServiceException setExceptionNumber(DataIntelligenceServiceExceptionNumber exceptionNumber) {
    this.exceptionNumber = exceptionNumber;
    return this;
  }

  public void unsetExceptionNumber() {
    this.exceptionNumber = null;
  }

  /** Returns true if field exceptionNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetExceptionNumber() {
    return this.exceptionNumber != null;
  }

  public void setExceptionNumberIsSet(boolean value) {
    if (!value) {
      this.exceptionNumber = null;
    }
  }

  /**
   * a textual message to explain the error conditions more in details
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * a textual message to explain the error conditions more in details
   */
  public DataIntelligenceServiceException setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXCEPTION_NUMBER:
      if (value == null) {
        unsetExceptionNumber();
      } else {
        setExceptionNumber((DataIntelligenceServiceExceptionNumber)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXCEPTION_NUMBER:
      return getExceptionNumber();

    case MESSAGE:
      return getMessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXCEPTION_NUMBER:
      return isSetExceptionNumber();
    case MESSAGE:
      return isSetMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DataIntelligenceServiceException)
      return this.equals((DataIntelligenceServiceException)that);
    return false;
  }

  public boolean equals(DataIntelligenceServiceException that) {
    if (that == null)
      return false;

    boolean this_present_exceptionNumber = true && this.isSetExceptionNumber();
    boolean that_present_exceptionNumber = true && that.isSetExceptionNumber();
    if (this_present_exceptionNumber || that_present_exceptionNumber) {
      if (!(this_present_exceptionNumber && that_present_exceptionNumber))
        return false;
      if (!this.exceptionNumber.equals(that.exceptionNumber))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_exceptionNumber = true && (isSetExceptionNumber());
    list.add(present_exceptionNumber);
    if (present_exceptionNumber)
      list.add(exceptionNumber.getValue());

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    return list.hashCode();
  }

  @Override
  public int compareTo(DataIntelligenceServiceException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExceptionNumber()).compareTo(other.isSetExceptionNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExceptionNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exceptionNumber, other.exceptionNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
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
    StringBuilder sb = new StringBuilder("DataIntelligenceServiceException(");
    boolean first = true;

    sb.append("exceptionNumber:");
    if (this.exceptionNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.exceptionNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (exceptionNumber == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'exceptionNumber' was not present! Struct: " + toString());
    }
    if (message == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'message' was not present! Struct: " + toString());
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

  private static class DataIntelligenceServiceExceptionStandardSchemeFactory implements SchemeFactory {
    public DataIntelligenceServiceExceptionStandardScheme getScheme() {
      return new DataIntelligenceServiceExceptionStandardScheme();
    }
  }

  private static class DataIntelligenceServiceExceptionStandardScheme extends StandardScheme<DataIntelligenceServiceException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DataIntelligenceServiceException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXCEPTION_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.exceptionNumber = com.boxalino.dataintelligence.api.thrift.DataIntelligenceServiceExceptionNumber.findByValue(iprot.readI32());
              struct.setExceptionNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DataIntelligenceServiceException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exceptionNumber != null) {
        oprot.writeFieldBegin(EXCEPTION_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.exceptionNumber.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DataIntelligenceServiceExceptionTupleSchemeFactory implements SchemeFactory {
    public DataIntelligenceServiceExceptionTupleScheme getScheme() {
      return new DataIntelligenceServiceExceptionTupleScheme();
    }
  }

  private static class DataIntelligenceServiceExceptionTupleScheme extends TupleScheme<DataIntelligenceServiceException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DataIntelligenceServiceException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.exceptionNumber.getValue());
      oprot.writeString(struct.message);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DataIntelligenceServiceException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.exceptionNumber = com.boxalino.dataintelligence.api.thrift.DataIntelligenceServiceExceptionNumber.findByValue(iprot.readI32());
      struct.setExceptionNumberIsSet(true);
      struct.message = iprot.readString();
      struct.setMessageIsSet(true);
    }
  }

}

