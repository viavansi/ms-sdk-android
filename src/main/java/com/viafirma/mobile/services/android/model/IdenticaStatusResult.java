package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.IdenticaOperationStatus;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class IdenticaStatusResult  implements Serializable {
  
  @SerializedName("operationStatus")
  private IdenticaOperationStatus operationStatus = null;
  @SerializedName("responseCode")
  private String responseCode = null;
  @SerializedName("responseMessage")
  private String responseMessage = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public IdenticaOperationStatus getOperationStatus() {
    return operationStatus;
  }
  public void setOperationStatus(IdenticaOperationStatus operationStatus) {
    this.operationStatus = operationStatus;
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getResponseMessage() {
    return responseMessage;
  }
  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdenticaStatusResult {\n");
    
    sb.append("  operationStatus: ").append(operationStatus).append("\n");
    sb.append("  responseCode: ").append(responseCode).append("\n");
    sb.append("  responseMessage: ").append(responseMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
