package com.viafirma.mobile.services.android.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class VerifierCrlDTO  implements Serializable {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("version")
  private String version = null;
  @SerializedName("issuer")
  private String issuer = null;
  @SerializedName("signingAlgorithm")
  private String signingAlgorithm = null;
  @SerializedName("signingOID")
  private String signingOID = null;
  @SerializedName("nextUpdate")
  private Date nextUpdate = null;
  @SerializedName("thisUpdate")
  private Date thisUpdate = null;

  
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
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSigningAlgorithm() {
    return signingAlgorithm;
  }
  public void setSigningAlgorithm(String signingAlgorithm) {
    this.signingAlgorithm = signingAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSigningOID() {
    return signingOID;
  }
  public void setSigningOID(String signingOID) {
    this.signingOID = signingOID;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getNextUpdate() {
    return nextUpdate;
  }
  public void setNextUpdate(Date nextUpdate) {
    this.nextUpdate = nextUpdate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getThisUpdate() {
    return thisUpdate;
  }
  public void setThisUpdate(Date thisUpdate) {
    this.thisUpdate = thisUpdate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifierCrlDTO {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  issuer: ").append(issuer).append("\n");
    sb.append("  signingAlgorithm: ").append(signingAlgorithm).append("\n");
    sb.append("  signingOID: ").append(signingOID).append("\n");
    sb.append("  nextUpdate: ").append(nextUpdate).append("\n");
    sb.append("  thisUpdate: ").append(thisUpdate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
