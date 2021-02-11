package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.GenericEvidencePropertyDTO;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class XMLGenericEvidenceDTO  implements Serializable {
  
  @SerializedName("properties")
  private List<GenericEvidencePropertyDTO> properties = new ArrayList<GenericEvidencePropertyDTO>() ;
  @SerializedName("providerId")
  private String providerId = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("icon")
  private String icon = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<GenericEvidencePropertyDTO> getProperties() {
    return properties;
  }
  public void setProperties(List<GenericEvidencePropertyDTO> properties) {
    this.properties = properties;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getProviderId() {
    return providerId;
  }
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIcon() {
    return icon;
  }
  public void setIcon(String icon) {
    this.icon = icon;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XMLGenericEvidenceDTO {\n");
    
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("  providerId: ").append(providerId).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  icon: ").append(icon).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
