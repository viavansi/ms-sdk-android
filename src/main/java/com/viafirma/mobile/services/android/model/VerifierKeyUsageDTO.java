package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class VerifierKeyUsageDTO  implements Serializable {
  
  @SerializedName("digitalSignature")
  private Boolean digitalSignature = Boolean.FALSE;
  @SerializedName("nonRepudiation")
  private Boolean nonRepudiation = Boolean.FALSE;
  @SerializedName("keyEncipherment")
  private Boolean keyEncipherment = Boolean.FALSE;
  @SerializedName("dataEncipherment")
  private Boolean dataEncipherment = Boolean.FALSE;
  @SerializedName("keyAgreement")
  private Boolean keyAgreement = Boolean.FALSE;
  @SerializedName("keyCertSign")
  private Boolean keyCertSign = Boolean.FALSE;
  @SerializedName("iscRLSign")
  private Boolean iscRLSign = Boolean.FALSE;
  @SerializedName("encipherOnly")
  private Boolean encipherOnly = Boolean.FALSE;
  @SerializedName("decipherOnly")
  private Boolean decipherOnly = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getDigitalSignature() {
    return digitalSignature;
  }
  public void setDigitalSignature(Boolean digitalSignature) {
    this.digitalSignature = digitalSignature;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getNonRepudiation() {
    return nonRepudiation;
  }
  public void setNonRepudiation(Boolean nonRepudiation) {
    this.nonRepudiation = nonRepudiation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getKeyEncipherment() {
    return keyEncipherment;
  }
  public void setKeyEncipherment(Boolean keyEncipherment) {
    this.keyEncipherment = keyEncipherment;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getDataEncipherment() {
    return dataEncipherment;
  }
  public void setDataEncipherment(Boolean dataEncipherment) {
    this.dataEncipherment = dataEncipherment;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getKeyAgreement() {
    return keyAgreement;
  }
  public void setKeyAgreement(Boolean keyAgreement) {
    this.keyAgreement = keyAgreement;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getKeyCertSign() {
    return keyCertSign;
  }
  public void setKeyCertSign(Boolean keyCertSign) {
    this.keyCertSign = keyCertSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getIscRLSign() {
    return iscRLSign;
  }
  public void setIscRLSign(Boolean iscRLSign) {
    this.iscRLSign = iscRLSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getEncipherOnly() {
    return encipherOnly;
  }
  public void setEncipherOnly(Boolean encipherOnly) {
    this.encipherOnly = encipherOnly;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getDecipherOnly() {
    return decipherOnly;
  }
  public void setDecipherOnly(Boolean decipherOnly) {
    this.decipherOnly = decipherOnly;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifierKeyUsageDTO {\n");
    
    sb.append("  digitalSignature: ").append(digitalSignature).append("\n");
    sb.append("  nonRepudiation: ").append(nonRepudiation).append("\n");
    sb.append("  keyEncipherment: ").append(keyEncipherment).append("\n");
    sb.append("  dataEncipherment: ").append(dataEncipherment).append("\n");
    sb.append("  keyAgreement: ").append(keyAgreement).append("\n");
    sb.append("  keyCertSign: ").append(keyCertSign).append("\n");
    sb.append("  iscRLSign: ").append(iscRLSign).append("\n");
    sb.append("  encipherOnly: ").append(encipherOnly).append("\n");
    sb.append("  decipherOnly: ").append(decipherOnly).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
