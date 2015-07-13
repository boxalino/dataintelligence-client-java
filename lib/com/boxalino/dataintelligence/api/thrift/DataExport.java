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
 * This structure defines a data export type used to push processed data into
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-13")
public class DataExport implements org.apache.thrift.TBase<DataExport, DataExport._Fields>, java.io.Serializable, Cloneable, Comparable<DataExport> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataExport");

  private static final org.apache.thrift.protocol.TField DATA_EXPORT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dataExportId", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DataExportStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DataExportTupleSchemeFactory());
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String dataExportId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
     */
    DATA_EXPORT_ID((short)1, "dataExportId");

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
        case 1: // DATA_EXPORT_ID
          return DATA_EXPORT_ID;
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
    tmpMap.put(_Fields.DATA_EXPORT_ID, new org.apache.thrift.meta_data.FieldMetaData("dataExportId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataExport.class, metaDataMap);
  }

  public DataExport() {
  }

  public DataExport(
    String dataExportId)
  {
    this();
    this.dataExportId = dataExportId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataExport(DataExport other) {
    if (other.isSetDataExportId()) {
      this.dataExportId = other.dataExportId;
    }
  }

  public DataExport deepCopy() {
    return new DataExport(this);
  }

  @Override
  public void clear() {
    this.dataExportId = null;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String getDataExportId() {
    return this.dataExportId;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public DataExport setDataExportId(String dataExportId) {
    this.dataExportId = dataExportId;
    return this;
  }

  public void unsetDataExportId() {
    this.dataExportId = null;
  }

  /** Returns true if field dataExportId is set (has been assigned a value) and false otherwise */
  public boolean isSetDataExportId() {
    return this.dataExportId != null;
  }

  public void setDataExportIdIsSet(boolean value) {
    if (!value) {
      this.dataExportId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA_EXPORT_ID:
      if (value == null) {
        unsetDataExportId();
      } else {
        setDataExportId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA_EXPORT_ID:
      return getDataExportId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA_EXPORT_ID:
      return isSetDataExportId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DataExport)
      return this.equals((DataExport)that);
    return false;
  }

  public boolean equals(DataExport that) {
    if (that == null)
      return false;

    boolean this_present_dataExportId = true && this.isSetDataExportId();
    boolean that_present_dataExportId = true && that.isSetDataExportId();
    if (this_present_dataExportId || that_present_dataExportId) {
      if (!(this_present_dataExportId && that_present_dataExportId))
        return false;
      if (!this.dataExportId.equals(that.dataExportId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dataExportId = true && (isSetDataExportId());
    list.add(present_dataExportId);
    if (present_dataExportId)
      list.add(dataExportId);

    return list.hashCode();
  }

  @Override
  public int compareTo(DataExport other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDataExportId()).compareTo(other.isSetDataExportId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataExportId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataExportId, other.dataExportId);
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
    StringBuilder sb = new StringBuilder("DataExport(");
    boolean first = true;

    sb.append("dataExportId:");
    if (this.dataExportId == null) {
      sb.append("null");
    } else {
      sb.append(this.dataExportId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (dataExportId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dataExportId' was not present! Struct: " + toString());
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

  private static class DataExportStandardSchemeFactory implements SchemeFactory {
    public DataExportStandardScheme getScheme() {
      return new DataExportStandardScheme();
    }
  }

  private static class DataExportStandardScheme extends StandardScheme<DataExport> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DataExport struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA_EXPORT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dataExportId = iprot.readString();
              struct.setDataExportIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DataExport struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dataExportId != null) {
        oprot.writeFieldBegin(DATA_EXPORT_ID_FIELD_DESC);
        oprot.writeString(struct.dataExportId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DataExportTupleSchemeFactory implements SchemeFactory {
    public DataExportTupleScheme getScheme() {
      return new DataExportTupleScheme();
    }
  }

  private static class DataExportTupleScheme extends TupleScheme<DataExport> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DataExport struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dataExportId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DataExport struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dataExportId = iprot.readString();
      struct.setDataExportIdIsSet(true);
    }
  }

}

