package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.VerifierDTO;
import com.viafirma.mobile.services.android.model.VerifierOidDTO;
import java.util.*;
import java.util.Date;
import com.viafirma.mobile.services.android.model.VerifierCertificateDTO;
import com.viafirma.mobile.services.android.model.VerifierKeyUsageDTO;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class VerifierCertificateDTO  implements Serializable {
  
  @SerializedName("certX509Base64")
  private String certX509Base64 = null;
  @SerializedName("subject")
  private String subject = null;
  @SerializedName("issuer")
  private String issuer = null;
  @SerializedName("notafter")
  private Date notafter = null;
  @SerializedName("notbefore")
  private Date notbefore = null;
  @SerializedName("signAlgName")
  private String signAlgName = null;
  @SerializedName("signAlgOID")
  private String signAlgOID = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("version")
  private String version = null;
  @SerializedName("serialNumber")
  private String serialNumber = null;
  @SerializedName("policyIdentifier")
  private String policyIdentifier = null;
  @SerializedName("expired")
  private Boolean expired = Boolean.FALSE;
  @SerializedName("expiredAfterSigningDate")
  private Boolean expiredAfterSigningDate = Boolean.FALSE;
  @SerializedName("selfSigned")
  private Boolean selfSigned = Boolean.FALSE;
  @SerializedName("trusted")
  private Boolean trusted = Boolean.FALSE;
  public enum TrustedSourceEnum {
     TSL,  KS, 
  };
  @SerializedName("trustedSource")
  private TrustedSourceEnum trustedSource = null;
  @SerializedName("valid")
  private Boolean valid = Boolean.FALSE;
  @SerializedName("keyUsage")
  private VerifierKeyUsageDTO keyUsage = null;
  @SerializedName("oids")
  private List<VerifierOidDTO> oids = new ArrayList<VerifierOidDTO>() ;
  @SerializedName("validation")
  private VerifierDTO validation = null;
  @SerializedName("issuerCert")
  private VerifierCertificateDTO issuerCert = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCertX509Base64() {
    return certX509Base64;
  }
  public void setCertX509Base64(String certX509Base64) {
    this.certX509Base64 = certX509Base64;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getNotafter() {
    return notafter;
  }
  public void setNotafter(Date notafter) {
    this.notafter = notafter;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getNotbefore() {
    return notbefore;
  }
  public void setNotbefore(Date notbefore) {
    this.notbefore = notbefore;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignAlgName() {
    return signAlgName;
  }
  public void setSignAlgName(String signAlgName) {
    this.signAlgName = signAlgName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignAlgOID() {
    return signAlgOID;
  }
  public void setSignAlgOID(String signAlgOID) {
    this.signAlgOID = signAlgOID;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPolicyIdentifier() {
    return policyIdentifier;
  }
  public void setPolicyIdentifier(String policyIdentifier) {
    this.policyIdentifier = policyIdentifier;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getExpired() {
    return expired;
  }
  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getExpiredAfterSigningDate() {
    return expiredAfterSigningDate;
  }
  public void setExpiredAfterSigningDate(Boolean expiredAfterSigningDate) {
    this.expiredAfterSigningDate = expiredAfterSigningDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getSelfSigned() {
    return selfSigned;
  }
  public void setSelfSigned(Boolean selfSigned) {
    this.selfSigned = selfSigned;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getTrusted() {
    return trusted;
  }
  public void setTrusted(Boolean trusted) {
    this.trusted = trusted;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TrustedSourceEnum getTrustedSource() {
    return trustedSource;
  }
  public void setTrustedSource(TrustedSourceEnum trustedSource) {
    this.trustedSource = trustedSource;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public VerifierKeyUsageDTO getKeyUsage() {
    return keyUsage;
  }
  public void setKeyUsage(VerifierKeyUsageDTO keyUsage) {
    this.keyUsage = keyUsage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<VerifierOidDTO> getOids() {
    return oids;
  }
  public void setOids(List<VerifierOidDTO> oids) {
    this.oids = oids;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public VerifierDTO getValidation() {
    return validation;
  }
  public void setValidation(VerifierDTO validation) {
    this.validation = validation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public VerifierCertificateDTO getIssuerCert() {
    return issuerCert;
  }
  public void setIssuerCert(VerifierCertificateDTO issuerCert) {
    this.issuerCert = issuerCert;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifierCertificateDTO {\n");
    
    sb.append("  certX509Base64: ").append(certX509Base64).append("\n");
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("  issuer: ").append(issuer).append("\n");
    sb.append("  notafter: ").append(notafter).append("\n");
    sb.append("  notbefore: ").append(notbefore).append("\n");
    sb.append("  signAlgName: ").append(signAlgName).append("\n");
    sb.append("  signAlgOID: ").append(signAlgOID).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  serialNumber: ").append(serialNumber).append("\n");
    sb.append("  policyIdentifier: ").append(policyIdentifier).append("\n");
    sb.append("  expired: ").append(expired).append("\n");
    sb.append("  expiredAfterSigningDate: ").append(expiredAfterSigningDate).append("\n");
    sb.append("  selfSigned: ").append(selfSigned).append("\n");
    sb.append("  trusted: ").append(trusted).append("\n");
    sb.append("  trustedSource: ").append(trustedSource).append("\n");
    sb.append("  valid: ").append(valid).append("\n");
    sb.append("  keyUsage: ").append(keyUsage).append("\n");
    sb.append("  oids: ").append(oids).append("\n");
    sb.append("  validation: ").append(validation).append("\n");
    sb.append("  issuerCert: ").append(issuerCert).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
