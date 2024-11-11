package com.mercadona.pedper.main.application.ports.driving;

import com.mercadona.pedper.main.domain.Vacancy;

public interface VacancyServicePort {
  Vacancy getVacancy(Long vacancyId);

  void createVacancy(Vacancy vacancy);
}
