package com.pragma.technologymicroservice.utils.constants;

public class ExceptionConstants {
  private ExceptionConstants() {
    throw new IllegalStateException("Utility class");
  }


  public static final String FIELD_NAME_NULL_MESSAGE = "Field 'name' cannot be null";
  public static final String FIELD_DESCRIPTION_NULL_MESSAGE = "Field 'description' cannot be null";
  public static final String FIELD_TECHNOLOGIES_NULL_MESSAGE = "Field 'technologies' cannot be null";
  public static final String FIELD_CAPACITIES_NULL_MESSAGE = "Field 'capacities' cannot be null";
  public static final String FIELD_INITIAL_DATE_NULL_MESSAGE = "Field 'initialDate' cannot be null";
  public static final String FIELD_FINAL_DATE_NULL_MESSAGE = "Field 'finalDate' cannot be null";
  public static final String FIELD_CUPOS_NULL_MESSAGE = "Field 'cupos' cannot be null";
  public static final String FIELD_BOOTCAMP_NULL_MESSAGE = "A version must have a bootcamp assigned to it.";
  public static final String MAX_CHAR_NAME_MESSAGE = "Field 'name' cannot exceed the maximum number of characters (50)";
  public static final String MAX_CHAR_DESCRIPTION_MESSAGE = "Field 'description' cannot exceed the maximum number of characters (90)";
  public static final String CAPACITY_MIN_OR_MAX_TECHNOLOGIES_EXCEPTION_MESSAGE = "A capability must have between 3 and 20 associated technologies";
  public static final String BOOTCAMP_MIN_OR_MAX_CAPACITIES_EXCEPTION_MESSAGE = "A Bootcamp must have between 1 and 4 associated capacities";
  }
