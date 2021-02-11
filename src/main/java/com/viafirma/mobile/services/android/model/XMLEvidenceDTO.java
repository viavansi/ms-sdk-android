package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.XMLPositionDTO;
import com.viafirma.mobile.services.android.model.XMLDeviceDTO;
import java.util.*;
import com.viafirma.mobile.services.android.model.XMLPdfPageHashes;
import com.viafirma.mobile.services.android.model.XMLGenericEvidenceDTO;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class XMLEvidenceDTO  implements Serializable {
  
  @SerializedName("locationData")
  private String locationData = null;
  @SerializedName("locationInfo")
  private String locationInfo = null;
  @SerializedName("longitude")
  private String longitude = null;
  @SerializedName("latitude")
  private String latitude = null;
  @SerializedName("pressureMaxValue")
  private String pressureMaxValue = null;
  @SerializedName("pressureMinValue")
  private String pressureMinValue = null;
  @SerializedName("pressureStylusInfo")
  private String pressureStylusInfo = null;
  @SerializedName("deviceInfo")
  private XMLDeviceDTO deviceInfo = null;
  @SerializedName("position")
  private XMLPositionDTO position = null;
  @SerializedName("positions")
  private List<XMLPositionDTO> positions = new ArrayList<XMLPositionDTO>() ;
  @SerializedName("hashImage")
  private String hashImage = null;
  @SerializedName("hashPdf")
  private XMLPdfPageHashes hashPdf = null;
  @SerializedName("cipherAlgorithm")
  private String cipherAlgorithm = null;
  @SerializedName("encryptedAesSessionKey")
  private String encryptedAesSessionKey = null;
  @SerializedName("trustedThirdParty")
  private String trustedThirdParty = null;
  @SerializedName("genericEvidence")
  private XMLGenericEvidenceDTO genericEvidence = null;
  @SerializedName("cipheredData")
  private String cipheredData = null;
  @SerializedName("evidenceType")
  private String evidenceType = null;
  @SerializedName("evidenceVersion")
  private String evidenceVersion = null;
  @SerializedName("evidenceTimestamp")
  private Long evidenceTimestamp = null;
  @SerializedName("clientTimestamp")
  private Long clientTimestamp = null;
  @SerializedName("serviceTimestamp")
  private Long serviceTimestamp = null;
  @SerializedName("serviceTimestampType")
  private String serviceTimestampType = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLocationData() {
    return locationData;
  }
  public void setLocationData(String locationData) {
    this.locationData = locationData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLocationInfo() {
    return locationInfo;
  }
  public void setLocationInfo(String locationInfo) {
    this.locationInfo = locationInfo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPressureMaxValue() {
    return pressureMaxValue;
  }
  public void setPressureMaxValue(String pressureMaxValue) {
    this.pressureMaxValue = pressureMaxValue;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPressureMinValue() {
    return pressureMinValue;
  }
  public void setPressureMinValue(String pressureMinValue) {
    this.pressureMinValue = pressureMinValue;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPressureStylusInfo() {
    return pressureStylusInfo;
  }
  public void setPressureStylusInfo(String pressureStylusInfo) {
    this.pressureStylusInfo = pressureStylusInfo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public XMLDeviceDTO getDeviceInfo() {
    return deviceInfo;
  }
  public void setDeviceInfo(XMLDeviceDTO deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public XMLPositionDTO getPosition() {
    return position;
  }
  public void setPosition(XMLPositionDTO position) {
    this.position = position;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<XMLPositionDTO> getPositions() {
    return positions;
  }
  public void setPositions(List<XMLPositionDTO> positions) {
    this.positions = positions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getHashImage() {
    return hashImage;
  }
  public void setHashImage(String hashImage) {
    this.hashImage = hashImage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public XMLPdfPageHashes getHashPdf() {
    return hashPdf;
  }
  public void setHashPdf(XMLPdfPageHashes hashPdf) {
    this.hashPdf = hashPdf;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCipherAlgorithm() {
    return cipherAlgorithm;
  }
  public void setCipherAlgorithm(String cipherAlgorithm) {
    this.cipherAlgorithm = cipherAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEncryptedAesSessionKey() {
    return encryptedAesSessionKey;
  }
  public void setEncryptedAesSessionKey(String encryptedAesSessionKey) {
    this.encryptedAesSessionKey = encryptedAesSessionKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTrustedThirdParty() {
    return trustedThirdParty;
  }
  public void setTrustedThirdParty(String trustedThirdParty) {
    this.trustedThirdParty = trustedThirdParty;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public XMLGenericEvidenceDTO getGenericEvidence() {
    return genericEvidence;
  }
  public void setGenericEvidence(XMLGenericEvidenceDTO genericEvidence) {
    this.genericEvidence = genericEvidence;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCipheredData() {
    return cipheredData;
  }
  public void setCipheredData(String cipheredData) {
    this.cipheredData = cipheredData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEvidenceType() {
    return evidenceType;
  }
  public void setEvidenceType(String evidenceType) {
    this.evidenceType = evidenceType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEvidenceVersion() {
    return evidenceVersion;
  }
  public void setEvidenceVersion(String evidenceVersion) {
    this.evidenceVersion = evidenceVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getEvidenceTimestamp() {
    return evidenceTimestamp;
  }
  public void setEvidenceTimestamp(Long evidenceTimestamp) {
    this.evidenceTimestamp = evidenceTimestamp;
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
    sb.append("class XMLEvidenceDTO {\n");
    
    sb.append("  locationData: ").append(locationData).append("\n");
    sb.append("  locationInfo: ").append(locationInfo).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  pressureMaxValue: ").append(pressureMaxValue).append("\n");
    sb.append("  pressureMinValue: ").append(pressureMinValue).append("\n");
    sb.append("  pressureStylusInfo: ").append(pressureStylusInfo).append("\n");
    sb.append("  deviceInfo: ").append(deviceInfo).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  positions: ").append(positions).append("\n");
    sb.append("  hashImage: ").append(hashImage).append("\n");
    sb.append("  hashPdf: ").append(hashPdf).append("\n");
    sb.append("  cipherAlgorithm: ").append(cipherAlgorithm).append("\n");
    sb.append("  encryptedAesSessionKey: ").append(encryptedAesSessionKey).append("\n");
    sb.append("  trustedThirdParty: ").append(trustedThirdParty).append("\n");
    sb.append("  genericEvidence: ").append(genericEvidence).append("\n");
    sb.append("  cipheredData: ").append(cipheredData).append("\n");
    sb.append("  evidenceType: ").append(evidenceType).append("\n");
    sb.append("  evidenceVersion: ").append(evidenceVersion).append("\n");
    sb.append("  evidenceTimestamp: ").append(evidenceTimestamp).append("\n");
    sb.append("  clientTimestamp: ").append(clientTimestamp).append("\n");
    sb.append("  serviceTimestamp: ").append(serviceTimestamp).append("\n");
    sb.append("  serviceTimestampType: ").append(serviceTimestampType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
