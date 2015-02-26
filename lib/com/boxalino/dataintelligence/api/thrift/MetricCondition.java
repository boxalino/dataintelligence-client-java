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
 * this structure defines a metric condition, corresponding to a list of ConditionTargets for a given metric
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-26")
public class MetricCondition implements org.apache.thrift.TBase<MetricCondition, MetricCondition._Fields>, java.io.Serializable, Cloneable, Comparable<MetricCondition> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MetricCondition");

  private static final org.apache.thrift.protocol.TField METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("metric", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CONDITION_TARGETS_FIELD_DESC = new org.apache.thrift.protocol.TField("conditionTargets", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetricConditionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetricConditionTupleSchemeFactory());
  }

  /**
   * the report metric
   */
  public ReportMetric metric; // required
  /**
   * the list of condition targets to be matched
   */
  public List<ConditionTarget> conditionTargets; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the report metric
     */
    METRIC((short)1, "metric"),
    /**
     * the list of condition targets to be matched
     */
    CONDITION_TARGETS((short)2, "conditionTargets");

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
        case 1: // METRIC
          return METRIC;
        case 2: // CONDITION_TARGETS
          return CONDITION_TARGETS;
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
    tmpMap.put(_Fields.METRIC, new org.apache.thrift.meta_data.FieldMetaData("metric", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ReportMetric.class)));
    tmpMap.put(_Fields.CONDITION_TARGETS, new org.apache.thrift.meta_data.FieldMetaData("conditionTargets", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ConditionTarget.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MetricCondition.class, metaDataMap);
  }

  public MetricCondition() {
  }

  public MetricCondition(
    ReportMetric metric,
    List<ConditionTarget> conditionTargets)
  {
    this();
    this.metric = metric;
    this.conditionTargets = conditionTargets;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetricCondition(MetricCondition other) {
    if (other.isSetMetric()) {
      this.metric = new ReportMetric(other.metric);
    }
    if (other.isSetConditionTargets()) {
      List<ConditionTarget> __this__conditionTargets = new ArrayList<ConditionTarget>(other.conditionTargets.size());
      for (ConditionTarget other_element : other.conditionTargets) {
        __this__conditionTargets.add(new ConditionTarget(other_element));
      }
      this.conditionTargets = __this__conditionTargets;
    }
  }

  public MetricCondition deepCopy() {
    return new MetricCondition(this);
  }

  @Override
  public void clear() {
    this.metric = null;
    this.conditionTargets = null;
  }

  /**
   * the report metric
   */
  public ReportMetric getMetric() {
    return this.metric;
  }

  /**
   * the report metric
   */
  public MetricCondition setMetric(ReportMetric metric) {
    this.metric = metric;
    return this;
  }

  public void unsetMetric() {
    this.metric = null;
  }

  /** Returns true if field metric is set (has been assigned a value) and false otherwise */
  public boolean isSetMetric() {
    return this.metric != null;
  }

  public void setMetricIsSet(boolean value) {
    if (!value) {
      this.metric = null;
    }
  }

  public int getConditionTargetsSize() {
    return (this.conditionTargets == null) ? 0 : this.conditionTargets.size();
  }

  public java.util.Iterator<ConditionTarget> getConditionTargetsIterator() {
    return (this.conditionTargets == null) ? null : this.conditionTargets.iterator();
  }

  public void addToConditionTargets(ConditionTarget elem) {
    if (this.conditionTargets == null) {
      this.conditionTargets = new ArrayList<ConditionTarget>();
    }
    this.conditionTargets.add(elem);
  }

  /**
   * the list of condition targets to be matched
   */
  public List<ConditionTarget> getConditionTargets() {
    return this.conditionTargets;
  }

  /**
   * the list of condition targets to be matched
   */
  public MetricCondition setConditionTargets(List<ConditionTarget> conditionTargets) {
    this.conditionTargets = conditionTargets;
    return this;
  }

  public void unsetConditionTargets() {
    this.conditionTargets = null;
  }

  /** Returns true if field conditionTargets is set (has been assigned a value) and false otherwise */
  public boolean isSetConditionTargets() {
    return this.conditionTargets != null;
  }

  public void setConditionTargetsIsSet(boolean value) {
    if (!value) {
      this.conditionTargets = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METRIC:
      if (value == null) {
        unsetMetric();
      } else {
        setMetric((ReportMetric)value);
      }
      break;

    case CONDITION_TARGETS:
      if (value == null) {
        unsetConditionTargets();
      } else {
        setConditionTargets((List<ConditionTarget>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METRIC:
      return getMetric();

    case CONDITION_TARGETS:
      return getConditionTargets();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METRIC:
      return isSetMetric();
    case CONDITION_TARGETS:
      return isSetConditionTargets();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetricCondition)
      return this.equals((MetricCondition)that);
    return false;
  }

  public boolean equals(MetricCondition that) {
    if (that == null)
      return false;

    boolean this_present_metric = true && this.isSetMetric();
    boolean that_present_metric = true && that.isSetMetric();
    if (this_present_metric || that_present_metric) {
      if (!(this_present_metric && that_present_metric))
        return false;
      if (!this.metric.equals(that.metric))
        return false;
    }

    boolean this_present_conditionTargets = true && this.isSetConditionTargets();
    boolean that_present_conditionTargets = true && that.isSetConditionTargets();
    if (this_present_conditionTargets || that_present_conditionTargets) {
      if (!(this_present_conditionTargets && that_present_conditionTargets))
        return false;
      if (!this.conditionTargets.equals(that.conditionTargets))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metric = true && (isSetMetric());
    list.add(present_metric);
    if (present_metric)
      list.add(metric);

    boolean present_conditionTargets = true && (isSetConditionTargets());
    list.add(present_conditionTargets);
    if (present_conditionTargets)
      list.add(conditionTargets);

    return list.hashCode();
  }

  @Override
  public int compareTo(MetricCondition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetric()).compareTo(other.isSetMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metric, other.metric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConditionTargets()).compareTo(other.isSetConditionTargets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConditionTargets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.conditionTargets, other.conditionTargets);
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
    StringBuilder sb = new StringBuilder("MetricCondition(");
    boolean first = true;

    sb.append("metric:");
    if (this.metric == null) {
      sb.append("null");
    } else {
      sb.append(this.metric);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("conditionTargets:");
    if (this.conditionTargets == null) {
      sb.append("null");
    } else {
      sb.append(this.conditionTargets);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (metric == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metric' was not present! Struct: " + toString());
    }
    if (conditionTargets == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'conditionTargets' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (metric != null) {
      metric.validate();
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

  private static class MetricConditionStandardSchemeFactory implements SchemeFactory {
    public MetricConditionStandardScheme getScheme() {
      return new MetricConditionStandardScheme();
    }
  }

  private static class MetricConditionStandardScheme extends StandardScheme<MetricCondition> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MetricCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.metric = new ReportMetric();
              struct.metric.read(iprot);
              struct.setMetricIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONDITION_TARGETS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list128 = iprot.readListBegin();
                struct.conditionTargets = new ArrayList<ConditionTarget>(_list128.size);
                ConditionTarget _elem129;
                for (int _i130 = 0; _i130 < _list128.size; ++_i130)
                {
                  _elem129 = new ConditionTarget();
                  _elem129.read(iprot);
                  struct.conditionTargets.add(_elem129);
                }
                iprot.readListEnd();
              }
              struct.setConditionTargetsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MetricCondition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metric != null) {
        oprot.writeFieldBegin(METRIC_FIELD_DESC);
        struct.metric.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.conditionTargets != null) {
        oprot.writeFieldBegin(CONDITION_TARGETS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.conditionTargets.size()));
          for (ConditionTarget _iter131 : struct.conditionTargets)
          {
            _iter131.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetricConditionTupleSchemeFactory implements SchemeFactory {
    public MetricConditionTupleScheme getScheme() {
      return new MetricConditionTupleScheme();
    }
  }

  private static class MetricConditionTupleScheme extends TupleScheme<MetricCondition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MetricCondition struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.metric.write(oprot);
      {
        oprot.writeI32(struct.conditionTargets.size());
        for (ConditionTarget _iter132 : struct.conditionTargets)
        {
          _iter132.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MetricCondition struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.metric = new ReportMetric();
      struct.metric.read(iprot);
      struct.setMetricIsSet(true);
      {
        org.apache.thrift.protocol.TList _list133 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.conditionTargets = new ArrayList<ConditionTarget>(_list133.size);
        ConditionTarget _elem134;
        for (int _i135 = 0; _i135 < _list133.size; ++_i135)
        {
          _elem134 = new ConditionTarget();
          _elem134.read(iprot);
          struct.conditionTargets.add(_elem134);
        }
      }
      struct.setConditionTargetsIsSet(true);
    }
  }

}
