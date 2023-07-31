package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageDevice  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("recipientKey")
  private String recipientKey = null;
  @SerializedName("deviceCode")
  private String deviceCode = null;
  @SerializedName("userCode")
  private String userCode = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getRecipientKey() {
    return recipientKey;
  }
  public void setRecipientKey(String recipientKey) {
    this.recipientKey = recipientKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDeviceCode() {
    return deviceCode;
  }
  public void setDeviceCode(String deviceCode) {
    this.deviceCode = deviceCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUserCode() {
    return userCode;
  }
  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDevice {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  recipientKey: ").append(recipientKey).append("\n");
    sb.append("  deviceCode: ").append(deviceCode).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
