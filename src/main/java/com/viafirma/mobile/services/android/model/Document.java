package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Item;
import java.util.*;
import java.util.Date;
import com.viafirma.mobile.services.android.model.Font;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Document  implements Serializable {
  
  @SerializedName("templateCode")
  private String templateCode = null;
  @SerializedName("templateReference")
  private String templateReference = null;
  @SerializedName("templateVersion")
  private Integer templateVersion = null;
  @SerializedName("draftedCode")
  private String draftedCode = null;
  @SerializedName("draftedReference")
  private String draftedReference = null;
  @SerializedName("signedCode")
  private String signedCode = null;
  @SerializedName("signedID")
  private String signedID = null;
  @SerializedName("signedReference")
  private String signedReference = null;
  @SerializedName("signingDate")
  private Date signingDate = null;
  public enum TemplateTypeEnum {
     docx,  odt,  url,  pdf,  base64,  message, 
  };
  @SerializedName("templateType")
  private TemplateTypeEnum templateType = null;
  @SerializedName("formRequired")
  private Boolean formRequired = Boolean.FALSE;
  @SerializedName("formDisabled")
  private Boolean formDisabled = Boolean.FALSE;
  @SerializedName("items")
  private List<Item> items = new ArrayList<Item>() ;
  @SerializedName("pdfaCompliant")
  private Boolean pdfaCompliant = Boolean.FALSE;
  @SerializedName("font")
  private Font font = null;
  @SerializedName("policyCode")
  private String policyCode = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("readRequired")
  private Boolean readRequired = Boolean.FALSE;
  @SerializedName("numPages")
  private Integer numPages = null;
  @SerializedName("allowResend")
  private Boolean allowResend = Boolean.FALSE;
  @SerializedName("autoFinalize")
  private Boolean autoFinalize = Boolean.FALSE;
  @SerializedName("deleteSignedDocuments")
  private Boolean deleteSignedDocuments = Boolean.FALSE;
  @SerializedName("watermarkText")
  private String watermarkText = null;
  @SerializedName("extraPages")
  private Integer extraPages = null;
  @SerializedName("formUpdated")
  private Boolean formUpdated = Boolean.FALSE;
  @SerializedName("hideDocumentBeforeStart")
  private Boolean hideDocumentBeforeStart = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTemplateCode() {
    return templateCode;
  }
  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTemplateReference() {
    return templateReference;
  }
  public void setTemplateReference(String templateReference) {
    this.templateReference = templateReference;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getTemplateVersion() {
    return templateVersion;
  }
  public void setTemplateVersion(Integer templateVersion) {
    this.templateVersion = templateVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDraftedCode() {
    return draftedCode;
  }
  public void setDraftedCode(String draftedCode) {
    this.draftedCode = draftedCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDraftedReference() {
    return draftedReference;
  }
  public void setDraftedReference(String draftedReference) {
    this.draftedReference = draftedReference;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignedCode() {
    return signedCode;
  }
  public void setSignedCode(String signedCode) {
    this.signedCode = signedCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignedID() {
    return signedID;
  }
  public void setSignedID(String signedID) {
    this.signedID = signedID;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignedReference() {
    return signedReference;
  }
  public void setSignedReference(String signedReference) {
    this.signedReference = signedReference;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getSigningDate() {
    return signingDate;
  }
  public void setSigningDate(Date signingDate) {
    this.signingDate = signingDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TemplateTypeEnum getTemplateType() {
    return templateType;
  }
  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getFormRequired() {
    return formRequired;
  }
  public void setFormRequired(Boolean formRequired) {
    this.formRequired = formRequired;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getFormDisabled() {
    return formDisabled;
  }
  public void setFormDisabled(Boolean formDisabled) {
    this.formDisabled = formDisabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }

  
  /**
   * generate pdf compliant with PDF/A-3A ISO 19005-3
   **/
  @ApiModelProperty(required = false, value = "generate pdf compliant with PDF/A-3A ISO 19005-3")
  public Boolean getPdfaCompliant() {
    return pdfaCompliant;
  }
  public void setPdfaCompliant(Boolean pdfaCompliant) {
    this.pdfaCompliant = pdfaCompliant;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Font getFont() {
    return font;
  }
  public void setFont(Font font) {
    this.font = font;
  }

  
  /**
   * (since 3.5.0) code of policy to use
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) code of policy to use")
  public String getPolicyCode() {
    return policyCode;
  }
  public void setPolicyCode(String policyCode) {
    this.policyCode = policyCode;
  }

  
  /**
   * (since 3.5.0) document password
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) document password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getReadRequired() {
    return readRequired;
  }
  public void setReadRequired(Boolean readRequired) {
    this.readRequired = readRequired;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getNumPages() {
    return numPages;
  }
  public void setNumPages(Integer numPages) {
    this.numPages = numPages;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAllowResend() {
    return allowResend;
  }
  public void setAllowResend(Boolean allowResend) {
    this.allowResend = allowResend;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAutoFinalize() {
    return autoFinalize;
  }
  public void setAutoFinalize(Boolean autoFinalize) {
    this.autoFinalize = autoFinalize;
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
  public String getWatermarkText() {
    return watermarkText;
  }
  public void setWatermarkText(String watermarkText) {
    this.watermarkText = watermarkText;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getExtraPages() {
    return extraPages;
  }
  public void setExtraPages(Integer extraPages) {
    this.extraPages = extraPages;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getFormUpdated() {
    return formUpdated;
  }
  public void setFormUpdated(Boolean formUpdated) {
    this.formUpdated = formUpdated;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("  templateCode: ").append(templateCode).append("\n");
    sb.append("  templateReference: ").append(templateReference).append("\n");
    sb.append("  templateVersion: ").append(templateVersion).append("\n");
    sb.append("  draftedCode: ").append(draftedCode).append("\n");
    sb.append("  draftedReference: ").append(draftedReference).append("\n");
    sb.append("  signedCode: ").append(signedCode).append("\n");
    sb.append("  signedID: ").append(signedID).append("\n");
    sb.append("  signedReference: ").append(signedReference).append("\n");
    sb.append("  signingDate: ").append(signingDate).append("\n");
    sb.append("  templateType: ").append(templateType).append("\n");
    sb.append("  formRequired: ").append(formRequired).append("\n");
    sb.append("  formDisabled: ").append(formDisabled).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  pdfaCompliant: ").append(pdfaCompliant).append("\n");
    sb.append("  font: ").append(font).append("\n");
    sb.append("  policyCode: ").append(policyCode).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  readRequired: ").append(readRequired).append("\n");
    sb.append("  numPages: ").append(numPages).append("\n");
    sb.append("  allowResend: ").append(allowResend).append("\n");
    sb.append("  autoFinalize: ").append(autoFinalize).append("\n");
    sb.append("  deleteSignedDocuments: ").append(deleteSignedDocuments).append("\n");
    sb.append("  watermarkText: ").append(watermarkText).append("\n");
    sb.append("  extraPages: ").append(extraPages).append("\n");
    sb.append("  formUpdated: ").append(formUpdated).append("\n");
    sb.append("  hideDocumentBeforeStart: ").append(hideDocumentBeforeStart).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
