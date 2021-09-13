package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.ConfigCadesDTO;
import com.viafirma.mobile.services.android.model.ConfigPolicyDTO;
import java.util.*;
import com.viafirma.mobile.services.android.model.ConfigPadesDTO;
import com.viafirma.mobile.services.android.model.ConfigXadesDTO;
import com.viafirma.mobile.services.android.model.ConfigTsaDTO;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ConfigSignatureDTO  implements Serializable {
  
  @SerializedName("idReference")
  private String idReference = null;
  public enum SignatureAlgorithmEnum {
     RSA_MD5,  RSA_SHA1,  RSA_SHA224,  RSA_SHA256,  RSA_SHA384,  RSA_SHA512, 
  };
  @SerializedName("signatureAlgorithm")
  private SignatureAlgorithmEnum signatureAlgorithm = null;
  @SerializedName("custodyCode")
  private String custodyCode = null;
  @SerializedName("custodyStorage")
  private Boolean custodyStorage = Boolean.FALSE;
  @SerializedName("custodyEncrypted")
  private Boolean custodyEncrypted = Boolean.FALSE;
  @SerializedName("auditoryCipherDisable")
  private Boolean auditoryCipherDisable = Boolean.FALSE;
  @SerializedName("auditoryDisable")
  private Boolean auditoryDisable = Boolean.FALSE;
  @SerializedName("tsa")
  private ConfigTsaDTO tsa = null;
  public enum SignatureTypeEnum {
     CADES_B,  CADES_T,  CADES_LT,  CADES_LTA,  PADES_B,  PADES_T,  PADES_LT,  PADES_LTA,  XADES_B,  XADES_T,  XADES_LT,  XADES_LTA, 
  };
  @SerializedName("signatureType")
  private SignatureTypeEnum signatureType = null;
  public enum PackagingEnum {
     ENVELOPED,  ENVELOPING,  DETACHED, 
  };
  @SerializedName("packaging")
  private PackagingEnum packaging = null;
  @SerializedName("policy")
  private ConfigPolicyDTO policy = null;
  @SerializedName("validSignerIds")
  private List<String> validSignerIds = new ArrayList<String>() ;
  @SerializedName("signatureReason")
  private String signatureReason = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("stateOrProvince")
  private String stateOrProvince = null;
  @SerializedName("postalCode")
  private String postalCode = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("cadesConfig")
  private ConfigCadesDTO cadesConfig = null;
  @SerializedName("padesConfig")
  private ConfigPadesDTO padesConfig = null;
  @SerializedName("xadesConfig")
  private ConfigXadesDTO xadesConfig = null;
  @SerializedName("operationId")
  private String operationId = null;
  @SerializedName("operationServer")
  private String operationServer = null;
  public enum TimestampAlgorithmEnum {
     SHA1,  SHA224,  SHA256,  SHA384,  SHA512,  RIPEMD160,  MD2,  MD5, 
  };
  @SerializedName("timestampAlgorithm")
  private TimestampAlgorithmEnum timestampAlgorithm = null;
  @SerializedName("autoVerifyDisabled")
  private Boolean autoVerifyDisabled = Boolean.FALSE;
  public enum RevocationRequestTypeEnum {
     ONLINE,  ONLINE_WITH_CACHE,  CRL,  CRL_CACHE,  OCSP, 
  };
  @SerializedName("revocationRequestType")
  private RevocationRequestTypeEnum revocationRequestType = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIdReference() {
    return idReference;
  }
  public void setIdReference(String idReference) {
    this.idReference = idReference;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public SignatureAlgorithmEnum getSignatureAlgorithm() {
    return signatureAlgorithm;
  }
  public void setSignatureAlgorithm(SignatureAlgorithmEnum signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCustodyCode() {
    return custodyCode;
  }
  public void setCustodyCode(String custodyCode) {
    this.custodyCode = custodyCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getCustodyStorage() {
    return custodyStorage;
  }
  public void setCustodyStorage(Boolean custodyStorage) {
    this.custodyStorage = custodyStorage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getCustodyEncrypted() {
    return custodyEncrypted;
  }
  public void setCustodyEncrypted(Boolean custodyEncrypted) {
    this.custodyEncrypted = custodyEncrypted;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAuditoryCipherDisable() {
    return auditoryCipherDisable;
  }
  public void setAuditoryCipherDisable(Boolean auditoryCipherDisable) {
    this.auditoryCipherDisable = auditoryCipherDisable;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAuditoryDisable() {
    return auditoryDisable;
  }
  public void setAuditoryDisable(Boolean auditoryDisable) {
    this.auditoryDisable = auditoryDisable;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ConfigTsaDTO getTsa() {
    return tsa;
  }
  public void setTsa(ConfigTsaDTO tsa) {
    this.tsa = tsa;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public SignatureTypeEnum getSignatureType() {
    return signatureType;
  }
  public void setSignatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public PackagingEnum getPackaging() {
    return packaging;
  }
  public void setPackaging(PackagingEnum packaging) {
    this.packaging = packaging;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ConfigPolicyDTO getPolicy() {
    return policy;
  }
  public void setPolicy(ConfigPolicyDTO policy) {
    this.policy = policy;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getValidSignerIds() {
    return validSignerIds;
  }
  public void setValidSignerIds(List<String> validSignerIds) {
    this.validSignerIds = validSignerIds;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignatureReason() {
    return signatureReason;
  }
  public void setSignatureReason(String signatureReason) {
    this.signatureReason = signatureReason;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getStateOrProvince() {
    return stateOrProvince;
  }
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ConfigCadesDTO getCadesConfig() {
    return cadesConfig;
  }
  public void setCadesConfig(ConfigCadesDTO cadesConfig) {
    this.cadesConfig = cadesConfig;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ConfigPadesDTO getPadesConfig() {
    return padesConfig;
  }
  public void setPadesConfig(ConfigPadesDTO padesConfig) {
    this.padesConfig = padesConfig;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ConfigXadesDTO getXadesConfig() {
    return xadesConfig;
  }
  public void setXadesConfig(ConfigXadesDTO xadesConfig) {
    this.xadesConfig = xadesConfig;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getOperationId() {
    return operationId;
  }
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getOperationServer() {
    return operationServer;
  }
  public void setOperationServer(String operationServer) {
    this.operationServer = operationServer;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TimestampAlgorithmEnum getTimestampAlgorithm() {
    return timestampAlgorithm;
  }
  public void setTimestampAlgorithm(TimestampAlgorithmEnum timestampAlgorithm) {
    this.timestampAlgorithm = timestampAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAutoVerifyDisabled() {
    return autoVerifyDisabled;
  }
  public void setAutoVerifyDisabled(Boolean autoVerifyDisabled) {
    this.autoVerifyDisabled = autoVerifyDisabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public RevocationRequestTypeEnum getRevocationRequestType() {
    return revocationRequestType;
  }
  public void setRevocationRequestType(RevocationRequestTypeEnum revocationRequestType) {
    this.revocationRequestType = revocationRequestType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigSignatureDTO {\n");
    
    sb.append("  idReference: ").append(idReference).append("\n");
    sb.append("  signatureAlgorithm: ").append(signatureAlgorithm).append("\n");
    sb.append("  custodyCode: ").append(custodyCode).append("\n");
    sb.append("  custodyStorage: ").append(custodyStorage).append("\n");
    sb.append("  custodyEncrypted: ").append(custodyEncrypted).append("\n");
    sb.append("  auditoryCipherDisable: ").append(auditoryCipherDisable).append("\n");
    sb.append("  auditoryDisable: ").append(auditoryDisable).append("\n");
    sb.append("  tsa: ").append(tsa).append("\n");
    sb.append("  signatureType: ").append(signatureType).append("\n");
    sb.append("  packaging: ").append(packaging).append("\n");
    sb.append("  policy: ").append(policy).append("\n");
    sb.append("  validSignerIds: ").append(validSignerIds).append("\n");
    sb.append("  signatureReason: ").append(signatureReason).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  stateOrProvince: ").append(stateOrProvince).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  cadesConfig: ").append(cadesConfig).append("\n");
    sb.append("  padesConfig: ").append(padesConfig).append("\n");
    sb.append("  xadesConfig: ").append(xadesConfig).append("\n");
    sb.append("  operationId: ").append(operationId).append("\n");
    sb.append("  operationServer: ").append(operationServer).append("\n");
    sb.append("  timestampAlgorithm: ").append(timestampAlgorithm).append("\n");
    sb.append("  autoVerifyDisabled: ").append(autoVerifyDisabled).append("\n");
    sb.append("  revocationRequestType: ").append(revocationRequestType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
