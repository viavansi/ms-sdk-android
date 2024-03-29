package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Recipient  implements Serializable {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("mail")
  private String mail = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("notificationType")
  private String notificationType = null;
  @SerializedName("smsType")
  private String smsType = null;
  @SerializedName("userCode")
  private String userCode = null;
  @SerializedName("id")
  private String id = null;
  public enum StatusEnum {
     PENDING,  RECEIVED,  WAITING, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("order")
  private Integer order = null;
  @SerializedName("deviceCode")
  private String deviceCode = null;
  @SerializedName("appCode")
  private String appCode = null;
  @SerializedName("presential")
  private Boolean presential = Boolean.FALSE;
  @SerializedName("label")
  private String label = null;
  @SerializedName("optional")
  private Boolean optional = Boolean.FALSE;
  @SerializedName("callbackType")
  private String callbackType = null;

  
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
  public String getNotificationType() {
    return notificationType;
  }
  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSmsType() {
    return smsType;
  }
  public void setSmsType(String smsType) {
    this.smsType = smsType;
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
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDeviceCode() {
    return deviceCode;
  }
  public void setDeviceCode(String deviceCode) {
    this.deviceCode = deviceCode;
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
  public Boolean getPresential() {
    return presential;
  }
  public void setPresential(Boolean presential) {
    this.presential = presential;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackType() {
    return callbackType;
  }
  public void setCallbackType(String callbackType) {
    this.callbackType = callbackType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipient {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  mail: ").append(mail).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  notificationType: ").append(notificationType).append("\n");
    sb.append("  smsType: ").append(smsType).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  deviceCode: ").append(deviceCode).append("\n");
    sb.append("  appCode: ").append(appCode).append("\n");
    sb.append("  presential: ").append(presential).append("\n");
    sb.append("  label: ").append(label).append("\n");
    sb.append("  optional: ").append(optional).append("\n");
    sb.append("  callbackType: ").append(callbackType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
