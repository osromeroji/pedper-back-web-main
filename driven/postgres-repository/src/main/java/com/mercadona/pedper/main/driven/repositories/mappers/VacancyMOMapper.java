package com.mercadona.pedper.main.driven.repositories.mappers;

import com.mercadona.pedper.main.domain.Vacancy;
import com.mercadona.pedper.main.domain.VacancyCandidate;
import com.mercadona.pedper.main.driven.repositories.models.VacancyCandidatesMO;
import com.mercadona.pedper.main.driven.repositories.models.VacancyMO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface VacancyMOMapper {
  Vacancy fromModel(VacancyMO vacancyMO);

  @InheritInverseConfiguration
  VacancyMO toModel(Vacancy vacancy);
}
