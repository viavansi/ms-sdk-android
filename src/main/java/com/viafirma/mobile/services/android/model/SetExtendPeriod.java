package com.viafirma.mobile.services.android.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class SetExtendPeriod  implements Serializable {
  
  @SerializedName("setCode")
  private String setCode = null;
  @SerializedName("expires")
  private Date expires = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSetCode() {
    return setCode;
  }
  public void setSetCode(String setCode) {
    this.setCode = setCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getExpires() {
    return expires;
  }
  public void setExpires(Date expires) {
    this.expires = expires;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetExtendPeriod {\n");
    
    sb.append("  setCode: ").append(setCode).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
