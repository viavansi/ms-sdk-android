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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapSignatureBatch {\n");
    
    sb.append("  wrapSignatures: ").append(wrapSignatures).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
