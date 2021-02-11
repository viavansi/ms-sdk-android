package com.viafirma.mobile.services.android.model;

import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class X500Principal  implements Serializable {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("encoded")
  private List<String> encoded = new ArrayList<String>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getEncoded() {
    return encoded;
  }
  public void setEncoded(List<String> encoded) {
    this.encoded = encoded;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class X500Principal {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  encoded: ").append(encoded).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
