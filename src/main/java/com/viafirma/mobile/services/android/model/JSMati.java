package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.JSMatiDetails;
import java.util.*;
import com.viafirma.mobile.services.android.model.JSMatiStep;
import java.util.Map;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class JSMati  implements Serializable {
  
  @SerializedName("eventName")
  private String eventName = null;
  @SerializedName("details")
  private JSMatiDetails details = null;
  @SerializedName("identityStatus")
  private String identityStatus = null;
  @SerializedName("matiDashboardUrl")
  private String matiDashboardUrl = null;
  @SerializedName("metadata")
  private Map<String, String> metadata = new HashMap<String, String>() ;
  @SerializedName("resource")
  private String resource = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("timestamp")
  private String timestamp = null;
  @SerializedName("step")
  private JSMatiStep step = null;
  @SerializedName("flowId")
  private String flowId = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public JSMatiDetails getDetails() {
    return details;
  }
  public void setDetails(JSMatiDetails details) {
    this.details = details;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIdentityStatus() {
    return identityStatus;
  }
  public void setIdentityStatus(String identityStatus) {
    this.identityStatus = identityStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMatiDashboardUrl() {
    return matiDashboardUrl;
  }
  public void setMatiDashboardUrl(String matiDashboardUrl) {
    this.matiDashboardUrl = matiDashboardUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getResource() {
    return resource;
  }
  public void setResource(String resource) {
    this.resource = resource;
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
  public String getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public JSMatiStep getStep() {
    return step;
  }
  public void setStep(JSMatiStep step) {
    this.step = step;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFlowId() {
    return flowId;
  }
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSMati {\n");
    
    sb.append("  eventName: ").append(eventName).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("  identityStatus: ").append(identityStatus).append("\n");
    sb.append("  matiDashboardUrl: ").append(matiDashboardUrl).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  resource: ").append(resource).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  step: ").append(step).append("\n");
    sb.append("  flowId: ").append(flowId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
