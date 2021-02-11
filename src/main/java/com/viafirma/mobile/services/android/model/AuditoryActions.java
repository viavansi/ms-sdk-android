package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Auditory;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditoryActions  implements Serializable {
  
  @SerializedName("actions")
  private List<Auditory> actions = new ArrayList<Auditory>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Auditory> getActions() {
    return actions;
  }
  public void setActions(List<Auditory> actions) {
    this.actions = actions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditoryActions {\n");
    
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
