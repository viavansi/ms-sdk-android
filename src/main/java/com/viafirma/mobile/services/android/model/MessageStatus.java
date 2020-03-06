package com.viafirma.mobile.services.android.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageStatus  implements Serializable {
  
  public enum StatusEnum {
     DELETED,  EXPIRED,  ERROR,  REJECTED,  TRANSFERRED,  RESPONSED,  SERVER_SIGN,  SENT,  SIGNED,  WAITING,  COMMITTED,  RECEIVED,  TEMPORAL_STORED,  STAND_BY,  WAITING_CHECK,  APPROVED,  FINISHED,  WAITING_OCR,  WAITING_CLIENT_SIGNATURE,  MAX_ERROR_REACHED,  ATTACHMENT_VERIFICATION,  TRANSFER_CANCELED,  SAVED,  INVALID,  WAITING_EXTERNAL_APPROVAL,  WORKFLOW_PROCESS, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("lastUpdated")
  private Date lastUpdated = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStatus {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  lastUpdated: ").append(lastUpdated).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
