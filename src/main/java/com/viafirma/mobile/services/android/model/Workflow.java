package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.EventHistory;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Workflow  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("current")
  private String current = null;
  @SerializedName("next")
  private String next = null;
  @SerializedName("history")
  private List<EventHistory> history = new ArrayList<EventHistory>() ;
  @SerializedName("initiate")
  private Date initiate = null;
  @SerializedName("lastUpdated")
  private Date lastUpdated = null;
  @SerializedName("expires")
  private Date expires = null;
  public enum TypeEnum {
     APP,  WEB,  PRESENTIAL,  SET, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("referenceCode")
  private String referenceCode = null;
  @SerializedName("step")
  private Integer step = null;
  @SerializedName("steps")
  private Integer steps = null;
  @SerializedName("nextMessageCode")
  private String nextMessageCode = null;
  @SerializedName("previousMessageCode")
  private String previousMessageCode = null;
  @SerializedName("workflowFinished")
  private Boolean workflowFinished = Boolean.FALSE;

  
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
  @ApiModelProperty(required = false, value = "")
  public String getCurrent() {
    return current;
  }
  public void setCurrent(String current) {
    this.current = current;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<EventHistory> getHistory() {
    return history;
  }
  public void setHistory(List<EventHistory> history) {
    this.history = history;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getInitiate() {
    return initiate;
  }
  public void setInitiate(Date initiate) {
    this.initiate = initiate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getReferenceCode() {
    return referenceCode;
  }
  public void setReferenceCode(String referenceCode) {
    this.referenceCode = referenceCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getStep() {
    return step;
  }
  public void setStep(Integer step) {
    this.step = step;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getSteps() {
    return steps;
  }
  public void setSteps(Integer steps) {
    this.steps = steps;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getNextMessageCode() {
    return nextMessageCode;
  }
  public void setNextMessageCode(String nextMessageCode) {
    this.nextMessageCode = nextMessageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPreviousMessageCode() {
    return previousMessageCode;
  }
  public void setPreviousMessageCode(String previousMessageCode) {
    this.previousMessageCode = previousMessageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getWorkflowFinished() {
    return workflowFinished;
  }
  public void setWorkflowFinished(Boolean workflowFinished) {
    this.workflowFinished = workflowFinished;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  current: ").append(current).append("\n");
    sb.append("  next: ").append(next).append("\n");
    sb.append("  history: ").append(history).append("\n");
    sb.append("  initiate: ").append(initiate).append("\n");
    sb.append("  lastUpdated: ").append(lastUpdated).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  referenceCode: ").append(referenceCode).append("\n");
    sb.append("  step: ").append(step).append("\n");
    sb.append("  steps: ").append(steps).append("\n");
    sb.append("  nextMessageCode: ").append(nextMessageCode).append("\n");
    sb.append("  previousMessageCode: ").append(previousMessageCode).append("\n");
    sb.append("  workflowFinished: ").append(workflowFinished).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
