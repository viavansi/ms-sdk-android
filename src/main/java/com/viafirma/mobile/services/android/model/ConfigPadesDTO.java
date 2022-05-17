package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.StamperDTO;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ConfigPadesDTO  implements Serializable {
  
  @SerializedName("stamper")
  private StamperDTO stamper = null;
  public enum CertificationLevelEnum {
     NOT_CERTIFIED,  CERTIFIED_NO_CHANGES_ALLOWED,  CERTIFIED_FORM_FILLING,  CERTIFIED_FORM_FILLING_AND_ANNOTATIONS, 
  };
  @SerializedName("certificationLevel")
  private CertificationLevelEnum certificationLevel = null;
  @SerializedName("externalPkcs7Signature")
  private Boolean externalPkcs7Signature = Boolean.FALSE;
  @SerializedName("password")
  private String password = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public StamperDTO getStamper() {
    return stamper;
  }
  public void setStamper(StamperDTO stamper) {
    this.stamper = stamper;
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getExternalPkcs7Signature() {
    return externalPkcs7Signature;
  }
  public void setExternalPkcs7Signature(Boolean externalPkcs7Signature) {
    this.externalPkcs7Signature = externalPkcs7Signature;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigPadesDTO {\n");
    
    sb.append("  stamper: ").append(stamper).append("\n");
    sb.append("  certificationLevel: ").append(certificationLevel).append("\n");
    sb.append("  externalPkcs7Signature: ").append(externalPkcs7Signature).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
