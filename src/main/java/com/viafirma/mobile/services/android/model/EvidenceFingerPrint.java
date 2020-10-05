package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Geolocation;
import com.viafirma.mobile.services.android.model.Position;
import com.viafirma.mobile.services.android.model.EvidenceDevice;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class EvidenceFingerPrint  implements Serializable {
  
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("evidenceCode")
  private String evidenceCode = null;
  @SerializedName("base64Image")
  private String base64Image = null;
  @SerializedName("base64Template")
  private String base64Template = null;
  @SerializedName("templateAlgorithmic")
  private String templateAlgorithmic = null;
  @SerializedName("fingerID")
  private String fingerID = null;
  @SerializedName("geolocation")
  private Geolocation geolocation = null;
  @SerializedName("device")
  private EvidenceDevice device = null;
  @SerializedName("positions")
  private List<Position> positions = new ArrayList<Position>() ;
  @SerializedName("imageQuality")
  private Integer imageQuality = null;
  @SerializedName("imageScaleFactor")
  private Integer imageScaleFactor = null;
  @SerializedName("clientTimestamp")
  private Long clientTimestamp = null;
  @SerializedName("serviceTimestamp")
  private Long serviceTimestamp = null;
  @SerializedName("serviceTimestampType")
  private String serviceTimestampType = null;

  
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
  public String getBase64Template() {
    return base64Template;
  }
  public void setBase64Template(String base64Template) {
    this.base64Template = base64Template;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTemplateAlgorithmic() {
    return templateAlgorithmic;
  }
  public void setTemplateAlgorithmic(String templateAlgorithmic) {
    this.templateAlgorithmic = templateAlgorithmic;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFingerID() {
    return fingerID;
  }
  public void setFingerID(String fingerID) {
    this.fingerID = fingerID;
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getClientTimestamp() {
    return clientTimestamp;
  }
  public void setClientTimestamp(Long clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getServiceTimestamp() {
    return serviceTimestamp;
  }
  public void setServiceTimestamp(Long serviceTimestamp) {
    this.serviceTimestamp = serviceTimestamp;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getServiceTimestampType() {
    return serviceTimestampType;
  }
  public void setServiceTimestampType(String serviceTimestampType) {
    this.serviceTimestampType = serviceTimestampType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceFingerPrint {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  evidenceCode: ").append(evidenceCode).append("\n");
    sb.append("  base64Image: ").append(base64Image).append("\n");
    sb.append("  base64Template: ").append(base64Template).append("\n");
    sb.append("  templateAlgorithmic: ").append(templateAlgorithmic).append("\n");
    sb.append("  fingerID: ").append(fingerID).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("  device: ").append(device).append("\n");
    sb.append("  positions: ").append(positions).append("\n");
    sb.append("  imageQuality: ").append(imageQuality).append("\n");
    sb.append("  imageScaleFactor: ").append(imageScaleFactor).append("\n");
    sb.append("  clientTimestamp: ").append(clientTimestamp).append("\n");
    sb.append("  serviceTimestamp: ").append(serviceTimestamp).append("\n");
    sb.append("  serviceTimestampType: ").append(serviceTimestampType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
