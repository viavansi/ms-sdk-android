package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Geolocation;
import com.viafirma.mobile.services.android.model.Position;
import com.viafirma.mobile.services.android.model.EvidenceDevice;
import java.util.*;
import com.viafirma.mobile.services.android.model.EvidenceStroke;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class EvidenceSignature  implements Serializable {
  
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("policyCode")
  private String policyCode = null;
  @SerializedName("evidenceCode")
  private String evidenceCode = null;
  @SerializedName("base64Image")
  private String base64Image = null;
  @SerializedName("geolocation")
  private Geolocation geolocation = null;
  @SerializedName("device")
  private EvidenceDevice device = null;
  @SerializedName("strokes")
  private List<EvidenceStroke> strokes = new ArrayList<EvidenceStroke>() ;
  @SerializedName("signAreaHeight")
  private Integer signAreaHeight = null;
  @SerializedName("signAreaWidth")
  private Integer signAreaWidth = null;
  @SerializedName("positions")
  private List<Position> positions = new ArrayList<Position>() ;
  @SerializedName("imageQuality")
  private Integer imageQuality = null;
  @SerializedName("imageScaleFactor")
  private Integer imageScaleFactor = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPolicyCode() {
    return policyCode;
  }
  public void setPolicyCode(String policyCode) {
    this.policyCode = policyCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEvidenceCode() {
    return evidenceCode;
  }
  public void setEvidenceCode(String evidenceCode) {
    this.evidenceCode = evidenceCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getBase64Image() {
    return base64Image;
  }
  public void setBase64Image(String base64Image) {
    this.base64Image = base64Image;
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
  public EvidenceDevice getDevice() {
    return device;
  }
  public void setDevice(EvidenceDevice device) {
    this.device = device;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<EvidenceStroke> getStrokes() {
    return strokes;
  }
  public void setStrokes(List<EvidenceStroke> strokes) {
    this.strokes = strokes;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getSignAreaHeight() {
    return signAreaHeight;
  }
  public void setSignAreaHeight(Integer signAreaHeight) {
    this.signAreaHeight = signAreaHeight;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getSignAreaWidth() {
    return signAreaWidth;
  }
  public void setSignAreaWidth(Integer signAreaWidth) {
    this.signAreaWidth = signAreaWidth;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Position> getPositions() {
    return positions;
  }
  public void setPositions(List<Position> positions) {
    this.positions = positions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getImageQuality() {
    return imageQuality;
  }
  public void setImageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getImageScaleFactor() {
    return imageScaleFactor;
  }
  public void setImageScaleFactor(Integer imageScaleFactor) {
    this.imageScaleFactor = imageScaleFactor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceSignature {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  policyCode: ").append(policyCode).append("\n");
    sb.append("  evidenceCode: ").append(evidenceCode).append("\n");
    sb.append("  base64Image: ").append(base64Image).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("  device: ").append(device).append("\n");
    sb.append("  strokes: ").append(strokes).append("\n");
    sb.append("  signAreaHeight: ").append(signAreaHeight).append("\n");
    sb.append("  signAreaWidth: ").append(signAreaWidth).append("\n");
    sb.append("  positions: ").append(positions).append("\n");
    sb.append("  imageQuality: ").append(imageQuality).append("\n");
    sb.append("  imageScaleFactor: ").append(imageScaleFactor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
