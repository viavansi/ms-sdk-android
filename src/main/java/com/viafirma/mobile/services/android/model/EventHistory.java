package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.ErrorResponse;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class EventHistory  implements Serializable {
  
  @SerializedName("start")
  private Long start = null;
  @SerializedName("ends")
  private Long ends = null;
  @SerializedName("taskName")
  private String taskName = null;
  @SerializedName("order")
  private Integer order = null;
  @SerializedName("error")
  private ErrorResponse error = null;

  
  /**
   * epoch timestamp in milliseconds
   **/
  @ApiModelProperty(required = false, value = "epoch timestamp in milliseconds")
  public Long getStart() {
    return start;
  }
  public void setStart(Long start) {
    this.start = start;
  }

  
  /**
   * epoch timestamp in milliseconds
   **/
  @ApiModelProperty(required = false, value = "epoch timestamp in milliseconds")
  public Long getEnds() {
    return ends;
  }
  public void setEnds(Long ends) {
    this.ends = ends;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTaskName() {
    return taskName;
  }
  public void setTaskName(String taskName) {
    this.taskName = taskName;
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
  public ErrorResponse getError() {
    return error;
  }
  public void setError(ErrorResponse error) {
    this.error = error;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventHistory {\n");
    
    sb.append("  start: ").append(start).append("\n");
    sb.append("  ends: ").append(ends).append("\n");
    sb.append("  taskName: ").append(taskName).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
