package com.mercadona.pedper.main.api.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mercadona.pedper.main.api.dto.CandidateResourceDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VacancyCandidateResourceDTO
 */
@lombok.Builder
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

@JsonTypeName("VacancyCandidateResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-10T16:36:37.876241+01:00[Europe/Madrid]")
public class VacancyCandidateResourceDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("candidate")
  private CandidateResourceDTO candidate;

  @JsonProperty("createdDate")
  private String createdDate;

  public VacancyCandidateResourceDTO candidate(CandidateResourceDTO candidate) {
    this.candidate = candidate;
    return this;
  }

  /**
   * Get candidate
   * @return candidate
  */
  @Valid 
  @Schema(name = "candidate", required = false)
  public CandidateResourceDTO getCandidate() {
    return candidate;
  }

  public void setCandidate(CandidateResourceDTO candidate) {
    this.candidate = candidate;
  }

  public VacancyCandidateResourceDTO createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  
  @Schema(name = "createdDate", required = false)
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyCandidateResourceDTO vacancyCandidateResource = (VacancyCandidateResourceDTO) o;
    return Objects.equals(this.candidate, vacancyCandidateResource.candidate) &&
        Objects.equals(this.createdDate, vacancyCandidateResource.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidate, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyCandidateResourceDTO {\n");
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

