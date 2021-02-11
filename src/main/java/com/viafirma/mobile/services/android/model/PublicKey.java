package com.viafirma.mobile.services.android.model;

import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class PublicKey  implements Serializable {
  
  @SerializedName("encoded")
  private List<String> encoded = new ArrayList<String>() ;
  @SerializedName("algorithm")
  private String algorithm = null;
  @SerializedName("format")
  private String format = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getEncoded() {
    return encoded;
  }
  public void setEncoded(List<String> encoded) {
    this.encoded = encoded;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAlgorithm() {
    return algorithm;
  }
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicKey {\n");
    
    sb.append("  encoded: ").append(encoded).append("\n");
    sb.append("  algorithm: ").append(algorithm).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
