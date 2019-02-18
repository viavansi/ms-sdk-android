package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageBuild  implements Serializable {
  
  @SerializedName("messageCode")
  private String messageCode = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageBuild {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
