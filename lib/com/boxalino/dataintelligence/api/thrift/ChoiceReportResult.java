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
 * This structure defines a map key (signature) of a choice report result (indication about what this result is about)
 * The ChoiceReport object contains a map with the results. For each key (i.e.: result group) the system returns a list of report metrics (kpis) and value for each date range requested.
 * These keys are, in the case of a ChoiceReport defined by the choice variant and, possibly a specific dimension value of the choice variant.
 * It is possible that there is no value for the dimension, but then there must be a value for the choiceVariant.
 * It is possible that there is no value for the choiceVariant, but then there must be a value for the choiceVariant.
 * It is only possibly that the recommendationStrategy has a value if a choiceVariant value is also provided.
 * It is possible that the 3 variables (choiceVariant, recommendationStrategy and dimensionValue) are all set.
 * Even if allowed by the fact that all of the variables are optional, it is not possible that none of the variables are set.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-26")
public class ChoiceReportResult implements org.apache.thrift.TBase<ChoiceReportResult, ChoiceReportResult._Fields>, java.io.Serializable, Cloneable, Comparable<ChoiceReportResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ChoiceReportResult");

  private static final org.apache.thrift.protocol.TField CHOICE_VARIANT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("choiceVariantId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RECOMMENDATION_STRATEGY_FIELD_DESC = new org.apache.thrift.protocol.TField("recommendationStrategy", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DIMENSION_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("dimensionValue", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChoiceReportResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ChoiceReportResultTupleSchemeFactory());
  }

  /**
   * the choice variant of the choice
   */
  public String choiceVariantId; // optional
  /**
   * optional: indicate a specific recommendation strategy which provided the result (only returned for recommendation choices when the flag returnRecommendationStrategies is true)
   */
  public String recommendationStrategy; // optional
  /**
   * an optional dimension value (in case a dimension has been requested for segmentation)
   */
  public String dimensionValue; // optional
  /**
   * the report result values
   */
  public ReportResultValues values; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the choice variant of the choice
     */
    CHOICE_VARIANT_ID((short)1, "choiceVariantId"),
    /**
     * optional: indicate a specific recommendation strategy which provided the result (only returned for recommendation choices when the flag returnRecommendationStrategies is true)
     */
    RECOMMENDATION_STRATEGY((short)2, "recommendationStrategy"),
    /**
     * an optional dimension value (in case a dimension has been requested for segmentation)
     */
    DIMENSION_VALUE((short)3, "dimensionValue"),
    /**
     * the report result values
     */
    VALUES((short)4, "values");

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
        case 1: // CHOICE_VARIANT_ID
          return CHOICE_VARIANT_ID;
        case 2: // RECOMMENDATION_STRATEGY
          return RECOMMENDATION_STRATEGY;
        case 3: // DIMENSION_VALUE
          return DIMENSION_VALUE;
        case 4: // VALUES
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
  private static final _Fields optionals[] = {_Fields.CHOICE_VARIANT_ID,_Fields.RECOMMENDATION_STRATEGY,_Fields.DIMENSION_VALUE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHOICE_VARIANT_ID, new org.apache.thrift.meta_data.FieldMetaData("choiceVariantId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECOMMENDATION_STRATEGY, new org.apache.thrift.meta_data.FieldMetaData("recommendationStrategy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DIMENSION_VALUE, new org.apache.thrift.meta_data.FieldMetaData("dimensionValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "ReportResultValues")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ChoiceReportResult.class, metaDataMap);
  }

  public ChoiceReportResult() {
  }

  public ChoiceReportResult(
    ReportResultValues values)
  {
    this();
    this.values = values;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChoiceReportResult(ChoiceReportResult other) {
    if (other.isSetChoiceVariantId()) {
      this.choiceVariantId = other.choiceVariantId;
    }
    if (other.isSetRecommendationStrategy()) {
      this.recommendationStrategy = other.recommendationStrategy;
    }
    if (other.isSetDimensionValue()) {
      this.dimensionValue = other.dimensionValue;
    }
    if (other.isSetValues()) {
      this.values = other.values;
    }
  }

  public ChoiceReportResult deepCopy() {
    return new ChoiceReportResult(this);
  }

  @Override
  public void clear() {
    this.choiceVariantId = null;
    this.recommendationStrategy = null;
    this.dimensionValue = null;
    this.values = null;
  }

  /**
   * the choice variant of the choice
   */
  public String getChoiceVariantId() {
    return this.choiceVariantId;
  }

  /**
   * the choice variant of the choice
   */
  public ChoiceReportResult setChoiceVariantId(String choiceVariantId) {
    this.choiceVariantId = choiceVariantId;
    return this;
  }

  public void unsetChoiceVariantId() {
    this.choiceVariantId = null;
  }

  /** Returns true if field choiceVariantId is set (has been assigned a value) and false otherwise */
  public boolean isSetChoiceVariantId() {
    return this.choiceVariantId != null;
  }

  public void setChoiceVariantIdIsSet(boolean value) {
    if (!value) {
      this.choiceVariantId = null;
    }
  }

  /**
   * optional: indicate a specific recommendation strategy which provided the result (only returned for recommendation choices when the flag returnRecommendationStrategies is true)
   */
  public String getRecommendationStrategy() {
    return this.recommendationStrategy;
  }

  /**
   * optional: indicate a specific recommendation strategy which provided the result (only returned for recommendation choices when the flag returnRecommendationStrategies is true)
   */
  public ChoiceReportResult setRecommendationStrategy(String recommendationStrategy) {
    this.recommendationStrategy = recommendationStrategy;
    return this;
  }

  public void unsetRecommendationStrategy() {
    this.recommendationStrategy = null;
  }

  /** Returns true if field recommendationStrategy is set (has been assigned a value) and false otherwise */
  public boolean isSetRecommendationStrategy() {
    return this.recommendationStrategy != null;
  }

  public void setRecommendationStrategyIsSet(boolean value) {
    if (!value) {
      this.recommendationStrategy = null;
    }
  }

  /**
   * an optional dimension value (in case a dimension has been requested for segmentation)
   */
  public String getDimensionValue() {
    return this.dimensionValue;
  }

  /**
   * an optional dimension value (in case a dimension has been requested for segmentation)
   */
  public ChoiceReportResult setDimensionValue(String dimensionValue) {
    this.dimensionValue = dimensionValue;
    return this;
  }

  public void unsetDimensionValue() {
    this.dimensionValue = null;
  }

  /** Returns true if field dimensionValue is set (has been assigned a value) and false otherwise */
  public boolean isSetDimensionValue() {
    return this.dimensionValue != null;
  }

  public void setDimensionValueIsSet(boolean value) {
    if (!value) {
      this.dimensionValue = null;
    }
  }

  /**
   * the report result values
   */
  public ReportResultValues getValues() {
    return this.values;
  }

  /**
   * the report result values
   */
  public ChoiceReportResult setValues(ReportResultValues values) {
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
    case CHOICE_VARIANT_ID:
      if (value == null) {
        unsetChoiceVariantId();
      } else {
        setChoiceVariantId((String)value);
      }
      break;

    case RECOMMENDATION_STRATEGY:
      if (value == null) {
        unsetRecommendationStrategy();
      } else {
        setRecommendationStrategy((String)value);
      }
      break;

    case DIMENSION_VALUE:
      if (value == null) {
        unsetDimensionValue();
      } else {
        setDimensionValue((String)value);
      }
      break;

    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((ReportResultValues)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHOICE_VARIANT_ID:
      return getChoiceVariantId();

    case RECOMMENDATION_STRATEGY:
      return getRecommendationStrategy();

    case DIMENSION_VALUE:
      return getDimensionValue();

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
    case CHOICE_VARIANT_ID:
      return isSetChoiceVariantId();
    case RECOMMENDATION_STRATEGY:
      return isSetRecommendationStrategy();
    case DIMENSION_VALUE:
      return isSetDimensionValue();
    case VALUES:
      return isSetValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChoiceReportResult)
      return this.equals((ChoiceReportResult)that);
    return false;
  }

  public boolean equals(ChoiceReportResult that) {
    if (that == null)
      return false;

    boolean this_present_choiceVariantId = true && this.isSetChoiceVariantId();
    boolean that_present_choiceVariantId = true && that.isSetChoiceVariantId();
    if (this_present_choiceVariantId || that_present_choiceVariantId) {
      if (!(this_present_choiceVariantId && that_present_choiceVariantId))
        return false;
      if (!this.choiceVariantId.equals(that.choiceVariantId))
        return false;
    }

    boolean this_present_recommendationStrategy = true && this.isSetRecommendationStrategy();
    boolean that_present_recommendationStrategy = true && that.isSetRecommendationStrategy();
    if (this_present_recommendationStrategy || that_present_recommendationStrategy) {
      if (!(this_present_recommendationStrategy && that_present_recommendationStrategy))
        return false;
      if (!this.recommendationStrategy.equals(that.recommendationStrategy))
        return false;
    }

    boolean this_present_dimensionValue = true && this.isSetDimensionValue();
    boolean that_present_dimensionValue = true && that.isSetDimensionValue();
    if (this_present_dimensionValue || that_present_dimensionValue) {
      if (!(this_present_dimensionValue && that_present_dimensionValue))
        return false;
      if (!this.dimensionValue.equals(that.dimensionValue))
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

    boolean present_choiceVariantId = true && (isSetChoiceVariantId());
    list.add(present_choiceVariantId);
    if (present_choiceVariantId)
      list.add(choiceVariantId);

    boolean present_recommendationStrategy = true && (isSetRecommendationStrategy());
    list.add(present_recommendationStrategy);
    if (present_recommendationStrategy)
      list.add(recommendationStrategy);

    boolean present_dimensionValue = true && (isSetDimensionValue());
    list.add(present_dimensionValue);
    if (present_dimensionValue)
      list.add(dimensionValue);

    boolean present_values = true && (isSetValues());
    list.add(present_values);
    if (present_values)
      list.add(values);

    return list.hashCode();
  }

  @Override
  public int compareTo(ChoiceReportResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetChoiceVariantId()).compareTo(other.isSetChoiceVariantId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChoiceVariantId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.choiceVariantId, other.choiceVariantId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecommendationStrategy()).compareTo(other.isSetRecommendationStrategy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecommendationStrategy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recommendationStrategy, other.recommendationStrategy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDimensionValue()).compareTo(other.isSetDimensionValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDimensionValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dimensionValue, other.dimensionValue);
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
    StringBuilder sb = new StringBuilder("ChoiceReportResult(");
    boolean first = true;

    if (isSetChoiceVariantId()) {
      sb.append("choiceVariantId:");
      if (this.choiceVariantId == null) {
        sb.append("null");
      } else {
        sb.append(this.choiceVariantId);
      }
      first = false;
    }
    if (isSetRecommendationStrategy()) {
      if (!first) sb.append(", ");
      sb.append("recommendationStrategy:");
      if (this.recommendationStrategy == null) {
        sb.append("null");
      } else {
        sb.append(this.recommendationStrategy);
      }
      first = false;
    }
    if (isSetDimensionValue()) {
      if (!first) sb.append(", ");
      sb.append("dimensionValue:");
      if (this.dimensionValue == null) {
        sb.append("null");
      } else {
        sb.append(this.dimensionValue);
      }
      first = false;
    }
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
    if (values == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'values' was not present! Struct: " + toString());
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

  private static class ChoiceReportResultStandardSchemeFactory implements SchemeFactory {
    public ChoiceReportResultStandardScheme getScheme() {
      return new ChoiceReportResultStandardScheme();
    }
  }

  private static class ChoiceReportResultStandardScheme extends StandardScheme<ChoiceReportResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ChoiceReportResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHOICE_VARIANT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.choiceVariantId = iprot.readString();
              struct.setChoiceVariantIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECOMMENDATION_STRATEGY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.recommendationStrategy = iprot.readString();
              struct.setRecommendationStrategyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DIMENSION_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dimensionValue = iprot.readString();
              struct.setDimensionValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.values = new ReportResultValues();
              struct.values.read(iprot);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ChoiceReportResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.choiceVariantId != null) {
        if (struct.isSetChoiceVariantId()) {
          oprot.writeFieldBegin(CHOICE_VARIANT_ID_FIELD_DESC);
          oprot.writeString(struct.choiceVariantId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.recommendationStrategy != null) {
        if (struct.isSetRecommendationStrategy()) {
          oprot.writeFieldBegin(RECOMMENDATION_STRATEGY_FIELD_DESC);
          oprot.writeString(struct.recommendationStrategy);
          oprot.writeFieldEnd();
        }
      }
      if (struct.dimensionValue != null) {
        if (struct.isSetDimensionValue()) {
          oprot.writeFieldBegin(DIMENSION_VALUE_FIELD_DESC);
          oprot.writeString(struct.dimensionValue);
          oprot.writeFieldEnd();
        }
      }
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        struct.values.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChoiceReportResultTupleSchemeFactory implements SchemeFactory {
    public ChoiceReportResultTupleScheme getScheme() {
      return new ChoiceReportResultTupleScheme();
    }
  }

  private static class ChoiceReportResultTupleScheme extends TupleScheme<ChoiceReportResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ChoiceReportResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.values.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetChoiceVariantId()) {
        optionals.set(0);
      }
      if (struct.isSetRecommendationStrategy()) {
        optionals.set(1);
      }
      if (struct.isSetDimensionValue()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetChoiceVariantId()) {
        oprot.writeString(struct.choiceVariantId);
      }
      if (struct.isSetRecommendationStrategy()) {
        oprot.writeString(struct.recommendationStrategy);
      }
      if (struct.isSetDimensionValue()) {
        oprot.writeString(struct.dimensionValue);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ChoiceReportResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.values = new ReportResultValues();
      struct.values.read(iprot);
      struct.setValuesIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.choiceVariantId = iprot.readString();
        struct.setChoiceVariantIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.recommendationStrategy = iprot.readString();
        struct.setRecommendationStrategyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dimensionValue = iprot.readString();
        struct.setDimensionValueIsSet(true);
      }
    }
  }

}

