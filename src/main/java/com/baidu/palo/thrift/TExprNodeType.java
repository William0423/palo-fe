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

public enum TExprNodeType implements org.apache.thrift.TEnum {
  AGG_EXPR(0),
  ARITHMETIC_EXPR(1),
  BINARY_PRED(2),
  BOOL_LITERAL(3),
  CASE_EXPR(4),
  CAST_EXPR(5),
  COMPOUND_PRED(6),
  DATE_LITERAL(7),
  FLOAT_LITERAL(8),
  INT_LITERAL(9),
  DECIMAL_LITERAL(10),
  IN_PRED(11),
  IS_NULL_PRED(12),
  LIKE_PRED(13),
  LITERAL_PRED(14),
  NULL_LITERAL(15),
  SLOT_REF(16),
  STRING_LITERAL(17),
  TUPLE_IS_NULL_PRED(18),
  INFO_FUNC(19),
  FUNCTION_CALL(20),
  COMPUTE_FUNCTION_CALL(21),
  LARGE_INT_LITERAL(22);

  private final int value;

  private TExprNodeType(int value) {
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
  public static TExprNodeType findByValue(int value) { 
    switch (value) {
      case 0:
        return AGG_EXPR;
      case 1:
        return ARITHMETIC_EXPR;
      case 2:
        return BINARY_PRED;
      case 3:
        return BOOL_LITERAL;
      case 4:
        return CASE_EXPR;
      case 5:
        return CAST_EXPR;
      case 6:
        return COMPOUND_PRED;
      case 7:
        return DATE_LITERAL;
      case 8:
        return FLOAT_LITERAL;
      case 9:
        return INT_LITERAL;
      case 10:
        return DECIMAL_LITERAL;
      case 11:
        return IN_PRED;
      case 12:
        return IS_NULL_PRED;
      case 13:
        return LIKE_PRED;
      case 14:
        return LITERAL_PRED;
      case 15:
        return NULL_LITERAL;
      case 16:
        return SLOT_REF;
      case 17:
        return STRING_LITERAL;
      case 18:
        return TUPLE_IS_NULL_PRED;
      case 19:
        return INFO_FUNC;
      case 20:
        return FUNCTION_CALL;
      case 21:
        return COMPUTE_FUNCTION_CALL;
      case 22:
        return LARGE_INT_LITERAL;
      default:
        return null;
    }
  }
}
