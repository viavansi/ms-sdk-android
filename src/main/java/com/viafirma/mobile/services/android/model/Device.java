package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Device  implements Serializable {
  
  @SerializedName("appCode")
  private String appCode = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("locale")
  private String locale = null;
  public enum StatusEnum {
     ACTIVE,  INACTIVE, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("uniqueIdentifier")
  private String uniqueIdentifier = null;
  public enum TypeEnum {
     ANDROID,  IOS,  WINDOWS, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("userEmail")
  private String userEmail = null;
  @SerializedName("userCode")
  private String userCode = null;
  @SerializedName("userNationalId")
  private String userNationalId = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAppCode() {
    return appCode;
  }
  public void setAppCode(String appCode) {
    this.appCode = appCode;
  }

  
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
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }
  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUserEmail() {
    return userEmail;
  }
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUserNationalId() {
    return userNationalId;
  }
  public void setUserNationalId(String userNationalId) {
    this.userNationalId = userNationalId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("  appCode: ").append(appCode).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  locale: ").append(locale).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  uniqueIdentifier: ").append(uniqueIdentifier).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  userEmail: ").append(userEmail).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  userNationalId: ").append(userNationalId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
