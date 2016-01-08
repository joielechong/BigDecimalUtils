package com.github.joielechong;

import java.math.BigDecimal;

/**
 * BigDecimal utility to check comparison between BigDecimal value.
 * Please read {@link BigDecimalUtilsLogic} for information.
 * Created by Joielechong on 1/2/16.
 */
public class BigDecimalUtils {

  private BigDecimalUtils() {}

  public static BigDecimalUtilsLogic is(BigDecimal bigDecimal) {
    return new BigDecimalUtilsLogic(bigDecimal);
  }

  /**
   * Do logic operation with BigDecimal like a > b, a >= b, a < b, a <= b.
   *
   * @param value of numeric in string. Must be in Locale.US numeric value.
   * @return {}@link BigDecimalUtilsLogic} for operation
   */
  public static BigDecimalUtilsLogic is(String value) {
    return new BigDecimalUtilsLogic(value);
  }

  /**
   * Do calculation operation with BigDecimal like a - b, a / b.
   *
   * @param value of numeric in string. Must be in Locale.US numeric value.
   * @return {}@link BigDecimalUtilsCalculation} for operation
   */
  public static BigDecimalUtilsCalculation calculate(String value) {
    return new BigDecimalUtilsCalculation(value);
  }

  /**
   * Do calculation operation with BigDecimal like a - b, a / b.
   *
   * @param value integer value
   * @return {}@link BigDecimalUtilsCalculation} for operation
   */
  public static BigDecimalUtilsCalculation calculate(int value) {
    return new BigDecimalUtilsCalculation(value);
  }

  public static BigDecimalUtilsCalculation calculate(long value) {
    return new BigDecimalUtilsCalculation(value);
  }
}
