package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AppCustomization  implements Serializable {
  
  @SerializedName("logo")
  private String logo = null;
  @SerializedName("mainColor")
  private String mainColor = null;
  @SerializedName("mainNegativeColor")
  private String mainNegativeColor = null;
  @SerializedName("errorMainColor")
  private String errorMainColor = null;
  @SerializedName("errorMainNegativeColor")
  private String errorMainNegativeColor = null;
  @SerializedName("successMainColor")
  private String successMainColor = null;
  @SerializedName("successMainNegativeColor")
  private String successMainNegativeColor = null;
  @SerializedName("darkColor")
  private String darkColor = null;
  @SerializedName("darkNegativeColor")
  private String darkNegativeColor = null;
  @SerializedName("serverEndpointSsoUrl")
  private String serverEndpointSsoUrl = null;
  @SerializedName("loginDisabled")
  private Boolean loginDisabled = Boolean.FALSE;
  @SerializedName("showQr")
  private Boolean showQr = Boolean.FALSE;
  @SerializedName("apiEditable")
  private Boolean apiEditable = Boolean.FALSE;
  @SerializedName("showCertificate")
  private Boolean showCertificate = Boolean.FALSE;
  @SerializedName("targetScanEnabled")
  private Boolean targetScanEnabled = Boolean.FALSE;
  @SerializedName("expirationDays")
  private Integer expirationDays = null;
  @SerializedName("autoDownloadFinished")
  private Boolean autoDownloadFinished = Boolean.FALSE;
  @SerializedName("autoDownloadInbox")
  private Boolean autoDownloadInbox = Boolean.FALSE;
  @SerializedName("forceGeolocationOnEvidence")
  private Boolean forceGeolocationOnEvidence = Boolean.FALSE;
  @SerializedName("fortressEnabled")
  private Boolean fortressEnabled = Boolean.FALSE;
  @SerializedName("sessionTimeoutMinutes")
  private Integer sessionTimeoutMinutes = null;
  @SerializedName("userGroupsEnabled")
  private Boolean userGroupsEnabled = Boolean.FALSE;
  @SerializedName("offlineIndicatorEnabled")
  private Boolean offlineIndicatorEnabled = Boolean.FALSE;
  @SerializedName("allowNewRequests")
  private Boolean allowNewRequests = Boolean.FALSE;
  @SerializedName("crmTransactEnabled")
  private Boolean crmTransactEnabled = Boolean.FALSE;
  @SerializedName("hideUrl")
  private Boolean hideUrl = Boolean.FALSE;
  @SerializedName("settingsCertificatesHide")
  private Boolean settingsCertificatesHide = Boolean.FALSE;
  @SerializedName("settingsDocAssistantHide")
  private Boolean settingsDocAssistantHide = Boolean.FALSE;
  @SerializedName("showActionsOnPdfOpen")
  private Boolean showActionsOnPdfOpen = Boolean.FALSE;
  @SerializedName("forceStylus")
  private Boolean forceStylus = Boolean.FALSE;
  @SerializedName("defaultStylus")
  private String defaultStylus = null;
  @SerializedName("strokeWidth")
  private Integer strokeWidth = null;
  @SerializedName("strokeWidthPhone")
  private Integer strokeWidthPhone = null;
  @SerializedName("imageEvidenceMenu")
  private Boolean imageEvidenceMenu = Boolean.FALSE;
  @SerializedName("jpegQuality")
  private Integer jpegQuality = null;
  @SerializedName("pixelIncreaseFactor")
  private Float pixelIncreaseFactor = null;
  @SerializedName("maxPixelsImage")
  private Integer maxPixelsImage = null;
  @SerializedName("pixelsImageDefault")
  private Integer pixelsImageDefault = null;
  @SerializedName("blockTakeScreenshots")
  private Boolean blockTakeScreenshots = Boolean.FALSE;
  @SerializedName("debugMessagesZip")
  private Boolean debugMessagesZip = Boolean.FALSE;
  @SerializedName("target")
  private String target = null;
  @SerializedName("loginBackground")
  private String loginBackground = null;
  @SerializedName("newAttachments")
  private Boolean newAttachments = Boolean.FALSE;

  
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
  public String getDarkColor() {
    return darkColor;
  }
  public void setDarkColor(String darkColor) {
    this.darkColor = darkColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDarkNegativeColor() {
    return darkNegativeColor;
  }
  public void setDarkNegativeColor(String darkNegativeColor) {
    this.darkNegativeColor = darkNegativeColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getServerEndpointSsoUrl() {
    return serverEndpointSsoUrl;
  }
  public void setServerEndpointSsoUrl(String serverEndpointSsoUrl) {
    this.serverEndpointSsoUrl = serverEndpointSsoUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getLoginDisabled() {
    return loginDisabled;
  }
  public void setLoginDisabled(Boolean loginDisabled) {
    this.loginDisabled = loginDisabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getShowQr() {
    return showQr;
  }
  public void setShowQr(Boolean showQr) {
    this.showQr = showQr;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getApiEditable() {
    return apiEditable;
  }
  public void setApiEditable(Boolean apiEditable) {
    this.apiEditable = apiEditable;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getShowCertificate() {
    return showCertificate;
  }
  public void setShowCertificate(Boolean showCertificate) {
    this.showCertificate = showCertificate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getTargetScanEnabled() {
    return targetScanEnabled;
  }
  public void setTargetScanEnabled(Boolean targetScanEnabled) {
    this.targetScanEnabled = targetScanEnabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getExpirationDays() {
    return expirationDays;
  }
  public void setExpirationDays(Integer expirationDays) {
    this.expirationDays = expirationDays;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAutoDownloadFinished() {
    return autoDownloadFinished;
  }
  public void setAutoDownloadFinished(Boolean autoDownloadFinished) {
    this.autoDownloadFinished = autoDownloadFinished;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAutoDownloadInbox() {
    return autoDownloadInbox;
  }
  public void setAutoDownloadInbox(Boolean autoDownloadInbox) {
    this.autoDownloadInbox = autoDownloadInbox;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getForceGeolocationOnEvidence() {
    return forceGeolocationOnEvidence;
  }
  public void setForceGeolocationOnEvidence(Boolean forceGeolocationOnEvidence) {
    this.forceGeolocationOnEvidence = forceGeolocationOnEvidence;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getFortressEnabled() {
    return fortressEnabled;
  }
  public void setFortressEnabled(Boolean fortressEnabled) {
    this.fortressEnabled = fortressEnabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getSessionTimeoutMinutes() {
    return sessionTimeoutMinutes;
  }
  public void setSessionTimeoutMinutes(Integer sessionTimeoutMinutes) {
    this.sessionTimeoutMinutes = sessionTimeoutMinutes;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getUserGroupsEnabled() {
    return userGroupsEnabled;
  }
  public void setUserGroupsEnabled(Boolean userGroupsEnabled) {
    this.userGroupsEnabled = userGroupsEnabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getOfflineIndicatorEnabled() {
    return offlineIndicatorEnabled;
  }
  public void setOfflineIndicatorEnabled(Boolean offlineIndicatorEnabled) {
    this.offlineIndicatorEnabled = offlineIndicatorEnabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAllowNewRequests() {
    return allowNewRequests;
  }
  public void setAllowNewRequests(Boolean allowNewRequests) {
    this.allowNewRequests = allowNewRequests;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getCrmTransactEnabled() {
    return crmTransactEnabled;
  }
  public void setCrmTransactEnabled(Boolean crmTransactEnabled) {
    this.crmTransactEnabled = crmTransactEnabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getHideUrl() {
    return hideUrl;
  }
  public void setHideUrl(Boolean hideUrl) {
    this.hideUrl = hideUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getSettingsCertificatesHide() {
    return settingsCertificatesHide;
  }
  public void setSettingsCertificatesHide(Boolean settingsCertificatesHide) {
    this.settingsCertificatesHide = settingsCertificatesHide;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getSettingsDocAssistantHide() {
    return settingsDocAssistantHide;
  }
  public void setSettingsDocAssistantHide(Boolean settingsDocAssistantHide) {
    this.settingsDocAssistantHide = settingsDocAssistantHide;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getShowActionsOnPdfOpen() {
    return showActionsOnPdfOpen;
  }
  public void setShowActionsOnPdfOpen(Boolean showActionsOnPdfOpen) {
    this.showActionsOnPdfOpen = showActionsOnPdfOpen;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getForceStylus() {
    return forceStylus;
  }
  public void setForceStylus(Boolean forceStylus) {
    this.forceStylus = forceStylus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDefaultStylus() {
    return defaultStylus;
  }
  public void setDefaultStylus(String defaultStylus) {
    this.defaultStylus = defaultStylus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getStrokeWidth() {
    return strokeWidth;
  }
  public void setStrokeWidth(Integer strokeWidth) {
    this.strokeWidth = strokeWidth;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getStrokeWidthPhone() {
    return strokeWidthPhone;
  }
  public void setStrokeWidthPhone(Integer strokeWidthPhone) {
    this.strokeWidthPhone = strokeWidthPhone;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getImageEvidenceMenu() {
    return imageEvidenceMenu;
  }
  public void setImageEvidenceMenu(Boolean imageEvidenceMenu) {
    this.imageEvidenceMenu = imageEvidenceMenu;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getJpegQuality() {
    return jpegQuality;
  }
  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Float getPixelIncreaseFactor() {
    return pixelIncreaseFactor;
  }
  public void setPixelIncreaseFactor(Float pixelIncreaseFactor) {
    this.pixelIncreaseFactor = pixelIncreaseFactor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getMaxPixelsImage() {
    return maxPixelsImage;
  }
  public void setMaxPixelsImage(Integer maxPixelsImage) {
    this.maxPixelsImage = maxPixelsImage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getPixelsImageDefault() {
    return pixelsImageDefault;
  }
  public void setPixelsImageDefault(Integer pixelsImageDefault) {
    this.pixelsImageDefault = pixelsImageDefault;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getBlockTakeScreenshots() {
    return blockTakeScreenshots;
  }
  public void setBlockTakeScreenshots(Boolean blockTakeScreenshots) {
    this.blockTakeScreenshots = blockTakeScreenshots;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getDebugMessagesZip() {
    return debugMessagesZip;
  }
  public void setDebugMessagesZip(Boolean debugMessagesZip) {
    this.debugMessagesZip = debugMessagesZip;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLoginBackground() {
    return loginBackground;
  }
  public void setLoginBackground(String loginBackground) {
    this.loginBackground = loginBackground;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getNewAttachments() {
    return newAttachments;
  }
  public void setNewAttachments(Boolean newAttachments) {
    this.newAttachments = newAttachments;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCustomization {\n");
    
    sb.append("  logo: ").append(logo).append("\n");
    sb.append("  mainColor: ").append(mainColor).append("\n");
    sb.append("  mainNegativeColor: ").append(mainNegativeColor).append("\n");
    sb.append("  errorMainColor: ").append(errorMainColor).append("\n");
    sb.append("  errorMainNegativeColor: ").append(errorMainNegativeColor).append("\n");
    sb.append("  successMainColor: ").append(successMainColor).append("\n");
    sb.append("  successMainNegativeColor: ").append(successMainNegativeColor).append("\n");
    sb.append("  darkColor: ").append(darkColor).append("\n");
    sb.append("  darkNegativeColor: ").append(darkNegativeColor).append("\n");
    sb.append("  serverEndpointSsoUrl: ").append(serverEndpointSsoUrl).append("\n");
    sb.append("  loginDisabled: ").append(loginDisabled).append("\n");
    sb.append("  showQr: ").append(showQr).append("\n");
    sb.append("  apiEditable: ").append(apiEditable).append("\n");
    sb.append("  showCertificate: ").append(showCertificate).append("\n");
    sb.append("  targetScanEnabled: ").append(targetScanEnabled).append("\n");
    sb.append("  expirationDays: ").append(expirationDays).append("\n");
    sb.append("  autoDownloadFinished: ").append(autoDownloadFinished).append("\n");
    sb.append("  autoDownloadInbox: ").append(autoDownloadInbox).append("\n");
    sb.append("  forceGeolocationOnEvidence: ").append(forceGeolocationOnEvidence).append("\n");
    sb.append("  fortressEnabled: ").append(fortressEnabled).append("\n");
    sb.append("  sessionTimeoutMinutes: ").append(sessionTimeoutMinutes).append("\n");
    sb.append("  userGroupsEnabled: ").append(userGroupsEnabled).append("\n");
    sb.append("  offlineIndicatorEnabled: ").append(offlineIndicatorEnabled).append("\n");
    sb.append("  allowNewRequests: ").append(allowNewRequests).append("\n");
    sb.append("  crmTransactEnabled: ").append(crmTransactEnabled).append("\n");
    sb.append("  hideUrl: ").append(hideUrl).append("\n");
    sb.append("  settingsCertificatesHide: ").append(settingsCertificatesHide).append("\n");
    sb.append("  settingsDocAssistantHide: ").append(settingsDocAssistantHide).append("\n");
    sb.append("  showActionsOnPdfOpen: ").append(showActionsOnPdfOpen).append("\n");
    sb.append("  forceStylus: ").append(forceStylus).append("\n");
    sb.append("  defaultStylus: ").append(defaultStylus).append("\n");
    sb.append("  strokeWidth: ").append(strokeWidth).append("\n");
    sb.append("  strokeWidthPhone: ").append(strokeWidthPhone).append("\n");
    sb.append("  imageEvidenceMenu: ").append(imageEvidenceMenu).append("\n");
    sb.append("  jpegQuality: ").append(jpegQuality).append("\n");
    sb.append("  pixelIncreaseFactor: ").append(pixelIncreaseFactor).append("\n");
    sb.append("  maxPixelsImage: ").append(maxPixelsImage).append("\n");
    sb.append("  pixelsImageDefault: ").append(pixelsImageDefault).append("\n");
    sb.append("  blockTakeScreenshots: ").append(blockTakeScreenshots).append("\n");
    sb.append("  debugMessagesZip: ").append(debugMessagesZip).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  loginBackground: ").append(loginBackground).append("\n");
    sb.append("  newAttachments: ").append(newAttachments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
