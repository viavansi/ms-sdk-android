package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.ConfigSignatureDTO;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class SignatureCodeDTO  implements Serializable {
  
  @SerializedName("custodyPathV1")
  private String custodyPathV1 = null;
  @SerializedName("config")
  private ConfigSignatureDTO config = null;
  @SerializedName("valid")
  private Boolean valid = Boolean.FALSE;
  @SerializedName("custodyPath")
  private String custodyPath = null;
  @SerializedName("type")
  private String type = null;
  public enum PackagingEnum {
     ENVELOPED,  ENVELOPING,  DETACHED, 
  };
  @SerializedName("packaging")
  private PackagingEnum packaging = null;
  @SerializedName("date")
  private Date date = null;
  @SerializedName("cades")
  private Boolean cades = Boolean.FALSE;
  @SerializedName("xades")
  private Boolean xades = Boolean.FALSE;
  @SerializedName("pades")
  private Boolean pades = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCustodyPathV1() {
    return custodyPathV1;
  }
  public void setCustodyPathV1(String custodyPathV1) {
    this.custodyPathV1 = custodyPathV1;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ConfigSignatureDTO getConfig() {
    return config;
  }
  public void setConfig(ConfigSignatureDTO config) {
    this.config = config;
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
  public String getCustodyPath() {
    return custodyPath;
  }
  public void setCustodyPath(String custodyPath) {
    this.custodyPath = custodyPath;
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
  public PackagingEnum getPackaging() {
    return packaging;
  }
  public void setPackaging(PackagingEnum packaging) {
    this.packaging = packaging;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getCades() {
    return cades;
  }
  public void setCades(Boolean cades) {
    this.cades = cades;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getXades() {
    return xades;
  }
  public void setXades(Boolean xades) {
    this.xades = xades;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getPades() {
    return pades;
  }
  public void setPades(Boolean pades) {
    this.pades = pades;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureCodeDTO {\n");
    
    sb.append("  custodyPathV1: ").append(custodyPathV1).append("\n");
    sb.append("  config: ").append(config).append("\n");
    sb.append("  valid: ").append(valid).append("\n");
    sb.append("  custodyPath: ").append(custodyPath).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  packaging: ").append(packaging).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  cades: ").append(cades).append("\n");
    sb.append("  xades: ").append(xades).append("\n");
    sb.append("  pades: ").append(pades).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
