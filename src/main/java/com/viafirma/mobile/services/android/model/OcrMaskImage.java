package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class OcrMaskImage  implements Serializable {
  
  @SerializedName("mask")
  private String mask = null;
  @SerializedName("version")
  private Double version = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMask() {
    return mask;
  }
  public void setMask(String mask) {
    this.mask = mask;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrMaskImage {\n");
    
    sb.append("  mask: ").append(mask).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
