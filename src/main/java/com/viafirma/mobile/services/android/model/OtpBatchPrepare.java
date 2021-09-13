package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class OtpBatchPrepare  implements Serializable {
  
  @SerializedName("operationCode")
  private String operationCode = null;
  @SerializedName("expires")
  private String expires = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getOperationCode() {
    return operationCode;
  }
  public void setOperationCode(String operationCode) {
    this.operationCode = operationCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getExpires() {
    return expires;
  }
  public void setExpires(String expires) {
    this.expires = expires;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpBatchPrepare {\n");
    
    sb.append("  operationCode: ").append(operationCode).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
