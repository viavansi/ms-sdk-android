package com.viafirma.mobile.services.android.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Download  implements Serializable {
  
  @SerializedName("link")
  private String link = null;
  @SerializedName("md5")
  private String md5 = null;
  @SerializedName("fileName")
  private String fileName = null;
  @SerializedName("expires")
  private Date expires = null;
  @SerializedName("base64")
  private String base64 = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMd5() {
    return md5;
  }
  public void setMd5(String md5) {
    this.md5 = md5;
  }

  
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
  public Date getExpires() {
    return expires;
  }
  public void setExpires(Date expires) {
    this.expires = expires;
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
    sb.append("class Download {\n");
    
    sb.append("  link: ").append(link).append("\n");
    sb.append("  md5: ").append(md5).append("\n");
    sb.append("  fileName: ").append(fileName).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("  base64: ").append(base64).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
