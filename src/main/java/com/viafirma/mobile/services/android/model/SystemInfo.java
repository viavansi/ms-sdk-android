package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class SystemInfo  implements Serializable {
  
  @SerializedName("loadAverage")
  private String loadAverage = null;
  @SerializedName("memory")
  private String memory = null;
  @SerializedName("cpu")
  private String cpu = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLoadAverage() {
    return loadAverage;
  }
  public void setLoadAverage(String loadAverage) {
    this.loadAverage = loadAverage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMemory() {
    return memory;
  }
  public void setMemory(String memory) {
    this.memory = memory;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCpu() {
    return cpu;
  }
  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfo {\n");
    
    sb.append("  loadAverage: ").append(loadAverage).append("\n");
    sb.append("  memory: ").append(memory).append("\n");
    sb.append("  cpu: ").append(cpu).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
