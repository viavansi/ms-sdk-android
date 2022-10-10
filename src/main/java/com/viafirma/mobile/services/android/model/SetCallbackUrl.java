package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class SetCallbackUrl  implements Serializable {
  
  @SerializedName("setCode")
  private String setCode = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("authorization")
  private String authorization = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSetCode() {
    return setCode;
  }
  public void setSetCode(String setCode) {
    this.setCode = setCode;
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
  public String getAuthorization() {
    return authorization;
  }
  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCallbackUrl {\n");
    
    sb.append("  setCode: ").append(setCode).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  authorization: ").append(authorization).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
