package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.OcrFieldExtractionResult;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class OcrData  implements Serializable {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("version")
  private Double version = null;
  @SerializedName("offline")
  private Boolean offline = Boolean.FALSE;
  @SerializedName("result")
  private List<OcrFieldExtractionResult> result = new ArrayList<OcrFieldExtractionResult>() ;

  
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
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getOffline() {
    return offline;
  }
  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<OcrFieldExtractionResult> getResult() {
    return result;
  }
  public void setResult(List<OcrFieldExtractionResult> result) {
    this.result = result;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrData {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  offline: ").append(offline).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
