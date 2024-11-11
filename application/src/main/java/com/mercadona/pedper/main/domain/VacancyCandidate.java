package com.mercadona.pedper.main.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class VacancyCandidate {
  private Employee candidate;
  private LocalDate createdDate;
}
