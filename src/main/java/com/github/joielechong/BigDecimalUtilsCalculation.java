package com.github.joielechong;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.github.joielechong.BigDecimalStringChecker.checkNumericString;

/**
 * BigDecimal calculation operation.
 * Created by Joielechong on 1/2/16.
 */
public class BigDecimalUtilsCalculation {

  private final BigDecimal amount;

  public BigDecimalUtilsCalculation(BigDecimal bigDecimal) {
    this.amount = bigDecimal;
  }

  public BigDecimalUtilsCalculation(String value) {
    checkNumericString(value);
    this.amount = new BigDecimal(value);
  }

  public BigDecimalUtilsCalculation(int value) {
    this.amount = new BigDecimal(value);
  }

  public BigDecimalUtilsCalculation(long value) {
    this.amount = new BigDecimal(value);
  }

  /**
   * Subtract the provided value from 'this' amount.
   * @value String numeric value in Locale.US
   * @return String numeric
   */
  public String minus(String value){
    checkNumericString(value);
    BigDecimal subtrahend = new BigDecimal(value);
    return amount.subtract(subtrahend).toString();
  }

  /**
   * Add the provided value to 'this' amount.
   * @param value String numeric value in Locale.US
   * @return String numeric
   */
  public String plus(String value){
    checkNumericString(value);
    BigDecimal augend = new BigDecimal(value);
    return amount.add(augend).toString();
  }

  public String plus(float value) {
    BigDecimal augend = new BigDecimal(value);
    return amount.add(augend).toString();
  }

  /**
   * Divide the provided value from 'this' amount.
   * @value String numeric value in Locale.US
   */
  public String div(String value){
    checkNumericString(value);
    BigDecimal divisor = new BigDecimal(value);
    return amount.divide(divisor, RoundingMode.HALF_EVEN).toString();
  }

  /**
   * Divide the provided value from 'this' amount.
   * @value float numeric value.
   */
  public String div(float value){
    BigDecimal divisor = new BigDecimal(value);
    return amount.divide(divisor, RoundingMode.HALF_EVEN).toString();
  }

}
