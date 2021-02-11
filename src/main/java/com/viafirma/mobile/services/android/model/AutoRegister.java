package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AutoRegister  implements Serializable {
  
  @SerializedName("mail")
  private String mail = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("surname")
  private String surname = null;
  @SerializedName("captchaId")
  private String captchaId = null;
  @SerializedName("remoteIp")
  private String remoteIp = null;
  @SerializedName("invitationCode")
  private String invitationCode = null;
  @SerializedName("mobile")
  private String mobile = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCaptchaId() {
    return captchaId;
  }
  public void setCaptchaId(String captchaId) {
    this.captchaId = captchaId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRemoteIp() {
    return remoteIp;
  }
  public void setRemoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getInvitationCode() {
    return invitationCode;
  }
  public void setInvitationCode(String invitationCode) {
    this.invitationCode = invitationCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMobile() {
    return mobile;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoRegister {\n");
    
    sb.append("  mail: ").append(mail).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  surname: ").append(surname).append("\n");
    sb.append("  captchaId: ").append(captchaId).append("\n");
    sb.append("  remoteIp: ").append(remoteIp).append("\n");
    sb.append("  invitationCode: ").append(invitationCode).append("\n");
    sb.append("  mobile: ").append(mobile).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
