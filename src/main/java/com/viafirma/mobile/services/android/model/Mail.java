package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.MailConfig;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Mail  implements Serializable {
  
  @SerializedName("from")
  private MailConfig from = null;
  @SerializedName("fromName")
  private MailConfig fromName = null;
  @SerializedName("to")
  private MailConfig to = null;
  @SerializedName("subject")
  private MailConfig subject = null;
  @SerializedName("replyTo")
  private MailConfig replyTo = null;
  @SerializedName("cc")
  private MailConfig cc = null;
  @SerializedName("bcc")
  private MailConfig bcc = null;
  @SerializedName("text")
  private MailConfig text = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public MailConfig getFrom() {
    return from;
  }
  public void setFrom(MailConfig from) {
    this.from = from;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public MailConfig getFromName() {
    return fromName;
  }
  public void setFromName(MailConfig fromName) {
    this.fromName = fromName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public MailConfig getTo() {
    return to;
  }
  public void setTo(MailConfig to) {
    this.to = to;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public MailConfig getSubject() {
    return subject;
  }
  public void setSubject(MailConfig subject) {
    this.subject = subject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public MailConfig getReplyTo() {
    return replyTo;
  }
  public void setReplyTo(MailConfig replyTo) {
    this.replyTo = replyTo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public MailConfig getCc() {
    return cc;
  }
  public void setCc(MailConfig cc) {
    this.cc = cc;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public MailConfig getBcc() {
    return bcc;
  }
  public void setBcc(MailConfig bcc) {
    this.bcc = bcc;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public MailConfig getText() {
    return text;
  }
  public void setText(MailConfig text) {
    this.text = text;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mail {\n");
    
    sb.append("  from: ").append(from).append("\n");
    sb.append("  fromName: ").append(fromName).append("\n");
    sb.append("  to: ").append(to).append("\n");
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("  replyTo: ").append(replyTo).append("\n");
    sb.append("  cc: ").append(cc).append("\n");
    sb.append("  bcc: ").append(bcc).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
