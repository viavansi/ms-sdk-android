package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Signature;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class SignatureBatch  implements Serializable {
  
  @SerializedName("signatures")
  private List<Signature> signatures = new ArrayList<Signature>() ;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Signature> getSignatures() {
    return signatures;
  }
  public void setSignatures(List<Signature> signatures) {
    this.signatures = signatures;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureBatch {\n");
    
    sb.append("  signatures: ").append(signatures).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
