package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.MessageSetList;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageSetInfo  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("callbackRedirectURL")
  private String callbackRedirectURL = null;
  @SerializedName("callbackRedirectURLTargetWindow")
  private String callbackRedirectURLTargetWindow = null;
  @SerializedName("messages")
  private List<MessageSetList> messages = new ArrayList<MessageSetList>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackRedirectURL() {
    return callbackRedirectURL;
  }
  public void setCallbackRedirectURL(String callbackRedirectURL) {
    this.callbackRedirectURL = callbackRedirectURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackRedirectURLTargetWindow() {
    return callbackRedirectURLTargetWindow;
  }
  public void setCallbackRedirectURLTargetWindow(String callbackRedirectURLTargetWindow) {
    this.callbackRedirectURLTargetWindow = callbackRedirectURLTargetWindow;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<MessageSetList> getMessages() {
    return messages;
  }
  public void setMessages(List<MessageSetList> messages) {
    this.messages = messages;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSetInfo {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  callbackRedirectURL: ").append(callbackRedirectURL).append("\n");
    sb.append("  callbackRedirectURLTargetWindow: ").append(callbackRedirectURLTargetWindow).append("\n");
    sb.append("  messages: ").append(messages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
