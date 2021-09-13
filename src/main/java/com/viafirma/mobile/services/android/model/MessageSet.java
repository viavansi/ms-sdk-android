package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Message;
import com.viafirma.mobile.services.android.model.Customization;
import com.viafirma.mobile.services.android.model.Param;
import com.viafirma.mobile.services.android.model.Recipient;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageSet  implements Serializable {
  
  @SerializedName("groupCode")
  private String groupCode = null;
  @SerializedName("expires")
  private Long expires = null;
  @SerializedName("retryTime")
  private Long retryTime = null;
  @SerializedName("retryCount")
  private Long retryCount = null;
  @SerializedName("externalCode")
  private String externalCode = null;
  @SerializedName("externalStatus")
  private String externalStatus = null;
  @SerializedName("userCode")
  private String userCode = null;
  @SerializedName("recipients")
  private List<Recipient> recipients = new ArrayList<Recipient>() ;
  @SerializedName("customization")
  private Customization customization = null;
  @SerializedName("messages")
  private List<Message> messages = new ArrayList<Message>() ;
  @SerializedName("metadataList")
  private List<Param> metadataList = new ArrayList<Param>() ;
  @SerializedName("messagesStep")
  private Integer messagesStep = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getGroupCode() {
    return groupCode;
  }
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  
  /**
   * epoch timestamp in milliseconds
   **/
  @ApiModelProperty(required = false, value = "epoch timestamp in milliseconds")
  public Long getExpires() {
    return expires;
  }
  public void setExpires(Long expires) {
    this.expires = expires;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getRetryTime() {
    return retryTime;
  }
  public void setRetryTime(Long retryTime) {
    this.retryTime = retryTime;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getRetryCount() {
    return retryCount;
  }
  public void setRetryCount(Long retryCount) {
    this.retryCount = retryCount;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getExternalCode() {
    return externalCode;
  }
  public void setExternalCode(String externalCode) {
    this.externalCode = externalCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getExternalStatus() {
    return externalStatus;
  }
  public void setExternalStatus(String externalStatus) {
    this.externalStatus = externalStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUserCode() {
    return userCode;
  }
  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Recipient> getRecipients() {
    return recipients;
  }
  public void setRecipients(List<Recipient> recipients) {
    this.recipients = recipients;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Customization getCustomization() {
    return customization;
  }
  public void setCustomization(Customization customization) {
    this.customization = customization;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Message> getMessages() {
    return messages;
  }
  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Param> getMetadataList() {
    return metadataList;
  }
  public void setMetadataList(List<Param> metadataList) {
    this.metadataList = metadataList;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getMessagesStep() {
    return messagesStep;
  }
  public void setMessagesStep(Integer messagesStep) {
    this.messagesStep = messagesStep;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSet {\n");
    
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("  retryTime: ").append(retryTime).append("\n");
    sb.append("  retryCount: ").append(retryCount).append("\n");
    sb.append("  externalCode: ").append(externalCode).append("\n");
    sb.append("  externalStatus: ").append(externalStatus).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  recipients: ").append(recipients).append("\n");
    sb.append("  customization: ").append(customization).append("\n");
    sb.append("  messages: ").append(messages).append("\n");
    sb.append("  metadataList: ").append(metadataList).append("\n");
    sb.append("  messagesStep: ").append(messagesStep).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
