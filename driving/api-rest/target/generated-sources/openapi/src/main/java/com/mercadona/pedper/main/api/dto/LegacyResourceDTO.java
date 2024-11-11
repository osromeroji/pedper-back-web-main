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
 * LegacyResourceDTO
 */
@lombok.Builder
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

@JsonTypeName("LegacyResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-10T16:36:37.876241+01:00[Europe/Madrid]")
public class LegacyResourceDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("publicId")
  private String publicId;

  @JsonProperty("thirdPartyId")
  private String thirdPartyId;

  @JsonProperty("siteId")
  private String siteId;

  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("typeId")
  private String typeId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("location")
  private String location;

  @JsonProperty("province")
  private String province;

  @JsonProperty("groupingName")
  private String groupingName;

  @JsonProperty("activationDate")
  private String activationDate;

  @JsonProperty("deactivationDate")
  private String deactivationDate;

  public LegacyResourceDTO publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * Get publicId
   * @return publicId
  */
  
  @Schema(name = "publicId", required = false)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public LegacyResourceDTO thirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
    return this;
  }

  /**
   * Get thirdPartyId
   * @return thirdPartyId
  */
  
  @Schema(name = "thirdPartyId", required = false)
  public String getThirdPartyId() {
    return thirdPartyId;
  }

  public void setThirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }

  public LegacyResourceDTO siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId
   * @return siteId
  */
  
  @Schema(name = "siteId", required = false)
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public LegacyResourceDTO companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  */
  
  @Schema(name = "companyId", required = false)
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public LegacyResourceDTO typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Get typeId
   * @return typeId
  */
  
  @Schema(name = "typeId", required = false)
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public LegacyResourceDTO name(String name) {
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

  public LegacyResourceDTO location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  
  @Schema(name = "location", required = false)
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public LegacyResourceDTO province(String province) {
    this.province = province;
    return this;
  }

  /**
   * Get province
   * @return province
  */
  
  @Schema(name = "province", required = false)
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public LegacyResourceDTO groupingName(String groupingName) {
    this.groupingName = groupingName;
    return this;
  }

  /**
   * Get groupingName
   * @return groupingName
  */
  
  @Schema(name = "groupingName", required = false)
  public String getGroupingName() {
    return groupingName;
  }

  public void setGroupingName(String groupingName) {
    this.groupingName = groupingName;
  }

  public LegacyResourceDTO activationDate(String activationDate) {
    this.activationDate = activationDate;
    return this;
  }

  /**
   * Get activationDate
   * @return activationDate
  */
  
  @Schema(name = "activationDate", required = false)
  public String getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(String activationDate) {
    this.activationDate = activationDate;
  }

  public LegacyResourceDTO deactivationDate(String deactivationDate) {
    this.deactivationDate = deactivationDate;
    return this;
  }

  /**
   * Get deactivationDate
   * @return deactivationDate
  */
  
  @Schema(name = "deactivationDate", required = false)
  public String getDeactivationDate() {
    return deactivationDate;
  }

  public void setDeactivationDate(String deactivationDate) {
    this.deactivationDate = deactivationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyResourceDTO legacyResource = (LegacyResourceDTO) o;
    return Objects.equals(this.publicId, legacyResource.publicId) &&
        Objects.equals(this.thirdPartyId, legacyResource.thirdPartyId) &&
        Objects.equals(this.siteId, legacyResource.siteId) &&
        Objects.equals(this.companyId, legacyResource.companyId) &&
        Objects.equals(this.typeId, legacyResource.typeId) &&
        Objects.equals(this.name, legacyResource.name) &&
        Objects.equals(this.location, legacyResource.location) &&
        Objects.equals(this.province, legacyResource.province) &&
        Objects.equals(this.groupingName, legacyResource.groupingName) &&
        Objects.equals(this.activationDate, legacyResource.activationDate) &&
        Objects.equals(this.deactivationDate, legacyResource.deactivationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicId, thirdPartyId, siteId, companyId, typeId, name, location, province, groupingName, activationDate, deactivationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyResourceDTO {\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    thirdPartyId: ").append(toIndentedString(thirdPartyId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    groupingName: ").append(toIndentedString(groupingName)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    deactivationDate: ").append(toIndentedString(deactivationDate)).append("\n");
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

