package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.PublicKey;
import com.viafirma.mobile.services.android.model.X500Principal;
import java.util.*;
import com.viafirma.mobile.services.android.model.Principal;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class X509Certificate  implements Serializable {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("subjectX500Principal")
  private X500Principal subjectX500Principal = null;
  @SerializedName("issuerX500Principal")
  private X500Principal issuerX500Principal = null;
  @SerializedName("issuerDN")
  private Principal issuerDN = null;
  @SerializedName("subjectDN")
  private Principal subjectDN = null;
  @SerializedName("signature")
  private List<String> signature = new ArrayList<String>() ;
  @SerializedName("basicConstraints")
  private Integer basicConstraints = null;
  @SerializedName("sigAlgName")
  private String sigAlgName = null;
  @SerializedName("notBefore")
  private Date notBefore = null;
  @SerializedName("notAfter")
  private Date notAfter = null;
  @SerializedName("serialNumber")
  private Integer serialNumber = null;
  @SerializedName("keyUsage")
  private List<Boolean> keyUsage = new ArrayList<Boolean>() ;
  @SerializedName("extendedKeyUsage")
  private List<String> extendedKeyUsage = new ArrayList<String>() ;
  @SerializedName("tbscertificate")
  private List<String> tbscertificate = new ArrayList<String>() ;
  @SerializedName("version")
  private Integer version = null;
  @SerializedName("issuerAlternativeNames")
  private List<List<Object>> issuerAlternativeNames = new ArrayList<>() ;
  @SerializedName("issuerUniqueID")
  private List<Boolean> issuerUniqueID = new ArrayList<Boolean>() ;
  @SerializedName("sigAlgOID")
  private String sigAlgOID = null;
  @SerializedName("sigAlgParams")
  private List<String> sigAlgParams = new ArrayList<String>() ;
  @SerializedName("subjectAlternativeNames")
  private List<List<Object>> subjectAlternativeNames = new ArrayList<>() ;
  @SerializedName("subjectUniqueID")
  private List<Boolean> subjectUniqueID = new ArrayList<Boolean>() ;
  @SerializedName("criticalExtensionOIDs")
  private List<String> criticalExtensionOIDs = new ArrayList<String>() ;
  @SerializedName("nonCriticalExtensionOIDs")
  private List<String> nonCriticalExtensionOIDs = new ArrayList<String>() ;
  @SerializedName("encoded")
  private List<String> encoded = new ArrayList<String>() ;
  @SerializedName("publicKey")
  private PublicKey publicKey = null;

  
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
  public X500Principal getSubjectX500Principal() {
    return subjectX500Principal;
  }
  public void setSubjectX500Principal(X500Principal subjectX500Principal) {
    this.subjectX500Principal = subjectX500Principal;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public X500Principal getIssuerX500Principal() {
    return issuerX500Principal;
  }
  public void setIssuerX500Principal(X500Principal issuerX500Principal) {
    this.issuerX500Principal = issuerX500Principal;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Principal getIssuerDN() {
    return issuerDN;
  }
  public void setIssuerDN(Principal issuerDN) {
    this.issuerDN = issuerDN;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Principal getSubjectDN() {
    return subjectDN;
  }
  public void setSubjectDN(Principal subjectDN) {
    this.subjectDN = subjectDN;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getSignature() {
    return signature;
  }
  public void setSignature(List<String> signature) {
    this.signature = signature;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getBasicConstraints() {
    return basicConstraints;
  }
  public void setBasicConstraints(Integer basicConstraints) {
    this.basicConstraints = basicConstraints;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSigAlgName() {
    return sigAlgName;
  }
  public void setSigAlgName(String sigAlgName) {
    this.sigAlgName = sigAlgName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getNotBefore() {
    return notBefore;
  }
  public void setNotBefore(Date notBefore) {
    this.notBefore = notBefore;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getNotAfter() {
    return notAfter;
  }
  public void setNotAfter(Date notAfter) {
    this.notAfter = notAfter;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Boolean> getKeyUsage() {
    return keyUsage;
  }
  public void setKeyUsage(List<Boolean> keyUsage) {
    this.keyUsage = keyUsage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getExtendedKeyUsage() {
    return extendedKeyUsage;
  }
  public void setExtendedKeyUsage(List<String> extendedKeyUsage) {
    this.extendedKeyUsage = extendedKeyUsage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getTbscertificate() {
    return tbscertificate;
  }
  public void setTbscertificate(List<String> tbscertificate) {
    this.tbscertificate = tbscertificate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<List<Object>> getIssuerAlternativeNames() {
    return issuerAlternativeNames;
  }
  public void setIssuerAlternativeNames(List<List<Object>> issuerAlternativeNames) {
    this.issuerAlternativeNames = issuerAlternativeNames;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Boolean> getIssuerUniqueID() {
    return issuerUniqueID;
  }
  public void setIssuerUniqueID(List<Boolean> issuerUniqueID) {
    this.issuerUniqueID = issuerUniqueID;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSigAlgOID() {
    return sigAlgOID;
  }
  public void setSigAlgOID(String sigAlgOID) {
    this.sigAlgOID = sigAlgOID;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getSigAlgParams() {
    return sigAlgParams;
  }
  public void setSigAlgParams(List<String> sigAlgParams) {
    this.sigAlgParams = sigAlgParams;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<List<Object>> getSubjectAlternativeNames() {
    return subjectAlternativeNames;
  }
  public void setSubjectAlternativeNames(List<List<Object>> subjectAlternativeNames) {
    this.subjectAlternativeNames = subjectAlternativeNames;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Boolean> getSubjectUniqueID() {
    return subjectUniqueID;
  }
  public void setSubjectUniqueID(List<Boolean> subjectUniqueID) {
    this.subjectUniqueID = subjectUniqueID;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getCriticalExtensionOIDs() {
    return criticalExtensionOIDs;
  }
  public void setCriticalExtensionOIDs(List<String> criticalExtensionOIDs) {
    this.criticalExtensionOIDs = criticalExtensionOIDs;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getNonCriticalExtensionOIDs() {
    return nonCriticalExtensionOIDs;
  }
  public void setNonCriticalExtensionOIDs(List<String> nonCriticalExtensionOIDs) {
    this.nonCriticalExtensionOIDs = nonCriticalExtensionOIDs;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getEncoded() {
    return encoded;
  }
  public void setEncoded(List<String> encoded) {
    this.encoded = encoded;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public PublicKey getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(PublicKey publicKey) {
    this.publicKey = publicKey;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class X509Certificate {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  subjectX500Principal: ").append(subjectX500Principal).append("\n");
    sb.append("  issuerX500Principal: ").append(issuerX500Principal).append("\n");
    sb.append("  issuerDN: ").append(issuerDN).append("\n");
    sb.append("  subjectDN: ").append(subjectDN).append("\n");
    sb.append("  signature: ").append(signature).append("\n");
    sb.append("  basicConstraints: ").append(basicConstraints).append("\n");
    sb.append("  sigAlgName: ").append(sigAlgName).append("\n");
    sb.append("  notBefore: ").append(notBefore).append("\n");
    sb.append("  notAfter: ").append(notAfter).append("\n");
    sb.append("  serialNumber: ").append(serialNumber).append("\n");
    sb.append("  keyUsage: ").append(keyUsage).append("\n");
    sb.append("  extendedKeyUsage: ").append(extendedKeyUsage).append("\n");
    sb.append("  tbscertificate: ").append(tbscertificate).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  issuerAlternativeNames: ").append(issuerAlternativeNames).append("\n");
    sb.append("  issuerUniqueID: ").append(issuerUniqueID).append("\n");
    sb.append("  sigAlgOID: ").append(sigAlgOID).append("\n");
    sb.append("  sigAlgParams: ").append(sigAlgParams).append("\n");
    sb.append("  subjectAlternativeNames: ").append(subjectAlternativeNames).append("\n");
    sb.append("  subjectUniqueID: ").append(subjectUniqueID).append("\n");
    sb.append("  criticalExtensionOIDs: ").append(criticalExtensionOIDs).append("\n");
    sb.append("  nonCriticalExtensionOIDs: ").append(nonCriticalExtensionOIDs).append("\n");
    sb.append("  encoded: ").append(encoded).append("\n");
    sb.append("  publicKey: ").append(publicKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
