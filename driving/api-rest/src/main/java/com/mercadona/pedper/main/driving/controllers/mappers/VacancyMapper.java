package com.mercadona.pedper.main.driving.controllers.mappers;

import com.mercadona.pedper.main.api.dto.VacancyResourceDTO;
import com.mercadona.pedper.main.domain.Vacancy;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VacancyMapper {

  VacancyResourceDTO toVacancyResourceDTO(Vacancy vacancy);

  @InheritInverseConfiguration
  Vacancy toVacancy(VacancyResourceDTO vacancyResourceDTO);
}
