package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AttachmentFile  implements Serializable {
  
  @SerializedName("fileName")
  private String fileName = null;
  @SerializedName("size")
  private Integer size = null;

  
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
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentFile {\n");
    
    sb.append("  fileName: ").append(fileName).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
