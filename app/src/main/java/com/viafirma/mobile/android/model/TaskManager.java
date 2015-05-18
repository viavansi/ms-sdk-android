package com.viafirma.mobile.android.model;

import com.viafirma.mobile.android.model.WorkflowConfig;
import com.viafirma.mobile.android.model.Task;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class TaskManager  implements Serializable {
  
  @SerializedName("tasks")
  private List<Task> tasks = new ArrayList<Task>() ;
  @SerializedName("workflows")
  private List<WorkflowConfig> workflows = new ArrayList<WorkflowConfig>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Task> getTasks() {
    return tasks;
  }
  public void setTasks(List<Task> tasks) {
    this.tasks = tasks;
  }

  
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
    sb.append("class TaskManager {\n");
    
    sb.append("  tasks: ").append(tasks).append("\n");
    sb.append("  workflows: ").append(workflows).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
