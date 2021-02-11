package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.PublicKey;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Certificate  implements Serializable {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("encoded")
  private List<String> encoded = new ArrayList<String>() ;
  @SerializedName("publicKey")
  private PublicKey publicKey = null;

  
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
  public List<String> getEncoded() {
    return encoded;
  }
  public void setEncoded(List<String> encoded) {
    this.encoded = encoded;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public PublicKey getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(PublicKey publicKey) {
    this.publicKey = publicKey;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Certificate {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  encoded: ").append(encoded).append("\n");
    sb.append("  publicKey: ").append(publicKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
