package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.User;
import com.viafirma.mobile.services.android.model.Configuration;
import com.viafirma.mobile.services.android.model.Style;
import java.util.*;
import com.viafirma.mobile.services.android.model.Property;
import java.util.Date;
import com.viafirma.mobile.services.android.model.Template;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class GroupInfo  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("tsaUrl")
  private String tsaUrl = null;
  @SerializedName("tsaUser")
  private String tsaUser = null;
  @SerializedName("tsaUserPassword")
  private String tsaUserPassword = null;
  @SerializedName("tsaPolicyId")
  private String tsaPolicyId = null;
  @SerializedName("tsaAlias")
  private String tsaAlias = null;
  @SerializedName("smsUrl")
  private String smsUrl = null;
  @SerializedName("smsUser")
  private String smsUser = null;
  @SerializedName("smsPassword")
  private String smsPassword = null;
  @SerializedName("transferSystem")
  private String transferSystem = null;
  @SerializedName("deleteSignedDocuments")
  private Boolean deleteSignedDocuments = Boolean.FALSE;
  @SerializedName("ttlMessage")
  private Integer ttlMessage = null;
  @SerializedName("tteNotification")
  private Integer tteNotification = null;
  @SerializedName("custodyCode")
  private String custodyCode = null;
  @SerializedName("tsaAuthTls")
  private Boolean tsaAuthTls = Boolean.FALSE;
  @SerializedName("dataProtectionLevel")
  private Integer dataProtectionLevel = null;
  @SerializedName("verificationDocUrl")
  private String verificationDocUrl = null;
  @SerializedName("callbackMailStatus")
  private String callbackMailStatus = null;
  @SerializedName("referenceCode")
  private String referenceCode = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("style")
  private Style style = null;
  @SerializedName("extensionOid")
  private String extensionOid = null;
  @SerializedName("extensionValue")
  private String extensionValue = null;
  @SerializedName("creationDate")
  private Date creationDate = null;
  @SerializedName("startDate")
  private Date startDate = null;
  @SerializedName("endDate")
  private Date endDate = null;
  @SerializedName("renovationDate")
  private Date renovationDate = null;
  @SerializedName("active")
  private Boolean active = Boolean.FALSE;
  @SerializedName("properties")
  private List<Property> properties = new ArrayList<Property>() ;
  @SerializedName("apps")
  private List<Configuration> apps = new ArrayList<Configuration>() ;
  @SerializedName("templates")
  private List<Template> templates = new ArrayList<Template>() ;
  @SerializedName("users")
  private List<User> users = new ArrayList<User>() ;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTsaUrl() {
    return tsaUrl;
  }
  public void setTsaUrl(String tsaUrl) {
    this.tsaUrl = tsaUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTsaUser() {
    return tsaUser;
  }
  public void setTsaUser(String tsaUser) {
    this.tsaUser = tsaUser;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTsaUserPassword() {
    return tsaUserPassword;
  }
  public void setTsaUserPassword(String tsaUserPassword) {
    this.tsaUserPassword = tsaUserPassword;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTsaPolicyId() {
    return tsaPolicyId;
  }
  public void setTsaPolicyId(String tsaPolicyId) {
    this.tsaPolicyId = tsaPolicyId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTsaAlias() {
    return tsaAlias;
  }
  public void setTsaAlias(String tsaAlias) {
    this.tsaAlias = tsaAlias;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSmsUrl() {
    return smsUrl;
  }
  public void setSmsUrl(String smsUrl) {
    this.smsUrl = smsUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSmsUser() {
    return smsUser;
  }
  public void setSmsUser(String smsUser) {
    this.smsUser = smsUser;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSmsPassword() {
    return smsPassword;
  }
  public void setSmsPassword(String smsPassword) {
    this.smsPassword = smsPassword;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTransferSystem() {
    return transferSystem;
  }
  public void setTransferSystem(String transferSystem) {
    this.transferSystem = transferSystem;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getDeleteSignedDocuments() {
    return deleteSignedDocuments;
  }
  public void setDeleteSignedDocuments(Boolean deleteSignedDocuments) {
    this.deleteSignedDocuments = deleteSignedDocuments;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getTtlMessage() {
    return ttlMessage;
  }
  public void setTtlMessage(Integer ttlMessage) {
    this.ttlMessage = ttlMessage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getTteNotification() {
    return tteNotification;
  }
  public void setTteNotification(Integer tteNotification) {
    this.tteNotification = tteNotification;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCustodyCode() {
    return custodyCode;
  }
  public void setCustodyCode(String custodyCode) {
    this.custodyCode = custodyCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getTsaAuthTls() {
    return tsaAuthTls;
  }
  public void setTsaAuthTls(Boolean tsaAuthTls) {
    this.tsaAuthTls = tsaAuthTls;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getDataProtectionLevel() {
    return dataProtectionLevel;
  }
  public void setDataProtectionLevel(Integer dataProtectionLevel) {
    this.dataProtectionLevel = dataProtectionLevel;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getVerificationDocUrl() {
    return verificationDocUrl;
  }
  public void setVerificationDocUrl(String verificationDocUrl) {
    this.verificationDocUrl = verificationDocUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailStatus() {
    return callbackMailStatus;
  }
  public void setCallbackMailStatus(String callbackMailStatus) {
    this.callbackMailStatus = callbackMailStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getReferenceCode() {
    return referenceCode;
  }
  public void setReferenceCode(String referenceCode) {
    this.referenceCode = referenceCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Style getStyle() {
    return style;
  }
  public void setStyle(Style style) {
    this.style = style;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getExtensionOid() {
    return extensionOid;
  }
  public void setExtensionOid(String extensionOid) {
    this.extensionOid = extensionOid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getExtensionValue() {
    return extensionValue;
  }
  public void setExtensionValue(String extensionValue) {
    this.extensionValue = extensionValue;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getRenovationDate() {
    return renovationDate;
  }
  public void setRenovationDate(Date renovationDate) {
    this.renovationDate = renovationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Property> getProperties() {
    return properties;
  }
  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Configuration> getApps() {
    return apps;
  }
  public void setApps(List<Configuration> apps) {
    this.apps = apps;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Template> getTemplates() {
    return templates;
  }
  public void setTemplates(List<Template> templates) {
    this.templates = templates;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<User> getUsers() {
    return users;
  }
  public void setUsers(List<User> users) {
    this.users = users;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupInfo {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  tsaUrl: ").append(tsaUrl).append("\n");
    sb.append("  tsaUser: ").append(tsaUser).append("\n");
    sb.append("  tsaUserPassword: ").append(tsaUserPassword).append("\n");
    sb.append("  tsaPolicyId: ").append(tsaPolicyId).append("\n");
    sb.append("  tsaAlias: ").append(tsaAlias).append("\n");
    sb.append("  smsUrl: ").append(smsUrl).append("\n");
    sb.append("  smsUser: ").append(smsUser).append("\n");
    sb.append("  smsPassword: ").append(smsPassword).append("\n");
    sb.append("  transferSystem: ").append(transferSystem).append("\n");
    sb.append("  deleteSignedDocuments: ").append(deleteSignedDocuments).append("\n");
    sb.append("  ttlMessage: ").append(ttlMessage).append("\n");
    sb.append("  tteNotification: ").append(tteNotification).append("\n");
    sb.append("  custodyCode: ").append(custodyCode).append("\n");
    sb.append("  tsaAuthTls: ").append(tsaAuthTls).append("\n");
    sb.append("  dataProtectionLevel: ").append(dataProtectionLevel).append("\n");
    sb.append("  verificationDocUrl: ").append(verificationDocUrl).append("\n");
    sb.append("  callbackMailStatus: ").append(callbackMailStatus).append("\n");
    sb.append("  referenceCode: ").append(referenceCode).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  style: ").append(style).append("\n");
    sb.append("  extensionOid: ").append(extensionOid).append("\n");
    sb.append("  extensionValue: ").append(extensionValue).append("\n");
    sb.append("  creationDate: ").append(creationDate).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  renovationDate: ").append(renovationDate).append("\n");
    sb.append("  active: ").append(active).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("  apps: ").append(apps).append("\n");
    sb.append("  templates: ").append(templates).append("\n");
    sb.append("  users: ").append(users).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
