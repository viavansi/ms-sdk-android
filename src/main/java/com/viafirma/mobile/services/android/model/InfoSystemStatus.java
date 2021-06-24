package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.SystemStatus;
import com.viafirma.mobile.services.android.model.SystemInfo;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class InfoSystemStatus  implements Serializable {
  
  @SerializedName("date")
  private Long date = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("info")
  private List<SystemStatus> info = new ArrayList<SystemStatus>() ;
  @SerializedName("system")
  private SystemInfo system = null;
  public enum StatusEnum {
     OK,  FAIL,  UNCONFIGURED,  CHECKING, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   * epoch timestamp in milliseconds
   **/
  @ApiModelProperty(required = false, value = "epoch timestamp in milliseconds")
  public Long getDate() {
    return date;
  }
  public void setDate(Long date) {
    this.date = date;
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
  public List<SystemStatus> getInfo() {
    return info;
  }
  public void setInfo(List<SystemStatus> info) {
    this.info = info;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public SystemInfo getSystem() {
    return system;
  }
  public void setSystem(SystemInfo system) {
    this.system = system;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoSystemStatus {\n");
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  system: ").append(system).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
