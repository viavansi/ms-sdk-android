package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.SystemStatus;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class InfoSystemStatus  implements Serializable {
  
  @SerializedName("date")
  private String date = null;
  @SerializedName("info")
  private List<SystemStatus> info = new ArrayList<SystemStatus>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoSystemStatus {\n");
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
