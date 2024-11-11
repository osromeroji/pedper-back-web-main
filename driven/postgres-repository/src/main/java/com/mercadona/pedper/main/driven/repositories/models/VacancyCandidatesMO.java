package com.mercadona.pedper.main.driven.repositories.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import jakarta.persistence.*;

import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vacancy_candidates")
public class VacancyCandidatesMO {

  @Id
  @Column(name = "vacancy_id")
  private Long vacancyId;

  @Id
  @Column(name = "employee_id")
  private String employeeId;

  @Id
  @Column(name = "managed_group_id")
  private String managedGroupId;

  @ManyToOne
  @JoinColumns({
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", insertable = false, updatable = false),
    @JoinColumn(name = "managed_group_id", referencedColumnName = "managed_group_id", insertable = false, updatable = false)
  })
  private EmployeeMO candidate;

  @Column(name = "created_date")
  private LocalDate createdDate;
}
