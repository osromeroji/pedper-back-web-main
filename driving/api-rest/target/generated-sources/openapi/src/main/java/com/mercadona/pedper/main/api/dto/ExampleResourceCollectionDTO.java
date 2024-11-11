package com.mercadona.pedper.main.api.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mercadona.pedper.main.api.dto.ExampleResourceDTO;
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
 * ExampleResourceCollectionDTO
 */
@lombok.Builder
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

@JsonTypeName("ExampleResourceCollection")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-10T16:36:37.876241+01:00[Europe/Madrid]")
public class ExampleResourceCollectionDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("examples")
  @Valid
  private List<ExampleResourceDTO> examples = null;

  public ExampleResourceCollectionDTO examples(List<ExampleResourceDTO> examples) {
    this.examples = examples;
    return this;
  }

  public ExampleResourceCollectionDTO addExamplesItem(ExampleResourceDTO examplesItem) {
    if (this.examples == null) {
      this.examples = new ArrayList<>();
    }
    this.examples.add(examplesItem);
    return this;
  }

  /**
   * Get examples
   * @return examples
  */
  @Valid 
  @Schema(name = "examples", required = false)
  public List<ExampleResourceDTO> getExamples() {
    return examples;
  }

  public void setExamples(List<ExampleResourceDTO> examples) {
    this.examples = examples;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleResourceCollectionDTO exampleResourceCollection = (ExampleResourceCollectionDTO) o;
    return Objects.equals(this.examples, exampleResourceCollection.examples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(examples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleResourceCollectionDTO {\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
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

