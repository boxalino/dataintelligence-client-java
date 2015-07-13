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
 * This structure defines a data synchronisation process task. It is used to get the data from external systems and process it.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-13")
public class DataSyncProcessTask implements org.apache.thrift.TBase<DataSyncProcessTask, DataSyncProcessTask._Fields>, java.io.Serializable, Cloneable, Comparable<DataSyncProcessTask> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataSyncProcessTask");

  private static final org.apache.thrift.protocol.TField PROCESS_TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("processTaskId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INPUTS_FIELD_DESC = new org.apache.thrift.protocol.TField("inputs", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField OUTPUTS_FIELD_DESC = new org.apache.thrift.protocol.TField("outputs", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField DEV_FIELD_DESC = new org.apache.thrift.protocol.TField("dev", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField DELTA_FIELD_DESC = new org.apache.thrift.protocol.TField("delta", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DataSyncProcessTaskStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DataSyncProcessTaskTupleSchemeFactory());
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String processTaskId; // required
  /**
   * list of data sources which should be used to get data from
   */
  public List<DataSource> inputs; // required
  /**
   * list of data exports which should be used to push the data into
   */
  public List<DataExport> outputs; // required
  /**
   * defines if it is dev version of the task process
   */
  public boolean dev; // required
  /**
   * defines if this particular task process is differential
   */
  public boolean delta; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
     */
    PROCESS_TASK_ID((short)1, "processTaskId"),
    /**
     * list of data sources which should be used to get data from
     */
    INPUTS((short)2, "inputs"),
    /**
     * list of data exports which should be used to push the data into
     */
    OUTPUTS((short)3, "outputs"),
    /**
     * defines if it is dev version of the task process
     */
    DEV((short)4, "dev"),
    /**
     * defines if this particular task process is differential
     */
    DELTA((short)5, "delta");

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
        case 1: // PROCESS_TASK_ID
          return PROCESS_TASK_ID;
        case 2: // INPUTS
          return INPUTS;
        case 3: // OUTPUTS
          return OUTPUTS;
        case 4: // DEV
          return DEV;
        case 5: // DELTA
          return DELTA;
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
  private static final int __DEV_ISSET_ID = 0;
  private static final int __DELTA_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROCESS_TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("processTaskId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INPUTS, new org.apache.thrift.meta_data.FieldMetaData("inputs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "DataSource"))));
    tmpMap.put(_Fields.OUTPUTS, new org.apache.thrift.meta_data.FieldMetaData("outputs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "DataExport"))));
    tmpMap.put(_Fields.DEV, new org.apache.thrift.meta_data.FieldMetaData("dev", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DELTA, new org.apache.thrift.meta_data.FieldMetaData("delta", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataSyncProcessTask.class, metaDataMap);
  }

  public DataSyncProcessTask() {
    this.dev = false;

    this.delta = false;

  }

  public DataSyncProcessTask(
    String processTaskId,
    List<DataSource> inputs,
    List<DataExport> outputs,
    boolean dev,
    boolean delta)
  {
    this();
    this.processTaskId = processTaskId;
    this.inputs = inputs;
    this.outputs = outputs;
    this.dev = dev;
    setDevIsSet(true);
    this.delta = delta;
    setDeltaIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataSyncProcessTask(DataSyncProcessTask other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProcessTaskId()) {
      this.processTaskId = other.processTaskId;
    }
    if (other.isSetInputs()) {
      List<DataSource> __this__inputs = new ArrayList<DataSource>(other.inputs.size());
      for (DataSource other_element : other.inputs) {
        __this__inputs.add(other_element);
      }
      this.inputs = __this__inputs;
    }
    if (other.isSetOutputs()) {
      List<DataExport> __this__outputs = new ArrayList<DataExport>(other.outputs.size());
      for (DataExport other_element : other.outputs) {
        __this__outputs.add(other_element);
      }
      this.outputs = __this__outputs;
    }
    this.dev = other.dev;
    this.delta = other.delta;
  }

  public DataSyncProcessTask deepCopy() {
    return new DataSyncProcessTask(this);
  }

  @Override
  public void clear() {
    this.processTaskId = null;
    this.inputs = null;
    this.outputs = null;
    this.dev = false;

    this.delta = false;

  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public String getProcessTaskId() {
    return this.processTaskId;
  }

  /**
   * a unique id which should not contain any punctuation, only non-accentuated alphabetic and numeric characters and should not be longer than 50 characters
   */
  public DataSyncProcessTask setProcessTaskId(String processTaskId) {
    this.processTaskId = processTaskId;
    return this;
  }

  public void unsetProcessTaskId() {
    this.processTaskId = null;
  }

  /** Returns true if field processTaskId is set (has been assigned a value) and false otherwise */
  public boolean isSetProcessTaskId() {
    return this.processTaskId != null;
  }

  public void setProcessTaskIdIsSet(boolean value) {
    if (!value) {
      this.processTaskId = null;
    }
  }

  public int getInputsSize() {
    return (this.inputs == null) ? 0 : this.inputs.size();
  }

  public java.util.Iterator<DataSource> getInputsIterator() {
    return (this.inputs == null) ? null : this.inputs.iterator();
  }

  public void addToInputs(DataSource elem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<DataSource>();
    }
    this.inputs.add(elem);
  }

  /**
   * list of data sources which should be used to get data from
   */
  public List<DataSource> getInputs() {
    return this.inputs;
  }

  /**
   * list of data sources which should be used to get data from
   */
  public DataSyncProcessTask setInputs(List<DataSource> inputs) {
    this.inputs = inputs;
    return this;
  }

  public void unsetInputs() {
    this.inputs = null;
  }

  /** Returns true if field inputs is set (has been assigned a value) and false otherwise */
  public boolean isSetInputs() {
    return this.inputs != null;
  }

  public void setInputsIsSet(boolean value) {
    if (!value) {
      this.inputs = null;
    }
  }

  public int getOutputsSize() {
    return (this.outputs == null) ? 0 : this.outputs.size();
  }

  public java.util.Iterator<DataExport> getOutputsIterator() {
    return (this.outputs == null) ? null : this.outputs.iterator();
  }

  public void addToOutputs(DataExport elem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<DataExport>();
    }
    this.outputs.add(elem);
  }

  /**
   * list of data exports which should be used to push the data into
   */
  public List<DataExport> getOutputs() {
    return this.outputs;
  }

  /**
   * list of data exports which should be used to push the data into
   */
  public DataSyncProcessTask setOutputs(List<DataExport> outputs) {
    this.outputs = outputs;
    return this;
  }

  public void unsetOutputs() {
    this.outputs = null;
  }

  /** Returns true if field outputs is set (has been assigned a value) and false otherwise */
  public boolean isSetOutputs() {
    return this.outputs != null;
  }

  public void setOutputsIsSet(boolean value) {
    if (!value) {
      this.outputs = null;
    }
  }

  /**
   * defines if it is dev version of the task process
   */
  public boolean isDev() {
    return this.dev;
  }

  /**
   * defines if it is dev version of the task process
   */
  public DataSyncProcessTask setDev(boolean dev) {
    this.dev = dev;
    setDevIsSet(true);
    return this;
  }

  public void unsetDev() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEV_ISSET_ID);
  }

  /** Returns true if field dev is set (has been assigned a value) and false otherwise */
  public boolean isSetDev() {
    return EncodingUtils.testBit(__isset_bitfield, __DEV_ISSET_ID);
  }

  public void setDevIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEV_ISSET_ID, value);
  }

  /**
   * defines if this particular task process is differential
   */
  public boolean isDelta() {
    return this.delta;
  }

  /**
   * defines if this particular task process is differential
   */
  public DataSyncProcessTask setDelta(boolean delta) {
    this.delta = delta;
    setDeltaIsSet(true);
    return this;
  }

  public void unsetDelta() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DELTA_ISSET_ID);
  }

  /** Returns true if field delta is set (has been assigned a value) and false otherwise */
  public boolean isSetDelta() {
    return EncodingUtils.testBit(__isset_bitfield, __DELTA_ISSET_ID);
  }

  public void setDeltaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DELTA_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROCESS_TASK_ID:
      if (value == null) {
        unsetProcessTaskId();
      } else {
        setProcessTaskId((String)value);
      }
      break;

    case INPUTS:
      if (value == null) {
        unsetInputs();
      } else {
        setInputs((List<DataSource>)value);
      }
      break;

    case OUTPUTS:
      if (value == null) {
        unsetOutputs();
      } else {
        setOutputs((List<DataExport>)value);
      }
      break;

    case DEV:
      if (value == null) {
        unsetDev();
      } else {
        setDev((Boolean)value);
      }
      break;

    case DELTA:
      if (value == null) {
        unsetDelta();
      } else {
        setDelta((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROCESS_TASK_ID:
      return getProcessTaskId();

    case INPUTS:
      return getInputs();

    case OUTPUTS:
      return getOutputs();

    case DEV:
      return Boolean.valueOf(isDev());

    case DELTA:
      return Boolean.valueOf(isDelta());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROCESS_TASK_ID:
      return isSetProcessTaskId();
    case INPUTS:
      return isSetInputs();
    case OUTPUTS:
      return isSetOutputs();
    case DEV:
      return isSetDev();
    case DELTA:
      return isSetDelta();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DataSyncProcessTask)
      return this.equals((DataSyncProcessTask)that);
    return false;
  }

  public boolean equals(DataSyncProcessTask that) {
    if (that == null)
      return false;

    boolean this_present_processTaskId = true && this.isSetProcessTaskId();
    boolean that_present_processTaskId = true && that.isSetProcessTaskId();
    if (this_present_processTaskId || that_present_processTaskId) {
      if (!(this_present_processTaskId && that_present_processTaskId))
        return false;
      if (!this.processTaskId.equals(that.processTaskId))
        return false;
    }

    boolean this_present_inputs = true && this.isSetInputs();
    boolean that_present_inputs = true && that.isSetInputs();
    if (this_present_inputs || that_present_inputs) {
      if (!(this_present_inputs && that_present_inputs))
        return false;
      if (!this.inputs.equals(that.inputs))
        return false;
    }

    boolean this_present_outputs = true && this.isSetOutputs();
    boolean that_present_outputs = true && that.isSetOutputs();
    if (this_present_outputs || that_present_outputs) {
      if (!(this_present_outputs && that_present_outputs))
        return false;
      if (!this.outputs.equals(that.outputs))
        return false;
    }

    boolean this_present_dev = true;
    boolean that_present_dev = true;
    if (this_present_dev || that_present_dev) {
      if (!(this_present_dev && that_present_dev))
        return false;
      if (this.dev != that.dev)
        return false;
    }

    boolean this_present_delta = true;
    boolean that_present_delta = true;
    if (this_present_delta || that_present_delta) {
      if (!(this_present_delta && that_present_delta))
        return false;
      if (this.delta != that.delta)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_processTaskId = true && (isSetProcessTaskId());
    list.add(present_processTaskId);
    if (present_processTaskId)
      list.add(processTaskId);

    boolean present_inputs = true && (isSetInputs());
    list.add(present_inputs);
    if (present_inputs)
      list.add(inputs);

    boolean present_outputs = true && (isSetOutputs());
    list.add(present_outputs);
    if (present_outputs)
      list.add(outputs);

    boolean present_dev = true;
    list.add(present_dev);
    if (present_dev)
      list.add(dev);

    boolean present_delta = true;
    list.add(present_delta);
    if (present_delta)
      list.add(delta);

    return list.hashCode();
  }

  @Override
  public int compareTo(DataSyncProcessTask other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProcessTaskId()).compareTo(other.isSetProcessTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcessTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processTaskId, other.processTaskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInputs()).compareTo(other.isSetInputs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputs, other.inputs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOutputs()).compareTo(other.isSetOutputs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutputs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.outputs, other.outputs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDev()).compareTo(other.isSetDev());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDev()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dev, other.dev);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDelta()).compareTo(other.isSetDelta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDelta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.delta, other.delta);
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
    StringBuilder sb = new StringBuilder("DataSyncProcessTask(");
    boolean first = true;

    sb.append("processTaskId:");
    if (this.processTaskId == null) {
      sb.append("null");
    } else {
      sb.append(this.processTaskId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("inputs:");
    if (this.inputs == null) {
      sb.append("null");
    } else {
      sb.append(this.inputs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("outputs:");
    if (this.outputs == null) {
      sb.append("null");
    } else {
      sb.append(this.outputs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dev:");
    sb.append(this.dev);
    first = false;
    if (!first) sb.append(", ");
    sb.append("delta:");
    sb.append(this.delta);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (processTaskId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'processTaskId' was not present! Struct: " + toString());
    }
    if (inputs == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'inputs' was not present! Struct: " + toString());
    }
    if (outputs == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'outputs' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'dev' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'delta' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DataSyncProcessTaskStandardSchemeFactory implements SchemeFactory {
    public DataSyncProcessTaskStandardScheme getScheme() {
      return new DataSyncProcessTaskStandardScheme();
    }
  }

  private static class DataSyncProcessTaskStandardScheme extends StandardScheme<DataSyncProcessTask> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DataSyncProcessTask struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROCESS_TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.processTaskId = iprot.readString();
              struct.setProcessTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INPUTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list10 = iprot.readListBegin();
                struct.inputs = new ArrayList<DataSource>(_list10.size);
                DataSource _elem11;
                for (int _i12 = 0; _i12 < _list10.size; ++_i12)
                {
                  _elem11 = new DataSource();
                  _elem11.read(iprot);
                  struct.inputs.add(_elem11);
                }
                iprot.readListEnd();
              }
              struct.setInputsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OUTPUTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list13 = iprot.readListBegin();
                struct.outputs = new ArrayList<DataExport>(_list13.size);
                DataExport _elem14;
                for (int _i15 = 0; _i15 < _list13.size; ++_i15)
                {
                  _elem14 = new DataExport();
                  _elem14.read(iprot);
                  struct.outputs.add(_elem14);
                }
                iprot.readListEnd();
              }
              struct.setOutputsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEV
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.dev = iprot.readBool();
              struct.setDevIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DELTA
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.delta = iprot.readBool();
              struct.setDeltaIsSet(true);
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
      if (!struct.isSetDev()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'dev' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetDelta()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'delta' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DataSyncProcessTask struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.processTaskId != null) {
        oprot.writeFieldBegin(PROCESS_TASK_ID_FIELD_DESC);
        oprot.writeString(struct.processTaskId);
        oprot.writeFieldEnd();
      }
      if (struct.inputs != null) {
        oprot.writeFieldBegin(INPUTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.inputs.size()));
          for (DataSource _iter16 : struct.inputs)
          {
            _iter16.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.outputs != null) {
        oprot.writeFieldBegin(OUTPUTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.outputs.size()));
          for (DataExport _iter17 : struct.outputs)
          {
            _iter17.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DEV_FIELD_DESC);
      oprot.writeBool(struct.dev);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DELTA_FIELD_DESC);
      oprot.writeBool(struct.delta);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DataSyncProcessTaskTupleSchemeFactory implements SchemeFactory {
    public DataSyncProcessTaskTupleScheme getScheme() {
      return new DataSyncProcessTaskTupleScheme();
    }
  }

  private static class DataSyncProcessTaskTupleScheme extends TupleScheme<DataSyncProcessTask> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DataSyncProcessTask struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.processTaskId);
      {
        oprot.writeI32(struct.inputs.size());
        for (DataSource _iter18 : struct.inputs)
        {
          _iter18.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.outputs.size());
        for (DataExport _iter19 : struct.outputs)
        {
          _iter19.write(oprot);
        }
      }
      oprot.writeBool(struct.dev);
      oprot.writeBool(struct.delta);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DataSyncProcessTask struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.processTaskId = iprot.readString();
      struct.setProcessTaskIdIsSet(true);
      {
        org.apache.thrift.protocol.TList _list20 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.inputs = new ArrayList<DataSource>(_list20.size);
        DataSource _elem21;
        for (int _i22 = 0; _i22 < _list20.size; ++_i22)
        {
          _elem21 = new DataSource();
          _elem21.read(iprot);
          struct.inputs.add(_elem21);
        }
      }
      struct.setInputsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.outputs = new ArrayList<DataExport>(_list23.size);
        DataExport _elem24;
        for (int _i25 = 0; _i25 < _list23.size; ++_i25)
        {
          _elem24 = new DataExport();
          _elem24.read(iprot);
          struct.outputs.add(_elem24);
        }
      }
      struct.setOutputsIsSet(true);
      struct.dev = iprot.readBool();
      struct.setDevIsSet(true);
      struct.delta = iprot.readBool();
      struct.setDeltaIsSet(true);
    }
  }

}

