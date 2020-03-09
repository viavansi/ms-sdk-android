package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class QuestionaryValidation  implements Serializable {
  
  @SerializedName("appId")
  private String appId = null;
  @SerializedName("valid")
  private Boolean valid = Boolean.FALSE;
  @SerializedName("responseXML")
  private String responseXML = null;
  @SerializedName("respCurrentAttempt")
  private Long respCurrentAttempt = null;
  @SerializedName("respMaxAttempts")
  private Long respMaxAttempts = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getResponseXML() {
    return responseXML;
  }
  public void setResponseXML(String responseXML) {
    this.responseXML = responseXML;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getRespCurrentAttempt() {
    return respCurrentAttempt;
  }
  public void setRespCurrentAttempt(Long respCurrentAttempt) {
    this.respCurrentAttempt = respCurrentAttempt;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getRespMaxAttempts() {
    return respMaxAttempts;
  }
  public void setRespMaxAttempts(Long respMaxAttempts) {
    this.respMaxAttempts = respMaxAttempts;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionaryValidation {\n");
    
    sb.append("  appId: ").append(appId).append("\n");
    sb.append("  valid: ").append(valid).append("\n");
    sb.append("  responseXML: ").append(responseXML).append("\n");
    sb.append("  respCurrentAttempt: ").append(respCurrentAttempt).append("\n");
    sb.append("  respMaxAttempts: ").append(respMaxAttempts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
