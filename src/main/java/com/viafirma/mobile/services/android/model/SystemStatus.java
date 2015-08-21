package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class SystemStatus  implements Serializable {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("notification")
  private String notification = null;

  
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
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getNotification() {
    return notification;
  }
  public void setNotification(String notification) {
    this.notification = notification;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemStatus {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  notification: ").append(notification).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
