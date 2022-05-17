package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.WrapSignature;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class WrapSignatureBatch  implements Serializable {
  
  @SerializedName("wrapSignatures")
  private List<WrapSignature> wrapSignatures = new ArrayList<WrapSignature>() ;
  @SerializedName("recipientKey")
  private String recipientKey = null;
  @SerializedName("publicKey")
  private String publicKey = null;

  
  /**
   * (since 3.7.10) wrap signature list
   **/
  @ApiModelProperty(required = true, value = "(since 3.7.10) wrap signature list")
  public List<WrapSignature> getWrapSignatures() {
    return wrapSignatures;
  }
  public void setWrapSignatures(List<WrapSignature> wrapSignatures) {
    this.wrapSignatures = wrapSignatures;
  }

  
  /**
   * (since 3.7.35) recipientKey
   **/
  @ApiModelProperty(required = true, value = "(since 3.7.35) recipientKey")
  public String getRecipientKey() {
    return recipientKey;
  }
  public void setRecipientKey(String recipientKey) {
    this.recipientKey = recipientKey;
  }

  
  /**
   * (since 3.7.35) publicKey
   **/
  @ApiModelProperty(required = false, value = "(since 3.7.35) publicKey")
  public String getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapSignatureBatch {\n");
    
    sb.append("  wrapSignatures: ").append(wrapSignatures).append("\n");
    sb.append("  recipientKey: ").append(recipientKey).append("\n");
    sb.append("  publicKey: ").append(publicKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
