package com.github.joielechong;

/**
 * Runtime exception for empty value
 * Created by Joielechong on 1/3/16.
 */
public class EmptyValueException extends RuntimeException{
  public EmptyValueException(String aMessage){
    super(aMessage);
  }
}
