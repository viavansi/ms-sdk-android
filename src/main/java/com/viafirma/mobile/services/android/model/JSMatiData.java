package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class JSMatiData  implements Serializable {
  
  @SerializedName("nationalId")
  private Boolean nationalId = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getNationalId() {
    return nationalId;
  }
  public void setNationalId(Boolean nationalId) {
    this.nationalId = nationalId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSMatiData {\n");
    
    sb.append("  nationalId: ").append(nationalId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
