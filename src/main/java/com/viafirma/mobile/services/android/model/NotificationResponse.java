package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class NotificationResponse  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("setCode")
  private String setCode = null;
  public enum StatusEnum {
     SENT,  RECEIVED,  READ,  ERROR,  REJECTED,  EXPIRED,  RESENT,  DISPATCHED,  DISPOSED,  COMPLETED,  WAITING,  INVALID,  WAITING_CLIENT_SIGNATURE, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  public enum TypeEnum {
     PUSH_IOS,  PUSH_ANDROID,  CALLBACK,  CALLBACK_MAIL,  CALLBACK_SMS,  CALLBACK_INBOX,  MAIL,  SMS,  MAIL_SMS,  CALLBACK_CRM,  WORKFLOW_STEP, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("creationDate")
  private Long creationDate = null;
  @SerializedName("updateDate")
  private Long updateDate = null;
  @SerializedName("target")
  private String target = null;

  
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
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
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
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * epoch timestamp in milliseconds
   **/
  @ApiModelProperty(required = false, value = "epoch timestamp in milliseconds")
  public Long getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  
  /**
   * epoch timestamp in milliseconds
   **/
  @ApiModelProperty(required = false, value = "epoch timestamp in milliseconds")
  public Long getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(Long updateDate) {
    this.updateDate = updateDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationResponse {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  setCode: ").append(setCode).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  creationDate: ").append(creationDate).append("\n");
    sb.append("  updateDate: ").append(updateDate).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
