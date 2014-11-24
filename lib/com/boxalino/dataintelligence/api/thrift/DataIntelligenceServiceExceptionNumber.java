/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.boxalino.dataintelligence.api.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * This enumeration defines the possible exception states returned by Boxalino Data Intelligence Thrift API
 */
public enum DataIntelligenceServiceExceptionNumber implements org.apache.thrift.TEnum {
  /**
   * general case of exception (no special detailed provided)
   */
  GENERAL_EXCEPTION(1),
  /**
   * the provided credentials to retrieve an authentication token are not valid (wrong username, password or both)
   */
  INVALID_CREDENTIALS(2),
  /**
   * your user has been blocked (but it doesn't necessarily mean your account has been blocked)
   */
  BLOCKED_USER(3),
  /**
   * your account has been blocked, you must contact Boxalino (<a href="mailto:support@boxalino.com">support@boxalino.com</a>) to know the reasons of this blocking.
   */
  BLOCKED_ACCOUNT(4),
  /**
   * the provided authentication token is invalid (wrong, or no more valid), you should get a new one by calling the GetAuthentication service.
   */
  INVALID_AUTHENTICATION_TOKEN(5),
  /**
   * specific to the service function UpdatePassword: means that the new password is not correct (should be at least 8 characters long and not contain any punctuation)
   */
  INVALID_NEW_PASSWORD(6),
  /**
   * the provided configuration object contains a configuration version number which doesn't exists or cannot be accessed
   */
  INVALID_CONFIGURATION_VERSION(7),
  /**
   * the provided XML data source is not correct (see documentation of the data source XML format)
   */
  INVALID_DATASOURCE(8),
  /**
   * the provided content to be changed (updated, deleted, etc.) is defined with a content id which doesn't exists
   */
  NON_EXISTING_CONTENT_ID(9),
  /**
   * the provided content id to be created already exists
   */
  ALREADY_EXISTING_CONTENT_ID(10),
  /**
   * the provided content id doesn't not match the requested format (less than 50 alphanumeric characters without any punctuation or accent)
   */
  INVALID_CONTENT_ID(11),
  /**
   * the provided content data are not correctly set
   */
  INVALID_CONTENT(12),
  /**
   * one of the provided languages has not been defined for this account
   */
  INVALID_LANGUAGE(13),
  DUPLICATED_FILE_ID(14),
  EMPTY_COLUMNS_LIST(15),
  NON_EXISTING_FILE(16),
  INVALID_RANGE(17);

  private final int value;

  private DataIntelligenceServiceExceptionNumber(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static DataIntelligenceServiceExceptionNumber findByValue(int value) { 
    switch (value) {
      case 1:
        return GENERAL_EXCEPTION;
      case 2:
        return INVALID_CREDENTIALS;
      case 3:
        return BLOCKED_USER;
      case 4:
        return BLOCKED_ACCOUNT;
      case 5:
        return INVALID_AUTHENTICATION_TOKEN;
      case 6:
        return INVALID_NEW_PASSWORD;
      case 7:
        return INVALID_CONFIGURATION_VERSION;
      case 8:
        return INVALID_DATASOURCE;
      case 9:
        return NON_EXISTING_CONTENT_ID;
      case 10:
        return ALREADY_EXISTING_CONTENT_ID;
      case 11:
        return INVALID_CONTENT_ID;
      case 12:
        return INVALID_CONTENT;
      case 13:
        return INVALID_LANGUAGE;
      case 14:
        return DUPLICATED_FILE_ID;
      case 15:
        return EMPTY_COLUMNS_LIST;
      case 16:
        return NON_EXISTING_FILE;
      case 17:
        return INVALID_RANGE;
      default:
        return null;
    }
  }
}
