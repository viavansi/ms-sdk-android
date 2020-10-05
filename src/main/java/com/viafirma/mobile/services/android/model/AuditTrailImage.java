package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailImage  implements Serializable {
  
  @SerializedName("relativePath")
  private String relativePath = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("base64Content")
  private String base64Content = null;
  @SerializedName("height")
  private Integer height = null;
  @SerializedName("width")
  private Integer width = null;
  public enum ImageFormatEnum {
     JPG,  PNG, 
  };
  @SerializedName("imageFormat")
  private ImageFormatEnum imageFormat = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRelativePath() {
    return relativePath;
  }
  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getBase64Content() {
    return base64Content;
  }
  public void setBase64Content(String base64Content) {
    this.base64Content = base64Content;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ImageFormatEnum getImageFormat() {
    return imageFormat;
  }
  public void setImageFormat(ImageFormatEnum imageFormat) {
    this.imageFormat = imageFormat;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailImage {\n");
    
    sb.append("  relativePath: ").append(relativePath).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  base64Content: ").append(base64Content).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  imageFormat: ").append(imageFormat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
