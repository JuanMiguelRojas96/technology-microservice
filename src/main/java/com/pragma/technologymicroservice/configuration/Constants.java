package com.pragma.technologymicroservice.configuration;

public class Constants {
  private Constants(){
    throw new IllegalStateException("utility class");
  }

  //Fields
  public static final String EMPTY_FIELD_EXCEPTION_MESSAGE = "The Field indicated is Empty or Null";
  public static final String MAX_CHAR_EXCEPTION_MESSAGE = "The Field indicated exceed the maximum number of characters";

  //Already exists
  public static final String TECHNOLOGY_ALREADY_EXISTS_EXCEPTION_MESSAGE = "The technology you want to create already exists";
  public static final String CAPACITY_ALREADY_EXISTS_EXCEPTION_MESSAGE = "The capacity you want to create already exists";
  public static final String BOOTCAMP_ALREADY_EXISTS_EXCEPTION_MESSAGE = "The bootcamp you want to create already exists";

  //Min or Max
  public static final String CAPACITY_MIN_OR_MAX_TECHNOLOGIES_EXCEPTION_MESSAGE = "A capability must have between 3 and 20 associated technologies";
  public static final String BOOTCAMP_MIN_OR_MAX_TECHNOLOGIES_EXCEPTION_MESSAGE = "A bootcamp must have between 1 and 4 associated capacities";

  //Repeat
  public static final String REPEAT_TECH_IN_CAPACITY_EXCEPTION_MESSAGE = "A capability cannot have repeating technologies";
  public static final String REPEAT_CAP_IN_BOOTCAMP_EXCEPTION_MESSAGE = "A bootcamp cannot have repeating capacities";

  //Dates
  public static final String INITIAL_DATE_MUST_BE_GREATER_THAN_ACTUAL = "The initial date must be greater than the current date";
  public static final String FINAL_DATE_MUST_BE_GREATER_THAN_INITIAL_DATE = "The final date must be greater than the initial date";

  //No data found
  public static final String NO_DATA_FOUND_EXCEPTION_MESSAGE = "No data was found in the database";

}
