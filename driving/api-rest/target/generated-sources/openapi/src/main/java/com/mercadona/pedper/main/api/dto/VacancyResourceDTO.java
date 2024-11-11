package com.mercadona.pedper.main.api.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mercadona.pedper.main.api.dto.VacancyCandidateResourceDTO;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VacancyResourceDTO
 */
@lombok.Builder
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

@JsonTypeName("VacancyResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-10T16:36:37.876241+01:00[Europe/Madrid]")
public class VacancyResourceDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  @JsonProperty("onboardingDate")
  private String onboardingDate;

  @JsonProperty("candidates")
  @Valid
  private List<VacancyCandidateResourceDTO> candidates = null;

  public VacancyResourceDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public VacancyResourceDTO startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "startDate", required = false)
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public VacancyResourceDTO endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  
  @Schema(name = "endDate", required = false)
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public VacancyResourceDTO onboardingDate(String onboardingDate) {
    this.onboardingDate = onboardingDate;
    return this;
  }

  /**
   * Get onboardingDate
   * @return onboardingDate
  */
  
  @Schema(name = "onboardingDate", required = false)
  public String getOnboardingDate() {
    return onboardingDate;
  }

  public void setOnboardingDate(String onboardingDate) {
    this.onboardingDate = onboardingDate;
  }

  public VacancyResourceDTO candidates(List<VacancyCandidateResourceDTO> candidates) {
    this.candidates = candidates;
    return this;
  }

  public VacancyResourceDTO addCandidatesItem(VacancyCandidateResourceDTO candidatesItem) {
    if (this.candidates == null) {
      this.candidates = new ArrayList<>();
    }
    this.candidates.add(candidatesItem);
    return this;
  }

  /**
   * Get candidates
   * @return candidates
  */
  @Valid 
  @Schema(name = "candidates", required = false)
  public List<VacancyCandidateResourceDTO> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<VacancyCandidateResourceDTO> candidates) {
    this.candidates = candidates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyResourceDTO vacancyResource = (VacancyResourceDTO) o;
    return Objects.equals(this.id, vacancyResource.id) &&
        Objects.equals(this.startDate, vacancyResource.startDate) &&
        Objects.equals(this.endDate, vacancyResource.endDate) &&
        Objects.equals(this.onboardingDate, vacancyResource.onboardingDate) &&
        Objects.equals(this.candidates, vacancyResource.candidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, endDate, onboardingDate, candidates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyResourceDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    onboardingDate: ").append(toIndentedString(onboardingDate)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
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

