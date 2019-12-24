package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Property  implements Serializable {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("value")
  private String value = null;
  @SerializedName("admin")
  private Boolean admin = Boolean.FALSE;

  
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
  @ApiModelProperty(required = true, value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAdmin() {
    return admin;
  }
  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Property {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  admin: ").append(admin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
