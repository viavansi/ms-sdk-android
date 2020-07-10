package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Style  implements Serializable {
  
  @SerializedName("emailTemplateActionFile")
  private String emailTemplateActionFile = null;
  @SerializedName("emailTemplateFile")
  private String emailTemplateFile = null;
  @SerializedName("styleFile")
  private String styleFile = null;
  @SerializedName("smsImage")
  private String smsImage = null;
  @SerializedName("mailImage")
  private String mailImage = null;
  @SerializedName("checkImage")
  private String checkImage = null;
  @SerializedName("fingerprintImage")
  private String fingerprintImage = null;
  @SerializedName("identicaImage")
  private String identicaImage = null;
  @SerializedName("questionImage")
  private String questionImage = null;
  @SerializedName("jsonStyleFile")
  private String jsonStyleFile = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEmailTemplateActionFile() {
    return emailTemplateActionFile;
  }
  public void setEmailTemplateActionFile(String emailTemplateActionFile) {
    this.emailTemplateActionFile = emailTemplateActionFile;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEmailTemplateFile() {
    return emailTemplateFile;
  }
  public void setEmailTemplateFile(String emailTemplateFile) {
    this.emailTemplateFile = emailTemplateFile;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getStyleFile() {
    return styleFile;
  }
  public void setStyleFile(String styleFile) {
    this.styleFile = styleFile;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSmsImage() {
    return smsImage;
  }
  public void setSmsImage(String smsImage) {
    this.smsImage = smsImage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMailImage() {
    return mailImage;
  }
  public void setMailImage(String mailImage) {
    this.mailImage = mailImage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCheckImage() {
    return checkImage;
  }
  public void setCheckImage(String checkImage) {
    this.checkImage = checkImage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFingerprintImage() {
    return fingerprintImage;
  }
  public void setFingerprintImage(String fingerprintImage) {
    this.fingerprintImage = fingerprintImage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIdenticaImage() {
    return identicaImage;
  }
  public void setIdenticaImage(String identicaImage) {
    this.identicaImage = identicaImage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getQuestionImage() {
    return questionImage;
  }
  public void setQuestionImage(String questionImage) {
    this.questionImage = questionImage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getJsonStyleFile() {
    return jsonStyleFile;
  }
  public void setJsonStyleFile(String jsonStyleFile) {
    this.jsonStyleFile = jsonStyleFile;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Style {\n");
    
    sb.append("  emailTemplateActionFile: ").append(emailTemplateActionFile).append("\n");
    sb.append("  emailTemplateFile: ").append(emailTemplateFile).append("\n");
    sb.append("  styleFile: ").append(styleFile).append("\n");
    sb.append("  smsImage: ").append(smsImage).append("\n");
    sb.append("  mailImage: ").append(mailImage).append("\n");
    sb.append("  checkImage: ").append(checkImage).append("\n");
    sb.append("  fingerprintImage: ").append(fingerprintImage).append("\n");
    sb.append("  identicaImage: ").append(identicaImage).append("\n");
    sb.append("  questionImage: ").append(questionImage).append("\n");
    sb.append("  jsonStyleFile: ").append(jsonStyleFile).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
