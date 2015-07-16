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
 * This enumeration defines possible report dimension types
 */
public enum ReportDimensionType implements org.apache.thrift.TEnum {
  /**
   * is the visitor a new visitor or a returning visitor
   */
  NEW_VISITOR(1),
  /**
   * the detected country of the visitor (NULL if none detected)
   */
  GEO_COUNTRY(2),
  /**
   * the detected zip code of the visitor (NULL if none detected)
   */
  GEO_ZIP(3),
  /**
   * the detected subdivision (Kanton for Switzerland) of the visitor (NULL if none detected)
   */
  GEO_SUBDIVISION(4),
  /**
   * the detected city of the visitor (NULL if none detected)
   */
  GEO_CITY(4),
  /**
   * the user agent name (most common values: IE,Mobile Safari,Chrome,Firefox,Safari,Android browser,Chrome Mobile,Java,IE Mobile,Opera,Mobile Firefox)
   */
  BROWSER_NAME(5),
  /**
   * the user agent version
   */
  BROWSER_VERSION(5),
  /**
   * the user agent operating system (most common values: Windows 7,iOS 7,Windows 8.1,iOS 8,Android 4.4 KitKat,OS X 10.9 Mavericks,Windows 8,Windows XP,Windows Vista,Android 4.2 Jelly Bean)
   */
  OPERATING_SYSTEM(6),
  /**
   * the user agent device category (most common values: Personal computer,Smartphone,Tablet,Other)
   */
  DEVICE_CATEGORY(7),
  /**
   * the AdWords Creative (requires that the AdWords ValueTrack is passed on the url parameter as "&creative={creative}"
   */
  ADWORDS_CREATIVE(8),
  /**
   * the AdWords Keyword (requires that the AdWords ValueTrack is passed on the url parameter as "&keyword={keyword}"
   */
  ADWORDS_KEYWORD(9),
  /**
   * the search queries done in the web-site
   */
  ONSITE_SEARCH_QUERY(15),
  /**
   * the different hours of the day (from "0" to "24")
   */
  HOUR_OF_DAY(20),
  /**
   * the different moments of the day ("22-6", "6-10", "10-12", "12-14", "14-17", "17-19", "19-22")
   */
  MOMENT_OF_DAY(21),
  /**
   * the different days of the week ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
   */
  DAY_OF_WEEK(22),
  /**
   * the different moments of the week ("Monday-Friday", "Saturday-Sunday")
   */
  MOMENT_OF_WEEK(23),
  /**
   * the timestamp at the beginning of the session (one dimension per session)
   */
  SESSION_START_TIMESTAMP(24),
  /**
   * the session id (as provided by the tracker)
   */
  SESSION_ID(25),
  /**
   * the session id (internal id of Boxalino)
   */
  INTERNAL_SESSION_ID(26),
  /**
   * the visitor id (as provided by the tracker)
   */
  VISITOR_ID(27),
  /**
   * the visitor id (internal id of Boxalino)
   */
  INTERNAL_VISITOR_ID(28),
  /**
   * the different page view urls
   */
  PAGE_VIEW_URL(29),
  /**
   * the different values of a URL parameter (require identifier to be provided with url parameter name)
   */
  URL_PARAMETER(50),
  /**
   * the different values of a transaction property (requires identifier to be provided with the transaction property name)
   * N.B.: a connection to the transaction property must be available (e.g.: For visit&visitor-based reporting, like BehaviorReport, will only work for the visits/visitors with a transaction)
   */
  TRANSACTION_PROPERTY(100),
  /**
   * the different values of a customer property (requires identifier to be provided with the customer property name)
   * N.B.: a connection to the transaction property must be available (e.g.: For visit&visitor-based reporting, like BehaviorReport, will only work for the visits/visitors with a login or other ways to link the customer id to the visitor id)
   */
  CUSTOMER_PROPERTY(150),
  /**
   * the different values of a product property (requires identifier to be provided with the product property name)
   * N.B.: a connection to the transaction property must be available (e.g.: For visit&visitor-based reporting, like BehaviorReport, will only work for the visits/visitors with a product purchased)
   */
  PURCHASED_PRODUCT_PROPERTY(200),
  /**
   * the different values of a product property (requires identifier to be provided with the product property name)
   * N.B.: a connection to the product property must be available (e.g.: For visit&visitor-based reporting, like BehaviorReport, will only work for the visits/visitors with a product displayed in the choice variant)
   */
  PRODUCT_PROPERTY(201),
  /**
   * the different possible choice ids (requires identifier to be provided with the choiceId as indicated in the structure Choice)
   * N.B.: a connection to the product property must be available (e.g.: For visit&visitor-based reporting, like BehaviorReport, will only work for the visits/visitors with a product displayed in the choice variant)
   */
  CHOICE(300),
  /**
   * the different possible choice variant ids (requires identifier to be provided with the choiceVariantIdId as indicated in the structure ChoiceVariant)
   * N.B.: a connection to the product property must be available (e.g.: For visit&visitor-based reporting, like BehaviorReport, will only work for the visits/visitors with a product displayed in the choice variant)
   */
  CHOICE_VARIANT(301),
  /**
   *  * The index of the returned time serie (starting at zero) related to this result (requires identifier to be provided with the cohort id field requested)
   * * N.B.: the ReportDimensionValue value will indicate the index as a number 0->n-1, n-1 being the last time range of the cohort report
   */
  COHORT_INDEX(1000);

  private final int value;

  private ReportDimensionType(int value) {
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
  public static ReportDimensionType findByValue(int value) { 
    switch (value) {
      case 1:
        return NEW_VISITOR;
      case 2:
        return GEO_COUNTRY;
      case 3:
        return GEO_ZIP;
      case 4:
        return GEO_SUBDIVISION;
      case 4:
        return GEO_CITY;
      case 5:
        return BROWSER_NAME;
      case 5:
        return BROWSER_VERSION;
      case 6:
        return OPERATING_SYSTEM;
      case 7:
        return DEVICE_CATEGORY;
      case 8:
        return ADWORDS_CREATIVE;
      case 9:
        return ADWORDS_KEYWORD;
      case 15:
        return ONSITE_SEARCH_QUERY;
      case 20:
        return HOUR_OF_DAY;
      case 21:
        return MOMENT_OF_DAY;
      case 22:
        return DAY_OF_WEEK;
      case 23:
        return MOMENT_OF_WEEK;
      case 24:
        return SESSION_START_TIMESTAMP;
      case 25:
        return SESSION_ID;
      case 26:
        return INTERNAL_SESSION_ID;
      case 27:
        return VISITOR_ID;
      case 28:
        return INTERNAL_VISITOR_ID;
      case 29:
        return PAGE_VIEW_URL;
      case 50:
        return URL_PARAMETER;
      case 100:
        return TRANSACTION_PROPERTY;
      case 150:
        return CUSTOMER_PROPERTY;
      case 200:
        return PURCHASED_PRODUCT_PROPERTY;
      case 201:
        return PRODUCT_PROPERTY;
      case 300:
        return CHOICE;
      case 301:
        return CHOICE_VARIANT;
      case 1000:
        return COHORT_INDEX;
      default:
        return null;
    }
  }
}
