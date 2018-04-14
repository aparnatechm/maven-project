package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * @param someone the name of a person.
   * @return greeting String
   */
  public Greeter() {

  }
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
