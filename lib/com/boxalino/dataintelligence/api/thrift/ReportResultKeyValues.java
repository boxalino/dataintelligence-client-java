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
 * This structure defines one key value set of report results
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-31")
public class ReportResultKeyValues implements org.apache.thrift.TBase<ReportResultKeyValues, ReportResultKeyValues._Fields>, java.io.Serializable, Cloneable, Comparable<ReportResultKeyValues> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReportResultKeyValues");

  private static final org.apache.thrift.protocol.TField RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("range", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReportResultKeyValuesStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReportResultKeyValuesTupleSchemeFactory());
  }

  /**
   * the time range key
   */
  public TimeRange range; // required
  /**
   * the metric values for this time range key
   */
  public List<ReportMetricValue> values; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the time range key
     */
    RANGE((short)1, "range"),
    /**
     * the metric values for this time range key
     */
    VALUES((short)2, "values");

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
        case 1: // RANGE
          return RANGE;
        case 2: // VALUES
          return VALUES;
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
    tmpMap.put(_Fields.RANGE, new org.apache.thrift.meta_data.FieldMetaData("range", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TimeRange.class)));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ReportMetricValue.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReportResultKeyValues.class, metaDataMap);
  }

  public ReportResultKeyValues() {
  }

  public ReportResultKeyValues(
    TimeRange range,
    List<ReportMetricValue> values)
  {
    this();
    this.range = range;
    this.values = values;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReportResultKeyValues(ReportResultKeyValues other) {
    if (other.isSetRange()) {
      this.range = new TimeRange(other.range);
    }
    if (other.isSetValues()) {
      List<ReportMetricValue> __this__values = new ArrayList<ReportMetricValue>(other.values.size());
      for (ReportMetricValue other_element : other.values) {
        __this__values.add(new ReportMetricValue(other_element));
      }
      this.values = __this__values;
    }
  }

  public ReportResultKeyValues deepCopy() {
    return new ReportResultKeyValues(this);
  }

  @Override
  public void clear() {
    this.range = null;
    this.values = null;
  }

  /**
   * the time range key
   */
  public TimeRange getRange() {
    return this.range;
  }

  /**
   * the time range key
   */
  public ReportResultKeyValues setRange(TimeRange range) {
    this.range = range;
    return this;
  }

  public void unsetRange() {
    this.range = null;
  }

  /** Returns true if field range is set (has been assigned a value) and false otherwise */
  public boolean isSetRange() {
    return this.range != null;
  }

  public void setRangeIsSet(boolean value) {
    if (!value) {
      this.range = null;
    }
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  public java.util.Iterator<ReportMetricValue> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }

  public void addToValues(ReportMetricValue elem) {
    if (this.values == null) {
      this.values = new ArrayList<ReportMetricValue>();
    }
    this.values.add(elem);
  }

  /**
   * the metric values for this time range key
   */
  public List<ReportMetricValue> getValues() {
    return this.values;
  }

  /**
   * the metric values for this time range key
   */
  public ReportResultKeyValues setValues(List<ReportMetricValue> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RANGE:
      if (value == null) {
        unsetRange();
      } else {
        setRange((TimeRange)value);
      }
      break;

    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((List<ReportMetricValue>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RANGE:
      return getRange();

    case VALUES:
      return getValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RANGE:
      return isSetRange();
    case VALUES:
      return isSetValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReportResultKeyValues)
      return this.equals((ReportResultKeyValues)that);
    return false;
  }

  public boolean equals(ReportResultKeyValues that) {
    if (that == null)
      return false;

    boolean this_present_range = true && this.isSetRange();
    boolean that_present_range = true && that.isSetRange();
    if (this_present_range || that_present_range) {
      if (!(this_present_range && that_present_range))
        return false;
      if (!this.range.equals(that.range))
        return false;
    }

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_range = true && (isSetRange());
    list.add(present_range);
    if (present_range)
      list.add(range);

    boolean present_values = true && (isSetValues());
    list.add(present_values);
    if (present_values)
      list.add(values);

    return list.hashCode();
  }

  @Override
  public int compareTo(ReportResultKeyValues other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRange()).compareTo(other.isSetRange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.range, other.range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
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
    StringBuilder sb = new StringBuilder("ReportResultKeyValues(");
    boolean first = true;

    sb.append("range:");
    if (this.range == null) {
      sb.append("null");
    } else {
      sb.append(this.range);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (range == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'range' was not present! Struct: " + toString());
    }
    if (values == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'values' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (range != null) {
      range.validate();
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

  private static class ReportResultKeyValuesStandardSchemeFactory implements SchemeFactory {
    public ReportResultKeyValuesStandardScheme getScheme() {
      return new ReportResultKeyValuesStandardScheme();
    }
  }

  private static class ReportResultKeyValuesStandardScheme extends StandardScheme<ReportResultKeyValues> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReportResultKeyValues struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.range = new TimeRange();
              struct.range.read(iprot);
              struct.setRangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list162 = iprot.readListBegin();
                struct.values = new ArrayList<ReportMetricValue>(_list162.size);
                ReportMetricValue _elem163;
                for (int _i164 = 0; _i164 < _list162.size; ++_i164)
                {
                  _elem163 = new ReportMetricValue();
                  _elem163.read(iprot);
                  struct.values.add(_elem163);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReportResultKeyValues struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.range != null) {
        oprot.writeFieldBegin(RANGE_FIELD_DESC);
        struct.range.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.values.size()));
          for (ReportMetricValue _iter165 : struct.values)
          {
            _iter165.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReportResultKeyValuesTupleSchemeFactory implements SchemeFactory {
    public ReportResultKeyValuesTupleScheme getScheme() {
      return new ReportResultKeyValuesTupleScheme();
    }
  }

  private static class ReportResultKeyValuesTupleScheme extends TupleScheme<ReportResultKeyValues> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReportResultKeyValues struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.range.write(oprot);
      {
        oprot.writeI32(struct.values.size());
        for (ReportMetricValue _iter166 : struct.values)
        {
          _iter166.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReportResultKeyValues struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.range = new TimeRange();
      struct.range.read(iprot);
      struct.setRangeIsSet(true);
      {
        org.apache.thrift.protocol.TList _list167 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.values = new ArrayList<ReportMetricValue>(_list167.size);
        ReportMetricValue _elem168;
        for (int _i169 = 0; _i169 < _list167.size; ++_i169)
        {
          _elem168 = new ReportMetricValue();
          _elem168.read(iprot);
          struct.values.add(_elem168);
        }
      }
      struct.setValuesIsSet(true);
    }
  }

}

