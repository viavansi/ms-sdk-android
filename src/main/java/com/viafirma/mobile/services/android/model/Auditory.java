package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Geolocation;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Auditory  implements Serializable {
  
  public enum ActionEnum {
     RECEIVED,   MAIL_SENT,   MAIL_READ,   MAIL_CALLBACK_SENT,   MAIL_CALLBACK_READ,   LOAD_REQUEST, 
  };
  @SerializedName("action")
  private ActionEnum action = null;
  @SerializedName("date")
  private Date date = null;
  @SerializedName("ip")
  private String ip = null;
  @SerializedName("data")
  private String data = null;
  @SerializedName("detail")
  private String detail = null;
  @SerializedName("geolocation")
  private Geolocation geolocation = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
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
  public Geolocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auditory {\n");
    
    sb.append("  action: ").append(action).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  ip: ").append(ip).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  detail: ").append(detail).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
