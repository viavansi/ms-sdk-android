package com.viafirma.mobile.services.android.model;

import java.util.*;
import com.viafirma.mobile.services.android.model.MessageSummary;
import java.util.Date;
import com.viafirma.mobile.services.android.model.RecipientLink;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageSetResponse  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("links")
  private List<RecipientLink> links = new ArrayList<RecipientLink>() ;
  @SerializedName("externalCode")
  private String externalCode = null;
  @SerializedName("externalStatus")
  private String externalStatus = null;
  @SerializedName("groupCode")
  private String groupCode = null;
  @SerializedName("commentReject")
  private String commentReject = null;
  @SerializedName("creationDate")
  private Date creationDate = null;
  @SerializedName("updateDate")
  private Date updateDate = null;
  @SerializedName("expirationDate")
  private Date expirationDate = null;
  @SerializedName("userName")
  private String userName = null;
  @SerializedName("groupTitle")
  private String groupTitle = null;
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
  public String getGroupCode() {
    return groupCode;
  }
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCommentReject() {
    return commentReject;
  }
  public void setCommentReject(String commentReject) {
    this.commentReject = commentReject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getGroupTitle() {
    return groupTitle;
  }
  public void setGroupTitle(String groupTitle) {
    this.groupTitle = groupTitle;
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
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  links: ").append(links).append("\n");
    sb.append("  externalCode: ").append(externalCode).append("\n");
    sb.append("  externalStatus: ").append(externalStatus).append("\n");
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  commentReject: ").append(commentReject).append("\n");
    sb.append("  creationDate: ").append(creationDate).append("\n");
    sb.append("  updateDate: ").append(updateDate).append("\n");
    sb.append("  expirationDate: ").append(expirationDate).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  groupTitle: ").append(groupTitle).append("\n");
    sb.append("  messages: ").append(messages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
