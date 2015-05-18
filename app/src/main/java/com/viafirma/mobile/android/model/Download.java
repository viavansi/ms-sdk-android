package com.viafirma.mobile.android.model;

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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Download {\n");
    
    sb.append("  link: ").append(link).append("\n");
    sb.append("  md5: ").append(md5).append("\n");
    sb.append("  fileName: ").append(fileName).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
