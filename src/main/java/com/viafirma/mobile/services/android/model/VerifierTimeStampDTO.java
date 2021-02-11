package com.viafirma.mobile.services.android.model;

import java.util.Date;
import com.viafirma.mobile.services.android.model.VerifierCertificateDTO;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class VerifierTimeStampDTO  implements Serializable {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("indication")
  private String indication = null;
  @SerializedName("subIndication")
  private String subIndication = null;
  @SerializedName("digestAlgo")
  private String digestAlgo = null;
  @SerializedName("productionTime")
  private Date productionTime = null;
  @SerializedName("certificate")
  private VerifierCertificateDTO certificate = null;

  
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
  public String getDigestAlgo() {
    return digestAlgo;
  }
  public void setDigestAlgo(String digestAlgo) {
    this.digestAlgo = digestAlgo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getProductionTime() {
    return productionTime;
  }
  public void setProductionTime(Date productionTime) {
    this.productionTime = productionTime;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifierTimeStampDTO {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  indication: ").append(indication).append("\n");
    sb.append("  subIndication: ").append(subIndication).append("\n");
    sb.append("  digestAlgo: ").append(digestAlgo).append("\n");
    sb.append("  productionTime: ").append(productionTime).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
