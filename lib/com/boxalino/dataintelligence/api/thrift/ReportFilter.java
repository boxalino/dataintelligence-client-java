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
 * this structure defines a report filter (set of and clauses), all of which must be true
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-26")
public class ReportFilter implements org.apache.thrift.TBase<ReportFilter, ReportFilter._Fields>, java.io.Serializable, Cloneable, Comparable<ReportFilter> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReportFilter");

  private static final org.apache.thrift.protocol.TField DIMENSION_CONDITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("dimensionConditions", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField METRIC_CONDITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("metricConditions", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReportFilterStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReportFilterTupleSchemeFactory());
  }

  /**
   * the dimension filters
   */
  public List<DimensionCondition> dimensionConditions; // required
  /**
   * the metric filters
   */
  public List<MetricCondition> metricConditions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the dimension filters
     */
    DIMENSION_CONDITIONS((short)1, "dimensionConditions"),
    /**
     * the metric filters
     */
    METRIC_CONDITIONS((short)2, "metricConditions");

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
        case 1: // DIMENSION_CONDITIONS
          return DIMENSION_CONDITIONS;
        case 2: // METRIC_CONDITIONS
          return METRIC_CONDITIONS;
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
    tmpMap.put(_Fields.DIMENSION_CONDITIONS, new org.apache.thrift.meta_data.FieldMetaData("dimensionConditions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DimensionCondition.class))));
    tmpMap.put(_Fields.METRIC_CONDITIONS, new org.apache.thrift.meta_data.FieldMetaData("metricConditions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricCondition.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReportFilter.class, metaDataMap);
  }

  public ReportFilter() {
  }

  public ReportFilter(
    List<DimensionCondition> dimensionConditions,
    List<MetricCondition> metricConditions)
  {
    this();
    this.dimensionConditions = dimensionConditions;
    this.metricConditions = metricConditions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReportFilter(ReportFilter other) {
    if (other.isSetDimensionConditions()) {
      List<DimensionCondition> __this__dimensionConditions = new ArrayList<DimensionCondition>(other.dimensionConditions.size());
      for (DimensionCondition other_element : other.dimensionConditions) {
        __this__dimensionConditions.add(new DimensionCondition(other_element));
      }
      this.dimensionConditions = __this__dimensionConditions;
    }
    if (other.isSetMetricConditions()) {
      List<MetricCondition> __this__metricConditions = new ArrayList<MetricCondition>(other.metricConditions.size());
      for (MetricCondition other_element : other.metricConditions) {
        __this__metricConditions.add(new MetricCondition(other_element));
      }
      this.metricConditions = __this__metricConditions;
    }
  }

  public ReportFilter deepCopy() {
    return new ReportFilter(this);
  }

  @Override
  public void clear() {
    this.dimensionConditions = null;
    this.metricConditions = null;
  }

  public int getDimensionConditionsSize() {
    return (this.dimensionConditions == null) ? 0 : this.dimensionConditions.size();
  }

  public java.util.Iterator<DimensionCondition> getDimensionConditionsIterator() {
    return (this.dimensionConditions == null) ? null : this.dimensionConditions.iterator();
  }

  public void addToDimensionConditions(DimensionCondition elem) {
    if (this.dimensionConditions == null) {
      this.dimensionConditions = new ArrayList<DimensionCondition>();
    }
    this.dimensionConditions.add(elem);
  }

  /**
   * the dimension filters
   */
  public List<DimensionCondition> getDimensionConditions() {
    return this.dimensionConditions;
  }

  /**
   * the dimension filters
   */
  public ReportFilter setDimensionConditions(List<DimensionCondition> dimensionConditions) {
    this.dimensionConditions = dimensionConditions;
    return this;
  }

  public void unsetDimensionConditions() {
    this.dimensionConditions = null;
  }

  /** Returns true if field dimensionConditions is set (has been assigned a value) and false otherwise */
  public boolean isSetDimensionConditions() {
    return this.dimensionConditions != null;
  }

  public void setDimensionConditionsIsSet(boolean value) {
    if (!value) {
      this.dimensionConditions = null;
    }
  }

  public int getMetricConditionsSize() {
    return (this.metricConditions == null) ? 0 : this.metricConditions.size();
  }

  public java.util.Iterator<MetricCondition> getMetricConditionsIterator() {
    return (this.metricConditions == null) ? null : this.metricConditions.iterator();
  }

  public void addToMetricConditions(MetricCondition elem) {
    if (this.metricConditions == null) {
      this.metricConditions = new ArrayList<MetricCondition>();
    }
    this.metricConditions.add(elem);
  }

  /**
   * the metric filters
   */
  public List<MetricCondition> getMetricConditions() {
    return this.metricConditions;
  }

  /**
   * the metric filters
   */
  public ReportFilter setMetricConditions(List<MetricCondition> metricConditions) {
    this.metricConditions = metricConditions;
    return this;
  }

  public void unsetMetricConditions() {
    this.metricConditions = null;
  }

  /** Returns true if field metricConditions is set (has been assigned a value) and false otherwise */
  public boolean isSetMetricConditions() {
    return this.metricConditions != null;
  }

  public void setMetricConditionsIsSet(boolean value) {
    if (!value) {
      this.metricConditions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DIMENSION_CONDITIONS:
      if (value == null) {
        unsetDimensionConditions();
      } else {
        setDimensionConditions((List<DimensionCondition>)value);
      }
      break;

    case METRIC_CONDITIONS:
      if (value == null) {
        unsetMetricConditions();
      } else {
        setMetricConditions((List<MetricCondition>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DIMENSION_CONDITIONS:
      return getDimensionConditions();

    case METRIC_CONDITIONS:
      return getMetricConditions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DIMENSION_CONDITIONS:
      return isSetDimensionConditions();
    case METRIC_CONDITIONS:
      return isSetMetricConditions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReportFilter)
      return this.equals((ReportFilter)that);
    return false;
  }

  public boolean equals(ReportFilter that) {
    if (that == null)
      return false;

    boolean this_present_dimensionConditions = true && this.isSetDimensionConditions();
    boolean that_present_dimensionConditions = true && that.isSetDimensionConditions();
    if (this_present_dimensionConditions || that_present_dimensionConditions) {
      if (!(this_present_dimensionConditions && that_present_dimensionConditions))
        return false;
      if (!this.dimensionConditions.equals(that.dimensionConditions))
        return false;
    }

    boolean this_present_metricConditions = true && this.isSetMetricConditions();
    boolean that_present_metricConditions = true && that.isSetMetricConditions();
    if (this_present_metricConditions || that_present_metricConditions) {
      if (!(this_present_metricConditions && that_present_metricConditions))
        return false;
      if (!this.metricConditions.equals(that.metricConditions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dimensionConditions = true && (isSetDimensionConditions());
    list.add(present_dimensionConditions);
    if (present_dimensionConditions)
      list.add(dimensionConditions);

    boolean present_metricConditions = true && (isSetMetricConditions());
    list.add(present_metricConditions);
    if (present_metricConditions)
      list.add(metricConditions);

    return list.hashCode();
  }

  @Override
  public int compareTo(ReportFilter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDimensionConditions()).compareTo(other.isSetDimensionConditions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDimensionConditions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dimensionConditions, other.dimensionConditions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetricConditions()).compareTo(other.isSetMetricConditions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetricConditions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metricConditions, other.metricConditions);
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
    StringBuilder sb = new StringBuilder("ReportFilter(");
    boolean first = true;

    sb.append("dimensionConditions:");
    if (this.dimensionConditions == null) {
      sb.append("null");
    } else {
      sb.append(this.dimensionConditions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("metricConditions:");
    if (this.metricConditions == null) {
      sb.append("null");
    } else {
      sb.append(this.metricConditions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (dimensionConditions == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dimensionConditions' was not present! Struct: " + toString());
    }
    if (metricConditions == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metricConditions' was not present! Struct: " + toString());
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

  private static class ReportFilterStandardSchemeFactory implements SchemeFactory {
    public ReportFilterStandardScheme getScheme() {
      return new ReportFilterStandardScheme();
    }
  }

  private static class ReportFilterStandardScheme extends StandardScheme<ReportFilter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReportFilter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DIMENSION_CONDITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list136 = iprot.readListBegin();
                struct.dimensionConditions = new ArrayList<DimensionCondition>(_list136.size);
                DimensionCondition _elem137;
                for (int _i138 = 0; _i138 < _list136.size; ++_i138)
                {
                  _elem137 = new DimensionCondition();
                  _elem137.read(iprot);
                  struct.dimensionConditions.add(_elem137);
                }
                iprot.readListEnd();
              }
              struct.setDimensionConditionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METRIC_CONDITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list139 = iprot.readListBegin();
                struct.metricConditions = new ArrayList<MetricCondition>(_list139.size);
                MetricCondition _elem140;
                for (int _i141 = 0; _i141 < _list139.size; ++_i141)
                {
                  _elem140 = new MetricCondition();
                  _elem140.read(iprot);
                  struct.metricConditions.add(_elem140);
                }
                iprot.readListEnd();
              }
              struct.setMetricConditionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReportFilter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dimensionConditions != null) {
        oprot.writeFieldBegin(DIMENSION_CONDITIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.dimensionConditions.size()));
          for (DimensionCondition _iter142 : struct.dimensionConditions)
          {
            _iter142.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.metricConditions != null) {
        oprot.writeFieldBegin(METRIC_CONDITIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.metricConditions.size()));
          for (MetricCondition _iter143 : struct.metricConditions)
          {
            _iter143.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReportFilterTupleSchemeFactory implements SchemeFactory {
    public ReportFilterTupleScheme getScheme() {
      return new ReportFilterTupleScheme();
    }
  }

  private static class ReportFilterTupleScheme extends TupleScheme<ReportFilter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReportFilter struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.dimensionConditions.size());
        for (DimensionCondition _iter144 : struct.dimensionConditions)
        {
          _iter144.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.metricConditions.size());
        for (MetricCondition _iter145 : struct.metricConditions)
        {
          _iter145.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReportFilter struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list146 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.dimensionConditions = new ArrayList<DimensionCondition>(_list146.size);
        DimensionCondition _elem147;
        for (int _i148 = 0; _i148 < _list146.size; ++_i148)
        {
          _elem147 = new DimensionCondition();
          _elem147.read(iprot);
          struct.dimensionConditions.add(_elem147);
        }
      }
      struct.setDimensionConditionsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list149 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.metricConditions = new ArrayList<MetricCondition>(_list149.size);
        MetricCondition _elem150;
        for (int _i151 = 0; _i151 < _list149.size; ++_i151)
        {
          _elem150 = new MetricCondition();
          _elem150.read(iprot);
          struct.metricConditions.add(_elem150);
        }
      }
      struct.setMetricConditionsIsSet(true);
    }
  }

}

