package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.TimeZone;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class StamperDTO  implements Serializable {
  
  public enum TypeEnum {
     PDF417,  QR_BARCODE128,  QR,  BARCODE128,  IMAGE,  TEXT,  QR_NO_TEXT,  QR_SCALED,  CUSTOM_TEXT,  QR_REDUCED,  CSV,  CSV_QR,  IMAGE_TEXT,  DEFAULT, 
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
  @SerializedName("getxAxis")
  private Integer getxAxis = null;
  @SerializedName("getyAxis")
  private Integer getyAxis = null;
  @SerializedName("page")
  private Integer page = null;
  @SerializedName("csvPath")
  private String csvPath = null;
  @SerializedName("textLine1")
  private String textLine1 = null;
  @SerializedName("textLine2")
  private String textLine2 = null;
  @SerializedName("textLine3")
  private String textLine3 = null;
  @SerializedName("image")
  private List<String> image = new ArrayList<String>() ;
  @SerializedName("logo")
  private List<String> logo = new ArrayList<String>() ;
  @SerializedName("signingDate")
  private Date signingDate = null;
  @SerializedName("transparent")
  private Boolean transparent = Boolean.FALSE;
  @SerializedName("timeZone")
  private TimeZone timeZone = null;

  
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
  public Integer getGetxAxis() {
    return getxAxis;
  }
  public void setGetxAxis(Integer getxAxis) {
    this.getxAxis = getxAxis;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getGetyAxis() {
    return getyAxis;
  }
  public void setGetyAxis(Integer getyAxis) {
    this.getyAxis = getyAxis;
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
  public String getCsvPath() {
    return csvPath;
  }
  public void setCsvPath(String csvPath) {
    this.csvPath = csvPath;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTextLine1() {
    return textLine1;
  }
  public void setTextLine1(String textLine1) {
    this.textLine1 = textLine1;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTextLine2() {
    return textLine2;
  }
  public void setTextLine2(String textLine2) {
    this.textLine2 = textLine2;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTextLine3() {
    return textLine3;
  }
  public void setTextLine3(String textLine3) {
    this.textLine3 = textLine3;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getImage() {
    return image;
  }
  public void setImage(List<String> image) {
    this.image = image;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getLogo() {
    return logo;
  }
  public void setLogo(List<String> logo) {
    this.logo = logo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getSigningDate() {
    return signingDate;
  }
  public void setSigningDate(Date signingDate) {
    this.signingDate = signingDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getTransparent() {
    return transparent;
  }
  public void setTransparent(Boolean transparent) {
    this.transparent = transparent;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TimeZone getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StamperDTO {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  rotation: ").append(rotation).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  getxAxis: ").append(getxAxis).append("\n");
    sb.append("  getyAxis: ").append(getyAxis).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  csvPath: ").append(csvPath).append("\n");
    sb.append("  textLine1: ").append(textLine1).append("\n");
    sb.append("  textLine2: ").append(textLine2).append("\n");
    sb.append("  textLine3: ").append(textLine3).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("  logo: ").append(logo).append("\n");
    sb.append("  signingDate: ").append(signingDate).append("\n");
    sb.append("  transparent: ").append(transparent).append("\n");
    sb.append("  timeZone: ").append(timeZone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
