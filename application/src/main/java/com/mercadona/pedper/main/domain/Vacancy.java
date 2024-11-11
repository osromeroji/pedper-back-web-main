package com.mercadona.pedper.main.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Vacancy {
  private Long id;
  private LocalDate startDate;
  private LocalDate endDate;
  private LocalDate onboardingDate;
  private List<VacancyCandidate> candidates;
}
