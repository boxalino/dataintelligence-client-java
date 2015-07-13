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
 * This structure defines a configuration version of your account. It must be provided to all functions accessing / updating or removing information from your account configuration
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-13")
public class ConfigurationVersion implements org.apache.thrift.TBase<ConfigurationVersion, ConfigurationVersion._Fields>, java.io.Serializable, Cloneable, Comparable<ConfigurationVersion> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ConfigurationVersion");

  private static final org.apache.thrift.protocol.TField CONFIGURATION_VERSION_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("configurationVersionNumber", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField SYSTEM_PARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("systemParameters", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ConfigurationVersionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ConfigurationVersionTupleSchemeFactory());
  }

  /**
   * an internal number identifying the configuration version
   */
  public short configurationVersionNumber; // required
  /**
   * an internal number identifying the configuration version
   */
  public Map<String,String> systemParameters; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * an internal number identifying the configuration version
     */
    CONFIGURATION_VERSION_NUMBER((short)1, "configurationVersionNumber"),
    /**
     * an internal number identifying the configuration version
     */
    SYSTEM_PARAMETERS((short)2, "systemParameters");

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
        case 1: // CONFIGURATION_VERSION_NUMBER
          return CONFIGURATION_VERSION_NUMBER;
        case 2: // SYSTEM_PARAMETERS
          return SYSTEM_PARAMETERS;
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
  private static final int __CONFIGURATIONVERSIONNUMBER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SYSTEM_PARAMETERS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONFIGURATION_VERSION_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("configurationVersionNumber", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.SYSTEM_PARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("systemParameters", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ConfigurationVersion.class, metaDataMap);
  }

  public ConfigurationVersion() {
  }

  public ConfigurationVersion(
    short configurationVersionNumber)
  {
    this();
    this.configurationVersionNumber = configurationVersionNumber;
    setConfigurationVersionNumberIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConfigurationVersion(ConfigurationVersion other) {
    __isset_bitfield = other.__isset_bitfield;
    this.configurationVersionNumber = other.configurationVersionNumber;
    if (other.isSetSystemParameters()) {
      Map<String,String> __this__systemParameters = new HashMap<String,String>(other.systemParameters);
      this.systemParameters = __this__systemParameters;
    }
  }

  public ConfigurationVersion deepCopy() {
    return new ConfigurationVersion(this);
  }

  @Override
  public void clear() {
    setConfigurationVersionNumberIsSet(false);
    this.configurationVersionNumber = 0;
    this.systemParameters = null;
  }

  /**
   * an internal number identifying the configuration version
   */
  public short getConfigurationVersionNumber() {
    return this.configurationVersionNumber;
  }

  /**
   * an internal number identifying the configuration version
   */
  public ConfigurationVersion setConfigurationVersionNumber(short configurationVersionNumber) {
    this.configurationVersionNumber = configurationVersionNumber;
    setConfigurationVersionNumberIsSet(true);
    return this;
  }

  public void unsetConfigurationVersionNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONFIGURATIONVERSIONNUMBER_ISSET_ID);
  }

  /** Returns true if field configurationVersionNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetConfigurationVersionNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __CONFIGURATIONVERSIONNUMBER_ISSET_ID);
  }

  public void setConfigurationVersionNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONFIGURATIONVERSIONNUMBER_ISSET_ID, value);
  }

  public int getSystemParametersSize() {
    return (this.systemParameters == null) ? 0 : this.systemParameters.size();
  }

  public void putToSystemParameters(String key, String val) {
    if (this.systemParameters == null) {
      this.systemParameters = new HashMap<String,String>();
    }
    this.systemParameters.put(key, val);
  }

  /**
   * an internal number identifying the configuration version
   */
  public Map<String,String> getSystemParameters() {
    return this.systemParameters;
  }

  /**
   * an internal number identifying the configuration version
   */
  public ConfigurationVersion setSystemParameters(Map<String,String> systemParameters) {
    this.systemParameters = systemParameters;
    return this;
  }

  public void unsetSystemParameters() {
    this.systemParameters = null;
  }

  /** Returns true if field systemParameters is set (has been assigned a value) and false otherwise */
  public boolean isSetSystemParameters() {
    return this.systemParameters != null;
  }

  public void setSystemParametersIsSet(boolean value) {
    if (!value) {
      this.systemParameters = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONFIGURATION_VERSION_NUMBER:
      if (value == null) {
        unsetConfigurationVersionNumber();
      } else {
        setConfigurationVersionNumber((Short)value);
      }
      break;

    case SYSTEM_PARAMETERS:
      if (value == null) {
        unsetSystemParameters();
      } else {
        setSystemParameters((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONFIGURATION_VERSION_NUMBER:
      return Short.valueOf(getConfigurationVersionNumber());

    case SYSTEM_PARAMETERS:
      return getSystemParameters();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONFIGURATION_VERSION_NUMBER:
      return isSetConfigurationVersionNumber();
    case SYSTEM_PARAMETERS:
      return isSetSystemParameters();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ConfigurationVersion)
      return this.equals((ConfigurationVersion)that);
    return false;
  }

  public boolean equals(ConfigurationVersion that) {
    if (that == null)
      return false;

    boolean this_present_configurationVersionNumber = true;
    boolean that_present_configurationVersionNumber = true;
    if (this_present_configurationVersionNumber || that_present_configurationVersionNumber) {
      if (!(this_present_configurationVersionNumber && that_present_configurationVersionNumber))
        return false;
      if (this.configurationVersionNumber != that.configurationVersionNumber)
        return false;
    }

    boolean this_present_systemParameters = true && this.isSetSystemParameters();
    boolean that_present_systemParameters = true && that.isSetSystemParameters();
    if (this_present_systemParameters || that_present_systemParameters) {
      if (!(this_present_systemParameters && that_present_systemParameters))
        return false;
      if (!this.systemParameters.equals(that.systemParameters))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_configurationVersionNumber = true;
    list.add(present_configurationVersionNumber);
    if (present_configurationVersionNumber)
      list.add(configurationVersionNumber);

    boolean present_systemParameters = true && (isSetSystemParameters());
    list.add(present_systemParameters);
    if (present_systemParameters)
      list.add(systemParameters);

    return list.hashCode();
  }

  @Override
  public int compareTo(ConfigurationVersion other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetConfigurationVersionNumber()).compareTo(other.isSetConfigurationVersionNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfigurationVersionNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.configurationVersionNumber, other.configurationVersionNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSystemParameters()).compareTo(other.isSetSystemParameters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystemParameters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.systemParameters, other.systemParameters);
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
    StringBuilder sb = new StringBuilder("ConfigurationVersion(");
    boolean first = true;

    sb.append("configurationVersionNumber:");
    sb.append(this.configurationVersionNumber);
    first = false;
    if (isSetSystemParameters()) {
      if (!first) sb.append(", ");
      sb.append("systemParameters:");
      if (this.systemParameters == null) {
        sb.append("null");
      } else {
        sb.append(this.systemParameters);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'configurationVersionNumber' because it's a primitive and you chose the non-beans generator.
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

  private static class ConfigurationVersionStandardSchemeFactory implements SchemeFactory {
    public ConfigurationVersionStandardScheme getScheme() {
      return new ConfigurationVersionStandardScheme();
    }
  }

  private static class ConfigurationVersionStandardScheme extends StandardScheme<ConfigurationVersion> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ConfigurationVersion struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONFIGURATION_VERSION_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.configurationVersionNumber = iprot.readI16();
              struct.setConfigurationVersionNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SYSTEM_PARAMETERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.systemParameters = new HashMap<String,String>(2*_map0.size);
                String _key1;
                String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.systemParameters.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setSystemParametersIsSet(true);
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
      if (!struct.isSetConfigurationVersionNumber()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'configurationVersionNumber' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ConfigurationVersion struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CONFIGURATION_VERSION_NUMBER_FIELD_DESC);
      oprot.writeI16(struct.configurationVersionNumber);
      oprot.writeFieldEnd();
      if (struct.systemParameters != null) {
        if (struct.isSetSystemParameters()) {
          oprot.writeFieldBegin(SYSTEM_PARAMETERS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.systemParameters.size()));
            for (Map.Entry<String, String> _iter4 : struct.systemParameters.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ConfigurationVersionTupleSchemeFactory implements SchemeFactory {
    public ConfigurationVersionTupleScheme getScheme() {
      return new ConfigurationVersionTupleScheme();
    }
  }

  private static class ConfigurationVersionTupleScheme extends TupleScheme<ConfigurationVersion> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ConfigurationVersion struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI16(struct.configurationVersionNumber);
      BitSet optionals = new BitSet();
      if (struct.isSetSystemParameters()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSystemParameters()) {
        {
          oprot.writeI32(struct.systemParameters.size());
          for (Map.Entry<String, String> _iter5 : struct.systemParameters.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ConfigurationVersion struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.configurationVersionNumber = iprot.readI16();
      struct.setConfigurationVersionNumberIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.systemParameters = new HashMap<String,String>(2*_map6.size);
          String _key7;
          String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.systemParameters.put(_key7, _val8);
          }
        }
        struct.setSystemParametersIsSet(true);
      }
    }
  }

}

