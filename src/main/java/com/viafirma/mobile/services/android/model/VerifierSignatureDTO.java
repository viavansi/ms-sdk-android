package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.VerifierTimeStampDTO;
import java.util.*;
import java.util.Date;
import com.viafirma.mobile.services.android.model.VerifierCertificateDTO;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class VerifierSignatureDTO  implements Serializable {
  
  @SerializedName("format")
  private String format = null;
  @SerializedName("encryptionAlgorithm")
  private String encryptionAlgorithm = null;
  @SerializedName("digestAlgorithm")
  private String digestAlgorithm = null;
  @SerializedName("level")
  private String level = null;
  @SerializedName("signingTime")
  private Date signingTime = null;
  public enum ValidationStatusEnum {
     VALID,  UNKNOWN,  INVALID, 
  };
  @SerializedName("validationStatus")
  private ValidationStatusEnum validationStatus = null;
  @SerializedName("indication")
  private String indication = null;
  @SerializedName("subIndication")
  private String subIndication = null;
  @SerializedName("policyId")
  private String policyId = null;
  @SerializedName("errorMessage")
  private String errorMessage = null;
  @SerializedName("signedBy")
  private String signedBy = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("certificate")
  private VerifierCertificateDTO certificate = null;
  @SerializedName("timeStamps")
  private List<VerifierTimeStampDTO> timeStamps = new ArrayList<VerifierTimeStampDTO>() ;
  @SerializedName("unsignedChanges")
  private Boolean unsignedChanges = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEncryptionAlgorithm() {
    return encryptionAlgorithm;
  }
  public void setEncryptionAlgorithm(String encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDigestAlgorithm() {
    return digestAlgorithm;
  }
  public void setDigestAlgorithm(String digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getSigningTime() {
    return signingTime;
  }
  public void setSigningTime(Date signingTime) {
    this.signingTime = signingTime;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ValidationStatusEnum getValidationStatus() {
    return validationStatus;
  }
  public void setValidationStatus(ValidationStatusEnum validationStatus) {
    this.validationStatus = validationStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIndication() {
    return indication;
  }
  public void setIndication(String indication) {
    this.indication = indication;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSubIndication() {
    return subIndication;
  }
  public void setSubIndication(String subIndication) {
    this.subIndication = subIndication;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPolicyId() {
    return policyId;
  }
  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignedBy() {
    return signedBy;
  }
  public void setSignedBy(String signedBy) {
    this.signedBy = signedBy;
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
  public VerifierCertificateDTO getCertificate() {
    return certificate;
  }
  public void setCertificate(VerifierCertificateDTO certificate) {
    this.certificate = certificate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<VerifierTimeStampDTO> getTimeStamps() {
    return timeStamps;
  }
  public void setTimeStamps(List<VerifierTimeStampDTO> timeStamps) {
    this.timeStamps = timeStamps;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getUnsignedChanges() {
    return unsignedChanges;
  }
  public void setUnsignedChanges(Boolean unsignedChanges) {
    this.unsignedChanges = unsignedChanges;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifierSignatureDTO {\n");
    
    sb.append("  format: ").append(format).append("\n");
    sb.append("  encryptionAlgorithm: ").append(encryptionAlgorithm).append("\n");
    sb.append("  digestAlgorithm: ").append(digestAlgorithm).append("\n");
    sb.append("  level: ").append(level).append("\n");
    sb.append("  signingTime: ").append(signingTime).append("\n");
    sb.append("  validationStatus: ").append(validationStatus).append("\n");
    sb.append("  indication: ").append(indication).append("\n");
    sb.append("  subIndication: ").append(subIndication).append("\n");
    sb.append("  policyId: ").append(policyId).append("\n");
    sb.append("  errorMessage: ").append(errorMessage).append("\n");
    sb.append("  signedBy: ").append(signedBy).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  timeStamps: ").append(timeStamps).append("\n");
    sb.append("  unsignedChanges: ").append(unsignedChanges).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
