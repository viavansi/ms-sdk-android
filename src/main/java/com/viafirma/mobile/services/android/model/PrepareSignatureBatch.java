package com.viafirma.mobile.services.android.model;

import java.util.*;
import com.viafirma.mobile.services.android.model.PrepareSignature;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class PrepareSignatureBatch  implements Serializable {
  
  @SerializedName("prepareSignatures")
  private List<PrepareSignature> prepareSignatures = new ArrayList<PrepareSignature>() ;

  
  /**
   * (since 3.7.10) prepare signature list
   **/
  @ApiModelProperty(required = true, value = "(since 3.7.10) prepare signature list")
  public List<PrepareSignature> getPrepareSignatures() {
    return prepareSignatures;
  }
  public void setPrepareSignatures(List<PrepareSignature> prepareSignatures) {
    this.prepareSignatures = prepareSignatures;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareSignatureBatch {\n");
    
    sb.append("  prepareSignatures: ").append(prepareSignatures).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
