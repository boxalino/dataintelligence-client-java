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
 * This enumeration defines possible report metric types
 */
public enum ReportMetricType implements org.apache.thrift.TEnum {
  /**
   * number of unique visitors (or user)
   */
  VISITORS(1),
  /**
   * number of visits (or session)
   */
  VISITS(2),
  /**
   * number of landing page bounces
   */
  BOUNCES(3),
  /**
   * BOUNCES / VISITS
   */
  BOUNCE_RATE(4),
  /**
   * number of page views
   */
  PAGE_VIEWS(5),
  /**
   * PAGE_VIEWS / VISITS
   */
  PAGE_VIEWS_PER_VISIT(6),
  /**
   * total time on site in secods
   */
  TIME_ON_SITE(31),
  /**
   * TIME_ON_SITE / VISITS
   */
  AVERAGE_TIME_ON_SITE(7),
  /**
   * number of product views
   */
  PRODUCT_VIEWS(8),
  /**
   * PRODUCT_VIEWS / VISITS
   */
  PRODUCT_VIEWS_PER_VISIT(9),
  /**
   * number of visits having at least one product view
   */
  VISITS_WITH_PRODUCT_VIEWS(10),
  /**
   * VISITS_WITH_PRODUCT_VIEWS / VISITS
   */
  VISITS_WITH_PRODUCT_VIEWS_RATE(11),
  /**
   * number of in-site searches
   */
  SEARCHES(12),
  /**
   * SEARCHES / VISITS
   */
  SEARCHES_PER_VISIT(13),
  /**
   * number of visits having at least one search
   */
  VISITS_WITH_SEARCHES(14),
  /**
   * VISITS_WITH_SEARCHES / VISITS
   */
  VISITS_WITH_SEARCHES_RATE(15),
  /**
   * number of goals (require identifier to be provided with the choice identifier)
   */
  GOALS(16),
  /**
   * GOALS / VISITS (require identifier to be provided with the choice identifier)
   */
  GOALS_PER_VISIT(17),
  /**
   * number of visits having at least one goal (require identifier to be provided with the choice identifier)
   */
  VISITS_WITH_GOALS(18),
  /**
   * VISITS_WITH_GOALS / VISITS (require identifier to be provided with the choice identifier)
   */
  VISITS_WITH_GOALS_RATE(19),
  /**
   * number of transactions
   */
  TRANSACTIONS(20),
  /**
   * TRANSACTIONS / VISITS
   */
  TRANSACTIONS_PER_VISIT(21),
  /**
   * number of visits having at least one transaction
   */
  VISITS_WITH_TRANSACTIONS(22),
  /**
   * VISITS_WITH_TRANSACTIONS / VISITS
   */
  VISITS_WITH_TRANSACTIONS_RATE(23),
  /**
   * transaction turnover
   * N.B.: will return zero for all cases which cannot be mapped to any transaction
   */
  TRANSACTIONS_TURNOVER(28),
  /**
   * sum of the transaction parameter values (require identifier to be provided with the transaction parameter name)
   * N.B.: will return zero for all cases which cannot be mapped to any transaction
   */
  TRANSACTIONS_PARAMETER_SUM(29),
  /**
   * count of the total number of transaction items (one product with quantity one is one item)
   */
  TRANSACTIONS_QUANTITY(30),
  /**
   * number of transactions customers (different customers having made transactions)
   */
  TRANSACTIONS_CUSTOMERS(32),
  /**
   * number of add-to-basket events
   */
  ADD_TO_BASKETS(24),
  /**
   * ADD_TO_BASKET / VISITS
   */
  ADD_TO_BASKETS_PER_VISIT(25),
  /**
   * number of visits having at least one add to basket event
   */
  VISITS_WITH_ADD_TO_BASKETS(26),
  /**
   * VISITS_WITH_ADD_TO_BASKETS / VISITS
   */
  VISITS_WITH_ADD_TO_BASKETS_RATE(27),
  /**
   * number of time the event has occurred
   */
  EVENT_COUNT(40),
  /**
   * number of e-mails sent
   */
  MAIL_SENT(50),
  /**
   * number of e-mails opened
   */
  MAIL_OPENED(51),
  /**
   * number of e-mails clicked
   */
  MAIL_CLICKED(52),
  /**
   * number of display of a choice
   */
  CHOICE_DISPLAYS(100),
  /**
   * CHOICE_DISPLAYS / VISITS
   */
  CHOICE_DISPLAYS_PER_VISIT(101),
  /**
   * number of visits having at least one choice display
   */
  VISITS_WITH_CHOICE_DISPLAYS(102),
  /**
   * VISITS_WITH_CHOICE_DISPLAYS / VISITS
   */
  VISITS_WITH_CHOICE_DISPLAYS_RATE(103),
  /**
   * number of product views event related to product displayed in a choice display
   * if a ReportDimension is on the product id, then only for this product id
   */
  PRODUCT_VIEWS_FROM_CHOICE_DISPLAY(110),
  /**
   * PRODUCT_VIEWS_FROM_CHOICE_DISPLAY / VISITS
   */
  PRODUCT_VIEWS_FROM_CHOICE_DISPLAY_PER_VISIT(111),
  /**
   * number of visits having at least one product views event related to product displayed in a choice display
   * if a ReportDimension is on the product id, then only for this product id
   * if a ReportDimension is on a Choice, then only for this choice
   * if a ReportDimension is on a ChoiceVariant, then only for this choice variant
   */
  VISITS_WITH_PRODUCT_VIEWS_FROM_CHOICE_DISPLAY(112),
  /**
   * VISITS_WITH_PRODUCT_VIEWS_FROM_CHOICE_DISPLAY / VISITS
   */
  VISITS_WITH_PRODUCT_VIEWS_FROM_CHOICE_DISPLAY_RATE(113),
  /**
   * number of transactions related to product displayed in a choice display
   * if a ReportDimension is on the product id, then only for this product id
   * if a ReportDimension is on a Choice, then only for this choice
   * if a ReportDimension is on a ChoiceVariant, then only for this choice variant
   */
  TRANSACTIONS_FROM_CHOICE_DISPLAY(120),
  /**
   * TRANSACTIONS_FROM_CHOICE_DISPLAY / VISITS
   */
  TRANSACTIONS_FROM_CHOICE_DISPLAY_PER_VISIT(121),
  /**
   * sum of transaction property value of transactions related to product displayed in a choice display
   * if a ReportDimension is on the product id, then only for this product id
   * if a ReportDimension is on a Choice, then only for this choice
   * if a ReportDimension is on a ChoiceVariant, then only for this choice variant
   */
  TRANSACTIONS_PARAMETER_SUM_FROM_CHOICE_DISPLAY(122),
  /**
   * TRANSACTIONS_PARAMETER_SUM_FROM_CHOICE_DISPLAY / VISITS
   */
  TRANSACTIONS_PARAMETER_SUM_FROM_CHOICE_DISPLAY_PER_VISIT(123),
  /**
   * number of visits having at least one transaction event related to product displayed in a choice display
   * if a ReportDimension is on the product id, then only for this product id
   * if a ReportDimension is on a Choice, then only for this choice
   * if a ReportDimension is on a ChoiceVariant, then only for this choice variant
   */
  VISITS_WITH_TRANSACTIONS_FROM_CHOICE_DISPLAY(130),
  /**
   * VISITS_WITH_TRANSACTIONS_FROM_CHOICE_DISPLAY / VISITS
   */
  VISITS_WITH_TRANSACTIONS_FROM_CHOICE_DISPLAY_RATE(131),
  /**
   * number of add to baskets related to product displayed in a choice display
   * if a ReportDimension is on the product id, then only for this product id
   * if a ReportDimension is on a Choice, then only for this choice
   * if a ReportDimension is on a ChoiceVariant, then only for this choice variant
   */
  ADD_TO_BASKETS_FROM_CHOICE_DISPLAY(132),
  /**
   * ADD_TO_BASKETS_FROM_CHOICE_DISPLAY / VISITS
   */
  ADD_TO_BASKETS_FROM_CHOICE_DISPLAY_PER_VISIT(133),
  /**
   * number of visits having at least one add to basket related to product displayed in a choice display
   * if a ReportDimension is on the product id, then only for this product id
   * if a ReportDimension is on a Choice, then only for this choice
   * if a ReportDimension is on a ChoiceVariant, then only for this choice variant
   */
  VISITS_WITH_ADD_TO_BASKETS_FROM_CHOICE_DISPLAY(134),
  /**
   * VISITS_WITH_ADD_TO_BASKETS_FROM_CHOICE_DISPLAY / VISITS
   */
  VISITS_WITH_ADD_TO_BASKETS_FROM_CHOICE_DISPLAY_RATE(135),
  /**
   * number of goals related to product displayed in a choice display
   * (require identifier to be provided with the choice identifier)
   * (will only work if a product identifier is provided with the goal)
   * if a ReportDimension is on the product id, then only for this product id
   * if a ReportDimension is on a Choice, then only for this choice
   * if a ReportDimension is on a ChoiceVariant, then only for this choice variant
   */
  GOALS_FROM_CHOICE_DISPLAY(140),
  /**
   * GOALS_FROM_CHOICE_DISPLAY / VISITS
   */
  GOALS_FROM_CHOICE_DISPLAY_PER_VISIT(141),
  /**
   * number of visits having at least goal related to product displayed in a choice display
   * (require identifier to be provided with the choice identifier)
   * (will only work if a product identifier is provided with the goal)
   * if a ReportDimension is on the product id, then only for this product id
   * if a ReportDimension is on a Choice, then only for this choice
   * if a ReportDimension is on a ChoiceVariant, then only for this choice variant
   */
  VISITS_WITH_GOALS_FROM_CHOICE_DISPLAY(142),
  /**
   * VISITS_WITH_GOALS_FROM_CHOICE_DISPLAY / VISITS
   */
  VISITS_WITH_GOALS_FROM_CHOICE_DISPLAY_RATE(143);

