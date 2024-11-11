package com.mercadona.pedper.main.driven.repositories.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vacancy")
public class VacancyMO {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "start_date")
  private LocalDate startDate;

  @Column(name = "end_date")
  private LocalDate endDate;

  @Column(name = "onboarding_date")
  private LocalDate onboardingDate;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "vacancy_id", insertable = false, updatable = false, nullable = false)
  private Set<VacancyCandidatesMO> candidates = new LinkedHashSet<>();
}
