package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Log  implements Serializable {
  
  @SerializedName("user")
  private String user = null;
  @SerializedName("device")
  private String device = null;
  @SerializedName("msg")
  private String msg = null;
  public enum LevelEnum {
     DEBUG,  INFO,  ERROR,  TRACE,  WARN, 
  };
  @SerializedName("level")
  private LevelEnum level = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDevice() {
    return device;
  }
  public void setDevice(String device) {
    this.device = device;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Log {\n");
    
    sb.append("  user: ").append(user).append("\n");
    sb.append("  device: ").append(device).append("\n");
    sb.append("  msg: ").append(msg).append("\n");
    sb.append("  level: ").append(level).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
