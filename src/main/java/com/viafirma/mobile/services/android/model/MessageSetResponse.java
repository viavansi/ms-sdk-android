package com.viafirma.mobile.services.android.model;

import java.util.*;
import com.viafirma.mobile.services.android.model.MessageSummary;
import com.viafirma.mobile.services.android.model.RecipientLink;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageSetResponse  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("links")
  private List<RecipientLink> links = new ArrayList<RecipientLink>() ;
  @SerializedName("externalCode")
  private String externalCode = null;
  @SerializedName("externalStatus")
  private String externalStatus = null;
  @SerializedName("messages")
  private List<MessageSummary> messages = new ArrayList<MessageSummary>() ;

  
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
  public List<RecipientLink> getLinks() {
    return links;
  }
  public void setLinks(List<RecipientLink> links) {
    this.links = links;
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
  public List<MessageSummary> getMessages() {
    return messages;
  }
  public void setMessages(List<MessageSummary> messages) {
    this.messages = messages;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSetResponse {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  links: ").append(links).append("\n");
    sb.append("  externalCode: ").append(externalCode).append("\n");
    sb.append("  externalStatus: ").append(externalStatus).append("\n");
    sb.append("  messages: ").append(messages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
