package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ResetPassword  implements Serializable {
  
  @SerializedName("mail")
  private String mail = null;
  @SerializedName("groupCode")
  private String groupCode = null;
  @SerializedName("captchaId")
  private String captchaId = null;
  @SerializedName("remoteIp")
  private String remoteIp = null;

  
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
  public String getGroupCode() {
    return groupCode;
  }
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPassword {\n");
    
    sb.append("  mail: ").append(mail).append("\n");
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  captchaId: ").append(captchaId).append("\n");
    sb.append("  remoteIp: ").append(remoteIp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
