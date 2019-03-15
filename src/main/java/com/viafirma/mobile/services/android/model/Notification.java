package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Customization;
import com.viafirma.mobile.services.android.model.Device;
import com.viafirma.mobile.services.android.model.Param;
import java.util.*;
import com.viafirma.mobile.services.android.model.SharedLink;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Notification  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("validateCode")
  private String validateCode = null;
  @SerializedName("validateCodeFinish")
  private String validateCodeFinish = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("detail")
  private String detail = null;
  @SerializedName("sound")
  private String sound = null;
  public enum StatusEnum {
     SENT,  RECEIVED,  READ,  ERROR,  REJECTED,  EXPIRED,  RESENT,  DISPATCHED,  DISPOSED,  COMPLETED,  WAITING,  INVALID, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  public enum NotificationTypeEnum {
     PUSH_IOS,  PUSH_ANDROID,  CALLBACK,  CALLBACK_MAIL,  MAIL,  SMS,   MAIL_SMS, 
  };
  @SerializedName("notificationType")
  private NotificationTypeEnum notificationType = null;
  @SerializedName("location")
  private String location = null;
  @SerializedName("sharedLink")
  private SharedLink sharedLink = null;
  @SerializedName("updateDate")
  private Date updateDate = null;
  @SerializedName("retryTime")
  private Long retryTime = null;
  @SerializedName("customization")
  private Customization customization = null;
  @SerializedName("metadata")
  private List<Param> metadata = new ArrayList<Param>() ;
  @SerializedName("devices")
  private List<Device> devices = new ArrayList<Device>() ;

  
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
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValidateCode() {
    return validateCode;
  }
  public void setValidateCode(String validateCode) {
    this.validateCode = validateCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValidateCodeFinish() {
    return validateCodeFinish;
  }
  public void setValidateCodeFinish(String validateCodeFinish) {
    this.validateCodeFinish = validateCodeFinish;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSound() {
    return sound;
  }
  public void setSound(String sound) {
    this.sound = sound;
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
  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }
  public void setNotificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public SharedLink getSharedLink() {
    return sharedLink;
  }
  public void setSharedLink(SharedLink sharedLink) {
    this.sharedLink = sharedLink;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getRetryTime() {
    return retryTime;
  }
  public void setRetryTime(Long retryTime) {
    this.retryTime = retryTime;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Customization getCustomization() {
    return customization;
  }
  public void setCustomization(Customization customization) {
    this.customization = customization;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Param> getMetadata() {
    return metadata;
  }
  public void setMetadata(List<Param> metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Device> getDevices() {
    return devices;
  }
  public void setDevices(List<Device> devices) {
    this.devices = devices;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  validateCode: ").append(validateCode).append("\n");
    sb.append("  validateCodeFinish: ").append(validateCodeFinish).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  detail: ").append(detail).append("\n");
    sb.append("  sound: ").append(sound).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  notificationType: ").append(notificationType).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  sharedLink: ").append(sharedLink).append("\n");
    sb.append("  updateDate: ").append(updateDate).append("\n");
    sb.append("  retryTime: ").append(retryTime).append("\n");
    sb.append("  customization: ").append(customization).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  devices: ").append(devices).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
