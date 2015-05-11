package com.viafirma.mobile.android.model;

import java.util.Date;
import com.viafirma.mobile.android.model.ErrorResponse;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class EventHistory  implements Serializable {
  
  @SerializedName("start")
  private Date start = null;
  @SerializedName("ends")
  private Date ends = null;
  @SerializedName("taskName")
  private String taskName = null;
  @SerializedName("order")
  private Integer order = null;
  @SerializedName("error")
  private ErrorResponse error = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getEnds() {
    return ends;
  }
  public void setEnds(Date ends) {
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
