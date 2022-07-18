package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Policy;
import com.viafirma.mobile.services.android.model.Transfer;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageSummary  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  public enum StatusEnum {
     DELETED,  EXPIRED,  ERROR,  REJECTED,  TRANSFERRED,  RESPONSED,  SERVER_SIGN,  SENT,  SIGNED,  WAITING,  COMMITTED,  RECEIVED,  TEMPORAL_STORED,  STAND_BY,  WAITING_CHECK,  APPROVED,  FINISHED,  WAITING_OCR,  WAITING_ATTACHMENTS_SIGNATURE,  WAITING_CLIENT_SIGNATURE,  WAITING_WRAP_SIGNATURE,  MAX_ERROR_REACHED,  ATTACHMENT_VERIFICATION,  TRANSFER_CANCELED,  SAVED,  INVALID,  WAITING_EXTERNAL_APPROVAL,  WORKFLOW_PROCESS, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("templateCode")
  private String templateCode = null;
  @SerializedName("policies")
  private List<Policy> policies = new ArrayList<Policy>() ;
  @SerializedName("transfers")
  private List<Transfer> transfers = new ArrayList<Transfer>() ;
  @SerializedName("languageId")
  private String languageId = null;
  @SerializedName("externalCode")
  private String externalCode = null;
  @SerializedName("commentReject")
  private String commentReject = null;

  
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
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTemplateCode() {
    return templateCode;
  }
  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
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
  public String getExternalCode() {
    return externalCode;
  }
  public void setExternalCode(String externalCode) {
    this.externalCode = externalCode;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSummary {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  templateCode: ").append(templateCode).append("\n");
    sb.append("  policies: ").append(policies).append("\n");
    sb.append("  transfers: ").append(transfers).append("\n");
    sb.append("  languageId: ").append(languageId).append("\n");
    sb.append("  externalCode: ").append(externalCode).append("\n");
    sb.append("  commentReject: ").append(commentReject).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
