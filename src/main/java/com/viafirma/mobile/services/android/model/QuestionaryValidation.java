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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionaryValidation {\n");
    
    sb.append("  appId: ").append(appId).append("\n");
    sb.append("  valid: ").append(valid).append("\n");
    sb.append("  responseXML: ").append(responseXML).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
