package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.WorkflowConfig;
import java.util.*;
import com.viafirma.mobile.services.android.model.WorkflowTask;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class WorkflowManager  implements Serializable {
  
  @SerializedName("workflows")
  private List<WorkflowConfig> workflows = new ArrayList<WorkflowConfig>() ;
  @SerializedName("tasks")
  private List<WorkflowTask> tasks = new ArrayList<WorkflowTask>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<WorkflowConfig> getWorkflows() {
    return workflows;
  }
  public void setWorkflows(List<WorkflowConfig> workflows) {
    this.workflows = workflows;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<WorkflowTask> getTasks() {
    return tasks;
  }
  public void setTasks(List<WorkflowTask> tasks) {
    this.tasks = tasks;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowManager {\n");
    
    sb.append("  workflows: ").append(workflows).append("\n");
    sb.append("  tasks: ").append(tasks).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
