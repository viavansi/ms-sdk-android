package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.JSFieldExtractionResultDerivedData;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class JSOcrFieldExtractionResult  implements Serializable {
  
  @SerializedName("derived")
  private List<JSFieldExtractionResultDerivedData> derived = new ArrayList<JSFieldExtractionResultDerivedData>() ;
  @SerializedName("confidence")
  private Double confidence = null;
  @SerializedName("key")
  private String key = null;
  @SerializedName("valid")
  private Boolean valid = Boolean.FALSE;
  @SerializedName("value")
  private String value = null;
  @SerializedName("title")
  private String title = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<JSFieldExtractionResultDerivedData> getDerived() {
    return derived;
  }
  public void setDerived(List<JSFieldExtractionResultDerivedData> derived) {
    this.derived = derived;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
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
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSOcrFieldExtractionResult {\n");
    
    sb.append("  derived: ").append(derived).append("\n");
    sb.append("  confidence: ").append(confidence).append("\n");
    sb.append("  key: ").append(key).append("\n");
    sb.append("  valid: ").append(valid).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
