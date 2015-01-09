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
 * This structure defines the parameters to be send to receive an authentication token (required by all the other services)
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-1-9")
public class AuthenticationRequest implements org.apache.thrift.TBase<AuthenticationRequest, AuthenticationRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AuthenticationRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthenticationRequest");

  private static final org.apache.thrift.protocol.TField ACCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("account", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AuthenticationRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AuthenticationRequestTupleSchemeFactory());
  }

  /**
   * the name of your account (as provided to you by Boxalino team, if you don't have an account, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
   */
  public String account; // required
  /**
   * usually the same value as account (but can be different for users with smaller rights, if you don't have a username, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
   */
  public String username; // required
  /**
   * as provided by Boxalino, or according to the last password update you have set. If you lost your password, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
   */
  public String password; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the name of your account (as provided to you by Boxalino team, if you don't have an account, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
     */
    ACCOUNT((short)1, "account"),
    /**
     * usually the same value as account (but can be different for users with smaller rights, if you don't have a username, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
     */
    USERNAME((short)2, "username"),
    /**
     * as provided by Boxalino, or according to the last password update you have set. If you lost your password, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
     */
    PASSWORD((short)3, "password");

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
        case 1: // ACCOUNT
          return ACCOUNT;
        case 2: // USERNAME
          return USERNAME;
        case 3: // PASSWORD
          return PASSWORD;
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
    tmpMap.put(_Fields.ACCOUNT, new org.apache.thrift.meta_data.FieldMetaData("account", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthenticationRequest.class, metaDataMap);
  }

  public AuthenticationRequest() {
  }

  public AuthenticationRequest(
    String account,
    String username,
    String password)
  {
    this();
    this.account = account;
    this.username = username;
    this.password = password;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthenticationRequest(AuthenticationRequest other) {
    if (other.isSetAccount()) {
      this.account = other.account;
    }
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
  }

  public AuthenticationRequest deepCopy() {
    return new AuthenticationRequest(this);
  }

  @Override
  public void clear() {
    this.account = null;
    this.username = null;
    this.password = null;
  }

  /**
   * the name of your account (as provided to you by Boxalino team, if you don't have an account, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
   */
  public String getAccount() {
    return this.account;
  }

  /**
   * the name of your account (as provided to you by Boxalino team, if you don't have an account, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
   */
  public AuthenticationRequest setAccount(String account) {
    this.account = account;
    return this;
  }

  public void unsetAccount() {
    this.account = null;
  }

  /** Returns true if field account is set (has been assigned a value) and false otherwise */
  public boolean isSetAccount() {
    return this.account != null;
  }

  public void setAccountIsSet(boolean value) {
    if (!value) {
      this.account = null;
    }
  }

  /**
   * usually the same value as account (but can be different for users with smaller rights, if you don't have a username, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
   */
  public String getUsername() {
    return this.username;
  }

  /**
   * usually the same value as account (but can be different for users with smaller rights, if you don't have a username, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
   */
  public AuthenticationRequest setUsername(String username) {
    this.username = username;
    return this;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  /**
   * as provided by Boxalino, or according to the last password update you have set. If you lost your password, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * as provided by Boxalino, or according to the last password update you have set. If you lost your password, contact <a href="mailto:support@boxalino.com">support@boxalino.com</a>)
   */
  public AuthenticationRequest setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACCOUNT:
      if (value == null) {
        unsetAccount();
      } else {
        setAccount((String)value);
      }
      break;

    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACCOUNT:
      return getAccount();

    case USERNAME:
      return getUsername();

    case PASSWORD:
      return getPassword();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACCOUNT:
      return isSetAccount();
    case USERNAME:
      return isSetUsername();
    case PASSWORD:
      return isSetPassword();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthenticationRequest)
      return this.equals((AuthenticationRequest)that);
    return false;
  }

  public boolean equals(AuthenticationRequest that) {
    if (that == null)
      return false;

    boolean this_present_account = true && this.isSetAccount();
    boolean that_present_account = true && that.isSetAccount();
    if (this_present_account || that_present_account) {
      if (!(this_present_account && that_present_account))
        return false;
      if (!this.account.equals(that.account))
        return false;
    }

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_account = true && (isSetAccount());
    list.add(present_account);
    if (present_account)
      list.add(account);

    boolean present_username = true && (isSetUsername());
    list.add(present_username);
    if (present_username)
      list.add(username);

    boolean present_password = true && (isSetPassword());
    list.add(present_password);
    if (present_password)
      list.add(password);

    return list.hashCode();
  }

  @Override
  public int compareTo(AuthenticationRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAccount()).compareTo(other.isSetAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.account, other.account);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
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
    StringBuilder sb = new StringBuilder("AuthenticationRequest(");
    boolean first = true;

    sb.append("account:");
    if (this.account == null) {
      sb.append("null");
    } else {
      sb.append(this.account);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("username:");
    if (this.username == null) {
      sb.append("null");
    } else {
      sb.append(this.username);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (account == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'account' was not present! Struct: " + toString());
    }
    if (username == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'username' was not present! Struct: " + toString());
    }
    if (password == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'password' was not present! Struct: " + toString());
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

  private static class AuthenticationRequestStandardSchemeFactory implements SchemeFactory {
    public AuthenticationRequestStandardScheme getScheme() {
      return new AuthenticationRequestStandardScheme();
    }
  }

  private static class AuthenticationRequestStandardScheme extends StandardScheme<AuthenticationRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthenticationRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACCOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.account = iprot.readString();
              struct.setAccountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthenticationRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.account != null) {
        oprot.writeFieldBegin(ACCOUNT_FIELD_DESC);
        oprot.writeString(struct.account);
        oprot.writeFieldEnd();
      }
      if (struct.username != null) {
        oprot.writeFieldBegin(USERNAME_FIELD_DESC);
        oprot.writeString(struct.username);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(struct.password);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthenticationRequestTupleSchemeFactory implements SchemeFactory {
    public AuthenticationRequestTupleScheme getScheme() {
      return new AuthenticationRequestTupleScheme();
    }
  }

  private static class AuthenticationRequestTupleScheme extends TupleScheme<AuthenticationRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuthenticationRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.account);
      oprot.writeString(struct.username);
      oprot.writeString(struct.password);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuthenticationRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.account = iprot.readString();
      struct.setAccountIsSet(true);
      struct.username = iprot.readString();
      struct.setUsernameIsSet(true);
      struct.password = iprot.readString();
      struct.setPasswordIsSet(true);
    }
  }

}

