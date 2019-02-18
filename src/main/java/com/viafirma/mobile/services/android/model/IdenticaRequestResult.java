package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class IdenticaRequestResult  implements Serializable {
  
  @SerializedName("responseMessage")
  private String responseMessage = null;
  @SerializedName("responseCode")
  private String responseCode = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getResponseMessage() {
    return responseMessage;
  }
  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdenticaRequestResult {\n");
    
    sb.append("  responseMessage: ").append(responseMessage).append("\n");
    sb.append("  responseCode: ").append(responseCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
