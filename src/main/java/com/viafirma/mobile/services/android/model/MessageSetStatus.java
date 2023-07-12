package com.viafirma.mobile.services.android.model;

import java.util.*;
import com.viafirma.mobile.services.android.model.RecipientStatus;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageSetStatus  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("recipientStatus")
  private List<RecipientStatus> recipientStatus = new ArrayList<RecipientStatus>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<RecipientStatus> getRecipientStatus() {
    return recipientStatus;
  }
  public void setRecipientStatus(List<RecipientStatus> recipientStatus) {
    this.recipientStatus = recipientStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSetStatus {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  recipientStatus: ").append(recipientStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
