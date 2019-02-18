package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class OcrScanImageCustom  implements Serializable {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("base64Image")
  private String base64Image = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getBase64Image() {
    return base64Image;
  }
  public void setBase64Image(String base64Image) {
    this.base64Image = base64Image;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrScanImageCustom {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  base64Image: ").append(base64Image).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
