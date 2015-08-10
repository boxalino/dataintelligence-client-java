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
 * This structure defines a configuration difference (somethin which has changed between two configuration versions)
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-10")
public class ConfigurationDifference implements org.apache.thrift.TBase<ConfigurationDifference, ConfigurationDifference._Fields>, java.io.Serializable, Cloneable, Comparable<ConfigurationDifference> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ConfigurationDifference");

  private static final org.apache.thrift.protocol.TField CONTENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("contentType", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CONTENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("contentId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PARAMETER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("parameterName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CONTENT_SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("contentSource", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CONTENT_DESTINATION_FIELD_DESC = new org.apache.thrift.protocol.TField("contentDestination", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ConfigurationDifferenceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ConfigurationDifferenceTupleSchemeFactory());
  }

  /**
   * the type of content which has changed (e.g.: 'field')
   */
  public String contentType; // required
  /**
   * the content id which has changed (e.g: a field id)
   */
  public String contentId; // required
  /**
   * the content parameter which has changed (e.g.: a field type)
   */
  public String parameterName; // required
  /**
   * the string encoded value of the content parameter value of the source configuration
   */
  public String contentSource; // required
  /**
   * the string encoded value of the content parameter value of the destination configuration
   */
  public String contentDestination; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the type of content which has changed (e.g.: 'field')
     */
    CONTENT_TYPE((short)1, "contentType"),
    /**
     * the content id which has changed (e.g: a field id)
     */
    CONTENT_ID((short)2, "contentId"),
    /**
     * the content parameter which has changed (e.g.: a field type)
     */
    PARAMETER_NAME((short)3, "parameterName"),
    /**
     * the string encoded value of the content parameter value of the source configuration
     */
    CONTENT_SOURCE((short)4, "contentSource"),
    /**
     * the string encoded value of the content parameter value of the destination configuration
     */
    CONTENT_DESTINATION((short)5, "contentDestination");

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
        case 1: // CONTENT_TYPE
          return CONTENT_TYPE;
        case 2: // CONTENT_ID
          return CONTENT_ID;
        case 3: // PARAMETER_NAME
          return PARAMETER_NAME;
        case 4: // CONTENT_SOURCE
          return CONTENT_SOURCE;
        case 5: // CONTENT_DESTINATION
          return CONTENT_DESTINATION;
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
    tmpMap.put(_Fields.CONTENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("contentType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT_ID, new org.apache.thrift.meta_data.FieldMetaData("contentId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMETER_NAME, new org.apache.thrift.meta_data.FieldMetaData("parameterName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT_SOURCE, new org.apache.thrift.meta_data.FieldMetaData("contentSource", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT_DESTINATION, new org.apache.thrift.meta_data.FieldMetaData("contentDestination", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ConfigurationDifference.class, metaDataMap);
  }

  public ConfigurationDifference() {
  }

  public ConfigurationDifference(
    String contentType,
    String contentId,
    String parameterName,
    String contentSource,
    String contentDestination)
  {
    this();
    this.contentType = contentType;
    this.contentId = contentId;
    this.parameterName = parameterName;
    this.contentSource = contentSource;
    this.contentDestination = contentDestination;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConfigurationDifference(ConfigurationDifference other) {
    if (other.isSetContentType()) {
      this.contentType = other.contentType;
    }
    if (other.isSetContentId()) {
      this.contentId = other.contentId;
    }
    if (other.isSetParameterName()) {
      this.parameterName = other.parameterName;
    }
    if (other.isSetContentSource()) {
      this.contentSource = other.contentSource;
    }
    if (other.isSetContentDestination()) {
      this.contentDestination = other.contentDestination;
    }
  }

  public ConfigurationDifference deepCopy() {
    return new ConfigurationDifference(this);
  }

  @Override
  public void clear() {
    this.contentType = null;
    this.contentId = null;
    this.parameterName = null;
    this.contentSource = null;
    this.contentDestination = null;
  }

  /**
   * the type of content which has changed (e.g.: 'field')
   */
  public String getContentType() {
    return this.contentType;
  }

  /**
   * the type of content which has changed (e.g.: 'field')
   */
  public ConfigurationDifference setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public void unsetContentType() {
    this.contentType = null;
  }

  /** Returns true if field contentType is set (has been assigned a value) and false otherwise */
  public boolean isSetContentType() {
    return this.contentType != null;
  }

  public void setContentTypeIsSet(boolean value) {
    if (!value) {
      this.contentType = null;
    }
  }

  /**
   * the content id which has changed (e.g: a field id)
   */
  public String getContentId() {
    return this.contentId;
  }

  /**
   * the content id which has changed (e.g: a field id)
   */
  public ConfigurationDifference setContentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  public void unsetContentId() {
    this.contentId = null;
  }

  /** Returns true if field contentId is set (has been assigned a value) and false otherwise */
  public boolean isSetContentId() {
    return this.contentId != null;
  }

  public void setContentIdIsSet(boolean value) {
    if (!value) {
      this.contentId = null;
    }
  }

  /**
   * the content parameter which has changed (e.g.: a field type)
   */
  public String getParameterName() {
    return this.parameterName;
  }

  /**
   * the content parameter which has changed (e.g.: a field type)
   */
  public ConfigurationDifference setParameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

  public void unsetParameterName() {
    this.parameterName = null;
  }

  /** Returns true if field parameterName is set (has been assigned a value) and false otherwise */
  public boolean isSetParameterName() {
    return this.parameterName != null;
  }

  public void setParameterNameIsSet(boolean value) {
    if (!value) {
      this.parameterName = null;
    }
  }

  /**
   * the string encoded value of the content parameter value of the source configuration
   */
  public String getContentSource() {
    return this.contentSource;
  }

  /**
   * the string encoded value of the content parameter value of the source configuration
   */
  public ConfigurationDifference setContentSource(String contentSource) {
    this.contentSource = contentSource;
    return this;
  }

  public void unsetContentSource() {
    this.contentSource = null;
  }

  /** Returns true if field contentSource is set (has been assigned a value) and false otherwise */
  public boolean isSetContentSource() {
    return this.contentSource != null;
  }

  public void setContentSourceIsSet(boolean value) {
    if (!value) {
      this.contentSource = null;
    }
  }

  /**
   * the string encoded value of the content parameter value of the destination configuration
   */
  public String getContentDestination() {
    return this.contentDestination;
  }

  /**
   * the string encoded value of the content parameter value of the destination configuration
   */
  public ConfigurationDifference setContentDestination(String contentDestination) {
    this.contentDestination = contentDestination;
    return this;
  }

  public void unsetContentDestination() {
    this.contentDestination = null;
  }

  /** Returns true if field contentDestination is set (has been assigned a value) and false otherwise */
  public boolean isSetContentDestination() {
    return this.contentDestination != null;
  }

  public void setContentDestinationIsSet(boolean value) {
    if (!value) {
      this.contentDestination = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONTENT_TYPE:
      if (value == null) {
        unsetContentType();
      } else {
        setContentType((String)value);
      }
      break;

    case CONTENT_ID:
      if (value == null) {
        unsetContentId();
      } else {
        setContentId((String)value);
      }
      break;

    case PARAMETER_NAME:
      if (value == null) {
        unsetParameterName();
      } else {
        setParameterName((String)value);
      }
      break;

    case CONTENT_SOURCE:
      if (value == null) {
        unsetContentSource();
      } else {
        setContentSource((String)value);
      }
      break;

    case CONTENT_DESTINATION:
      if (value == null) {
        unsetContentDestination();
      } else {
        setContentDestination((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTENT_TYPE:
      return getContentType();

    case CONTENT_ID:
      return getContentId();

    case PARAMETER_NAME:
      return getParameterName();

    case CONTENT_SOURCE:
      return getContentSource();

    case CONTENT_DESTINATION:
      return getContentDestination();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONTENT_TYPE:
      return isSetContentType();
    case CONTENT_ID:
      return isSetContentId();
    case PARAMETER_NAME:
      return isSetParameterName();
    case CONTENT_SOURCE:
      return isSetContentSource();
    case CONTENT_DESTINATION:
      return isSetContentDestination();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ConfigurationDifference)
      return this.equals((ConfigurationDifference)that);
    return false;
  }

  public boolean equals(ConfigurationDifference that) {
    if (that == null)
      return false;

    boolean this_present_contentType = true && this.isSetContentType();
    boolean that_present_contentType = true && that.isSetContentType();
    if (this_present_contentType || that_present_contentType) {
      if (!(this_present_contentType && that_present_contentType))
        return false;
      if (!this.contentType.equals(that.contentType))
        return false;
    }

    boolean this_present_contentId = true && this.isSetContentId();
    boolean that_present_contentId = true && that.isSetContentId();
    if (this_present_contentId || that_present_contentId) {
      if (!(this_present_contentId && that_present_contentId))
        return false;
      if (!this.contentId.equals(that.contentId))
        return false;
    }

    boolean this_present_parameterName = true && this.isSetParameterName();
    boolean that_present_parameterName = true && that.isSetParameterName();
    if (this_present_parameterName || that_present_parameterName) {
      if (!(this_present_parameterName && that_present_parameterName))
        return false;
      if (!this.parameterName.equals(that.parameterName))
        return false;
    }

    boolean this_present_contentSource = true && this.isSetContentSource();
    boolean that_present_contentSource = true && that.isSetContentSource();
    if (this_present_contentSource || that_present_contentSource) {
      if (!(this_present_contentSource && that_present_contentSource))
        return false;
      if (!this.contentSource.equals(that.contentSource))
        return false;
    }

    boolean this_present_contentDestination = true && this.isSetContentDestination();
    boolean that_present_contentDestination = true && that.isSetContentDestination();
    if (this_present_contentDestination || that_present_contentDestination) {
      if (!(this_present_contentDestination && that_present_contentDestination))
        return false;
      if (!this.contentDestination.equals(that.contentDestination))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_contentType = true && (isSetContentType());
    list.add(present_contentType);
    if (present_contentType)
      list.add(contentType);

    boolean present_contentId = true && (isSetContentId());
    list.add(present_contentId);
    if (present_contentId)
      list.add(contentId);

    boolean present_parameterName = true && (isSetParameterName());
    list.add(present_parameterName);
    if (present_parameterName)
      list.add(parameterName);

    boolean present_contentSource = true && (isSetContentSource());
    list.add(present_contentSource);
    if (present_contentSource)
      list.add(contentSource);

    boolean present_contentDestination = true && (isSetContentDestination());
    list.add(present_contentDestination);
    if (present_contentDestination)
      list.add(contentDestination);

    return list.hashCode();
  }

  @Override
  public int compareTo(ConfigurationDifference other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetContentType()).compareTo(other.isSetContentType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentType, other.contentType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContentId()).compareTo(other.isSetContentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentId, other.contentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParameterName()).compareTo(other.isSetParameterName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameterName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameterName, other.parameterName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContentSource()).compareTo(other.isSetContentSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentSource, other.contentSource);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContentDestination()).compareTo(other.isSetContentDestination());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentDestination()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentDestination, other.contentDestination);
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
    StringBuilder sb = new StringBuilder("ConfigurationDifference(");
    boolean first = true;

    sb.append("contentType:");
    if (this.contentType == null) {
      sb.append("null");
    } else {
      sb.append(this.contentType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contentId:");
    if (this.contentId == null) {
      sb.append("null");
    } else {
      sb.append(this.contentId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameterName:");
    if (this.parameterName == null) {
      sb.append("null");
    } else {
      sb.append(this.parameterName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contentSource:");
    if (this.contentSource == null) {
      sb.append("null");
    } else {
      sb.append(this.contentSource);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contentDestination:");
    if (this.contentDestination == null) {
      sb.append("null");
    } else {
      sb.append(this.contentDestination);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (contentType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'contentType' was not present! Struct: " + toString());
    }
    if (contentId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'contentId' was not present! Struct: " + toString());
    }
    if (parameterName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'parameterName' was not present! Struct: " + toString());
    }
    if (contentSource == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'contentSource' was not present! Struct: " + toString());
    }
    if (contentDestination == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'contentDestination' was not present! Struct: " + toString());
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

  private static class ConfigurationDifferenceStandardSchemeFactory implements SchemeFactory {
    public ConfigurationDifferenceStandardScheme getScheme() {
      return new ConfigurationDifferenceStandardScheme();
    }
  }

  private static class ConfigurationDifferenceStandardScheme extends StandardScheme<ConfigurationDifference> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ConfigurationDifference struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contentType = iprot.readString();
              struct.setContentTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONTENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contentId = iprot.readString();
              struct.setContentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARAMETER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.parameterName = iprot.readString();
              struct.setParameterNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONTENT_SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contentSource = iprot.readString();
              struct.setContentSourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CONTENT_DESTINATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contentDestination = iprot.readString();
              struct.setContentDestinationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ConfigurationDifference struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.contentType != null) {
        oprot.writeFieldBegin(CONTENT_TYPE_FIELD_DESC);
        oprot.writeString(struct.contentType);
        oprot.writeFieldEnd();
      }
      if (struct.contentId != null) {
        oprot.writeFieldBegin(CONTENT_ID_FIELD_DESC);
        oprot.writeString(struct.contentId);
        oprot.writeFieldEnd();
      }
      if (struct.parameterName != null) {
        oprot.writeFieldBegin(PARAMETER_NAME_FIELD_DESC);
        oprot.writeString(struct.parameterName);
        oprot.writeFieldEnd();
      }
      if (struct.contentSource != null) {
        oprot.writeFieldBegin(CONTENT_SOURCE_FIELD_DESC);
        oprot.writeString(struct.contentSource);
        oprot.writeFieldEnd();
      }
      if (struct.contentDestination != null) {
        oprot.writeFieldBegin(CONTENT_DESTINATION_FIELD_DESC);
        oprot.writeString(struct.contentDestination);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ConfigurationDifferenceTupleSchemeFactory implements SchemeFactory {
    public ConfigurationDifferenceTupleScheme getScheme() {
      return new ConfigurationDifferenceTupleScheme();
    }
  }

  private static class ConfigurationDifferenceTupleScheme extends TupleScheme<ConfigurationDifference> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ConfigurationDifference struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.contentType);
      oprot.writeString(struct.contentId);
      oprot.writeString(struct.parameterName);
      oprot.writeString(struct.contentSource);
      oprot.writeString(struct.contentDestination);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ConfigurationDifference struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.contentType = iprot.readString();
      struct.setContentTypeIsSet(true);
      struct.contentId = iprot.readString();
      struct.setContentIdIsSet(true);
      struct.parameterName = iprot.readString();
      struct.setParameterNameIsSet(true);
      struct.contentSource = iprot.readString();
      struct.setContentSourceIsSet(true);
      struct.contentDestination = iprot.readString();
      struct.setContentDestinationIsSet(true);
    }
  }

}

