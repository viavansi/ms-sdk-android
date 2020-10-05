package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageSetList  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("link")
  private String link = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("recipientStatus")
  private String recipientStatus = null;
  @SerializedName("auditTrailPage")
  private String auditTrailPage = null;
  @SerializedName("languageId")
  private String languageId = null;

  
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
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
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
  public String getRecipientStatus() {
    return recipientStatus;
  }
  public void setRecipientStatus(String recipientStatus) {
    this.recipientStatus = recipientStatus;
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
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSetList {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  recipientStatus: ").append(recipientStatus).append("\n");
    sb.append("  auditTrailPage: ").append(auditTrailPage).append("\n");
    sb.append("  languageId: ").append(languageId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
