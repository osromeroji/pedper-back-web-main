package com.mercadona.pedper.main.api.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mercadona.pedper.main.api.dto.IdentificationTypesRequestEnumDTO;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExampleRequestDTO
 */
@lombok.Builder
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

@JsonTypeName("ExampleRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-10T16:36:37.876241+01:00[Europe/Madrid]")
public class ExampleRequestDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("creationTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date creationTime;

  @JsonProperty("identificationType")
  private IdentificationTypesRequestEnumDTO identificationType;

  @JsonProperty("identification")
  private String identification;

  @JsonProperty("numberOfDaysInWeek")
  private Integer numberOfDaysInWeek;

  public ExampleRequestDTO id(Long id) {
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

  public ExampleRequestDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExampleRequestDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull @Size(min = 5, max = 30) 
  @Schema(name = "description", required = true)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExampleRequestDTO creationTime(Date creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Get creationTime
   * @return creationTime
  */
  @NotNull @Valid 
  @Schema(name = "creationTime", required = true)
  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  public ExampleRequestDTO identificationType(IdentificationTypesRequestEnumDTO identificationType) {
    this.identificationType = identificationType;
    return this;
  }

  /**
   * Get identificationType
   * @return identificationType
  */
  @NotNull @Valid 
  @Schema(name = "identificationType", required = true)
  public IdentificationTypesRequestEnumDTO getIdentificationType() {
    return identificationType;
  }

  public void setIdentificationType(IdentificationTypesRequestEnumDTO identificationType) {
    this.identificationType = identificationType;
  }

  public ExampleRequestDTO identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  */
  @NotNull @Pattern(regexp = "(?:(?=^[0-9])[0-9]{8}[A-Z]{1}$|(?!^[0-9])[A-Z]{1}[0-9]{7}[A-Z]{1}$)") 
  @Schema(name = "identification", required = true)
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public ExampleRequestDTO numberOfDaysInWeek(Integer numberOfDaysInWeek) {
    this.numberOfDaysInWeek = numberOfDaysInWeek;
    return this;
  }

  /**
   * Get numberOfDaysInWeek
   * minimum: 1
   * maximum: 7
   * @return numberOfDaysInWeek
  */
  @NotNull @Min(1) @Max(7) 
  @Schema(name = "numberOfDaysInWeek", required = true)
  public Integer getNumberOfDaysInWeek() {
    return numberOfDaysInWeek;
  }

  public void setNumberOfDaysInWeek(Integer numberOfDaysInWeek) {
    this.numberOfDaysInWeek = numberOfDaysInWeek;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleRequestDTO exampleRequest = (ExampleRequestDTO) o;
    return Objects.equals(this.id, exampleRequest.id) &&
        Objects.equals(this.name, exampleRequest.name) &&
        Objects.equals(this.description, exampleRequest.description) &&
        Objects.equals(this.creationTime, exampleRequest.creationTime) &&
        Objects.equals(this.identificationType, exampleRequest.identificationType) &&
        Objects.equals(this.identification, exampleRequest.identification) &&
        Objects.equals(this.numberOfDaysInWeek, exampleRequest.numberOfDaysInWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, creationTime, identificationType, identification, numberOfDaysInWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleRequestDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    identificationType: ").append(toIndentedString(identificationType)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    numberOfDaysInWeek: ").append(toIndentedString(numberOfDaysInWeek)).append("\n");
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

