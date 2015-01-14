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
 * the possible condition operators to be used in a condition target
 */
public enum ConditionOperator implements org.apache.thrift.TEnum {
  /**
   * when cast as a String, does the substring provided in the ConditionTarget value match exactly the source string?
   */
  IS(1),
  /**
   * when cast as a String, does the substring provided in the ConditionTarget value NOT match exactly the source string?
   */
  IS_NOT(2),
  /**
   * when cast as a number, is the number provided in the source number greater (but not equal or smaller) than the ConditionTarget value?
   */
  IS_GREATER(3),
  /**
   * when cast as a number, is the number provided in the source number greater or equal (but not smaller) than the ConditionTarget value?
   */
  IS_GREATER_OR_EQUAL(4),
  /**
   * when cast as a number, is the number provided in the source number smaller (but not equal or greater) than the ConditionTarget value?
   */
  IS_SMALLER(5),
  /**
   * when cast as a number, is the number provided in the source number smaller or equal (but not greater) than the ConditionTarget value?
   */
  IS_SMALLER_OR_EQUAL(6),
  /**
   * when cast as a String, is the substring provided in the ConditionTarget value contained in the source string?
   */
  CONTAINS(7),
  /**
   * when cast as a String, is the substring provided in the ConditionTarget value NOT contained in the source string?
   */
  DOES_NOT_CONTAIN(8),
  /**
   * when cast as a String, does the substring provided in the ConditionTarget value match the first characters of the source string?
   */
  STARTS_WITH(9),
  /**
   * when cast as a String, does the substring provided in the ConditionTarget value NOT match the first characters of the source string?
   */
  DOES_NOT_START_WITH(10),
  /**
   * when cast as a String, does the substring provided in the ConditionTarget value match the last characters of the source string?
   */
  ENDS_WITH(11),
  /**
   * when cast as a String, does the substring provided in the ConditionTarget value NOT match the last characters of the source string?
   */
  DOES_NOT_END_WITH(12);

  private final int value;

  private ConditionOperator(int value) {
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
  public static ConditionOperator findByValue(int value) { 
    switch (value) {
      case 1:
        return IS;
      case 2:
        return IS_NOT;
      case 3:
        return IS_GREATER;
      case 4:
        return IS_GREATER_OR_EQUAL;
      case 5:
        return IS_SMALLER;
      case 6:
        return IS_SMALLER_OR_EQUAL;
      case 7:
        return CONTAINS;
      case 8:
        return DOES_NOT_CONTAIN;
      case 9:
        return STARTS_WITH;
      case 10:
        return DOES_NOT_START_WITH;
      case 11:
        return ENDS_WITH;
      case 12:
        return DOES_NOT_END_WITH;
      default:
        return null;
    }
  }
}