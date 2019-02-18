package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ImageProviderConfig  implements Serializable {
  
  @SerializedName("providerId")
  private String providerId = null;
  @SerializedName("groupCode")
  private String groupCode = null;
  @SerializedName("value")
  private String value = null;
  @SerializedName("extension")
  private String extension = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getProviderId() {
    return providerId;
  }
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getGroupCode() {
    return groupCode;
  }
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageProviderConfig {\n");
    
    sb.append("  providerId: ").append(providerId).append("\n");
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  extension: ").append(extension).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
