package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class EvidenceDevice  implements Serializable {
  
  @SerializedName("manufacturer")
  private String manufacturer = null;
  @SerializedName("model")
  private String model = null;
  @SerializedName("osVersion")
  private String osVersion = null;
  @SerializedName("penType")
  private String penType = null;
  @SerializedName("maxPressure")
  private Double maxPressure = null;
  @SerializedName("minPressure")
  private Double minPressure = null;
  @SerializedName("ppi")
  private String ppi = null;
  @SerializedName("rotationAllowed")
  private Boolean rotationAllowed = Boolean.FALSE;
  @SerializedName("screenHeight")
  private Integer screenHeight = null;
  @SerializedName("screenWidth")
  private Integer screenWidth = null;
  @SerializedName("app")
  private String app = null;
  @SerializedName("ip")
  private String ip = null;

  
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
  public String getPenType() {
    return penType;
  }
  public void setPenType(String penType) {
    this.penType = penType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Double getMaxPressure() {
    return maxPressure;
  }
  public void setMaxPressure(Double maxPressure) {
    this.maxPressure = maxPressure;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Double getMinPressure() {
    return minPressure;
  }
  public void setMinPressure(Double minPressure) {
    this.minPressure = minPressure;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPpi() {
    return ppi;
  }
  public void setPpi(String ppi) {
    this.ppi = ppi;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getRotationAllowed() {
    return rotationAllowed;
  }
  public void setRotationAllowed(Boolean rotationAllowed) {
    this.rotationAllowed = rotationAllowed;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getScreenHeight() {
    return screenHeight;
  }
  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getScreenWidth() {
    return screenWidth;
  }
  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
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
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceDevice {\n");
    
    sb.append("  manufacturer: ").append(manufacturer).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  osVersion: ").append(osVersion).append("\n");
    sb.append("  penType: ").append(penType).append("\n");
    sb.append("  maxPressure: ").append(maxPressure).append("\n");
    sb.append("  minPressure: ").append(minPressure).append("\n");
    sb.append("  ppi: ").append(ppi).append("\n");
    sb.append("  rotationAllowed: ").append(rotationAllowed).append("\n");
    sb.append("  screenHeight: ").append(screenHeight).append("\n");
    sb.append("  screenWidth: ").append(screenWidth).append("\n");
    sb.append("  app: ").append(app).append("\n");
    sb.append("  ip: ").append(ip).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
