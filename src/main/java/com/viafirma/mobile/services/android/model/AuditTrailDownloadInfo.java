package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailDownloadInfo  implements Serializable {
  
  @SerializedName("buttonTitle")
  private String buttonTitle = null;
  @SerializedName("buttonColor")
  private String buttonColor = null;
  @SerializedName("url")
  private String url = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getButtonTitle() {
    return buttonTitle;
  }
  public void setButtonTitle(String buttonTitle) {
    this.buttonTitle = buttonTitle;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getButtonColor() {
    return buttonColor;
  }
  public void setButtonColor(String buttonColor) {
    this.buttonColor = buttonColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailDownloadInfo {\n");
    
    sb.append("  buttonTitle: ").append(buttonTitle).append("\n");
    sb.append("  buttonColor: ").append(buttonColor).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
