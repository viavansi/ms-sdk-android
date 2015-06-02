package com.viafirma.mobile.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Task  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("finalStatus")
  private Boolean finalStatus = Boolean.FALSE;
  @SerializedName("numThreads")
  private Integer numThreads = null;
  @SerializedName("cacheName")
  private String cacheName = null;
  @SerializedName("classRef")
  private String classRef = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getFinalStatus() {
    return finalStatus;
  }
  public void setFinalStatus(Boolean finalStatus) {
    this.finalStatus = finalStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getNumThreads() {
    return numThreads;
  }
  public void setNumThreads(Integer numThreads) {
    this.numThreads = numThreads;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCacheName() {
    return cacheName;
  }
  public void setCacheName(String cacheName) {
    this.cacheName = cacheName;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getClassRef() {
    return classRef;
  }
  public void setClassRef(String classRef) {
    this.classRef = classRef;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  finalStatus: ").append(finalStatus).append("\n");
    sb.append("  numThreads: ").append(numThreads).append("\n");
    sb.append("  cacheName: ").append(cacheName).append("\n");
    sb.append("  classRef: ").append(classRef).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
