package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class CallbackUrl  implements Serializable {
  
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("authorization")
  private String authorization = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
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
    sb.append("class CallbackUrl {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  authorization: ").append(authorization).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
