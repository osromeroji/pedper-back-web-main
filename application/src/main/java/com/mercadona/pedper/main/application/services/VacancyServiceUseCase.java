package com.mercadona.pedper.main.application.services;

import com.mercadona.pedper.main.application.ports.driven.VacancyRepositoryPort;
import com.mercadona.pedper.main.application.ports.driving.VacancyServicePort;
import com.mercadona.pedper.main.domain.Vacancy;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class VacancyServiceUseCase implements VacancyServicePort {
  private final VacancyRepositoryPort vacancyRepositoryPort;

  @Override
  public Vacancy getVacancy(Long vacancyId) {
    return vacancyRepositoryPort.getVacancy(vacancyId);
  }

  @Override
  public void createVacancy(Vacancy vacancy) {
    vacancyRepositoryPort.createVacancy(vacancy);
  }
}
