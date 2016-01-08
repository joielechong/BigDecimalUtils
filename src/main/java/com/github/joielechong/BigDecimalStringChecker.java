package com.github.joielechong;

/**
 * Numeric String checker for BigDecimal string.
 * Created by Joielechong on 1/2/16.
 */
public final class BigDecimalStringChecker {
  /**
   * Check string for numeric value
   * @param value String of numeric
   *
   * TODO: Check if value is not a Locale.US String
   * TODO: Check if value is not numeric
   */
  public static final void checkNumericString(String value) {
    check(value);
  }

  public static final void checkNumericString(CharSequence value, String valueFrom) {
    check(value.toString(), valueFrom);
  }

  private static final void check(String value) {
    if(value.isEmpty()) {
      throw new WrongNumericException("String can not be an empty value.");
    }
  }

  private static final void check(String value, String valueFrom) {
    if(value.isEmpty()) {
      throw new WrongNumericException(valueFrom + " can not be an empty value.");
    }
  }
}
