package com.viafirma.mobile.android.model;

import com.viafirma.mobile.android.model.Status;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class WorkflowConfig  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("status")
  private List<Status> status = new ArrayList<Status>() ;

  
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
  public List<Status> getStatus() {
    return status;
  }
  public void setStatus(List<Status> status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowConfig {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
