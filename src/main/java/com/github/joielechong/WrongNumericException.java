package com.github.joielechong;

/**
 * Thrown when a string is not a valid numeric value.
 * Created by Joielechong 1/2/2016
 */
public final class WrongNumericException extends RuntimeException {
  WrongNumericException(String aMessage){
    super(aMessage);
  }
}
