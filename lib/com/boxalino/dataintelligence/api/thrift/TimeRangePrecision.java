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
 * This enumeration defines possible granularities used in time ranges
 */
public enum TimeRangePrecision implements org.apache.thrift.TEnum {
  /**
   * daily precision
   */
  DAY(1),
  /**
   * weekly precision
   */
  WEEK(2),
  /**
   * monthly precision
   */
  MONTH(3);

  private final int value;

  private TimeRangePrecision(int value) {
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
  public static TimeRangePrecision findByValue(int value) { 
    switch (value) {
      case 1:
        return DAY;
      case 2:
        return WEEK;
      case 3:
        return MONTH;
      default:
        return null;
    }
  }
}