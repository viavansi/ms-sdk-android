package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class EvidencePoint  implements Serializable {
  
  @SerializedName("x")
  private Double x = null;
  @SerializedName("y")
  private Double y = null;
  @SerializedName("pressure")
  private Double pressure = null;
  @SerializedName("milliseconds")
  private Long milliseconds = null;
  @SerializedName("penElevation")
  private Double penElevation = null;
  @SerializedName("penRotation")
  private Double penRotation = null;
  @SerializedName("penAzimuth")
  private Double penAzimuth = null;
  @SerializedName("s")
  private Boolean s = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Double getX() {
    return x;
  }
  public void setX(Double x) {
    this.x = x;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Double getY() {
    return y;
  }
  public void setY(Double y) {
    this.y = y;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Double getPressure() {
    return pressure;
  }
  public void setPressure(Double pressure) {
    this.pressure = pressure;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getMilliseconds() {
    return milliseconds;
  }
  public void setMilliseconds(Long milliseconds) {
    this.milliseconds = milliseconds;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Double getPenElevation() {
    return penElevation;
  }
  public void setPenElevation(Double penElevation) {
    this.penElevation = penElevation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Double getPenRotation() {
    return penRotation;
  }
  public void setPenRotation(Double penRotation) {
    this.penRotation = penRotation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Double getPenAzimuth() {
    return penAzimuth;
  }
  public void setPenAzimuth(Double penAzimuth) {
    this.penAzimuth = penAzimuth;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getS() {
    return s;
  }
  public void setS(Boolean s) {
    this.s = s;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidencePoint {\n");
    
    sb.append("  x: ").append(x).append("\n");
    sb.append("  y: ").append(y).append("\n");
    sb.append("  pressure: ").append(pressure).append("\n");
    sb.append("  milliseconds: ").append(milliseconds).append("\n");
    sb.append("  penElevation: ").append(penElevation).append("\n");
    sb.append("  penRotation: ").append(penRotation).append("\n");
    sb.append("  penAzimuth: ").append(penAzimuth).append("\n");
    sb.append("  s: ").append(s).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
