package com.pragma.technologymicroservice.domain.api.usecase;

import com.pragma.technologymicroservice.domain.api.IVersionServicePort;
import com.pragma.technologymicroservice.domain.model.Version;
import com.pragma.technologymicroservice.domain.spi.IVersionPersistencePort;
import com.pragma.technologymicroservice.utils.exception.FinalDateBeforeInitialDateException;
import com.pragma.technologymicroservice.utils.exception.InitialDateBeforeCurrentDateException;

import java.time.LocalDate;
import java.util.List;

public class VersionUseCase implements IVersionServicePort {

  private IVersionPersistencePort versionPersistencePort;

  public VersionUseCase(IVersionPersistencePort versionPersistencePort) {

    this.versionPersistencePort = versionPersistencePort;

  }

  @Override
  public void saveVersion(Version version) {

    LocalDate fechaActual = LocalDate.now();
    LocalDate fechaInicio = version.getInitialDate();
    LocalDate fechaFin = version.getFinalDate();

    if (fechaInicio.isBefore(fechaActual)) {
      throw new InitialDateBeforeCurrentDateException();
    }
    if (fechaFin.isBefore(fechaInicio)) {
      throw new FinalDateBeforeInitialDateException();
    }

    versionPersistencePort.saveVersion(version);
  }

  @Override
  public List<Version> getAllVersions(Integer page, Integer size, String orderBootcamp,
                                      String orderDate, String orderCupos, Long bootcampId) {
    return versionPersistencePort.getAllVersions(page,size,orderBootcamp,orderDate,orderCupos,bootcampId);
  }

}
