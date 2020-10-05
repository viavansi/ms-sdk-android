package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.AuditTrailImage;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailFooter  implements Serializable {
  
  @SerializedName("initialText")
  private String initialText = null;
  @SerializedName("footerLogo")
  private AuditTrailImage footerLogo = null;
  @SerializedName("highlightedText")
  private String highlightedText = null;
  @SerializedName("includePermalink")
  private Boolean includePermalink = Boolean.FALSE;
  @SerializedName("auditTrailPDFDocumentPermalinkURL")
  private String auditTrailPDFDocumentPermalinkURL = null;
  @SerializedName("includeQR")
  private Boolean includeQR = Boolean.FALSE;
  @SerializedName("issuerInfo")
  private String issuerInfo = null;
  @SerializedName("issuerExtraInfo")
  private String issuerExtraInfo = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getInitialText() {
    return initialText;
  }
  public void setInitialText(String initialText) {
    this.initialText = initialText;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public AuditTrailImage getFooterLogo() {
    return footerLogo;
  }
  public void setFooterLogo(AuditTrailImage footerLogo) {
    this.footerLogo = footerLogo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getHighlightedText() {
    return highlightedText;
  }
  public void setHighlightedText(String highlightedText) {
    this.highlightedText = highlightedText;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getIncludePermalink() {
    return includePermalink;
  }
  public void setIncludePermalink(Boolean includePermalink) {
    this.includePermalink = includePermalink;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAuditTrailPDFDocumentPermalinkURL() {
    return auditTrailPDFDocumentPermalinkURL;
  }
  public void setAuditTrailPDFDocumentPermalinkURL(String auditTrailPDFDocumentPermalinkURL) {
    this.auditTrailPDFDocumentPermalinkURL = auditTrailPDFDocumentPermalinkURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getIncludeQR() {
    return includeQR;
  }
  public void setIncludeQR(Boolean includeQR) {
    this.includeQR = includeQR;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIssuerInfo() {
    return issuerInfo;
  }
  public void setIssuerInfo(String issuerInfo) {
    this.issuerInfo = issuerInfo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIssuerExtraInfo() {
    return issuerExtraInfo;
  }
  public void setIssuerExtraInfo(String issuerExtraInfo) {
    this.issuerExtraInfo = issuerExtraInfo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailFooter {\n");
    
    sb.append("  initialText: ").append(initialText).append("\n");
    sb.append("  footerLogo: ").append(footerLogo).append("\n");
    sb.append("  highlightedText: ").append(highlightedText).append("\n");
    sb.append("  includePermalink: ").append(includePermalink).append("\n");
    sb.append("  auditTrailPDFDocumentPermalinkURL: ").append(auditTrailPDFDocumentPermalinkURL).append("\n");
    sb.append("  includeQR: ").append(includeQR).append("\n");
    sb.append("  issuerInfo: ").append(issuerInfo).append("\n");
    sb.append("  issuerExtraInfo: ").append(issuerExtraInfo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
