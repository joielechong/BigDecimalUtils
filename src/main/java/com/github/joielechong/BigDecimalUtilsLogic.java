package com.github.joielechong;

import java.math.BigDecimal;

import static com.github.joielechong.BigDecimalStringChecker.checkNumericString;

/**
 * Utility to do comparison between BigDecimal value.
 * Adopted from Representing money (http://www.javapractices.com/topic/TopicAction.do?Id=13)
 * Created by Joielechong on 1/2/16.
 */
public class BigDecimalUtilsLogic {

  private final BigDecimal amount;

  public BigDecimalUtilsLogic(BigDecimal bigDecimal) {
    this.amount = bigDecimal;
  }

  public BigDecimalUtilsLogic(String value) {
    checkNumericString(value);
    this.amount = new BigDecimal(value);
  }

  /**
   * Equals (insensitive to scale).
   *
   * <P>Return <tt>true</tt> only if the amounts are equal to the provided
   * {@link BigDecimal} bigDecimal or not..
   * This method is <em>not</em> synonymous with the <tt>equals</tt> method.
   *
   * @param bigDecimal value to compare
   * @return {@link Boolean} value
   */
  public boolean eq(BigDecimal bigDecimal) {
    return this.amount.compareTo(bigDecimal) == 0;
  }

  /**
   * Greater than.
   *
   * <P>Return <tt>true</tt> only if  'this' amount is greater than
   * to the provided {@link BigDecimal} bigDecimal or not.
   *
   * @param value String bigDecimal value to compare
   * @return {@link Boolean} value
   */
  public boolean gt(String value) {
    return this.amount.compareTo(new BigDecimal(value)) > 0;
  }

  /**
   * Greater than.
   *
   * <P>Return <tt>true</tt> only if  'this' amount is greater than
   * to the provided {@link BigDecimal} bigDecimal or not.
   *
   * @param bigDecimal value to compare
   * @return {@link Boolean} value
   */
  public boolean gt(BigDecimal bigDecimal) {
    return this.amount.compareTo(bigDecimal) > 0;
  }

  /**
   * Greater than or equal to.
   *
   * <P>Return <tt>true</tt> only if 'this' amount is
   * greater than or equal to the provided {@link BigDecimal} bigDecimal or not.
   *
   * @param bigDecimal value to compare
   * @return {@link Boolean} value
   */
  public boolean gteq(BigDecimal bigDecimal) {
    return this.amount.compareTo(bigDecimal) >= 0;
  }

  /**
   * Greater than or equal to.
   *
   * <P>Return <tt>true</tt> only if 'this' amount is
   * greater than or equal to the provided {@link BigDecimal} bigDecimal or not.
   *
   * @param value String for bigDecimal value to compare
   * @return {@link Boolean} value
   */
  public boolean gteq(String value) {
    checkNumericString(value);

    return this.amount.compareTo(new BigDecimal(value)) >= 0;
  }
  /**
   * Less than.
   *
   * <P>Return <tt>true</tt> only if 'this' amount is less than
   * to the provided {@link BigDecimal} bigDecimal or not.
   *
   * @param bigDecimal value to compare
   * @return {@link Boolean} value
   */
  public boolean lt(BigDecimal bigDecimal) {
    return this.amount.compareTo(bigDecimal) < 0;
  }

  public boolean lt(String value) {
    checkNumericString(value);
    return this.amount.compareTo(new BigDecimal(value)) < 0;
  }

  /**
   * Less than or equal to.
   *
   * <P>Return <tt>true</tt> only if 'this' amount is less than or equal to
   * to the provided {@link BigDecimal} bigDecimal or not.
   *
   * @param bigDecimal value to compare
   * @return {@link Boolean} value
   */
  public boolean lteq(BigDecimal bigDecimal) {
    return this.amount.compareTo(bigDecimal) <= 0;
  }

  /**
   * Less than or equal to.
   *
   * <P>Return <tt>true</tt> only if 'this' amount is less than or equal to
   * to the provided {@link BigDecimal} bigDecimal or not.
   *
   * @param value String for bigDecimal value to compare
   * @return {@link Boolean} value
   */
  public boolean lteq(String value) {
    return this.amount.compareTo(new BigDecimal(value)) <= 0;
  }
}
