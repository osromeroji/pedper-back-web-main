package com.mercadona.pedper.main.api.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CandidateResourceDTO
 */
@lombok.Builder
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

@JsonTypeName("CandidateResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-10T16:36:37.876241+01:00[Europe/Madrid]")
public class CandidateResourceDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("employeeId")
  private String employeeId;

  @JsonProperty("managedGroupId")
  private String managedGroupId;

  @JsonProperty("name")
  private String name;

  public CandidateResourceDTO employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Get employeeId
   * @return employeeId
  */
  
  @Schema(name = "employeeId", required = false)
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public CandidateResourceDTO managedGroupId(String managedGroupId) {
    this.managedGroupId = managedGroupId;
    return this;
  }

  /**
   * Get managedGroupId
   * @return managedGroupId
  */
  
  @Schema(name = "managedGroupId", required = false)
  public String getManagedGroupId() {
    return managedGroupId;
  }

  public void setManagedGroupId(String managedGroupId) {
    this.managedGroupId = managedGroupId;
  }

  public CandidateResourceDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateResourceDTO candidateResource = (CandidateResourceDTO) o;
    return Objects.equals(this.employeeId, candidateResource.employeeId) &&
        Objects.equals(this.managedGroupId, candidateResource.managedGroupId) &&
        Objects.equals(this.name, candidateResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, managedGroupId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateResourceDTO {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    managedGroupId: ").append(toIndentedString(managedGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

