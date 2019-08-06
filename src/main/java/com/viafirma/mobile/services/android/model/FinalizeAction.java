package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Param;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class FinalizeAction  implements Serializable {
  
  public enum TypeEnum {
     MAIL,  DETAIL,  SHARE,  PRINT, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("paramList")
  private List<Param> paramList = new ArrayList<Param>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Param> getParamList() {
    return paramList;
  }
  public void setParamList(List<Param> paramList) {
    this.paramList = paramList;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalizeAction {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  paramList: ").append(paramList).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
