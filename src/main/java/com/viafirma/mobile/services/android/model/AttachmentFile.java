package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AttachmentFile  implements Serializable {
  
  @SerializedName("fileName")
  private String fileName = null;
  @SerializedName("base64")
  private String base64 = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getBase64() {
    return base64;
  }
  public void setBase64(String base64) {
    this.base64 = base64;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentFile {\n");
    
    sb.append("  fileName: ").append(fileName).append("\n");
    sb.append("  base64: ").append(base64).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
