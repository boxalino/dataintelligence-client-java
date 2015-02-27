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
 * This structure defines a transaction report returned
 * This object is specific to TransactionReportRequest but is similar to all other type of report responses, as the only difference usually is the key object of the result variable (in this case: TransactionReportResult)
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-27")
public class TransactionReport implements org.apache.thrift.TBase<TransactionReport, TransactionReport._Fields>, java.io.Serializable, Cloneable, Comparable<TransactionReport> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TransactionReport");

  private static final org.apache.thrift.protocol.TField RESULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("results", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField SUM_RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("sumResult", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TransactionReportStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TransactionReportTupleSchemeFactory());
  }

  /**
   * the map of reporting results (one result per TransactionReportResult: indicating dimension values)
   */
  public List<TransactionReportResult> results; // required
  /**
   * the sum result
   */
  public ReportResultValues sumResult; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the map of reporting results (one result per TransactionReportResult: indicating dimension values)
     */
    RESULTS((short)1, "results"),
    /**
     * the sum result
     */
    SUM_RESULT((short)2, "sumResult");

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
        case 1: // RESULTS
          return RESULTS;
        case 2: // SUM_RESULT
          return SUM_RESULT;
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
    tmpMap.put(_Fields.RESULTS, new org.apache.thrift.meta_data.FieldMetaData("results", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TransactionReportResult.class))));
    tmpMap.put(_Fields.SUM_RESULT, new org.apache.thrift.meta_data.FieldMetaData("sumResult", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ReportResultValues.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TransactionReport.class, metaDataMap);
  }

  public TransactionReport() {
  }

  public TransactionReport(
    List<TransactionReportResult> results,
    ReportResultValues sumResult)
  {
    this();
    this.results = results;
    this.sumResult = sumResult;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TransactionReport(TransactionReport other) {
    if (other.isSetResults()) {
      List<TransactionReportResult> __this__results = new ArrayList<TransactionReportResult>(other.results.size());
      for (TransactionReportResult other_element : other.results) {
        __this__results.add(new TransactionReportResult(other_element));
      }
      this.results = __this__results;
    }
    if (other.isSetSumResult()) {
      this.sumResult = new ReportResultValues(other.sumResult);
    }
  }

  public TransactionReport deepCopy() {
    return new TransactionReport(this);
  }

  @Override
  public void clear() {
    this.results = null;
    this.sumResult = null;
  }

  public int getResultsSize() {
    return (this.results == null) ? 0 : this.results.size();
  }

  public java.util.Iterator<TransactionReportResult> getResultsIterator() {
    return (this.results == null) ? null : this.results.iterator();
  }

  public void addToResults(TransactionReportResult elem) {
    if (this.results == null) {
      this.results = new ArrayList<TransactionReportResult>();
    }
    this.results.add(elem);
  }

  /**
   * the map of reporting results (one result per TransactionReportResult: indicating dimension values)
   */
  public List<TransactionReportResult> getResults() {
    return this.results;
  }

  /**
   * the map of reporting results (one result per TransactionReportResult: indicating dimension values)
   */
  public TransactionReport setResults(List<TransactionReportResult> results) {
    this.results = results;
    return this;
  }

  public void unsetResults() {
    this.results = null;
  }

  /** Returns true if field results is set (has been assigned a value) and false otherwise */
  public boolean isSetResults() {
    return this.results != null;
  }

  public void setResultsIsSet(boolean value) {
    if (!value) {
      this.results = null;
    }
  }

  /**
   * the sum result
   */
  public ReportResultValues getSumResult() {
    return this.sumResult;
  }

  /**
   * the sum result
   */
  public TransactionReport setSumResult(ReportResultValues sumResult) {
    this.sumResult = sumResult;
    return this;
  }

  public void unsetSumResult() {
    this.sumResult = null;
  }

  /** Returns true if field sumResult is set (has been assigned a value) and false otherwise */
  public boolean isSetSumResult() {
    return this.sumResult != null;
  }

  public void setSumResultIsSet(boolean value) {
    if (!value) {
      this.sumResult = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULTS:
      if (value == null) {
        unsetResults();
      } else {
        setResults((List<TransactionReportResult>)value);
      }
      break;

    case SUM_RESULT:
      if (value == null) {
        unsetSumResult();
      } else {
        setSumResult((ReportResultValues)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULTS:
      return getResults();

    case SUM_RESULT:
      return getSumResult();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULTS:
      return isSetResults();
    case SUM_RESULT:
      return isSetSumResult();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TransactionReport)
      return this.equals((TransactionReport)that);
    return false;
  }

  public boolean equals(TransactionReport that) {
    if (that == null)
      return false;

    boolean this_present_results = true && this.isSetResults();
    boolean that_present_results = true && that.isSetResults();
    if (this_present_results || that_present_results) {
      if (!(this_present_results && that_present_results))
        return false;
      if (!this.results.equals(that.results))
        return false;
    }

    boolean this_present_sumResult = true && this.isSetSumResult();
    boolean that_present_sumResult = true && that.isSetSumResult();
    if (this_present_sumResult || that_present_sumResult) {
      if (!(this_present_sumResult && that_present_sumResult))
        return false;
      if (!this.sumResult.equals(that.sumResult))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_results = true && (isSetResults());
    list.add(present_results);
    if (present_results)
      list.add(results);

    boolean present_sumResult = true && (isSetSumResult());
    list.add(present_sumResult);
    if (present_sumResult)
      list.add(sumResult);

    return list.hashCode();
  }

  @Override
  public int compareTo(TransactionReport other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResults()).compareTo(other.isSetResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResults()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.results, other.results);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSumResult()).compareTo(other.isSetSumResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSumResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sumResult, other.sumResult);
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
    StringBuilder sb = new StringBuilder("TransactionReport(");
    boolean first = true;

    sb.append("results:");
    if (this.results == null) {
      sb.append("null");
    } else {
      sb.append(this.results);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sumResult:");
    if (this.sumResult == null) {
      sb.append("null");
    } else {
      sb.append(this.sumResult);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (results == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'results' was not present! Struct: " + toString());
    }
    if (sumResult == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sumResult' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (sumResult != null) {
      sumResult.validate();
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

  private static class TransactionReportStandardSchemeFactory implements SchemeFactory {
    public TransactionReportStandardScheme getScheme() {
      return new TransactionReportStandardScheme();
    }
  }

  private static class TransactionReportStandardScheme extends StandardScheme<TransactionReport> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TransactionReport struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list240 = iprot.readListBegin();
                struct.results = new ArrayList<TransactionReportResult>(_list240.size);
                TransactionReportResult _elem241;
                for (int _i242 = 0; _i242 < _list240.size; ++_i242)
                {
                  _elem241 = new TransactionReportResult();
                  _elem241.read(iprot);
                  struct.results.add(_elem241);
                }
                iprot.readListEnd();
              }
              struct.setResultsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUM_RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sumResult = new ReportResultValues();
              struct.sumResult.read(iprot);
              struct.setSumResultIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TransactionReport struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.results != null) {
        oprot.writeFieldBegin(RESULTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.results.size()));
          for (TransactionReportResult _iter243 : struct.results)
          {
            _iter243.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.sumResult != null) {
        oprot.writeFieldBegin(SUM_RESULT_FIELD_DESC);
        struct.sumResult.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TransactionReportTupleSchemeFactory implements SchemeFactory {
    public TransactionReportTupleScheme getScheme() {
      return new TransactionReportTupleScheme();
    }
  }

  private static class TransactionReportTupleScheme extends TupleScheme<TransactionReport> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TransactionReport struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.results.size());
        for (TransactionReportResult _iter244 : struct.results)
        {
          _iter244.write(oprot);
        }
      }
      struct.sumResult.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TransactionReport struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list245 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.results = new ArrayList<TransactionReportResult>(_list245.size);
        TransactionReportResult _elem246;
        for (int _i247 = 0; _i247 < _list245.size; ++_i247)
        {
          _elem246 = new TransactionReportResult();
          _elem246.read(iprot);
          struct.results.add(_elem246);
        }
      }
      struct.setResultsIsSet(true);
      struct.sumResult = new ReportResultValues();
      struct.sumResult.read(iprot);
      struct.setSumResultIsSet(true);
    }
  }

}

