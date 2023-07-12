package com.viafirma.mobile.services.android.model;

import java.util.*;
import java.util.Map;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class FortressCertificate  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("dateIssued")
  private Long dateIssued = null;
  @SerializedName("dateExpired")
  private Long dateExpired = null;
  @SerializedName("dateRevoked")
  private Long dateRevoked = null;
  @SerializedName("serialNumber")
  private String serialNumber = null;
  @SerializedName("issuer")
  private String issuer = null;
  @SerializedName("subject")
  private String subject = null;
  @SerializedName("pem")
  private String pem = null;
  @SerializedName("issuerMap")
  private Map<String, String> issuerMap = new HashMap<String, String>() ;
  @SerializedName("subjectMap")
  private Map<String, String> subjectMap = new HashMap<String, String>() ;
  @SerializedName("delegated")
  private Boolean delegated = Boolean.FALSE;
  @SerializedName("level")
  private String level = null;

  
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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getDateIssued() {
    return dateIssued;
  }
  public void setDateIssued(Long dateIssued) {
    this.dateIssued = dateIssued;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getDateExpired() {
    return dateExpired;
  }
  public void setDateExpired(Long dateExpired) {
    this.dateExpired = dateExpired;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getDateRevoked() {
    return dateRevoked;
  }
  public void setDateRevoked(Long dateRevoked) {
    this.dateRevoked = dateRevoked;
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
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
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
  public String getPem() {
    return pem;
  }
  public void setPem(String pem) {
    this.pem = pem;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Map<String, String> getIssuerMap() {
    return issuerMap;
  }
  public void setIssuerMap(Map<String, String> issuerMap) {
    this.issuerMap = issuerMap;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Map<String, String> getSubjectMap() {
    return subjectMap;
  }
  public void setSubjectMap(Map<String, String> subjectMap) {
    this.subjectMap = subjectMap;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getDelegated() {
    return delegated;
  }
  public void setDelegated(Boolean delegated) {
    this.delegated = delegated;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FortressCertificate {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  dateIssued: ").append(dateIssued).append("\n");
    sb.append("  dateExpired: ").append(dateExpired).append("\n");
    sb.append("  dateRevoked: ").append(dateRevoked).append("\n");
    sb.append("  serialNumber: ").append(serialNumber).append("\n");
    sb.append("  issuer: ").append(issuer).append("\n");
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("  pem: ").append(pem).append("\n");
    sb.append("  issuerMap: ").append(issuerMap).append("\n");
    sb.append("  subjectMap: ").append(subjectMap).append("\n");
    sb.append("  delegated: ").append(delegated).append("\n");
    sb.append("  level: ").append(level).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
