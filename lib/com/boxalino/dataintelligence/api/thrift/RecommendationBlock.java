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
 * This structure defines a task RecommendationBlock. A RecommendationBlock is a visual block of recommendation for one page of your web-site (product detail page, basket page, etc.) you can have several recommendation blocks on the same page.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-31")
public class RecommendationBlock implements org.apache.thrift.TBase<RecommendationBlock, RecommendationBlock._Fields>, java.io.Serializable, Cloneable, Comparable<RecommendationBlock> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RecommendationBlock");

  private static final org.apache.thrift.protocol.TField RECOMMENDATION_BLOCK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("recommendationBlockId", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RecommendationBlockStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RecommendationBlockTupleSchemeFactory());
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String recommendationBlockId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
     */
    RECOMMENDATION_BLOCK_ID((short)1, "recommendationBlockId");

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
        case 1: // RECOMMENDATION_BLOCK_ID
          return RECOMMENDATION_BLOCK_ID;
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
    tmpMap.put(_Fields.RECOMMENDATION_BLOCK_ID, new org.apache.thrift.meta_data.FieldMetaData("recommendationBlockId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RecommendationBlock.class, metaDataMap);
  }

  public RecommendationBlock() {
  }

  public RecommendationBlock(
    String recommendationBlockId)
  {
    this();
    this.recommendationBlockId = recommendationBlockId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RecommendationBlock(RecommendationBlock other) {
    if (other.isSetRecommendationBlockId()) {
      this.recommendationBlockId = other.recommendationBlockId;
    }
  }

  public RecommendationBlock deepCopy() {
    return new RecommendationBlock(this);
  }

  @Override
  public void clear() {
    this.recommendationBlockId = null;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String getRecommendationBlockId() {
    return this.recommendationBlockId;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public RecommendationBlock setRecommendationBlockId(String recommendationBlockId) {
    this.recommendationBlockId = recommendationBlockId;
    return this;
  }

  public void unsetRecommendationBlockId() {
    this.recommendationBlockId = null;
  }

  /** Returns true if field recommendationBlockId is set (has been assigned a value) and false otherwise */
  public boolean isSetRecommendationBlockId() {
    return this.recommendationBlockId != null;
  }

  public void setRecommendationBlockIdIsSet(boolean value) {
    if (!value) {
      this.recommendationBlockId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RECOMMENDATION_BLOCK_ID:
      if (value == null) {
        unsetRecommendationBlockId();
      } else {
        setRecommendationBlockId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RECOMMENDATION_BLOCK_ID:
      return getRecommendationBlockId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RECOMMENDATION_BLOCK_ID:
      return isSetRecommendationBlockId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RecommendationBlock)
      return this.equals((RecommendationBlock)that);
    return false;
  }

  public boolean equals(RecommendationBlock that) {
    if (that == null)
      return false;

    boolean this_present_recommendationBlockId = true && this.isSetRecommendationBlockId();
    boolean that_present_recommendationBlockId = true && that.isSetRecommendationBlockId();
    if (this_present_recommendationBlockId || that_present_recommendationBlockId) {
      if (!(this_present_recommendationBlockId && that_present_recommendationBlockId))
        return false;
      if (!this.recommendationBlockId.equals(that.recommendationBlockId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_recommendationBlockId = true && (isSetRecommendationBlockId());
    list.add(present_recommendationBlockId);
    if (present_recommendationBlockId)
      list.add(recommendationBlockId);

    return list.hashCode();
  }

  @Override
  public int compareTo(RecommendationBlock other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRecommendationBlockId()).compareTo(other.isSetRecommendationBlockId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecommendationBlockId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recommendationBlockId, other.recommendationBlockId);
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
    StringBuilder sb = new StringBuilder("RecommendationBlock(");
    boolean first = true;

    sb.append("recommendationBlockId:");
    if (this.recommendationBlockId == null) {
      sb.append("null");
    } else {
      sb.append(this.recommendationBlockId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (recommendationBlockId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'recommendationBlockId' was not present! Struct: " + toString());
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

  private static class RecommendationBlockStandardSchemeFactory implements SchemeFactory {
    public RecommendationBlockStandardScheme getScheme() {
      return new RecommendationBlockStandardScheme();
    }
  }

  private static class RecommendationBlockStandardScheme extends StandardScheme<RecommendationBlock> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RecommendationBlock struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECOMMENDATION_BLOCK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.recommendationBlockId = iprot.readString();
              struct.setRecommendationBlockIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RecommendationBlock struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.recommendationBlockId != null) {
        oprot.writeFieldBegin(RECOMMENDATION_BLOCK_ID_FIELD_DESC);
        oprot.writeString(struct.recommendationBlockId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RecommendationBlockTupleSchemeFactory implements SchemeFactory {
    public RecommendationBlockTupleScheme getScheme() {
      return new RecommendationBlockTupleScheme();
    }
  }

  private static class RecommendationBlockTupleScheme extends TupleScheme<RecommendationBlock> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RecommendationBlock struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.recommendationBlockId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RecommendationBlock struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.recommendationBlockId = iprot.readString();
      struct.setRecommendationBlockIdIsSet(true);
    }
  }

}

