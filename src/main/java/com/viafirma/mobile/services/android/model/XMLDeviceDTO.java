package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class XMLDeviceDTO  implements Serializable {
  
  @SerializedName("app")
  private String app = null;
  @SerializedName("manufacturer")
  private String manufacturer = null;
  @SerializedName("model")
  private String model = null;
  @SerializedName("osVersion")
  private String osVersion = null;
  @SerializedName("ip")
  private String ip = null;

  
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
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XMLDeviceDTO {\n");
    
    sb.append("  app: ").append(app).append("\n");
    sb.append("  manufacturer: ").append(manufacturer).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  osVersion: ").append(osVersion).append("\n");
    sb.append("  ip: ").append(ip).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
