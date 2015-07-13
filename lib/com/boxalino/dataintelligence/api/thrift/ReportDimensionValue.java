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
 * This structure defines a dimension value association
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-13")
public class ReportDimensionValue implements org.apache.thrift.TBase<ReportDimensionValue, ReportDimensionValue._Fields>, java.io.Serializable, Cloneable, Comparable<ReportDimensionValue> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReportDimensionValue");

  private static final org.apache.thrift.protocol.TField DIMENSION_FIELD_DESC = new org.apache.thrift.protocol.TField("dimension", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReportDimensionValueStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReportDimensionValueTupleSchemeFactory());
  }

  /**
   * the dimension
   */
  public ReportDimension dimension; // required
  /**
   * the dimension value
   */
  public String value; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the dimension
     */
    DIMENSION((short)1, "dimension"),
    /**
     * the dimension value
     */
    VALUE((short)2, "value");

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
        case 1: // DIMENSION
          return DIMENSION;
        case 2: // VALUE
          return VALUE;
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
    tmpMap.put(_Fields.DIMENSION, new org.apache.thrift.meta_data.FieldMetaData("dimension", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ReportDimension.class)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReportDimensionValue.class, metaDataMap);
  }

  public ReportDimensionValue() {
  }

  public ReportDimensionValue(
    ReportDimension dimension,
    String value)
  {
    this();
    this.dimension = dimension;
    this.value = value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReportDimensionValue(ReportDimensionValue other) {
    if (other.isSetDimension()) {
      this.dimension = new ReportDimension(other.dimension);
    }
    if (other.isSetValue()) {
      this.value = other.value;
    }
  }

  public ReportDimensionValue deepCopy() {
    return new ReportDimensionValue(this);
  }

  @Override
  public void clear() {
    this.dimension = null;
    this.value = null;
  }

  /**
   * the dimension
   */
  public ReportDimension getDimension() {
    return this.dimension;
  }

  /**
   * the dimension
   */
  public ReportDimensionValue setDimension(ReportDimension dimension) {
    this.dimension = dimension;
    return this;
  }

  public void unsetDimension() {
    this.dimension = null;
  }

  /** Returns true if field dimension is set (has been assigned a value) and false otherwise */
  public boolean isSetDimension() {
    return this.dimension != null;
  }

  public void setDimensionIsSet(boolean value) {
    if (!value) {
      this.dimension = null;
    }
  }

  /**
   * the dimension value
   */
  public String getValue() {
    return this.value;
  }

  /**
   * the dimension value
   */
  public ReportDimensionValue setValue(String value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DIMENSION:
      if (value == null) {
        unsetDimension();
      } else {
        setDimension((ReportDimension)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DIMENSION:
      return getDimension();

    case VALUE:
      return getValue();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DIMENSION:
      return isSetDimension();
    case VALUE:
      return isSetValue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReportDimensionValue)
      return this.equals((ReportDimensionValue)that);
    return false;
  }

  public boolean equals(ReportDimensionValue that) {
    if (that == null)
      return false;

    boolean this_present_dimension = true && this.isSetDimension();
    boolean that_present_dimension = true && that.isSetDimension();
    if (this_present_dimension || that_present_dimension) {
      if (!(this_present_dimension && that_present_dimension))
        return false;
      if (!this.dimension.equals(that.dimension))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dimension = true && (isSetDimension());
    list.add(present_dimension);
    if (present_dimension)
      list.add(dimension);

    boolean present_value = true && (isSetValue());
    list.add(present_value);
    if (present_value)
      list.add(value);

    return list.hashCode();
  }

  @Override
  public int compareTo(ReportDimensionValue other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDimension()).compareTo(other.isSetDimension());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDimension()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dimension, other.dimension);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
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
    StringBuilder sb = new StringBuilder("ReportDimensionValue(");
    boolean first = true;

    sb.append("dimension:");
    if (this.dimension == null) {
      sb.append("null");
    } else {
      sb.append(this.dimension);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (dimension == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dimension' was not present! Struct: " + toString());
    }
    if (value == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'value' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (dimension != null) {
      dimension.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReportDimensionValueStandardSchemeFactory implements SchemeFactory {
    public ReportDimensionValueStandardScheme getScheme() {
      return new ReportDimensionValueStandardScheme();
    }
  }

  private static class ReportDimensionValueStandardScheme extends StandardScheme<ReportDimensionValue> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReportDimensionValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DIMENSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.dimension = new ReportDimension();
              struct.dimension.read(iprot);
              struct.setDimensionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readString();
              struct.setValueIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReportDimensionValue struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dimension != null) {
        oprot.writeFieldBegin(DIMENSION_FIELD_DESC);
        struct.dimension.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeString(struct.value);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReportDimensionValueTupleSchemeFactory implements SchemeFactory {
    public ReportDimensionValueTupleScheme getScheme() {
      return new ReportDimensionValueTupleScheme();
    }
  }

  private static class ReportDimensionValueTupleScheme extends TupleScheme<ReportDimensionValue> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReportDimensionValue struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.dimension.write(oprot);
      oprot.writeString(struct.value);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReportDimensionValue struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dimension = new ReportDimension();
      struct.dimension.read(iprot);
      struct.setDimensionIsSet(true);
      struct.value = iprot.readString();
      struct.setValueIsSet(true);
    }
  }

}

