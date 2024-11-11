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
 * PaginationDTO
 */
@lombok.Builder
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

@JsonTypeName("Pagination")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-10T16:36:37.876241+01:00[Europe/Madrid]")
public class PaginationDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("requestedPage")
  private Integer requestedPage;

  @JsonProperty("requestedSize")
  private Integer requestedSize;

  @JsonProperty("retrievedResults")
  private Integer retrievedResults;

  @JsonProperty("totalResults")
  private Long totalResults;

  @JsonProperty("nextPage")
  private String nextPage;

  @JsonProperty("previousPage")
  private String previousPage;

  public PaginationDTO requestedPage(Integer requestedPage) {
    this.requestedPage = requestedPage;
    return this;
  }

  /**
   * Get requestedPage
   * @return requestedPage
  */
  
  @Schema(name = "requestedPage", required = false)
  public Integer getRequestedPage() {
    return requestedPage;
  }

  public void setRequestedPage(Integer requestedPage) {
    this.requestedPage = requestedPage;
  }

  public PaginationDTO requestedSize(Integer requestedSize) {
    this.requestedSize = requestedSize;
    return this;
  }

  /**
   * Get requestedSize
   * @return requestedSize
  */
  
  @Schema(name = "requestedSize", required = false)
  public Integer getRequestedSize() {
    return requestedSize;
  }

  public void setRequestedSize(Integer requestedSize) {
    this.requestedSize = requestedSize;
  }

  public PaginationDTO retrievedResults(Integer retrievedResults) {
    this.retrievedResults = retrievedResults;
    return this;
  }

  /**
   * Get retrievedResults
   * @return retrievedResults
  */
  
  @Schema(name = "retrievedResults", required = false)
  public Integer getRetrievedResults() {
    return retrievedResults;
  }

  public void setRetrievedResults(Integer retrievedResults) {
    this.retrievedResults = retrievedResults;
  }

  public PaginationDTO totalResults(Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * Get totalResults
   * @return totalResults
  */
  
  @Schema(name = "totalResults", required = false)
  public Long getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
  }

  public PaginationDTO nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * Get nextPage
   * @return nextPage
  */
  
  @Schema(name = "nextPage", required = false)
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }

  public PaginationDTO previousPage(String previousPage) {
    this.previousPage = previousPage;
    return this;
  }

  /**
   * Get previousPage
   * @return previousPage
  */
  
  @Schema(name = "previousPage", required = false)
  public String getPreviousPage() {
    return previousPage;
  }

  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationDTO pagination = (PaginationDTO) o;
    return Objects.equals(this.requestedPage, pagination.requestedPage) &&
        Objects.equals(this.requestedSize, pagination.requestedSize) &&
        Objects.equals(this.retrievedResults, pagination.retrievedResults) &&
        Objects.equals(this.totalResults, pagination.totalResults) &&
        Objects.equals(this.nextPage, pagination.nextPage) &&
        Objects.equals(this.previousPage, pagination.previousPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedPage, requestedSize, retrievedResults, totalResults, nextPage, previousPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationDTO {\n");
    sb.append("    requestedPage: ").append(toIndentedString(requestedPage)).append("\n");
    sb.append("    requestedSize: ").append(toIndentedString(requestedSize)).append("\n");
    sb.append("    retrievedResults: ").append(toIndentedString(retrievedResults)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
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

