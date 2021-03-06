package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class TemplateList  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("creationDate")
  private Long creationDate = null;
  @SerializedName("groups")
  private String groups = null;
  @SerializedName("onlyWacom")
  private Boolean onlyWacom = Boolean.FALSE;
  @SerializedName("version")
  private String version = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * epoch timestamp in milliseconds
   **/
  @ApiModelProperty(required = false, value = "epoch timestamp in milliseconds")
  public Long getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getGroups() {
    return groups;
  }
  public void setGroups(String groups) {
    this.groups = groups;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getOnlyWacom() {
    return onlyWacom;
  }
  public void setOnlyWacom(Boolean onlyWacom) {
    this.onlyWacom = onlyWacom;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateList {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  creationDate: ").append(creationDate).append("\n");
    sb.append("  groups: ").append(groups).append("\n");
    sb.append("  onlyWacom: ").append(onlyWacom).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
