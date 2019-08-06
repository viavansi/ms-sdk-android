package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Geolocation;
import com.viafirma.mobile.services.android.model.AuditoryMetadata;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Auditory  implements Serializable {
  
  @SerializedName("action")
  private String action = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("date")
  private Date date = null;
  @SerializedName("app")
  private String app = null;
  @SerializedName("user")
  private String user = null;
  @SerializedName("ip")
  private String ip = null;
  @SerializedName("data")
  private String data = null;
  @SerializedName("detail")
  private String detail = null;
  @SerializedName("userAgent")
  private String userAgent = null;
  @SerializedName("sessionId")
  private String sessionId = null;
  @SerializedName("geolocation")
  private Geolocation geolocation = null;
  @SerializedName("metadatas")
  private List<AuditoryMetadata> metadatas = new ArrayList<AuditoryMetadata>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
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
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getApp() {
    return app;
  }
  public void setApp(String app) {
    this.app = app;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Geolocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<AuditoryMetadata> getMetadatas() {
    return metadatas;
  }
  public void setMetadatas(List<AuditoryMetadata> metadatas) {
    this.metadatas = metadatas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auditory {\n");
    
    sb.append("  action: ").append(action).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  app: ").append(app).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  ip: ").append(ip).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  detail: ").append(detail).append("\n");
    sb.append("  userAgent: ").append(userAgent).append("\n");
    sb.append("  sessionId: ").append(sessionId).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("  metadatas: ").append(metadatas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
