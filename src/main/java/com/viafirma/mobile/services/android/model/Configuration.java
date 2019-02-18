package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Group;
import com.viafirma.mobile.services.android.model.FinalizeAction;
import com.viafirma.mobile.services.android.model.MenuOption;
import com.viafirma.mobile.services.android.model.Version;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Configuration  implements Serializable {
  
  @SerializedName("viafirmaURL")
  private String viafirmaURL = null;
  @SerializedName("editableURL")
  private Boolean editableURL = Boolean.FALSE;
  @SerializedName("frontCamera")
  private Boolean frontCamera = Boolean.FALSE;
  @SerializedName("autoLogout")
  private Boolean autoLogout = Boolean.FALSE;
  @SerializedName("showCSV")
  private Boolean showCSV = Boolean.FALSE;
  @SerializedName("personMask")
  private Boolean personMask = Boolean.FALSE;
  @SerializedName("registerHide")
  private Boolean registerHide = Boolean.FALSE;
  @SerializedName("allowsInvalidSSLCertificate")
  private Boolean allowsInvalidSSLCertificate = Boolean.FALSE;
  @SerializedName("evidenceBase64")
  private Boolean evidenceBase64 = Boolean.FALSE;
  @SerializedName("version")
  private String version = null;
  @SerializedName("showUpdate")
  private Boolean showUpdate = Boolean.FALSE;
  @SerializedName("installURL")
  private String installURL = null;
  @SerializedName("installMessage")
  private String installMessage = null;
  @SerializedName("backendVersion")
  private String backendVersion = null;
  @SerializedName("finalize_menu_options")
  private List<MenuOption> finalize_menu_options = new ArrayList<MenuOption>() ;
  @SerializedName("autoRegisterDevice")
  private Boolean autoRegisterDevice = Boolean.FALSE;
  @SerializedName("versions")
  private List<Version> versions = new ArrayList<Version>() ;
  @SerializedName("clientSignature")
  private Boolean clientSignature = Boolean.FALSE;
  @SerializedName("finalizeActions")
  private List<FinalizeAction> finalizeActions = new ArrayList<FinalizeAction>() ;
  @SerializedName("groups")
  private List<Group> groups = new ArrayList<Group>() ;
  @SerializedName("sSLPinningEnabled")
  private Boolean sSLPinningEnabled = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getViafirmaURL() {
    return viafirmaURL;
  }
  public void setViafirmaURL(String viafirmaURL) {
    this.viafirmaURL = viafirmaURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getEditableURL() {
    return editableURL;
  }
  public void setEditableURL(Boolean editableURL) {
    this.editableURL = editableURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getFrontCamera() {
    return frontCamera;
  }
  public void setFrontCamera(Boolean frontCamera) {
    this.frontCamera = frontCamera;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAutoLogout() {
    return autoLogout;
  }
  public void setAutoLogout(Boolean autoLogout) {
    this.autoLogout = autoLogout;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getShowCSV() {
    return showCSV;
  }
  public void setShowCSV(Boolean showCSV) {
    this.showCSV = showCSV;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getPersonMask() {
    return personMask;
  }
  public void setPersonMask(Boolean personMask) {
    this.personMask = personMask;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getRegisterHide() {
    return registerHide;
  }
  public void setRegisterHide(Boolean registerHide) {
    this.registerHide = registerHide;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAllowsInvalidSSLCertificate() {
    return allowsInvalidSSLCertificate;
  }
  public void setAllowsInvalidSSLCertificate(Boolean allowsInvalidSSLCertificate) {
    this.allowsInvalidSSLCertificate = allowsInvalidSSLCertificate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getEvidenceBase64() {
    return evidenceBase64;
  }
  public void setEvidenceBase64(Boolean evidenceBase64) {
    this.evidenceBase64 = evidenceBase64;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getShowUpdate() {
    return showUpdate;
  }
  public void setShowUpdate(Boolean showUpdate) {
    this.showUpdate = showUpdate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getInstallURL() {
    return installURL;
  }
  public void setInstallURL(String installURL) {
    this.installURL = installURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getInstallMessage() {
    return installMessage;
  }
  public void setInstallMessage(String installMessage) {
    this.installMessage = installMessage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getBackendVersion() {
    return backendVersion;
  }
  public void setBackendVersion(String backendVersion) {
    this.backendVersion = backendVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<MenuOption> getFinalize_menu_options() {
    return finalize_menu_options;
  }
  public void setFinalize_menu_options(List<MenuOption> finalize_menu_options) {
    this.finalize_menu_options = finalize_menu_options;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAutoRegisterDevice() {
    return autoRegisterDevice;
  }
  public void setAutoRegisterDevice(Boolean autoRegisterDevice) {
    this.autoRegisterDevice = autoRegisterDevice;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Version> getVersions() {
    return versions;
  }
  public void setVersions(List<Version> versions) {
    this.versions = versions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getClientSignature() {
    return clientSignature;
  }
  public void setClientSignature(Boolean clientSignature) {
    this.clientSignature = clientSignature;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<FinalizeAction> getFinalizeActions() {
    return finalizeActions;
  }
  public void setFinalizeActions(List<FinalizeAction> finalizeActions) {
    this.finalizeActions = finalizeActions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Group> getGroups() {
    return groups;
  }
  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getSSLPinningEnabled() {
    return sSLPinningEnabled;
  }
  public void setSSLPinningEnabled(Boolean sSLPinningEnabled) {
    this.sSLPinningEnabled = sSLPinningEnabled;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Configuration {\n");
    
    sb.append("  viafirmaURL: ").append(viafirmaURL).append("\n");
    sb.append("  editableURL: ").append(editableURL).append("\n");
    sb.append("  frontCamera: ").append(frontCamera).append("\n");
    sb.append("  autoLogout: ").append(autoLogout).append("\n");
    sb.append("  showCSV: ").append(showCSV).append("\n");
    sb.append("  personMask: ").append(personMask).append("\n");
    sb.append("  registerHide: ").append(registerHide).append("\n");
    sb.append("  allowsInvalidSSLCertificate: ").append(allowsInvalidSSLCertificate).append("\n");
    sb.append("  evidenceBase64: ").append(evidenceBase64).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  showUpdate: ").append(showUpdate).append("\n");
    sb.append("  installURL: ").append(installURL).append("\n");
    sb.append("  installMessage: ").append(installMessage).append("\n");
    sb.append("  backendVersion: ").append(backendVersion).append("\n");
    sb.append("  finalize_menu_options: ").append(finalize_menu_options).append("\n");
    sb.append("  autoRegisterDevice: ").append(autoRegisterDevice).append("\n");
    sb.append("  versions: ").append(versions).append("\n");
    sb.append("  clientSignature: ").append(clientSignature).append("\n");
    sb.append("  finalizeActions: ").append(finalizeActions).append("\n");
    sb.append("  groups: ").append(groups).append("\n");
    sb.append("  sSLPinningEnabled: ").append(sSLPinningEnabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
