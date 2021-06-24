package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailConfig  implements Serializable {
  
  @SerializedName("locale")
  private String locale = null;
  @SerializedName("timeZone")
  private String timeZone = null;
  @SerializedName("addPdfLinks")
  private Boolean addPdfLinks = Boolean.FALSE;
  @SerializedName("signPDF")
  private Boolean signPDF = Boolean.FALSE;
  @SerializedName("customizationUrl")
  private String customizationUrl = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAddPdfLinks() {
    return addPdfLinks;
  }
  public void setAddPdfLinks(Boolean addPdfLinks) {
    this.addPdfLinks = addPdfLinks;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getSignPDF() {
    return signPDF;
  }
  public void setSignPDF(Boolean signPDF) {
    this.signPDF = signPDF;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCustomizationUrl() {
    return customizationUrl;
  }
  public void setCustomizationUrl(String customizationUrl) {
    this.customizationUrl = customizationUrl;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailConfig {\n");
    
    sb.append("  locale: ").append(locale).append("\n");
    sb.append("  timeZone: ").append(timeZone).append("\n");
    sb.append("  addPdfLinks: ").append(addPdfLinks).append("\n");
    sb.append("  signPDF: ").append(signPDF).append("\n");
    sb.append("  customizationUrl: ").append(customizationUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
