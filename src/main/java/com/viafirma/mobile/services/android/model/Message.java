package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Policy;
import com.viafirma.mobile.services.android.model.Auditory;
import com.viafirma.mobile.services.android.model.Param;
import com.viafirma.mobile.services.android.model.Transfer;
import com.viafirma.mobile.services.android.model.Workflow;
import com.viafirma.mobile.services.android.model.Recipient;
import java.util.*;
import com.viafirma.mobile.services.android.model.Document;
import com.viafirma.mobile.services.android.model.Notification;
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
  @SerializedName("inboxCode")
  private String inboxCode = null;
  @SerializedName("inboxStatus")
  private String inboxStatus = null;
  @SerializedName("callbackInbox")
  private String callbackInbox = null;
  @SerializedName("callbackInboxAuthorization")
  private String callbackInboxAuthorization = null;
  @SerializedName("callbackCRM")
  private String callbackCRM = null;
  @SerializedName("callbackCRMAuthorization")
  private String callbackCRMAuthorization = null;
  @SerializedName("callbackCRMResponse")
  private String callbackCRMResponse = null;
  @SerializedName("callbackRedirectURL")
  private String callbackRedirectURL = null;
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
  @SerializedName("recipients")
  private List<Recipient> recipients = new ArrayList<Recipient>() ;
  @SerializedName("recipientStep")
  private Integer recipientStep = null;
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
  @SerializedName("callbackPhones")
  private String callbackPhones = null;
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
  private Long processTimeExpired = null;
  @SerializedName("commentReject")
  private String commentReject = null;
  @SerializedName("callbackResponse")
  private String callbackResponse = null;
  @SerializedName("auditory")
  private List<Auditory> auditory = new ArrayList<Auditory>() ;
  @SerializedName("transfers")
  private List<Transfer> transfers = new ArrayList<Transfer>() ;
  @SerializedName("languageId")
  private String languageId = null;
  @SerializedName("timeZoneId")
  private String timeZoneId = null;
  @SerializedName("setCode")
  private String setCode = null;
  @SerializedName("setStatus")
  private String setStatus = null;
  @SerializedName("signPageServer")
  private String signPageServer = null;
  @SerializedName("auditTrailPage")
  private String auditTrailPage = null;
  @SerializedName("order")
  private Integer order = null;
  @SerializedName("callbackRedirectURLTargetWindow")
  private String callbackRedirectURLTargetWindow = null;
  @SerializedName("callbackProcessMessage")
  private String callbackProcessMessage = null;

  
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
  public String getInboxCode() {
    return inboxCode;
  }
  public void setInboxCode(String inboxCode) {
    this.inboxCode = inboxCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getInboxStatus() {
    return inboxStatus;
  }
  public void setInboxStatus(String inboxStatus) {
    this.inboxStatus = inboxStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackInbox() {
    return callbackInbox;
  }
  public void setCallbackInbox(String callbackInbox) {
    this.callbackInbox = callbackInbox;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackInboxAuthorization() {
    return callbackInboxAuthorization;
  }
  public void setCallbackInboxAuthorization(String callbackInboxAuthorization) {
    this.callbackInboxAuthorization = callbackInboxAuthorization;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackCRM() {
    return callbackCRM;
  }
  public void setCallbackCRM(String callbackCRM) {
    this.callbackCRM = callbackCRM;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackCRMAuthorization() {
    return callbackCRMAuthorization;
  }
  public void setCallbackCRMAuthorization(String callbackCRMAuthorization) {
    this.callbackCRMAuthorization = callbackCRMAuthorization;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackCRMResponse() {
    return callbackCRMResponse;
  }
  public void setCallbackCRMResponse(String callbackCRMResponse) {
    this.callbackCRMResponse = callbackCRMResponse;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackRedirectURL() {
    return callbackRedirectURL;
  }
  public void setCallbackRedirectURL(String callbackRedirectURL) {
    this.callbackRedirectURL = callbackRedirectURL;
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
  public List<Recipient> getRecipients() {
    return recipients;
  }
  public void setRecipients(List<Recipient> recipients) {
    this.recipients = recipients;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getRecipientStep() {
    return recipientStep;
  }
  public void setRecipientStep(Integer recipientStep) {
    this.recipientStep = recipientStep;
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
  public String getCallbackPhones() {
    return callbackPhones;
  }
  public void setCallbackPhones(String callbackPhones) {
    this.callbackPhones = callbackPhones;
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
   * epoch timestamp in milliseconds
   **/
  @ApiModelProperty(required = false, value = "epoch timestamp in milliseconds")
  public Long getProcessTimeExpired() {
    return processTimeExpired;
  }
  public void setProcessTimeExpired(Long processTimeExpired) {
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Transfer> getTransfers() {
    return transfers;
  }
  public void setTransfers(List<Transfer> transfers) {
    this.transfers = transfers;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
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
  public String getSetStatus() {
    return setStatus;
  }
  public void setSetStatus(String setStatus) {
    this.setStatus = setStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignPageServer() {
    return signPageServer;
  }
  public void setSignPageServer(String signPageServer) {
    this.signPageServer = signPageServer;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAuditTrailPage() {
    return auditTrailPage;
  }
  public void setAuditTrailPage(String auditTrailPage) {
    this.auditTrailPage = auditTrailPage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackRedirectURLTargetWindow() {
    return callbackRedirectURLTargetWindow;
  }
  public void setCallbackRedirectURLTargetWindow(String callbackRedirectURLTargetWindow) {
    this.callbackRedirectURLTargetWindow = callbackRedirectURLTargetWindow;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackProcessMessage() {
    return callbackProcessMessage;
  }
  public void setCallbackProcessMessage(String callbackProcessMessage) {
    this.callbackProcessMessage = callbackProcessMessage;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  externalCode: ").append(externalCode).append("\n");
    sb.append("  externalStatus: ").append(externalStatus).append("\n");
    sb.append("  inboxCode: ").append(inboxCode).append("\n");
    sb.append("  inboxStatus: ").append(inboxStatus).append("\n");
    sb.append("  callbackInbox: ").append(callbackInbox).append("\n");
    sb.append("  callbackInboxAuthorization: ").append(callbackInboxAuthorization).append("\n");
    sb.append("  callbackCRM: ").append(callbackCRM).append("\n");
    sb.append("  callbackCRMAuthorization: ").append(callbackCRMAuthorization).append("\n");
    sb.append("  callbackCRMResponse: ").append(callbackCRMResponse).append("\n");
    sb.append("  callbackRedirectURL: ").append(callbackRedirectURL).append("\n");
    sb.append("  disabled: ").append(disabled).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  appCode: ").append(appCode).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  workflow: ").append(workflow).append("\n");
    sb.append("  recipients: ").append(recipients).append("\n");
    sb.append("  recipientStep: ").append(recipientStep).append("\n");
    sb.append("  notification: ").append(notification).append("\n");
    sb.append("  document: ").append(document).append("\n");
    sb.append("  metadataList: ").append(metadataList).append("\n");
    sb.append("  policies: ").append(policies).append("\n");
    sb.append("  callbackURL: ").append(callbackURL).append("\n");
    sb.append("  callbackPhones: ").append(callbackPhones).append("\n");
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
    sb.append("  transfers: ").append(transfers).append("\n");
    sb.append("  languageId: ").append(languageId).append("\n");
    sb.append("  timeZoneId: ").append(timeZoneId).append("\n");
    sb.append("  setCode: ").append(setCode).append("\n");
    sb.append("  setStatus: ").append(setStatus).append("\n");
    sb.append("  signPageServer: ").append(signPageServer).append("\n");
    sb.append("  auditTrailPage: ").append(auditTrailPage).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  callbackRedirectURLTargetWindow: ").append(callbackRedirectURLTargetWindow).append("\n");
    sb.append("  callbackProcessMessage: ").append(callbackProcessMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
