package com.mercadona.pedper.main.driven.repositories.adapters;

import com.mercadona.pedper.main.application.ports.driven.VacancyRepositoryPort;
import com.mercadona.pedper.main.domain.Vacancy;
import com.mercadona.pedper.main.driven.repositories.VacancyMOJpaRepository;
import com.mercadona.pedper.main.driven.repositories.mappers.VacancyMOMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class VacancyRepositoryAdapter implements VacancyRepositoryPort {
  private final VacancyMOJpaRepository vacancyMOJpaRepository;
  private final VacancyMOMapper vacancyMOMapper;

  @Override
  public Vacancy getVacancy(Long vacancyId) {
    var vacancyMO = vacancyMOJpaRepository.findById(vacancyId).orElseThrow();

    return vacancyMOMapper.fromModel(vacancyMO);
  }

  @Override
  public void createVacancy(Vacancy vacancy) {
    var vacancyMO = vacancyMOMapper.toModel(vacancy);

    vacancyMOJpaRepository.save(vacancyMO);
  }
}
