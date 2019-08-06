package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.WorkflowConfig;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class WorkflowManager  implements Serializable {
  
  @SerializedName("workflows")
  private List<WorkflowConfig> workflows = new ArrayList<WorkflowConfig>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<WorkflowConfig> getWorkflows() {
    return workflows;
  }
  public void setWorkflows(List<WorkflowConfig> workflows) {
    this.workflows = workflows;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowManager {\n");
    
    sb.append("  workflows: ").append(workflows).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
