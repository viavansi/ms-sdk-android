package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.PositionsMatch;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Stamper  implements Serializable {
  
  public enum TypeEnum {
     PDF417,  QR_BARCODE128,  QR,  BARCODE128,  IMAGE,  TEXT,  QR_NO_TEXT,  QR_SCALED,  CUSTOM_TEXT,  QR_REDUCED,  CSV, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum RotationEnum {
     ROTATE_90,  ROTATE_270, 
  };
  @SerializedName("rotation")
  private RotationEnum rotation = null;
  @SerializedName("width")
  private Integer width = null;
  @SerializedName("height")
  private Integer height = null;
  @SerializedName("xAxis")
  private Integer xAxis = null;
  @SerializedName("yAxis")
  private Integer yAxis = null;
  @SerializedName("page")
  private Integer page = null;
  @SerializedName("imageBase64")
  private String imageBase64 = null;
  @SerializedName("positionsKey")
  private String positionsKey = null;
  @SerializedName("timeZoneId")
  private String timeZoneId = null;
  @SerializedName("positionsMatch")
  private List<PositionsMatch> positionsMatch = new ArrayList<PositionsMatch>() ;

  
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
  public RotationEnum getRotation() {
    return rotation;
  }
  public void setRotation(RotationEnum rotation) {
    this.rotation = rotation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getXAxis() {
    return xAxis;
  }
  public void setXAxis(Integer xAxis) {
    this.xAxis = xAxis;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getYAxis() {
    return yAxis;
  }
  public void setYAxis(Integer yAxis) {
    this.yAxis = yAxis;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getImageBase64() {
    return imageBase64;
  }
  public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPositionsKey() {
    return positionsKey;
  }
  public void setPositionsKey(String positionsKey) {
    this.positionsKey = positionsKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<PositionsMatch> getPositionsMatch() {
    return positionsMatch;
  }
  public void setPositionsMatch(List<PositionsMatch> positionsMatch) {
    this.positionsMatch = positionsMatch;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stamper {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  rotation: ").append(rotation).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  xAxis: ").append(xAxis).append("\n");
    sb.append("  yAxis: ").append(yAxis).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  imageBase64: ").append(imageBase64).append("\n");
    sb.append("  positionsKey: ").append(positionsKey).append("\n");
    sb.append("  timeZoneId: ").append(timeZoneId).append("\n");
    sb.append("  positionsMatch: ").append(positionsMatch).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
