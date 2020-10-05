package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Signature;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Check  implements Serializable {
  
  public enum StatusEnum {
     PENDING,  CONFIRMED,  REJECTED, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("helpText")
  private String helpText = null;
  @SerializedName("signature")
  private Signature signature = null;
  @SerializedName("validateCode")
  private String validateCode = null;
  @SerializedName("expires")
  private Long expires = null;
  @SerializedName("date")
  private Long date = null;
  @SerializedName("commentReject")
  private String commentReject = null;

  
  /**
   * (since 3.4.0, internal) check status
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0, internal) check status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * (since 3.4.0, internal) identification code
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0, internal) identification code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * (since 3.4.0) who approve the check
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) who approve the check")
  public String getHelpText() {
    return helpText;
  }
  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  
  /**
   * (since 3.4.0) signature info
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) signature info")
  public Signature getSignature() {
    return signature;
  }
  public void setSignature(Signature signature) {
    this.signature = signature;
  }

  
  /**
   * (since 3.4.0) code that allows you to execute the confirmation action
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) code that allows you to execute the confirmation action")
  public String getValidateCode() {
    return validateCode;
  }
  public void setValidateCode(String validateCode) {
    this.validateCode = validateCode;
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
   * epoch timestamp in milliseconds
   **/
  @ApiModelProperty(required = false, value = "epoch timestamp in milliseconds")
  public Long getDate() {
    return date;
  }
  public void setDate(Long date) {
    this.date = date;
  }

  
  /**
   * (since 3.4.0) check rejection reason
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) check rejection reason")
  public String getCommentReject() {
    return commentReject;
  }
  public void setCommentReject(String commentReject) {
    this.commentReject = commentReject;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Check {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  helpText: ").append(helpText).append("\n");
    sb.append("  signature: ").append(signature).append("\n");
    sb.append("  validateCode: ").append(validateCode).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  commentReject: ").append(commentReject).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
