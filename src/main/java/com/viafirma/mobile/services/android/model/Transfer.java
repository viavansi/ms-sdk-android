package com.viafirma.mobile.services.android.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Transfer  implements Serializable {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("transferDate")
  private Date transferDate = null;
  @SerializedName("error")
  private String error = null;
  @SerializedName("response")
  private String response = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getTransferDate() {
    return transferDate;
  }
  public void setTransferDate(Date transferDate) {
    this.transferDate = transferDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getResponse() {
    return response;
  }
  public void setResponse(String response) {
    this.response = response;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  transferDate: ").append(transferDate).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  response: ").append(response).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
