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
 * This enumeration defines the version type. All contents are versioned, normally, you want to change the current development version and then, when finished, publish it (so it becomes the new production version and a new development version is created), but it is also possible to access the production version directly
 * 
 * <dl>
 * <dt>CURRENT_DEVELOPMENT_VERSION</dt>
 * <dd>this is the normal case, as you want to retrieve the current dev version of your account configuration and not touch the production one</dd>
 * 
 * <dt>CURRENT_PRODUCTION_VERSION</dt>
 * <dd>this should only be used in rare cases where you want to recuperate information from the production configuration, but be careful in changing this version as it will immediately affect your production processes!</dd>
 * </dl>
 */
public enum ConfigurationVersionType implements org.apache.thrift.TEnum {
  CURRENT_DEVELOPMENT_VERSION(1),
  CURRENT_PRODUCTION_VERSION(2);

  private final int value;

  private ConfigurationVersionType(int value) {
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
  public static ConfigurationVersionType findByValue(int value) { 
    switch (value) {
      case 1:
        return CURRENT_DEVELOPMENT_VERSION;
      case 2:
        return CURRENT_PRODUCTION_VERSION;
      default:
        return null;
    }
  }
}