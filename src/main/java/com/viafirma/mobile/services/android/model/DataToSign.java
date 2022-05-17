package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class DataToSign  implements Serializable {
  
  @SerializedName("algorithm")
  private String algorithm = null;
  @SerializedName("hash")
  private String hash = null;
  @SerializedName("idSign")
  private String idSign = null;
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("signatureCode")
  private String signatureCode = null;

  
  /**
   * (since 3.5.0) signature algorith
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) signature algorith")
  public String getAlgorithm() {
    return algorithm;
  }
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  
  /**
   * (since 3.5.0) hash to sign
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) hash to sign")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
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
   * (since 3.7.35) message code
   **/
  @ApiModelProperty(required = false, value = "(since 3.7.35) message code")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignatureCode() {
    return signatureCode;
  }
  public void setSignatureCode(String signatureCode) {
    this.signatureCode = signatureCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataToSign {\n");
    
    sb.append("  algorithm: ").append(algorithm).append("\n");
    sb.append("  hash: ").append(hash).append("\n");
    sb.append("  idSign: ").append(idSign).append("\n");
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  signatureCode: ").append(signatureCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
