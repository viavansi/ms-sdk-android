package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.JSMatiData;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class JSMatiDocumentExpired  implements Serializable {
  
  @SerializedName("data")
  private JSMatiData data = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public JSMatiData getData() {
    return data;
  }
  public void setData(JSMatiData data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSMatiDocumentExpired {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
