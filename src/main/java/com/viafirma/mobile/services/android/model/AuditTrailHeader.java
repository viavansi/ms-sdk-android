package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.AuditTrailImage;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailHeader  implements Serializable {
  
  @SerializedName("mainLogo")
  private AuditTrailImage mainLogo = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("text")
  private String text = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public AuditTrailImage getMainLogo() {
    return mainLogo;
  }
  public void setMainLogo(AuditTrailImage mainLogo) {
    this.mainLogo = mainLogo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailHeader {\n");
    
    sb.append("  mainLogo: ").append(mainLogo).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
