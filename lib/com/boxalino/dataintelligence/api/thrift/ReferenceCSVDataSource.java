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
 * This structure defines a data source type used to get the data from reference csv files defined with the API
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-1-14")
public class ReferenceCSVDataSource implements org.apache.thrift.TBase<ReferenceCSVDataSource, ReferenceCSVDataSource._Fields>, java.io.Serializable, Cloneable, Comparable<ReferenceCSVDataSource> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReferenceCSVDataSource");

  private static final org.apache.thrift.protocol.TField DATA_SOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dataSourceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXTENDED_DATA_SOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("extendedDataSourceId", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReferenceCSVDataSourceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReferenceCSVDataSourceTupleSchemeFactory());
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String dataSourceId; // required
  /**
   * identifier of the data source which will be extended by this data source
   */
  public String extendedDataSourceId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
     */
    DATA_SOURCE_ID((short)1, "dataSourceId"),
    /**
     * identifier of the data source which will be extended by this data source
     */
    EXTENDED_DATA_SOURCE_ID((short)2, "extendedDataSourceId");

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
        case 1: // DATA_SOURCE_ID
          return DATA_SOURCE_ID;
        case 2: // EXTENDED_DATA_SOURCE_ID
          return EXTENDED_DATA_SOURCE_ID;
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
    tmpMap.put(_Fields.DATA_SOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("dataSourceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTENDED_DATA_SOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("extendedDataSourceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReferenceCSVDataSource.class, metaDataMap);
  }

  public ReferenceCSVDataSource() {
  }

  public ReferenceCSVDataSource(
    String dataSourceId,
    String extendedDataSourceId)
  {
    this();
    this.dataSourceId = dataSourceId;
    this.extendedDataSourceId = extendedDataSourceId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReferenceCSVDataSource(ReferenceCSVDataSource other) {
    if (other.isSetDataSourceId()) {
      this.dataSourceId = other.dataSourceId;
    }
    if (other.isSetExtendedDataSourceId()) {
      this.extendedDataSourceId = other.extendedDataSourceId;
    }
  }

  public ReferenceCSVDataSource deepCopy() {
    return new ReferenceCSVDataSource(this);
  }

  @Override
  public void clear() {
    this.dataSourceId = null;
    this.extendedDataSourceId = null;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String getDataSourceId() {
    return this.dataSourceId;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public ReferenceCSVDataSource setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public void unsetDataSourceId() {
    this.dataSourceId = null;
  }

  /** Returns true if field dataSourceId is set (has been assigned a value) and false otherwise */
  public boolean isSetDataSourceId() {
    return this.dataSourceId != null;
  }

  public void setDataSourceIdIsSet(boolean value) {
    if (!value) {
      this.dataSourceId = null;
    }
  }

  /**
   * identifier of the data source which will be extended by this data source
   */
  public String getExtendedDataSourceId() {
    return this.extendedDataSourceId;
  }

  /**
   * identifier of the data source which will be extended by this data source
   */
  public ReferenceCSVDataSource setExtendedDataSourceId(String extendedDataSourceId) {
    this.extendedDataSourceId = extendedDataSourceId;
    return this;
  }

  public void unsetExtendedDataSourceId() {
    this.extendedDataSourceId = null;
  }

  /** Returns true if field extendedDataSourceId is set (has been assigned a value) and false otherwise */
  public boolean isSetExtendedDataSourceId() {
    return this.extendedDataSourceId != null;
  }

  public void setExtendedDataSourceIdIsSet(boolean value) {
    if (!value) {
      this.extendedDataSourceId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA_SOURCE_ID:
      if (value == null) {
        unsetDataSourceId();
      } else {
        setDataSourceId((String)value);
      }
      break;

    case EXTENDED_DATA_SOURCE_ID:
      if (value == null) {
        unsetExtendedDataSourceId();
      } else {
        setExtendedDataSourceId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA_SOURCE_ID:
      return getDataSourceId();

    case EXTENDED_DATA_SOURCE_ID:
      return getExtendedDataSourceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA_SOURCE_ID:
      return isSetDataSourceId();
    case EXTENDED_DATA_SOURCE_ID:
      return isSetExtendedDataSourceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReferenceCSVDataSource)
      return this.equals((ReferenceCSVDataSource)that);
    return false;
  }

  public boolean equals(ReferenceCSVDataSource that) {
    if (that == null)
      return false;

    boolean this_present_dataSourceId = true && this.isSetDataSourceId();
    boolean that_present_dataSourceId = true && that.isSetDataSourceId();
    if (this_present_dataSourceId || that_present_dataSourceId) {
      if (!(this_present_dataSourceId && that_present_dataSourceId))
        return false;
      if (!this.dataSourceId.equals(that.dataSourceId))
        return false;
    }

    boolean this_present_extendedDataSourceId = true && this.isSetExtendedDataSourceId();
    boolean that_present_extendedDataSourceId = true && that.isSetExtendedDataSourceId();
    if (this_present_extendedDataSourceId || that_present_extendedDataSourceId) {
      if (!(this_present_extendedDataSourceId && that_present_extendedDataSourceId))
        return false;
      if (!this.extendedDataSourceId.equals(that.extendedDataSourceId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dataSourceId = true && (isSetDataSourceId());
    list.add(present_dataSourceId);
    if (present_dataSourceId)
      list.add(dataSourceId);

    boolean present_extendedDataSourceId = true && (isSetExtendedDataSourceId());
    list.add(present_extendedDataSourceId);
    if (present_extendedDataSourceId)
      list.add(extendedDataSourceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(ReferenceCSVDataSource other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDataSourceId()).compareTo(other.isSetDataSourceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataSourceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataSourceId, other.dataSourceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtendedDataSourceId()).compareTo(other.isSetExtendedDataSourceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtendedDataSourceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extendedDataSourceId, other.extendedDataSourceId);
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
    StringBuilder sb = new StringBuilder("ReferenceCSVDataSource(");
    boolean first = true;

    sb.append("dataSourceId:");
    if (this.dataSourceId == null) {
      sb.append("null");
    } else {
      sb.append(this.dataSourceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("extendedDataSourceId:");
    if (this.extendedDataSourceId == null) {
      sb.append("null");
    } else {
      sb.append(this.extendedDataSourceId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (dataSourceId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dataSourceId' was not present! Struct: " + toString());
    }
    if (extendedDataSourceId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'extendedDataSourceId' was not present! Struct: " + toString());
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

  private static class ReferenceCSVDataSourceStandardSchemeFactory implements SchemeFactory {
    public ReferenceCSVDataSourceStandardScheme getScheme() {
      return new ReferenceCSVDataSourceStandardScheme();
    }
  }

  private static class ReferenceCSVDataSourceStandardScheme extends StandardScheme<ReferenceCSVDataSource> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReferenceCSVDataSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA_SOURCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dataSourceId = iprot.readString();
              struct.setDataSourceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXTENDED_DATA_SOURCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.extendedDataSourceId = iprot.readString();
              struct.setExtendedDataSourceIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReferenceCSVDataSource struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dataSourceId != null) {
        oprot.writeFieldBegin(DATA_SOURCE_ID_FIELD_DESC);
        oprot.writeString(struct.dataSourceId);
        oprot.writeFieldEnd();
      }
      if (struct.extendedDataSourceId != null) {
        oprot.writeFieldBegin(EXTENDED_DATA_SOURCE_ID_FIELD_DESC);
        oprot.writeString(struct.extendedDataSourceId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReferenceCSVDataSourceTupleSchemeFactory implements SchemeFactory {
    public ReferenceCSVDataSourceTupleScheme getScheme() {
      return new ReferenceCSVDataSourceTupleScheme();
    }
  }

  private static class ReferenceCSVDataSourceTupleScheme extends TupleScheme<ReferenceCSVDataSource> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReferenceCSVDataSource struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dataSourceId);
      oprot.writeString(struct.extendedDataSourceId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReferenceCSVDataSource struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dataSourceId = iprot.readString();
      struct.setDataSourceIdIsSet(true);
      struct.extendedDataSourceId = iprot.readString();
      struct.setExtendedDataSourceIdIsSet(true);
    }
  }

}

