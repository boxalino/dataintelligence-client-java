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
 * This structure defines the authentication object (to pass as authentication proof to all function and services)
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-31")
public class Authentication implements org.apache.thrift.TBase<Authentication, Authentication._Fields>, java.io.Serializable, Cloneable, Comparable<Authentication> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Authentication");

  private static final org.apache.thrift.protocol.TField AUTHENTICATION_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("authenticationToken", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AuthenticationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AuthenticationTupleSchemeFactory());
  }

  /**
   * the return authentication token is a string valid for one hour
   */
  public String authenticationToken; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the return authentication token is a string valid for one hour
     */
    AUTHENTICATION_TOKEN((short)1, "authenticationToken");

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
        case 1: // AUTHENTICATION_TOKEN
          return AUTHENTICATION_TOKEN;
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
    tmpMap.put(_Fields.AUTHENTICATION_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("authenticationToken", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Authentication.class, metaDataMap);
  }

  public Authentication() {
  }

  public Authentication(
    String authenticationToken)
  {
    this();
    this.authenticationToken = authenticationToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Authentication(Authentication other) {
    if (other.isSetAuthenticationToken()) {
      this.authenticationToken = other.authenticationToken;
    }
  }

  public Authentication deepCopy() {
    return new Authentication(this);
  }

  @Override
  public void clear() {
    this.authenticationToken = null;
  }

  /**
   * the return authentication token is a string valid for one hour
   */
  public String getAuthenticationToken() {
    return this.authenticationToken;
  }

  /**
   * the return authentication token is a string valid for one hour
   */
  public Authentication setAuthenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
    return this;
  }

  public void unsetAuthenticationToken() {
    this.authenticationToken = null;
  }

  /** Returns true if field authenticationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthenticationToken() {
    return this.authenticationToken != null;
  }

  public void setAuthenticationTokenIsSet(boolean value) {
    if (!value) {
      this.authenticationToken = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AUTHENTICATION_TOKEN:
      if (value == null) {
        unsetAuthenticationToken();
      } else {
        setAuthenticationToken((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AUTHENTICATION_TOKEN:
      return getAuthenticationToken();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AUTHENTICATION_TOKEN:
      return isSetAuthenticationToken();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Authentication)
      return this.equals((Authentication)that);
    return false;
  }

  public boolean equals(Authentication that) {
    if (that == null)
      return false;

    boolean this_present_authenticationToken = true && this.isSetAuthenticationToken();
    boolean that_present_authenticationToken = true && that.isSetAuthenticationToken();
    if (this_present_authenticationToken || that_present_authenticationToken) {
      if (!(this_present_authenticationToken && that_present_authenticationToken))
        return false;
      if (!this.authenticationToken.equals(that.authenticationToken))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_authenticationToken = true && (isSetAuthenticationToken());
    list.add(present_authenticationToken);
    if (present_authenticationToken)
      list.add(authenticationToken);

    return list.hashCode();
  }

  @Override
  public int compareTo(Authentication other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAuthenticationToken()).compareTo(other.isSetAuthenticationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthenticationToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authenticationToken, other.authenticationToken);
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
    StringBuilder sb = new StringBuilder("Authentication(");
    boolean first = true;

    sb.append("authenticationToken:");
    if (this.authenticationToken == null) {
      sb.append("null");
    } else {
      sb.append(this.authenticationToken);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (authenticationToken == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'authenticationToken' was not present! Struct: " + toString());
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

  private static class AuthenticationStandardSchemeFactory implements SchemeFactory {
    public AuthenticationStandardScheme getScheme() {
      return new AuthenticationStandardScheme();
    }
  }

  private static class AuthenticationStandardScheme extends StandardScheme<Authentication> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Authentication struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AUTHENTICATION_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.authenticationToken = iprot.readString();
              struct.setAuthenticationTokenIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Authentication struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.authenticationToken != null) {
        oprot.writeFieldBegin(AUTHENTICATION_TOKEN_FIELD_DESC);
        oprot.writeString(struct.authenticationToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthenticationTupleSchemeFactory implements SchemeFactory {
    public AuthenticationTupleScheme getScheme() {
      return new AuthenticationTupleScheme();
    }
  }

  private static class AuthenticationTupleScheme extends TupleScheme<Authentication> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Authentication struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.authenticationToken);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Authentication struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.authenticationToken = iprot.readString();
      struct.setAuthenticationTokenIsSet(true);
    }
  }

}

