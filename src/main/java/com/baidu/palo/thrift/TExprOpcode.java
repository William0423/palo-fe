/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.baidu.palo.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TExprOpcode implements org.apache.thrift.TEnum {
  INVALID_OPCODE(0),
  COMPOUND_NOT(1),
  COMPOUND_AND(2),
  COMPOUND_OR(3),
  CAST(4),
  FILTER_IN(5),
  FILTER_NOT_IN(6),
  FILTER_NEW_IN(7),
  FILTER_NEW_NOT_IN(8),
  EQ(9),
  NE(10),
  LT(11),
  LE(12),
  GT(13),
  GE(14),
  CONDITION_IF(15),
  CONDITION_NULLIF(16),
  CONDITION_IFNULL(17),
  CONDITION_COALESCE(18),
  TIMESTAMP_DATE_FORMAT(19),
  TIMESTAMP_DAYOFMONTH(20),
  TIMESTAMP_DAYOFYEAR(21),
  TIMESTAMP_DAYS_ADD(22),
  TIMESTAMP_DAYS_SUB(23),
  TIMESTAMP_DAY_NAME(24),
  TIMESTAMP_DIFF(25),
  TIMESTAMP_FROM_DAYS(26),
  TIMESTAMP_HOUR(27),
  TIMESTAMP_HOURS_ADD(28),
  TIMESTAMP_HOURS_SUB(29),
  TIMESTAMP_MICROSECONDS_ADD(30),
  TIMESTAMP_MICROSECONDS_SUB(31),
  TIMESTAMP_MINUTE(32),
  TIMESTAMP_MINUTES_ADD(33),
  TIMESTAMP_MINUTES_SUB(34),
  TIMESTAMP_MONTH(35),
  TIMESTAMP_MONTHS_ADD(36),
  TIMESTAMP_MONTHS_SUB(37),
  TIMESTAMP_MONT_NAME(38),
  TIMESTAMP_NOW(39),
  TIMESTAMP_SECOND(40),
  TIMESTAMP_SECONDS_ADD(41),
  TIMESTAMP_SECONDS_SUB(42),
  TIMESTAMP_STR_TO_DATE(43),
  TIMESTAMP_TO_DATE(44),
  TIMESTAMP_TO_DAYS(45),
  TIMESTAMP_WEEKOFYEAR(46),
  TIMESTAMP_WEEKS_ADD(47),
  TIMESTAMP_WEEKS_SUB(48),
  TIMESTAMP_YEAR(49),
  TIMESTAMP_YEARS_ADD(50),
  TIMESTAMP_YEARS_SUB(51),
  ADD(52),
  SUBTRACT(53),
  MULTIPLY(54),
  DIVIDE(55),
  INT_DIVIDE(56),
  MOD(57),
  BITAND(58),
  BITOR(59),
  BITXOR(60),
  BITNOT(61),
  FACTORIAL(62),
  LAST_OPCODE(63);

  private final int value;

  private TExprOpcode(int value) {
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
  public static TExprOpcode findByValue(int value) { 
    switch (value) {
      case 0:
        return INVALID_OPCODE;
      case 1:
        return COMPOUND_NOT;
      case 2:
        return COMPOUND_AND;
      case 3:
        return COMPOUND_OR;
      case 4:
        return CAST;
      case 5:
        return FILTER_IN;
      case 6:
        return FILTER_NOT_IN;
      case 7:
        return FILTER_NEW_IN;
      case 8:
        return FILTER_NEW_NOT_IN;
      case 9:
        return EQ;
      case 10:
        return NE;
      case 11:
        return LT;
      case 12:
        return LE;
      case 13:
        return GT;
      case 14:
        return GE;
      case 15:
        return CONDITION_IF;
      case 16:
        return CONDITION_NULLIF;
      case 17:
        return CONDITION_IFNULL;
      case 18:
        return CONDITION_COALESCE;
      case 19:
        return TIMESTAMP_DATE_FORMAT;
      case 20:
        return TIMESTAMP_DAYOFMONTH;
      case 21:
        return TIMESTAMP_DAYOFYEAR;
      case 22:
        return TIMESTAMP_DAYS_ADD;
      case 23:
        return TIMESTAMP_DAYS_SUB;
      case 24:
        return TIMESTAMP_DAY_NAME;
      case 25:
        return TIMESTAMP_DIFF;
      case 26:
        return TIMESTAMP_FROM_DAYS;
      case 27:
        return TIMESTAMP_HOUR;
      case 28:
        return TIMESTAMP_HOURS_ADD;
      case 29:
        return TIMESTAMP_HOURS_SUB;
      case 30:
        return TIMESTAMP_MICROSECONDS_ADD;
      case 31:
        return TIMESTAMP_MICROSECONDS_SUB;
      case 32:
        return TIMESTAMP_MINUTE;
      case 33:
        return TIMESTAMP_MINUTES_ADD;
      case 34:
        return TIMESTAMP_MINUTES_SUB;
      case 35:
        return TIMESTAMP_MONTH;
      case 36:
        return TIMESTAMP_MONTHS_ADD;
      case 37:
        return TIMESTAMP_MONTHS_SUB;
      case 38:
        return TIMESTAMP_MONT_NAME;
      case 39:
        return TIMESTAMP_NOW;
      case 40:
        return TIMESTAMP_SECOND;
      case 41:
        return TIMESTAMP_SECONDS_ADD;
      case 42:
        return TIMESTAMP_SECONDS_SUB;
      case 43:
        return TIMESTAMP_STR_TO_DATE;
      case 44:
        return TIMESTAMP_TO_DATE;
      case 45:
        return TIMESTAMP_TO_DAYS;
      case 46:
        return TIMESTAMP_WEEKOFYEAR;
      case 47:
        return TIMESTAMP_WEEKS_ADD;
      case 48:
        return TIMESTAMP_WEEKS_SUB;
      case 49:
        return TIMESTAMP_YEAR;
      case 50:
        return TIMESTAMP_YEARS_ADD;
      case 51:
        return TIMESTAMP_YEARS_SUB;
      case 52:
        return ADD;
      case 53:
        return SUBTRACT;
      case 54:
        return MULTIPLY;
      case 55:
        return DIVIDE;
      case 56:
        return INT_DIVIDE;
      case 57:
        return MOD;
      case 58:
        return BITAND;
      case 59:
        return BITOR;
      case 60:
        return BITXOR;
      case 61:
        return BITNOT;
      case 62:
        return FACTORIAL;
      case 63:
        return LAST_OPCODE;
      default:
        return null;
    }
  }
}
