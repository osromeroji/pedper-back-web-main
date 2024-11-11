package com.mercadona.pedper.main.driven.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class VacancyCandidatesMOPK implements Serializable {
  @Column(name = "vacancy_id")
  private Long vacancyId;

  @Column(name = "employee_id")
  private String employeeId;

  @Column(name = "managed_group_id")
  private String managedGroupId;
}
