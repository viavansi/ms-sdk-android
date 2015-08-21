package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ErrorResponse  implements Serializable {
  
  @SerializedName("code")
  private Integer code = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("trace")
  private String trace = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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
  public String getTrace() {
    return trace;
  }
  public void setTrace(String trace) {
    this.trace = trace;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  trace: ").append(trace).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
