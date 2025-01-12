package com.pragma.technologymicroservice.domain.api.usecase;

import com.pragma.technologymicroservice.utils.exception.RepeatCapInBootcampException;
import com.pragma.technologymicroservice.domain.api.IBootcampServicePort;
import com.pragma.technologymicroservice.domain.model.Bootcamp;
import com.pragma.technologymicroservice.domain.model.Capacity;
import com.pragma.technologymicroservice.domain.spi.IBootcampPersistencePort;

import java.util.ArrayList;
import java.util.List;

public class BootcampUseCase implements IBootcampServicePort {

  private IBootcampPersistencePort bootcampPersistencePort;

  public BootcampUseCase(IBootcampPersistencePort bootcampPersistencePort) {
    this.bootcampPersistencePort = bootcampPersistencePort;
  }

  @Override
  public void saveBootcamp(Bootcamp bootcamp) {

    List<Long> capacities = new ArrayList<>();

    for (Capacity capacity : bootcamp.getCapacities()){
      Long capacityId = capacity.getId();

      if (capacities.contains(capacityId)){
        throw new RepeatCapInBootcampException();
      }else {
        capacities.add(capacityId);
      }
    }
    bootcampPersistencePort.saveBootcamp(bootcamp);
  }

  @Override
  public List<Bootcamp> getAllBootcamps(Integer page, Integer size, boolean orderBootcamp, boolean orderCapacity){
    return bootcampPersistencePort.getAllBootcamps(page, size, orderBootcamp, orderCapacity);
  }
}
