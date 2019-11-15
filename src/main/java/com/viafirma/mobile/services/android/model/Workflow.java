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
    sb.append("}\n");
    return sb.toString();
  }
}
