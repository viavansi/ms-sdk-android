package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class SignPageStyle  implements Serializable {
  
  @SerializedName("logo")
  private String logo = null;
  @SerializedName("mainColor")
  private String mainColor = null;
  @SerializedName("mainNegativeColor")
  private String mainNegativeColor = null;
  @SerializedName("headerBackgroundColor")
  private String headerBackgroundColor = null;
  @SerializedName("headerTextColor")
  private String headerTextColor = null;
  @SerializedName("infoClearColor")
  private String infoClearColor = null;
  @SerializedName("infoMainColor")
  private String infoMainColor = null;
  @SerializedName("infoMainNegativeColor")
  private String infoMainNegativeColor = null;
  @SerializedName("warningClearColor")
  private String warningClearColor = null;
  @SerializedName("warningMainColor")
  private String warningMainColor = null;
  @SerializedName("warningMainNegativeColor")
  private String warningMainNegativeColor = null;
  @SerializedName("errorClearColor")
  private String errorClearColor = null;
  @SerializedName("errorMainColor")
  private String errorMainColor = null;
  @SerializedName("errorMainNegativeColor")
  private String errorMainNegativeColor = null;
  @SerializedName("successClearColor")
  private String successClearColor = null;
  @SerializedName("successMainColor")
  private String successMainColor = null;
  @SerializedName("successMainNegativeColor")
  private String successMainNegativeColor = null;
  @SerializedName("linkColor")
  private String linkColor = null;
  @SerializedName("avoidGeolocation")
  private Boolean avoidGeolocation = Boolean.FALSE;
  @SerializedName("hideDocumentBeforeStart")
  private Boolean hideDocumentBeforeStart = Boolean.FALSE;
  @SerializedName("hideRejectAction")
  private Boolean hideRejectAction = Boolean.FALSE;
  @SerializedName("hideOpenInApp")
  private Boolean hideOpenInApp = Boolean.FALSE;
  @SerializedName("hideIntro")
  private Boolean hideIntro = Boolean.FALSE;
  @SerializedName("hideAuditTrailLink")
  private Boolean hideAuditTrailLink = Boolean.FALSE;
  @SerializedName("showUploadSignature")
  private Boolean showUploadSignature = Boolean.FALSE;
  @SerializedName("languageId")
  private String languageId = null;
  @SerializedName("hideSidebar")
  private Boolean hideSidebar = Boolean.FALSE;
  @SerializedName("hideHeader")
  private Boolean hideHeader = Boolean.FALSE;
  @SerializedName("favicon")
  private String favicon = null;
  @SerializedName("tabTitle")
  private String tabTitle = null;
  @SerializedName("panelAttachmentsFirst")
  private Boolean panelAttachmentsFirst = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLogo() {
    return logo;
  }
  public void setLogo(String logo) {
    this.logo = logo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMainColor() {
    return mainColor;
  }
  public void setMainColor(String mainColor) {
    this.mainColor = mainColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMainNegativeColor() {
    return mainNegativeColor;
  }
  public void setMainNegativeColor(String mainNegativeColor) {
    this.mainNegativeColor = mainNegativeColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getHeaderBackgroundColor() {
    return headerBackgroundColor;
  }
  public void setHeaderBackgroundColor(String headerBackgroundColor) {
    this.headerBackgroundColor = headerBackgroundColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getHeaderTextColor() {
    return headerTextColor;
  }
  public void setHeaderTextColor(String headerTextColor) {
    this.headerTextColor = headerTextColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getInfoClearColor() {
    return infoClearColor;
  }
  public void setInfoClearColor(String infoClearColor) {
    this.infoClearColor = infoClearColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getInfoMainColor() {
    return infoMainColor;
  }
  public void setInfoMainColor(String infoMainColor) {
    this.infoMainColor = infoMainColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getInfoMainNegativeColor() {
    return infoMainNegativeColor;
  }
  public void setInfoMainNegativeColor(String infoMainNegativeColor) {
    this.infoMainNegativeColor = infoMainNegativeColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getWarningClearColor() {
    return warningClearColor;
  }
  public void setWarningClearColor(String warningClearColor) {
    this.warningClearColor = warningClearColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getWarningMainColor() {
    return warningMainColor;
  }
  public void setWarningMainColor(String warningMainColor) {
    this.warningMainColor = warningMainColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getWarningMainNegativeColor() {
    return warningMainNegativeColor;
  }
  public void setWarningMainNegativeColor(String warningMainNegativeColor) {
    this.warningMainNegativeColor = warningMainNegativeColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getErrorClearColor() {
    return errorClearColor;
  }
  public void setErrorClearColor(String errorClearColor) {
    this.errorClearColor = errorClearColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getErrorMainColor() {
    return errorMainColor;
  }
  public void setErrorMainColor(String errorMainColor) {
    this.errorMainColor = errorMainColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getErrorMainNegativeColor() {
    return errorMainNegativeColor;
  }
  public void setErrorMainNegativeColor(String errorMainNegativeColor) {
    this.errorMainNegativeColor = errorMainNegativeColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSuccessClearColor() {
    return successClearColor;
  }
  public void setSuccessClearColor(String successClearColor) {
    this.successClearColor = successClearColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSuccessMainColor() {
    return successMainColor;
  }
  public void setSuccessMainColor(String successMainColor) {
    this.successMainColor = successMainColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSuccessMainNegativeColor() {
    return successMainNegativeColor;
  }
  public void setSuccessMainNegativeColor(String successMainNegativeColor) {
    this.successMainNegativeColor = successMainNegativeColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLinkColor() {
    return linkColor;
  }
  public void setLinkColor(String linkColor) {
    this.linkColor = linkColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAvoidGeolocation() {
    return avoidGeolocation;
  }
  public void setAvoidGeolocation(Boolean avoidGeolocation) {
    this.avoidGeolocation = avoidGeolocation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getHideDocumentBeforeStart() {
    return hideDocumentBeforeStart;
  }
  public void setHideDocumentBeforeStart(Boolean hideDocumentBeforeStart) {
    this.hideDocumentBeforeStart = hideDocumentBeforeStart;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getHideRejectAction() {
    return hideRejectAction;
  }
  public void setHideRejectAction(Boolean hideRejectAction) {
    this.hideRejectAction = hideRejectAction;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getHideOpenInApp() {
    return hideOpenInApp;
  }
  public void setHideOpenInApp(Boolean hideOpenInApp) {
    this.hideOpenInApp = hideOpenInApp;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getHideIntro() {
    return hideIntro;
  }
  public void setHideIntro(Boolean hideIntro) {
    this.hideIntro = hideIntro;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getHideAuditTrailLink() {
    return hideAuditTrailLink;
  }
  public void setHideAuditTrailLink(Boolean hideAuditTrailLink) {
    this.hideAuditTrailLink = hideAuditTrailLink;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getShowUploadSignature() {
    return showUploadSignature;
  }
  public void setShowUploadSignature(Boolean showUploadSignature) {
    this.showUploadSignature = showUploadSignature;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getHideSidebar() {
    return hideSidebar;
  }
  public void setHideSidebar(Boolean hideSidebar) {
    this.hideSidebar = hideSidebar;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getHideHeader() {
    return hideHeader;
  }
  public void setHideHeader(Boolean hideHeader) {
    this.hideHeader = hideHeader;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFavicon() {
    return favicon;
  }
  public void setFavicon(String favicon) {
    this.favicon = favicon;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTabTitle() {
    return tabTitle;
  }
  public void setTabTitle(String tabTitle) {
    this.tabTitle = tabTitle;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getPanelAttachmentsFirst() {
    return panelAttachmentsFirst;
  }
  public void setPanelAttachmentsFirst(Boolean panelAttachmentsFirst) {
    this.panelAttachmentsFirst = panelAttachmentsFirst;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignPageStyle {\n");
    
    sb.append("  logo: ").append(logo).append("\n");
    sb.append("  mainColor: ").append(mainColor).append("\n");
    sb.append("  mainNegativeColor: ").append(mainNegativeColor).append("\n");
    sb.append("  headerBackgroundColor: ").append(headerBackgroundColor).append("\n");
    sb.append("  headerTextColor: ").append(headerTextColor).append("\n");
    sb.append("  infoClearColor: ").append(infoClearColor).append("\n");
    sb.append("  infoMainColor: ").append(infoMainColor).append("\n");
    sb.append("  infoMainNegativeColor: ").append(infoMainNegativeColor).append("\n");
    sb.append("  warningClearColor: ").append(warningClearColor).append("\n");
    sb.append("  warningMainColor: ").append(warningMainColor).append("\n");
    sb.append("  warningMainNegativeColor: ").append(warningMainNegativeColor).append("\n");
    sb.append("  errorClearColor: ").append(errorClearColor).append("\n");
    sb.append("  errorMainColor: ").append(errorMainColor).append("\n");
    sb.append("  errorMainNegativeColor: ").append(errorMainNegativeColor).append("\n");
    sb.append("  successClearColor: ").append(successClearColor).append("\n");
    sb.append("  successMainColor: ").append(successMainColor).append("\n");
    sb.append("  successMainNegativeColor: ").append(successMainNegativeColor).append("\n");
    sb.append("  linkColor: ").append(linkColor).append("\n");
    sb.append("  avoidGeolocation: ").append(avoidGeolocation).append("\n");
    sb.append("  hideDocumentBeforeStart: ").append(hideDocumentBeforeStart).append("\n");
    sb.append("  hideRejectAction: ").append(hideRejectAction).append("\n");
    sb.append("  hideOpenInApp: ").append(hideOpenInApp).append("\n");
    sb.append("  hideIntro: ").append(hideIntro).append("\n");
    sb.append("  hideAuditTrailLink: ").append(hideAuditTrailLink).append("\n");
    sb.append("  showUploadSignature: ").append(showUploadSignature).append("\n");
    sb.append("  languageId: ").append(languageId).append("\n");
    sb.append("  hideSidebar: ").append(hideSidebar).append("\n");
    sb.append("  hideHeader: ").append(hideHeader).append("\n");
    sb.append("  favicon: ").append(favicon).append("\n");
    sb.append("  tabTitle: ").append(tabTitle).append("\n");
    sb.append("  panelAttachmentsFirst: ").append(panelAttachmentsFirst).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
