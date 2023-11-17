package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class RecipientLink  implements Serializable {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("link")
  private String link = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("mail")
  private String mail = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("userCode")
  private String userCode = null;
  @SerializedName("order")
  private Integer order = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
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
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
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
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientLink {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  mail: ").append(mail).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
