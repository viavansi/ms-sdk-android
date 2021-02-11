package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.AuditoryActions;
import com.viafirma.mobile.services.android.model.VerifierDocumentDTO;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditoryInfo  implements Serializable {
  
  @SerializedName("actions")
  private AuditoryActions actions = null;
  @SerializedName("info")
  private VerifierDocumentDTO info = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public AuditoryActions getActions() {
    return actions;
  }
  public void setActions(AuditoryActions actions) {
    this.actions = actions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public VerifierDocumentDTO getInfo() {
    return info;
  }
  public void setInfo(VerifierDocumentDTO info) {
    this.info = info;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditoryInfo {\n");
    
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
