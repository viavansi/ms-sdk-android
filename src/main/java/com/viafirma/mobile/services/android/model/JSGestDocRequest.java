package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class JSGestDocRequest  implements Serializable {
  
  @SerializedName("appCode")
  private String appCode = null;
  @SerializedName("userCode")
  private String userCode = null;
  @SerializedName("deviceCode")
  private String deviceCode = null;
  @SerializedName("identifier")
  private String identifier = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAppCode() {
    return appCode;
  }
  public void setAppCode(String appCode) {
    this.appCode = appCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUserCode() {
    return userCode;
  }
  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDeviceCode() {
    return deviceCode;
  }
  public void setDeviceCode(String deviceCode) {
    this.deviceCode = deviceCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSGestDocRequest {\n");
    
    sb.append("  appCode: ").append(appCode).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  deviceCode: ").append(deviceCode).append("\n");
    sb.append("  identifier: ").append(identifier).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
