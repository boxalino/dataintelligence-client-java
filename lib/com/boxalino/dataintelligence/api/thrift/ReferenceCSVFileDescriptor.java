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
 * This structure defines a reference CSV file descriptor with the identifier and schema
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-13")
public class ReferenceCSVFileDescriptor implements org.apache.thrift.TBase<ReferenceCSVFileDescriptor, ReferenceCSVFileDescriptor._Fields>, java.io.Serializable, Cloneable, Comparable<ReferenceCSVFileDescriptor> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReferenceCSVFileDescriptor");

  private static final org.apache.thrift.protocol.TField FILE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("fileId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FILE_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("fileColumns", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField FILE_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("fileHash", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReferenceCSVFileDescriptorStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReferenceCSVFileDescriptorTupleSchemeFactory());
  }

  /**
   * identifier of the csv file, needs to be unique per account
   */
  public String fileId; // required
  /**
   * key-value map of the file columns, where key is a name of the column and value is a column's type
   */
  public Map<String,CSVFileColumnType> fileColumns; // required
  /**
   * internal hash used for csv file upload - this property is set by the API and cannot be changed
   */
  public String fileHash; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * identifier of the csv file, needs to be unique per account
     */
    FILE_ID((short)1, "fileId"),
    /**
     * key-value map of the file columns, where key is a name of the column and value is a column's type
     */
    FILE_COLUMNS((short)2, "fileColumns"),
    /**
     * internal hash used for csv file upload - this property is set by the API and cannot be changed
     */
    FILE_HASH((short)3, "fileHash");

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
        case 1: // FILE_ID
          return FILE_ID;
        case 2: // FILE_COLUMNS
          return FILE_COLUMNS;
        case 3: // FILE_HASH
          return FILE_HASH;
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
  private static final _Fields optionals[] = {_Fields.FILE_HASH};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILE_ID, new org.apache.thrift.meta_data.FieldMetaData("fileId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FILE_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("fileColumns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CSVFileColumnType.class))));
    tmpMap.put(_Fields.FILE_HASH, new org.apache.thrift.meta_data.FieldMetaData("fileHash", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReferenceCSVFileDescriptor.class, metaDataMap);
  }

  public ReferenceCSVFileDescriptor() {
  }

  public ReferenceCSVFileDescriptor(
    String fileId,
    Map<String,CSVFileColumnType> fileColumns)
  {
    this();
    this.fileId = fileId;
    this.fileColumns = fileColumns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReferenceCSVFileDescriptor(ReferenceCSVFileDescriptor other) {
    if (other.isSetFileId()) {
      this.fileId = other.fileId;
    }
    if (other.isSetFileColumns()) {
      Map<String,CSVFileColumnType> __this__fileColumns = new HashMap<String,CSVFileColumnType>(other.fileColumns.size());
      for (Map.Entry<String, CSVFileColumnType> other_element : other.fileColumns.entrySet()) {

        String other_element_key = other_element.getKey();
        CSVFileColumnType other_element_value = other_element.getValue();

        String __this__fileColumns_copy_key = other_element_key;

        CSVFileColumnType __this__fileColumns_copy_value = other_element_value;

        __this__fileColumns.put(__this__fileColumns_copy_key, __this__fileColumns_copy_value);
      }
      this.fileColumns = __this__fileColumns;
    }
    if (other.isSetFileHash()) {
      this.fileHash = other.fileHash;
    }
  }

  public ReferenceCSVFileDescriptor deepCopy() {
    return new ReferenceCSVFileDescriptor(this);
  }

  @Override
  public void clear() {
    this.fileId = null;
    this.fileColumns = null;
    this.fileHash = null;
  }

  /**
   * identifier of the csv file, needs to be unique per account
   */
  public String getFileId() {
    return this.fileId;
  }

  /**
   * identifier of the csv file, needs to be unique per account
   */
  public ReferenceCSVFileDescriptor setFileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  public void unsetFileId() {
    this.fileId = null;
  }

  /** Returns true if field fileId is set (has been assigned a value) and false otherwise */
  public boolean isSetFileId() {
    return this.fileId != null;
  }

  public void setFileIdIsSet(boolean value) {
    if (!value) {
      this.fileId = null;
    }
  }

  public int getFileColumnsSize() {
    return (this.fileColumns == null) ? 0 : this.fileColumns.size();
  }

  public void putToFileColumns(String key, CSVFileColumnType val) {
    if (this.fileColumns == null) {
      this.fileColumns = new HashMap<String,CSVFileColumnType>();
    }
    this.fileColumns.put(key, val);
  }

  /**
   * key-value map of the file columns, where key is a name of the column and value is a column's type
   */
  public Map<String,CSVFileColumnType> getFileColumns() {
    return this.fileColumns;
  }

  /**
   * key-value map of the file columns, where key is a name of the column and value is a column's type
   */
  public ReferenceCSVFileDescriptor setFileColumns(Map<String,CSVFileColumnType> fileColumns) {
    this.fileColumns = fileColumns;
    return this;
  }

  public void unsetFileColumns() {
    this.fileColumns = null;
  }

  /** Returns true if field fileColumns is set (has been assigned a value) and false otherwise */
  public boolean isSetFileColumns() {
    return this.fileColumns != null;
  }

  public void setFileColumnsIsSet(boolean value) {
    if (!value) {
      this.fileColumns = null;
    }
  }

  /**
   * internal hash used for csv file upload - this property is set by the API and cannot be changed
   */
  public String getFileHash() {
    return this.fileHash;
  }

  /**
   * internal hash used for csv file upload - this property is set by the API and cannot be changed
   */
  public ReferenceCSVFileDescriptor setFileHash(String fileHash) {
    this.fileHash = fileHash;
    return this;
  }

  public void unsetFileHash() {
    this.fileHash = null;
  }

  /** Returns true if field fileHash is set (has been assigned a value) and false otherwise */
  public boolean isSetFileHash() {
    return this.fileHash != null;
  }

  public void setFileHashIsSet(boolean value) {
    if (!value) {
      this.fileHash = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILE_ID:
      if (value == null) {
        unsetFileId();
      } else {
        setFileId((String)value);
      }
      break;

    case FILE_COLUMNS:
      if (value == null) {
        unsetFileColumns();
      } else {
        setFileColumns((Map<String,CSVFileColumnType>)value);
      }
      break;

    case FILE_HASH:
      if (value == null) {
        unsetFileHash();
      } else {
        setFileHash((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILE_ID:
      return getFileId();

    case FILE_COLUMNS:
      return getFileColumns();

    case FILE_HASH:
      return getFileHash();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILE_ID:
      return isSetFileId();
    case FILE_COLUMNS:
      return isSetFileColumns();
    case FILE_HASH:
      return isSetFileHash();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReferenceCSVFileDescriptor)
      return this.equals((ReferenceCSVFileDescriptor)that);
    return false;
  }

  public boolean equals(ReferenceCSVFileDescriptor that) {
    if (that == null)
      return false;

    boolean this_present_fileId = true && this.isSetFileId();
    boolean that_present_fileId = true && that.isSetFileId();
    if (this_present_fileId || that_present_fileId) {
      if (!(this_present_fileId && that_present_fileId))
        return false;
      if (!this.fileId.equals(that.fileId))
        return false;
    }

    boolean this_present_fileColumns = true && this.isSetFileColumns();
    boolean that_present_fileColumns = true && that.isSetFileColumns();
    if (this_present_fileColumns || that_present_fileColumns) {
      if (!(this_present_fileColumns && that_present_fileColumns))
        return false;
      if (!this.fileColumns.equals(that.fileColumns))
        return false;
    }

    boolean this_present_fileHash = true && this.isSetFileHash();
    boolean that_present_fileHash = true && that.isSetFileHash();
    if (this_present_fileHash || that_present_fileHash) {
      if (!(this_present_fileHash && that_present_fileHash))
        return false;
      if (!this.fileHash.equals(that.fileHash))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fileId = true && (isSetFileId());
    list.add(present_fileId);
    if (present_fileId)
      list.add(fileId);

    boolean present_fileColumns = true && (isSetFileColumns());
    list.add(present_fileColumns);
    if (present_fileColumns)
      list.add(fileColumns);

    boolean present_fileHash = true && (isSetFileHash());
    list.add(present_fileHash);
    if (present_fileHash)
      list.add(fileHash);

    return list.hashCode();
  }

  @Override
  public int compareTo(ReferenceCSVFileDescriptor other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFileId()).compareTo(other.isSetFileId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileId, other.fileId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFileColumns()).compareTo(other.isSetFileColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileColumns, other.fileColumns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFileHash()).compareTo(other.isSetFileHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileHash, other.fileHash);
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
    StringBuilder sb = new StringBuilder("ReferenceCSVFileDescriptor(");
    boolean first = true;

    sb.append("fileId:");
    if (this.fileId == null) {
      sb.append("null");
    } else {
      sb.append(this.fileId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fileColumns:");
    if (this.fileColumns == null) {
      sb.append("null");
    } else {
      sb.append(this.fileColumns);
    }
    first = false;
    if (isSetFileHash()) {
      if (!first) sb.append(", ");
      sb.append("fileHash:");
      if (this.fileHash == null) {
        sb.append("null");
      } else {
        sb.append(this.fileHash);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (fileId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fileId' was not present! Struct: " + toString());
    }
    if (fileColumns == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fileColumns' was not present! Struct: " + toString());
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

  private static class ReferenceCSVFileDescriptorStandardSchemeFactory implements SchemeFactory {
    public ReferenceCSVFileDescriptorStandardScheme getScheme() {
      return new ReferenceCSVFileDescriptorStandardScheme();
    }
  }

  private static class ReferenceCSVFileDescriptorStandardScheme extends StandardScheme<ReferenceCSVFileDescriptor> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReferenceCSVFileDescriptor struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fileId = iprot.readString();
              struct.setFileIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FILE_COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map120 = iprot.readMapBegin();
                struct.fileColumns = new HashMap<String,CSVFileColumnType>(2*_map120.size);
                String _key121;
                CSVFileColumnType _val122;
                for (int _i123 = 0; _i123 < _map120.size; ++_i123)
                {
                  _key121 = iprot.readString();
                  _val122 = com.boxalino.dataintelligence.api.thrift.CSVFileColumnType.findByValue(iprot.readI32());
                  struct.fileColumns.put(_key121, _val122);
                }
                iprot.readMapEnd();
              }
              struct.setFileColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FILE_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fileHash = iprot.readString();
              struct.setFileHashIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReferenceCSVFileDescriptor struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fileId != null) {
        oprot.writeFieldBegin(FILE_ID_FIELD_DESC);
        oprot.writeString(struct.fileId);
        oprot.writeFieldEnd();
      }
      if (struct.fileColumns != null) {
        oprot.writeFieldBegin(FILE_COLUMNS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, struct.fileColumns.size()));
          for (Map.Entry<String, CSVFileColumnType> _iter124 : struct.fileColumns.entrySet())
          {
            oprot.writeString(_iter124.getKey());
            oprot.writeI32(_iter124.getValue().getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.fileHash != null) {
        if (struct.isSetFileHash()) {
          oprot.writeFieldBegin(FILE_HASH_FIELD_DESC);
          oprot.writeString(struct.fileHash);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReferenceCSVFileDescriptorTupleSchemeFactory implements SchemeFactory {
    public ReferenceCSVFileDescriptorTupleScheme getScheme() {
      return new ReferenceCSVFileDescriptorTupleScheme();
    }
  }

  private static class ReferenceCSVFileDescriptorTupleScheme extends TupleScheme<ReferenceCSVFileDescriptor> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReferenceCSVFileDescriptor struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.fileId);
      {
        oprot.writeI32(struct.fileColumns.size());
        for (Map.Entry<String, CSVFileColumnType> _iter125 : struct.fileColumns.entrySet())
        {
          oprot.writeString(_iter125.getKey());
          oprot.writeI32(_iter125.getValue().getValue());
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetFileHash()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFileHash()) {
        oprot.writeString(struct.fileHash);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReferenceCSVFileDescriptor struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.fileId = iprot.readString();
      struct.setFileIdIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map126 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.fileColumns = new HashMap<String,CSVFileColumnType>(2*_map126.size);
        String _key127;
        CSVFileColumnType _val128;
        for (int _i129 = 0; _i129 < _map126.size; ++_i129)
        {
          _key127 = iprot.readString();
          _val128 = com.boxalino.dataintelligence.api.thrift.CSVFileColumnType.findByValue(iprot.readI32());
          struct.fileColumns.put(_key127, _val128);
        }
      }
      struct.setFileColumnsIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.fileHash = iprot.readString();
        struct.setFileHashIsSet(true);
      }
    }
  }

}

