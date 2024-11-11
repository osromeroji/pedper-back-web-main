package com.mercadona.pedper.main.driven.repositories.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class EmployeeMO {

  @Id
  @Column(name = "employee_id")
  private String employeeId;

  @Id
  @Column(name = "managed_group_id")
  private String managedGroupId;

  @Column(name = "name")
  private String name;
}
