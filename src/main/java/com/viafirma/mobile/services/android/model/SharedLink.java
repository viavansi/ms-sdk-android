package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class SharedLink  implements Serializable {
  
  @SerializedName("scheme")
  private String scheme = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("link")
  private String link = null;
  @SerializedName("appCode")
  private String appCode = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("subject")
  private String subject = null;
  @SerializedName("phone")
  private String phone = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getScheme() {
    return scheme;
  }
  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
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
  public String getAppCode() {
    return appCode;
  }
  public void setAppCode(String appCode) {
    this.appCode = appCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedLink {\n");
    
    sb.append("  scheme: ").append(scheme).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  appCode: ").append(appCode).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
