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
  @SerializedName("recipients")
  private List<Recipient> recipients = new ArrayList<Recipient>() ;
  @SerializedName("customization")
  private Customization customization = null;
  @SerializedName("messages")
  private List<Message> messages = new ArrayList<Message>() ;
  @SerializedName("metadataList")
  private List<Param> metadataList = new ArrayList<Param>() ;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSet {\n");
    
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  recipients: ").append(recipients).append("\n");
    sb.append("  customization: ").append(customization).append("\n");
    sb.append("  messages: ").append(messages).append("\n");
    sb.append("  metadataList: ").append(metadataList).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
