package com.mercadona.pedper.main.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Employee {
  private String employeeId;
  private String managedGroupId;
  private String name;
}
