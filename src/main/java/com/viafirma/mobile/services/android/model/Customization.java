package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Customization  implements Serializable {
  
  @SerializedName("mailFrom")
  private String mailFrom = null;
  @SerializedName("smsFrom")
  private String smsFrom = null;
  @SerializedName("requestMailSubject")
  private String requestMailSubject = null;
  @SerializedName("requestMailBody")
  private String requestMailBody = null;
  @SerializedName("requestSmsBody")
  private String requestSmsBody = null;
  @SerializedName("callbackMailSuccessSubject")
  private String callbackMailSuccessSubject = null;
  @SerializedName("callbackMailSuccessBody")
  private String callbackMailSuccessBody = null;
  @SerializedName("callbackMailExpiredSubject")
  private String callbackMailExpiredSubject = null;
  @SerializedName("callbackMailExpiredBody")
  private String callbackMailExpiredBody = null;
  @SerializedName("callbackMailWaitingCheckSubject")
  private String callbackMailWaitingCheckSubject = null;
  @SerializedName("callbackMailWaitingCheckBody")
  private String callbackMailWaitingCheckBody = null;
  @SerializedName("callbackMailRejectedSubject")
  private String callbackMailRejectedSubject = null;
  @SerializedName("callbackMailRejectedBody")
  private String callbackMailRejectedBody = null;
  @SerializedName("callbackMailErrorSubject")
  private String callbackMailErrorSubject = null;
  @SerializedName("callbackMailErrorBody")
  private String callbackMailErrorBody = null;
  @SerializedName("callbackSmsReminderBody")
  private String callbackSmsReminderBody = null;
  @SerializedName("callbackMailReminderBody")
  private String callbackMailReminderBody = null;
  @SerializedName("callbackMailReminderSubject")
  private String callbackMailReminderSubject = null;
  @SerializedName("successMessage")
  private String successMessage = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMailFrom() {
    return mailFrom;
  }
  public void setMailFrom(String mailFrom) {
    this.mailFrom = mailFrom;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSmsFrom() {
    return smsFrom;
  }
  public void setSmsFrom(String smsFrom) {
    this.smsFrom = smsFrom;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRequestMailSubject() {
    return requestMailSubject;
  }
  public void setRequestMailSubject(String requestMailSubject) {
    this.requestMailSubject = requestMailSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRequestMailBody() {
    return requestMailBody;
  }
  public void setRequestMailBody(String requestMailBody) {
    this.requestMailBody = requestMailBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRequestSmsBody() {
    return requestSmsBody;
  }
  public void setRequestSmsBody(String requestSmsBody) {
    this.requestSmsBody = requestSmsBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailSuccessSubject() {
    return callbackMailSuccessSubject;
  }
  public void setCallbackMailSuccessSubject(String callbackMailSuccessSubject) {
    this.callbackMailSuccessSubject = callbackMailSuccessSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailSuccessBody() {
    return callbackMailSuccessBody;
  }
  public void setCallbackMailSuccessBody(String callbackMailSuccessBody) {
    this.callbackMailSuccessBody = callbackMailSuccessBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailExpiredSubject() {
    return callbackMailExpiredSubject;
  }
  public void setCallbackMailExpiredSubject(String callbackMailExpiredSubject) {
    this.callbackMailExpiredSubject = callbackMailExpiredSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailExpiredBody() {
    return callbackMailExpiredBody;
  }
  public void setCallbackMailExpiredBody(String callbackMailExpiredBody) {
    this.callbackMailExpiredBody = callbackMailExpiredBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailWaitingCheckSubject() {
    return callbackMailWaitingCheckSubject;
  }
  public void setCallbackMailWaitingCheckSubject(String callbackMailWaitingCheckSubject) {
    this.callbackMailWaitingCheckSubject = callbackMailWaitingCheckSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailWaitingCheckBody() {
    return callbackMailWaitingCheckBody;
  }
  public void setCallbackMailWaitingCheckBody(String callbackMailWaitingCheckBody) {
    this.callbackMailWaitingCheckBody = callbackMailWaitingCheckBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailRejectedSubject() {
    return callbackMailRejectedSubject;
  }
  public void setCallbackMailRejectedSubject(String callbackMailRejectedSubject) {
    this.callbackMailRejectedSubject = callbackMailRejectedSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailRejectedBody() {
    return callbackMailRejectedBody;
  }
  public void setCallbackMailRejectedBody(String callbackMailRejectedBody) {
    this.callbackMailRejectedBody = callbackMailRejectedBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailErrorSubject() {
    return callbackMailErrorSubject;
  }
  public void setCallbackMailErrorSubject(String callbackMailErrorSubject) {
    this.callbackMailErrorSubject = callbackMailErrorSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailErrorBody() {
    return callbackMailErrorBody;
  }
  public void setCallbackMailErrorBody(String callbackMailErrorBody) {
    this.callbackMailErrorBody = callbackMailErrorBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackSmsReminderBody() {
    return callbackSmsReminderBody;
  }
  public void setCallbackSmsReminderBody(String callbackSmsReminderBody) {
    this.callbackSmsReminderBody = callbackSmsReminderBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailReminderBody() {
    return callbackMailReminderBody;
  }
  public void setCallbackMailReminderBody(String callbackMailReminderBody) {
    this.callbackMailReminderBody = callbackMailReminderBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailReminderSubject() {
    return callbackMailReminderSubject;
  }
  public void setCallbackMailReminderSubject(String callbackMailReminderSubject) {
    this.callbackMailReminderSubject = callbackMailReminderSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSuccessMessage() {
    return successMessage;
  }
  public void setSuccessMessage(String successMessage) {
    this.successMessage = successMessage;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customization {\n");
    
    sb.append("  mailFrom: ").append(mailFrom).append("\n");
    sb.append("  smsFrom: ").append(smsFrom).append("\n");
    sb.append("  requestMailSubject: ").append(requestMailSubject).append("\n");
    sb.append("  requestMailBody: ").append(requestMailBody).append("\n");
    sb.append("  requestSmsBody: ").append(requestSmsBody).append("\n");
    sb.append("  callbackMailSuccessSubject: ").append(callbackMailSuccessSubject).append("\n");
    sb.append("  callbackMailSuccessBody: ").append(callbackMailSuccessBody).append("\n");
    sb.append("  callbackMailExpiredSubject: ").append(callbackMailExpiredSubject).append("\n");
    sb.append("  callbackMailExpiredBody: ").append(callbackMailExpiredBody).append("\n");
    sb.append("  callbackMailWaitingCheckSubject: ").append(callbackMailWaitingCheckSubject).append("\n");
    sb.append("  callbackMailWaitingCheckBody: ").append(callbackMailWaitingCheckBody).append("\n");
    sb.append("  callbackMailRejectedSubject: ").append(callbackMailRejectedSubject).append("\n");
    sb.append("  callbackMailRejectedBody: ").append(callbackMailRejectedBody).append("\n");
    sb.append("  callbackMailErrorSubject: ").append(callbackMailErrorSubject).append("\n");
    sb.append("  callbackMailErrorBody: ").append(callbackMailErrorBody).append("\n");
    sb.append("  callbackSmsReminderBody: ").append(callbackSmsReminderBody).append("\n");
    sb.append("  callbackMailReminderBody: ").append(callbackMailReminderBody).append("\n");
    sb.append("  callbackMailReminderSubject: ").append(callbackMailReminderSubject).append("\n");
    sb.append("  successMessage: ").append(successMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