  private final int value;

  private ReportMetricType(int value) {
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
  public static ReportMetricType findByValue(int value) { 
    switch (value) {
      case 1:
        return VISITORS;
      case 2:
        return VISITS;
      case 3:
        return BOUNCES;
      case 4:
        return BOUNCE_RATE;
      case 5:
        return PAGE_VIEWS;
      case 6:
        return PAGE_VIEWS_PER_VISIT;
      case 31:
        return TIME_ON_SITE;
      case 7:
        return AVERAGE_TIME_ON_SITE;
      case 8:
        return PRODUCT_VIEWS;
      case 9:
        return PRODUCT_VIEWS_PER_VISIT;
      case 10:
        return VISITS_WITH_PRODUCT_VIEWS;
      case 11:
        return VISITS_WITH_PRODUCT_VIEWS_RATE;
      case 12:
        return SEARCHES;
      case 13:
        return SEARCHES_PER_VISIT;
      case 14:
        return VISITS_WITH_SEARCHES;
      case 15:
        return VISITS_WITH_SEARCHES_RATE;
      case 16:
        return GOALS;
      case 17:
        return GOALS_PER_VISIT;
      case 18:
        return VISITS_WITH_GOALS;
      case 19:
        return VISITS_WITH_GOALS_RATE;
      case 20:
        return TRANSACTIONS;
      case 21:
        return TRANSACTIONS_PER_VISIT;
      case 22:
        return VISITS_WITH_TRANSACTIONS;
      case 23:
        return VISITS_WITH_TRANSACTIONS_RATE;
      case 28:
        return TRANSACTIONS_TURNOVER;
      case 29:
        return TRANSACTIONS_PARAMETER_SUM;
      case 30:
        return TRANSACTIONS_QUANTITY;
      case 32:
        return TRANSACTIONS_CUSTOMERS;
      case 24:
        return ADD_TO_BASKETS;
      case 25:
        return ADD_TO_BASKETS_PER_VISIT;
      case 26:
        return VISITS_WITH_ADD_TO_BASKETS;
      case 27:
        return VISITS_WITH_ADD_TO_BASKETS_RATE;
      case 40:
        return EVENT_COUNT;
      case 50:
        return MAIL_SENT;
      case 51:
        return MAIL_OPENED;
      case 52:
        return MAIL_CLICKED;
      case 100:
        return CHOICE_DISPLAYS;
      case 101:
        return CHOICE_DISPLAYS_PER_VISIT;
      case 102:
        return VISITS_WITH_CHOICE_DISPLAYS;
      case 103:
        return VISITS_WITH_CHOICE_DISPLAYS_RATE;
      case 110:
        return PRODUCT_VIEWS_FROM_CHOICE_DISPLAY;
      case 111:
        return PRODUCT_VIEWS_FROM_CHOICE_DISPLAY_PER_VISIT;
      case 112:
        return VISITS_WITH_PRODUCT_VIEWS_FROM_CHOICE_DISPLAY;
      case 113:
        return VISITS_WITH_PRODUCT_VIEWS_FROM_CHOICE_DISPLAY_RATE;
      case 120:
        return TRANSACTIONS_FROM_CHOICE_DISPLAY;
      case 121:
        return TRANSACTIONS_FROM_CHOICE_DISPLAY_PER_VISIT;
      case 122:
        return TRANSACTIONS_PARAMETER_SUM_FROM_CHOICE_DISPLAY;
      case 123:
        return TRANSACTIONS_PARAMETER_SUM_FROM_CHOICE_DISPLAY_PER_VISIT;
      case 130:
        return VISITS_WITH_TRANSACTIONS_FROM_CHOICE_DISPLAY;
      case 131:
        return VISITS_WITH_TRANSACTIONS_FROM_CHOICE_DISPLAY_RATE;
      case 132:
        return ADD_TO_BASKETS_FROM_CHOICE_DISPLAY;
      case 133:
        return ADD_TO_BASKETS_FROM_CHOICE_DISPLAY_PER_VISIT;
      case 134:
        return VISITS_WITH_ADD_TO_BASKETS_FROM_CHOICE_DISPLAY;
      case 135:
        return VISITS_WITH_ADD_TO_BASKETS_FROM_CHOICE_DISPLAY_RATE;
      case 140:
        return GOALS_FROM_CHOICE_DISPLAY;
      case 141:
        return GOALS_FROM_CHOICE_DISPLAY_PER_VISIT;
      case 142:
        return VISITS_WITH_GOALS_FROM_CHOICE_DISPLAY;
      case 143:
        return VISITS_WITH_GOALS_FROM_CHOICE_DISPLAY_RATE;
      default:
        return null;
    }
  }
}
