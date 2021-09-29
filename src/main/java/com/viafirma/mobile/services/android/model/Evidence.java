package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.PositionsMatch;
import com.viafirma.mobile.services.android.model.Geolocation;
import com.viafirma.mobile.services.android.model.Position;
import com.viafirma.mobile.services.android.model.EvidenceSignature;
import com.viafirma.mobile.services.android.model.Param;
import com.viafirma.mobile.services.android.model.EvidenceFingerPrint;
import com.viafirma.mobile.services.android.model.EvidenceGeneric;
import java.util.*;
import com.viafirma.mobile.services.android.model.OcrData;
import com.viafirma.mobile.services.android.model.EvidenceImage;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Evidence  implements Serializable {
  
  public enum TypeEnum {
     SIGNATURE,  FINGERPRINT,  IMAGE,  ANNOTATION,  FINGER_PRINT,  OTP_SMS,  GENERIC, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("enabledExpression")
  private String enabledExpression = null;
  @SerializedName("visibleExpression")
  private String visibleExpression = null;
  @SerializedName("enabled")
  private Boolean enabled = Boolean.FALSE;
  @SerializedName("visible")
  private Boolean visible = Boolean.FALSE;
  @SerializedName("code")
  private String code = null;
  public enum StatusEnum {
     PENDING,  RECEIVED,  ADDED,  IN_PROGRESS, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("helpText")
  private String helpText = null;
  @SerializedName("helpDetail")
  private String helpDetail = null;
  @SerializedName("temporalReference")
  private String temporalReference = null;
  @SerializedName("positions")
  private List<Position> positions = new ArrayList<Position>() ;
  @SerializedName("metadataList")
  private List<Param> metadataList = new ArrayList<Param>() ;
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
  @SerializedName("certificateId")
  private String certificateId = null;
  @SerializedName("metadataCipherPublicKey")
  private String metadataCipherPublicKey = null;
  @SerializedName("encryptionKeyAlias")
  private String encryptionKeyAlias = null;
  @SerializedName("optional")
  private Boolean optional = Boolean.FALSE;
  @SerializedName("required")
  private Boolean required = Boolean.FALSE;
  @SerializedName("ratioH")
  private String ratioH = null;
  @SerializedName("ratioW")
  private String ratioW = null;
  @SerializedName("signatureData")
  private EvidenceSignature signatureData = null;
  @SerializedName("fingerPrintData")
  private EvidenceFingerPrint fingerPrintData = null;
  @SerializedName("imageData")
  private EvidenceImage imageData = null;
  @SerializedName("positionsKey")
  private String positionsKey = null;
  @SerializedName("positionsMatch")
  private List<PositionsMatch> positionsMatch = new ArrayList<PositionsMatch>() ;
  @SerializedName("stampsMin")
  private Integer stampsMin = null;
  @SerializedName("stampsPolicy")
  private String stampsPolicy = null;
  @SerializedName("stylus")
  private List<String> stylus = new ArrayList<String>() ;
  @SerializedName("geolocation")
  private Geolocation geolocation = null;
  @SerializedName("imageQuality")
  private Integer imageQuality = null;
  @SerializedName("imageScaleFactor")
  private Integer imageScaleFactor = null;
  @SerializedName("ocr")
  private OcrData ocr = null;
  @SerializedName("genericData")
  private EvidenceGeneric genericData = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("base64Image")
  private String base64Image = null;
  @SerializedName("imageText")
  private String imageText = null;
  @SerializedName("imageType")
  private String imageType = null;
  @SerializedName("addLink")
  private Boolean addLink = Boolean.FALSE;
  @SerializedName("recipientKey")
  private String recipientKey = null;
  @SerializedName("imageDataType")
  private String imageDataType = null;
  public enum ImageTextLocationEnum {
     UP,  DOWN,  LEFT,  RIGHT, 
  };
  @SerializedName("imageTextLocation")
  private ImageTextLocationEnum imageTextLocation = null;
  @SerializedName("imageTextSize")
  private Integer imageTextSize = null;

  
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
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEnabledExpression() {
    return enabledExpression;
  }
  public void setEnabledExpression(String enabledExpression) {
    this.enabledExpression = enabledExpression;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getVisibleExpression() {
    return visibleExpression;
  }
  public void setVisibleExpression(String visibleExpression) {
    this.visibleExpression = visibleExpression;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible) {
    this.visible = visible;
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
  public String getHelpDetail() {
    return helpDetail;
  }
  public void setHelpDetail(String helpDetail) {
    this.helpDetail = helpDetail;
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
  public List<Param> getMetadataList() {
    return metadataList;
  }
  public void setMetadataList(List<Param> metadataList) {
    this.metadataList = metadataList;
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
  public String getCertificateId() {
    return certificateId;
  }
  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEncryptionKeyAlias() {
    return encryptionKeyAlias;
  }
  public void setEncryptionKeyAlias(String encryptionKeyAlias) {
    this.encryptionKeyAlias = encryptionKeyAlias;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRatioH() {
    return ratioH;
  }
  public void setRatioH(String ratioH) {
    this.ratioH = ratioH;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRatioW() {
    return ratioW;
  }
  public void setRatioW(String ratioW) {
    this.ratioW = ratioW;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public EvidenceSignature getSignatureData() {
    return signatureData;
  }
  public void setSignatureData(EvidenceSignature signatureData) {
    this.signatureData = signatureData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public EvidenceFingerPrint getFingerPrintData() {
    return fingerPrintData;
  }
  public void setFingerPrintData(EvidenceFingerPrint fingerPrintData) {
    this.fingerPrintData = fingerPrintData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public EvidenceImage getImageData() {
    return imageData;
  }
  public void setImageData(EvidenceImage imageData) {
    this.imageData = imageData;
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
  public List<PositionsMatch> getPositionsMatch() {
    return positionsMatch;
  }
  public void setPositionsMatch(List<PositionsMatch> positionsMatch) {
    this.positionsMatch = positionsMatch;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getStampsMin() {
    return stampsMin;
  }
  public void setStampsMin(Integer stampsMin) {
    this.stampsMin = stampsMin;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getStampsPolicy() {
    return stampsPolicy;
  }
  public void setStampsPolicy(String stampsPolicy) {
    this.stampsPolicy = stampsPolicy;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getStylus() {
    return stylus;
  }
  public void setStylus(List<String> stylus) {
    this.stylus = stylus;
  }

  
  /**
   * (since 3.5.0, internal) geolocation info
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0, internal) geolocation info")
  public Geolocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  
  /**
   * (since 3.5.0) calidad de la imagen donde 100 representa el máximo de calidad y 0 el máximo nivel de compresión
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) calidad de la imagen donde 100 representa el máximo de calidad y 0 el máximo nivel de compresión")
  public Integer getImageQuality() {
    return imageQuality;
  }
  public void setImageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
  }

  
  /**
   * (since 3.5.0) factor multiplicador del tamaño de la imagen, para permitir zoom, 1, 2, 3
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) factor multiplicador del tamaño de la imagen, para permitir zoom, 1, 2, 3")
  public Integer getImageScaleFactor() {
    return imageScaleFactor;
  }
  public void setImageScaleFactor(Integer imageScaleFactor) {
    this.imageScaleFactor = imageScaleFactor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public OcrData getOcr() {
    return ocr;
  }
  public void setOcr(OcrData ocr) {
    this.ocr = ocr;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public EvidenceGeneric getGenericData() {
    return genericData;
  }
  public void setGenericData(EvidenceGeneric genericData) {
    this.genericData = genericData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
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
  public String getImageText() {
    return imageText;
  }
  public void setImageText(String imageText) {
    this.imageText = imageText;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getImageType() {
    return imageType;
  }
  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAddLink() {
    return addLink;
  }
  public void setAddLink(Boolean addLink) {
    this.addLink = addLink;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRecipientKey() {
    return recipientKey;
  }
  public void setRecipientKey(String recipientKey) {
    this.recipientKey = recipientKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getImageDataType() {
    return imageDataType;
  }
  public void setImageDataType(String imageDataType) {
    this.imageDataType = imageDataType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ImageTextLocationEnum getImageTextLocation() {
    return imageTextLocation;
  }
  public void setImageTextLocation(ImageTextLocationEnum imageTextLocation) {
    this.imageTextLocation = imageTextLocation;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getImageTextSize() {
    return imageTextSize;
  }
  public void setImageTextSize(Integer imageTextSize) {
    this.imageTextSize = imageTextSize;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evidence {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  enabledExpression: ").append(enabledExpression).append("\n");
    sb.append("  visibleExpression: ").append(visibleExpression).append("\n");
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("  visible: ").append(visible).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  helpText: ").append(helpText).append("\n");
    sb.append("  helpDetail: ").append(helpDetail).append("\n");
    sb.append("  temporalReference: ").append(temporalReference).append("\n");
    sb.append("  positions: ").append(positions).append("\n");
    sb.append("  metadataList: ").append(metadataList).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  deviceType: ").append(deviceType).append("\n");
    sb.append("  hashPdf: ").append(hashPdf).append("\n");
    sb.append("  hashImage: ").append(hashImage).append("\n");
    sb.append("  algorithmic: ").append(algorithmic).append("\n");
    sb.append("  fingerID: ").append(fingerID).append("\n");
    sb.append("  typeFormatSign: ").append(typeFormatSign).append("\n");
    sb.append("  certificateAlias: ").append(certificateAlias).append("\n");
    sb.append("  certificatePassword: ").append(certificatePassword).append("\n");
    sb.append("  certificateId: ").append(certificateId).append("\n");
    sb.append("  metadataCipherPublicKey: ").append(metadataCipherPublicKey).append("\n");
    sb.append("  encryptionKeyAlias: ").append(encryptionKeyAlias).append("\n");
    sb.append("  optional: ").append(optional).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("  ratioH: ").append(ratioH).append("\n");
    sb.append("  ratioW: ").append(ratioW).append("\n");
    sb.append("  signatureData: ").append(signatureData).append("\n");
    sb.append("  fingerPrintData: ").append(fingerPrintData).append("\n");
    sb.append("  imageData: ").append(imageData).append("\n");
    sb.append("  positionsKey: ").append(positionsKey).append("\n");
    sb.append("  positionsMatch: ").append(positionsMatch).append("\n");
    sb.append("  stampsMin: ").append(stampsMin).append("\n");
    sb.append("  stampsPolicy: ").append(stampsPolicy).append("\n");
    sb.append("  stylus: ").append(stylus).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("  imageQuality: ").append(imageQuality).append("\n");
    sb.append("  imageScaleFactor: ").append(imageScaleFactor).append("\n");
    sb.append("  ocr: ").append(ocr).append("\n");
    sb.append("  genericData: ").append(genericData).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  base64Image: ").append(base64Image).append("\n");
    sb.append("  imageText: ").append(imageText).append("\n");
    sb.append("  imageType: ").append(imageType).append("\n");
    sb.append("  addLink: ").append(addLink).append("\n");
    sb.append("  recipientKey: ").append(recipientKey).append("\n");
    sb.append("  imageDataType: ").append(imageDataType).append("\n");
    sb.append("  imageTextLocation: ").append(imageTextLocation).append("\n");
    sb.append("  imageTextSize: ").append(imageTextSize).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
