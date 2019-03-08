package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Policy;
import com.viafirma.mobile.services.android.model.Auditory;
import com.viafirma.mobile.services.android.model.Param;
import com.viafirma.mobile.services.android.model.Workflow;
import java.util.*;
import com.viafirma.mobile.services.android.model.Document;
import com.viafirma.mobile.services.android.model.Notification;
import java.util.Date;
import com.viafirma.mobile.services.android.model.ErrorResponse;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Message  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("externalCode")
  private String externalCode = null;
  @SerializedName("externalStatus")
  private String externalStatus = null;
  @SerializedName("disabled")
  private Boolean disabled = Boolean.FALSE;
  @SerializedName("userCode")
  private String userCode = null;
  @SerializedName("groupCode")
  private String groupCode = null;
  @SerializedName("appCode")
  private String appCode = null;
  @SerializedName("version")
  private String version = null;
  @SerializedName("workflow")
  private Workflow workflow = null;
  @SerializedName("notification")
  private Notification notification = null;
  @SerializedName("document")
  private Document document = null;
  @SerializedName("metadataList")
  private List<Param> metadataList = new ArrayList<Param>() ;
  @SerializedName("policies")
  private List<Policy> policies = new ArrayList<Policy>() ;
  @SerializedName("callbackURL")
  private String callbackURL = null;
  @SerializedName("callbackMails")
  private String callbackMails = null;
  @SerializedName("callbackCheckListMails")
  private String callbackCheckListMails = null;
  @SerializedName("callbackMailsFormKeys")
  private List<String> callbackMailsFormKeys = new ArrayList<String>() ;
  @SerializedName("callbackMailFilename")
  private String callbackMailFilename = null;
  @SerializedName("callbackAuthorization")
  private String callbackAuthorization = null;
  @SerializedName("error")
  private ErrorResponse error = null;
  @SerializedName("pid")
  private String pid = null;
  @SerializedName("server")
  private String server = null;
  @SerializedName("processTimeExpired")
  private Date processTimeExpired = null;
  @SerializedName("commentReject")
  private String commentReject = null;
  @SerializedName("callbackResponse")
  private String callbackResponse = null;
  @SerializedName("auditory")
  private List<Auditory> auditory = new ArrayList<Auditory>() ;

  
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
  public Boolean getDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
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
  public String getGroupCode() {
    return groupCode;
  }
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAppCode() {
    return appCode;
  }
  public void setAppCode(String appCode) {
    this.appCode = appCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Workflow getWorkflow() {
    return workflow;
  }
  public void setWorkflow(Workflow workflow) {
    this.workflow = workflow;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Notification getNotification() {
    return notification;
  }
  public void setNotification(Notification notification) {
    this.notification = notification;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Document getDocument() {
    return document;
  }
  public void setDocument(Document document) {
    this.document = document;
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
  public List<Policy> getPolicies() {
    return policies;
  }
  public void setPolicies(List<Policy> policies) {
    this.policies = policies;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackURL() {
    return callbackURL;
  }
  public void setCallbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMails() {
    return callbackMails;
  }
  public void setCallbackMails(String callbackMails) {
    this.callbackMails = callbackMails;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackCheckListMails() {
    return callbackCheckListMails;
  }
  public void setCallbackCheckListMails(String callbackCheckListMails) {
    this.callbackCheckListMails = callbackCheckListMails;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getCallbackMailsFormKeys() {
    return callbackMailsFormKeys;
  }
  public void setCallbackMailsFormKeys(List<String> callbackMailsFormKeys) {
    this.callbackMailsFormKeys = callbackMailsFormKeys;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailFilename() {
    return callbackMailFilename;
  }
  public void setCallbackMailFilename(String callbackMailFilename) {
    this.callbackMailFilename = callbackMailFilename;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackAuthorization() {
    return callbackAuthorization;
  }
  public void setCallbackAuthorization(String callbackAuthorization) {
    this.callbackAuthorization = callbackAuthorization;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ErrorResponse getError() {
    return error;
  }
  public void setError(ErrorResponse error) {
    this.error = error;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getServer() {
    return server;
  }
  public void setServer(String server) {
    this.server = server;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getProcessTimeExpired() {
    return processTimeExpired;
  }
  public void setProcessTimeExpired(Date processTimeExpired) {
    this.processTimeExpired = processTimeExpired;
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
  public String getCallbackResponse() {
    return callbackResponse;
  }
  public void setCallbackResponse(String callbackResponse) {
    this.callbackResponse = callbackResponse;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Auditory> getAuditory() {
    return auditory;
  }
  public void setAuditory(List<Auditory> auditory) {
    this.auditory = auditory;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  externalCode: ").append(externalCode).append("\n");
    sb.append("  externalStatus: ").append(externalStatus).append("\n");
    sb.append("  disabled: ").append(disabled).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  appCode: ").append(appCode).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  workflow: ").append(workflow).append("\n");
    sb.append("  notification: ").append(notification).append("\n");
    sb.append("  document: ").append(document).append("\n");
    sb.append("  metadataList: ").append(metadataList).append("\n");
    sb.append("  policies: ").append(policies).append("\n");
    sb.append("  callbackURL: ").append(callbackURL).append("\n");
    sb.append("  callbackMails: ").append(callbackMails).append("\n");
    sb.append("  callbackCheckListMails: ").append(callbackCheckListMails).append("\n");
    sb.append("  callbackMailsFormKeys: ").append(callbackMailsFormKeys).append("\n");
    sb.append("  callbackMailFilename: ").append(callbackMailFilename).append("\n");
    sb.append("  callbackAuthorization: ").append(callbackAuthorization).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  pid: ").append(pid).append("\n");
    sb.append("  server: ").append(server).append("\n");
    sb.append("  processTimeExpired: ").append(processTimeExpired).append("\n");
    sb.append("  commentReject: ").append(commentReject).append("\n");
    sb.append("  callbackResponse: ").append(callbackResponse).append("\n");
    sb.append("  auditory: ").append(auditory).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
