package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class GroupUserData  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("userName")
  private String userName = null;
  @SerializedName("surname")
  private String surname = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("templates")
  private String templates = null;
  @SerializedName("sendMail")
  private Boolean sendMail = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
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
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
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
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTemplates() {
    return templates;
  }
  public void setTemplates(String templates) {
    this.templates = templates;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getSendMail() {
    return sendMail;
  }
  public void setSendMail(Boolean sendMail) {
    this.sendMail = sendMail;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUserData {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  surname: ").append(surname).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  templates: ").append(templates).append("\n");
    sb.append("  sendMail: ").append(sendMail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
