package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Stamper;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Signature  implements Serializable {
  
  public enum TypeEnum {
     CLIENT,  SERVER, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("code")
  private String code = null;
  public enum StatusEnum {
     PENDING,  RECEIVED,  SIGNED,  PREPARED,  CLICKED,  CLIENT_OPENED, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("helpText")
  private String helpText = null;
  @SerializedName("certificateAlias")
  private String certificateAlias = null;
  @SerializedName("certificatePassword")
  private String certificatePassword = null;
  public enum TypeFormatSignEnum {
     PADES_B,  PADES_T,  PADES_LT,  PADES_LTA, 
  };
  @SerializedName("typeFormatSign")
  private TypeFormatSignEnum typeFormatSign = null;
  @SerializedName("dataToSign")
  private String dataToSign = null;
  @SerializedName("idSign")
  private String idSign = null;
  @SerializedName("custodyDisabled")
  private Boolean custodyDisabled = Boolean.FALSE;
  @SerializedName("stampers")
  private List<Stamper> stampers = new ArrayList<Stamper>() ;
  @SerializedName("lastUpdated")
  private Long lastUpdated = null;
  public enum CertificationLevelEnum {
     NOT_CERTIFIED,  CERTIFIED_NO_CHANGES_ALLOWED,  CERTIFIED_FORM_FILLING,  CERTIFIED_FORM_FILLING_AND_ANNOTATIONS, 
  };
  @SerializedName("certificationLevel")
  private CertificationLevelEnum certificationLevel = null;

  
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
  public TypeFormatSignEnum getTypeFormatSign() {
    return typeFormatSign;
  }
  public void setTypeFormatSign(TypeFormatSignEnum typeFormatSign) {
    this.typeFormatSign = typeFormatSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDataToSign() {
    return dataToSign;
  }
  public void setDataToSign(String dataToSign) {
    this.dataToSign = dataToSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIdSign() {
    return idSign;
  }
  public void setIdSign(String idSign) {
    this.idSign = idSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getCustodyDisabled() {
    return custodyDisabled;
  }
  public void setCustodyDisabled(Boolean custodyDisabled) {
    this.custodyDisabled = custodyDisabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Stamper> getStampers() {
    return stampers;
  }
  public void setStampers(List<Stamper> stampers) {
    this.stampers = stampers;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public CertificationLevelEnum getCertificationLevel() {
    return certificationLevel;
  }
  public void setCertificationLevel(CertificationLevelEnum certificationLevel) {
    this.certificationLevel = certificationLevel;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  helpText: ").append(helpText).append("\n");
    sb.append("  certificateAlias: ").append(certificateAlias).append("\n");
    sb.append("  certificatePassword: ").append(certificatePassword).append("\n");
    sb.append("  typeFormatSign: ").append(typeFormatSign).append("\n");
    sb.append("  dataToSign: ").append(dataToSign).append("\n");
    sb.append("  idSign: ").append(idSign).append("\n");
    sb.append("  custodyDisabled: ").append(custodyDisabled).append("\n");
    sb.append("  stampers: ").append(stampers).append("\n");
    sb.append("  lastUpdated: ").append(lastUpdated).append("\n");
    sb.append("  certificationLevel: ").append(certificationLevel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}