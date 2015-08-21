package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Position;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Evidence  implements Serializable {
  
  public enum TypeEnum {
     ANNOTATION,  IMAGE,  FINGER_PRINT, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("code")
  private String code = null;
  public enum StatusEnum {
     PENDING,  RECEIVED,  ADDED, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("helpText")
  private String helpText = null;
  @SerializedName("temporalReference")
  private String temporalReference = null;
  @SerializedName("positions")
  private List<Position> positions = new ArrayList<Position>() ;
  @SerializedName("metadata")
  private String metadata = null;
  @SerializedName("deviceType")
  private String deviceType = null;
  @SerializedName("hashPdf")
  private List<String> hashPdf = new ArrayList<String>() ;
  @SerializedName("hashImage")
  private String hashImage = null;
  @SerializedName("algorithmic")
  private String algorithmic = null;
  @SerializedName("fingerID")
  private String fingerID = null;
  @SerializedName("typeFormatSign")
  private String typeFormatSign = null;
  @SerializedName("certificateAlias")
  private String certificateAlias = null;
  @SerializedName("certificatePassword")
  private String certificatePassword = null;
  @SerializedName("metadataCipherPublicKey")
  private String metadataCipherPublicKey = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
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
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getHelpText() {
    return helpText;
  }
  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTemporalReference() {
    return temporalReference;
  }
  public void setTemporalReference(String temporalReference) {
    this.temporalReference = temporalReference;
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
  public String getMetadata() {
    return metadata;
  }
  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDeviceType() {
    return deviceType;
  }
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getHashPdf() {
    return hashPdf;
  }
  public void setHashPdf(List<String> hashPdf) {
    this.hashPdf = hashPdf;
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
  public String getAlgorithmic() {
    return algorithmic;
  }
  public void setAlgorithmic(String algorithmic) {
    this.algorithmic = algorithmic;
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
  public String getTypeFormatSign() {
    return typeFormatSign;
  }
  public void setTypeFormatSign(String typeFormatSign) {
    this.typeFormatSign = typeFormatSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCertificateAlias() {
    return certificateAlias;
  }
  public void setCertificateAlias(String certificateAlias) {
    this.certificateAlias = certificateAlias;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCertificatePassword() {
    return certificatePassword;
  }
  public void setCertificatePassword(String certificatePassword) {
    this.certificatePassword = certificatePassword;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMetadataCipherPublicKey() {
    return metadataCipherPublicKey;
  }
  public void setMetadataCipherPublicKey(String metadataCipherPublicKey) {
    this.metadataCipherPublicKey = metadataCipherPublicKey;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evidence {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  helpText: ").append(helpText).append("\n");
    sb.append("  temporalReference: ").append(temporalReference).append("\n");
    sb.append("  positions: ").append(positions).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  deviceType: ").append(deviceType).append("\n");
    sb.append("  hashPdf: ").append(hashPdf).append("\n");
    sb.append("  hashImage: ").append(hashImage).append("\n");
    sb.append("  algorithmic: ").append(algorithmic).append("\n");
    sb.append("  fingerID: ").append(fingerID).append("\n");
    sb.append("  typeFormatSign: ").append(typeFormatSign).append("\n");
    sb.append("  certificateAlias: ").append(certificateAlias).append("\n");
    sb.append("  certificatePassword: ").append(certificatePassword).append("\n");
    sb.append("  metadataCipherPublicKey: ").append(metadataCipherPublicKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
