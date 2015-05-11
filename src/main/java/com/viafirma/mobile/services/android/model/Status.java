package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Status  implements Serializable {
  
  @SerializedName("current")
  private String current = null;
  @SerializedName("next")
  private String next = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCurrent() {
    return current;
  }
  public void setCurrent(String current) {
    this.current = current;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("  current: ").append(current).append("\n");
    sb.append("  next: ").append(next).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
