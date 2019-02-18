package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Base64  implements Serializable {
  
  @SerializedName("base64")
  private String base64 = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getBase64() {
    return base64;
  }
  public void setBase64(String base64) {
    this.base64 = base64;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64 {\n");
    
    sb.append("  base64: ").append(base64).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
