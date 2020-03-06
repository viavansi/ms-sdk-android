package com.viafirma.mobile.services.android.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageList  implements Serializable {
  
  @SerializedName("messageCode")
  private String messageCode = null;
  public enum StatusEnum {
     DELETED,  EXPIRED,  ERROR,  REJECTED,  TRANSFERRED,  RESPONSED,  SERVER_SIGN,  SENT,  SIGNED,  WAITING,  COMMITTED,  RECEIVED,  TEMPORAL_STORED,  STAND_BY,  WAITING_CHECK,  APPROVED,  FINISHED,  WAITING_OCR,  WAITING_CLIENT_SIGNATURE,  MAX_ERROR_REACHED,  ATTACHMENT_VERIFICATION,  TRANSFER_CANCELED,  SAVED,  INVALID,  WAITING_EXTERNAL_APPROVAL,  WORKFLOW_PROCESS, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("userCode")
  private String userCode = null;
  @SerializedName("groupCode")
  private String groupCode = null;
  @SerializedName("templateCode")
  private String templateCode = null;
  @SerializedName("creationDate")
  private Date creationDate = null;
  @SerializedName("externalCode")
  private String externalCode = null;
  @SerializedName("externalStatus")
  private String externalStatus = null;

  
  /**
   * (since 3.4.8, internal) message code
   **/
  @ApiModelProperty(required = true, value = "(since 3.4.8, internal) message code")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   * (since 3.4.8, internal) message status
   **/
  @ApiModelProperty(required = true, value = "(since 3.4.8, internal) message status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * (since 3.4.8, internal) user code
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.8, internal) user code")
  public String getUserCode() {
    return userCode;
  }
  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  
  /**
   * (since 3.4.8, internal) group code
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.8, internal) group code")
  public String getGroupCode() {
    return groupCode;
  }
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  
  /**
   * (since 3.4.8, internal) template code
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.8, internal) template code")
  public String getTemplateCode() {
    return templateCode;
  }
  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }

  
  /**
   * (since 3.4.8, internal) creation date
   **/
  @ApiModelProperty(required = true, value = "(since 3.4.8, internal) creation date")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  
  /**
   * (since 3.5.120, internal) external code
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.120, internal) external code")
  public String getExternalCode() {
    return externalCode;
  }
  public void setExternalCode(String externalCode) {
    this.externalCode = externalCode;
  }

  
  /**
   * (since 3.5.120, internal) external status
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.120, internal) external status")
  public String getExternalStatus() {
    return externalStatus;
  }
  public void setExternalStatus(String externalStatus) {
    this.externalStatus = externalStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageList {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  templateCode: ").append(templateCode).append("\n");
    sb.append("  creationDate: ").append(creationDate).append("\n");
    sb.append("  externalCode: ").append(externalCode).append("\n");
    sb.append("  externalStatus: ").append(externalStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
