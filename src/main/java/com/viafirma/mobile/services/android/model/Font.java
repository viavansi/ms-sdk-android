package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Font  implements Serializable {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("size")
  private Integer size = null;

  
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
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Font {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
