package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Alive  implements Serializable {
  
  @SerializedName("isAlive")
  private String isAlive = null;
  @SerializedName("pid")
  private String pid = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIsAlive() {
    return isAlive;
  }
  public void setIsAlive(String isAlive) {
    this.isAlive = isAlive;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alive {\n");
    
    sb.append("  isAlive: ").append(isAlive).append("\n");
    sb.append("  pid: ").append(pid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
