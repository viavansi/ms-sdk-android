package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ConfigCadesDTO  implements Serializable {
  
  @SerializedName("toCounterSignSignatureValueId")
  private String toCounterSignSignatureValueId = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getToCounterSignSignatureValueId() {
    return toCounterSignSignatureValueId;
  }
  public void setToCounterSignSignatureValueId(String toCounterSignSignatureValueId) {
    this.toCounterSignSignatureValueId = toCounterSignSignatureValueId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigCadesDTO {\n");
    
    sb.append("  toCounterSignSignatureValueId: ").append(toCounterSignSignatureValueId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
