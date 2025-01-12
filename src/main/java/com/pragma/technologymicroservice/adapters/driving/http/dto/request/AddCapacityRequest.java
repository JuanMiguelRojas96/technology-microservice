package com.pragma.technologymicroservice.adapters.driving.http.dto.request;

import com.pragma.technologymicroservice.utils.constants.ExceptionConstants;
import com.pragma.technologymicroservice.domain.model.Technology;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@AllArgsConstructor
@Getter
public class AddCapacityRequest {

  @NotBlank(message = ExceptionConstants.FIELD_NAME_NULL_MESSAGE)
  @Size(max = 50 , message = ExceptionConstants.MAX_CHAR_NAME_MESSAGE)
  private final String name;

  @NotBlank(message = ExceptionConstants.FIELD_DESCRIPTION_NULL_MESSAGE)
  @Size(max = 90 , message = ExceptionConstants.MAX_CHAR_DESCRIPTION_MESSAGE)
  private final String description;

  @NotNull(message = ExceptionConstants.FIELD_TECHNOLOGIES_NULL_MESSAGE)
  @Size(min = 3, max = 20, message = ExceptionConstants.CAPACITY_MIN_OR_MAX_TECHNOLOGIES_EXCEPTION_MESSAGE)
  private final List<Technology> technologies;



}
