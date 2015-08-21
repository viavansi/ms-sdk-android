package com.viafirma.mobile.services.android.model;

import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class FormValue  implements Serializable {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("values")
  private List<String> values = new ArrayList<String>() ;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormValue {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
