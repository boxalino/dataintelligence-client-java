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
 * This structure defines a data Choice.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-26")
public class Choice implements org.apache.thrift.TBase<Choice, Choice._Fields>, java.io.Serializable, Cloneable, Comparable<Choice> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Choice");

  private static final org.apache.thrift.protocol.TField CHOICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("choiceId", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChoiceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ChoiceTupleSchemeFactory());
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String choiceId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
     */
    CHOICE_ID((short)1, "choiceId");

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
        case 1: // CHOICE_ID
          return CHOICE_ID;
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
    tmpMap.put(_Fields.CHOICE_ID, new org.apache.thrift.meta_data.FieldMetaData("choiceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Choice.class, metaDataMap);
  }

  public Choice() {
  }

  public Choice(
    String choiceId)
  {
    this();
    this.choiceId = choiceId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Choice(Choice other) {
    if (other.isSetChoiceId()) {
      this.choiceId = other.choiceId;
    }
  }

  public Choice deepCopy() {
    return new Choice(this);
  }

  @Override
  public void clear() {
    this.choiceId = null;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String getChoiceId() {
    return this.choiceId;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public Choice setChoiceId(String choiceId) {
    this.choiceId = choiceId;
    return this;
  }

  public void unsetChoiceId() {
    this.choiceId = null;
  }

  /** Returns true if field choiceId is set (has been assigned a value) and false otherwise */
  public boolean isSetChoiceId() {
    return this.choiceId != null;
  }

  public void setChoiceIdIsSet(boolean value) {
    if (!value) {
      this.choiceId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHOICE_ID:
      if (value == null) {
        unsetChoiceId();
      } else {
        setChoiceId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHOICE_ID:
      return getChoiceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHOICE_ID:
      return isSetChoiceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Choice)
      return this.equals((Choice)that);
    return false;
  }

  public boolean equals(Choice that) {
    if (that == null)
      return false;

    boolean this_present_choiceId = true && this.isSetChoiceId();
    boolean that_present_choiceId = true && that.isSetChoiceId();
    if (this_present_choiceId || that_present_choiceId) {
      if (!(this_present_choiceId && that_present_choiceId))
        return false;
      if (!this.choiceId.equals(that.choiceId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_choiceId = true && (isSetChoiceId());
    list.add(present_choiceId);
    if (present_choiceId)
      list.add(choiceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(Choice other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetChoiceId()).compareTo(other.isSetChoiceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChoiceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.choiceId, other.choiceId);
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
    StringBuilder sb = new StringBuilder("Choice(");
    boolean first = true;

    sb.append("choiceId:");
    if (this.choiceId == null) {
      sb.append("null");
    } else {
      sb.append(this.choiceId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (choiceId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'choiceId' was not present! Struct: " + toString());
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

  private static class ChoiceStandardSchemeFactory implements SchemeFactory {
    public ChoiceStandardScheme getScheme() {
      return new ChoiceStandardScheme();
    }
  }

  private static class ChoiceStandardScheme extends StandardScheme<Choice> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Choice struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHOICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.choiceId = iprot.readString();
              struct.setChoiceIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Choice struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.choiceId != null) {
        oprot.writeFieldBegin(CHOICE_ID_FIELD_DESC);
        oprot.writeString(struct.choiceId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChoiceTupleSchemeFactory implements SchemeFactory {
    public ChoiceTupleScheme getScheme() {
      return new ChoiceTupleScheme();
    }
  }

  private static class ChoiceTupleScheme extends TupleScheme<Choice> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Choice struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.choiceId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Choice struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.choiceId = iprot.readString();
      struct.setChoiceIdIsSet(true);
    }
  }

}

