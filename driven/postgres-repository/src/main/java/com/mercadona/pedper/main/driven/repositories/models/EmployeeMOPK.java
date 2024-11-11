package com.mercadona.pedper.main.driven.repositories.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
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
public class EmployeeMOPK implements Serializable {
  @Column(name = "employee_id")
  private String employeeId;

  @Column(name = "managed_group_id")
  private String managedGroupId;
}
