package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Param;
import com.viafirma.mobile.services.android.model.Device;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Notification  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("validateCode")
  private String validateCode = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("detail")
  private String detail = null;
  @SerializedName("sound")
  private String sound = null;
  public enum StatusEnum {
     DISPATCHED,  DISPOSED,  READ,  RECEIVED,  COMPLETED,  REJECTED,  EXPIRED, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("location")
  private String location = null;
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
  public String getValidateCode() {
    return validateCode;
  }
  public void setValidateCode(String validateCode) {
    this.validateCode = validateCode;
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
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
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
    sb.append("  validateCode: ").append(validateCode).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  detail: ").append(detail).append("\n");
    sb.append("  sound: ").append(sound).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  devices: ").append(devices).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
