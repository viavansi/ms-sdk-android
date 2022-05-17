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
  @SerializedName("memoryLimit")
  private String memoryLimit = null;
  @SerializedName("cpuLimit")
  private String cpuLimit = null;
  @SerializedName("threadsCount")
  private Long threadsCount = null;
  @SerializedName("tasksCount")
  private Long tasksCount = null;

  
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMemoryLimit() {
    return memoryLimit;
  }
  public void setMemoryLimit(String memoryLimit) {
    this.memoryLimit = memoryLimit;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCpuLimit() {
    return cpuLimit;
  }
  public void setCpuLimit(String cpuLimit) {
    this.cpuLimit = cpuLimit;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getThreadsCount() {
    return threadsCount;
  }
  public void setThreadsCount(Long threadsCount) {
    this.threadsCount = threadsCount;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getTasksCount() {
    return tasksCount;
  }
  public void setTasksCount(Long tasksCount) {
    this.tasksCount = tasksCount;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfo {\n");
    
    sb.append("  loadAverage: ").append(loadAverage).append("\n");
    sb.append("  memory: ").append(memory).append("\n");
    sb.append("  cpu: ").append(cpu).append("\n");
    sb.append("  memoryLimit: ").append(memoryLimit).append("\n");
    sb.append("  cpuLimit: ").append(cpuLimit).append("\n");
    sb.append("  threadsCount: ").append(threadsCount).append("\n");
    sb.append("  tasksCount: ").append(tasksCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
