package com.mercadona.pedper.main.application.ports.driven;

import com.mercadona.pedper.main.domain.Vacancy;

public interface VacancyRepositoryPort {
  Vacancy getVacancy(Long vacancyId);
  void createVacancy(Vacancy vacancy);
}
