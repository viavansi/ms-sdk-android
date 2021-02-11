package com.viafirma.mobile.services.android.model;

import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ConfigPolicyDTO  implements Serializable {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("description")
  private String description = null;
  public enum DigestAlgorithmEnum {
     SHA1,  SHA224,  SHA256,  SHA384,  SHA512,  RIPEMD160,  MD2,  MD5, 
  };
  @SerializedName("digestAlgorithm")
  private DigestAlgorithmEnum digestAlgorithm = null;
  @SerializedName("digestValue")
  private List<String> digestValue = new ArrayList<String>() ;
  @SerializedName("contentHintsDescription")
  private String contentHintsDescription = null;
  @SerializedName("contentHintsType")
  private String contentHintsType = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
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
  public DigestAlgorithmEnum getDigestAlgorithm() {
    return digestAlgorithm;
  }
  public void setDigestAlgorithm(DigestAlgorithmEnum digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getDigestValue() {
    return digestValue;
  }
  public void setDigestValue(List<String> digestValue) {
    this.digestValue = digestValue;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getContentHintsDescription() {
    return contentHintsDescription;
  }
  public void setContentHintsDescription(String contentHintsDescription) {
    this.contentHintsDescription = contentHintsDescription;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getContentHintsType() {
    return contentHintsType;
  }
  public void setContentHintsType(String contentHintsType) {
    this.contentHintsType = contentHintsType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigPolicyDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  digestAlgorithm: ").append(digestAlgorithm).append("\n");
    sb.append("  digestValue: ").append(digestValue).append("\n");
    sb.append("  contentHintsDescription: ").append(contentHintsDescription).append("\n");
    sb.append("  contentHintsType: ").append(contentHintsType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
