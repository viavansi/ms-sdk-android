package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class WrapSignature  implements Serializable {
  
  @SerializedName("signatureCode")
  private String signatureCode = null;
  @SerializedName("publicKey")
  private String publicKey = null;
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("signedDataBase64")
  private String signedDataBase64 = null;

  
  /**
   * (since 3.5.0) signature code
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) signature code")
  public String getSignatureCode() {
    return signatureCode;
  }
  public void setSignatureCode(String signatureCode) {
    this.signatureCode = signatureCode;
  }

  
  /**
   * (since 3.5.0) public Key
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) public Key")
  public String getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  
  /**
   * (since 3.5.0) message code
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) message code")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   * (since 3.5.0) base 64 hash
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) base 64 hash")
  public String getSignedDataBase64() {
    return signedDataBase64;
  }
  public void setSignedDataBase64(String signedDataBase64) {
    this.signedDataBase64 = signedDataBase64;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapSignature {\n");
    
    sb.append("  signatureCode: ").append(signatureCode).append("\n");
    sb.append("  publicKey: ").append(publicKey).append("\n");
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  signedDataBase64: ").append(signedDataBase64).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
