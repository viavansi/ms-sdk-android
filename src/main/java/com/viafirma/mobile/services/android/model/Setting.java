package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Policy;
import com.viafirma.mobile.services.android.model.Customization;
import com.viafirma.mobile.services.android.model.Param;
import java.util.*;
import com.viafirma.mobile.services.android.model.AcrofieldPosition;
import com.viafirma.mobile.services.android.model.Font;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Setting  implements Serializable {
  
  @SerializedName("titleKey")
  private String titleKey = null;
  @SerializedName("descriptionKey")
  private String descriptionKey = null;
  @SerializedName("policy")
  private Policy policy = null;
  @SerializedName("computec_key")
  private String computec_key = null;
  @SerializedName("policies")
  private List<Policy> policies = new ArrayList<Policy>() ;
  @SerializedName("callbackAuthorization")
  private String callbackAuthorization = null;
  @SerializedName("callbackURL")
  private String callbackURL = null;
  @SerializedName("callbackCheckListMails")
  private String callbackCheckListMails = null;
  @SerializedName("callbackMails")
  private String callbackMails = null;
  @SerializedName("callbackPhones")
  private String callbackPhones = null;
  @SerializedName("callbackMailsFormKeys")
  private List<String> callbackMailsFormKeys = new ArrayList<String>() ;
  @SerializedName("validateCode")
  private String validateCode = null;
  @SerializedName("validateCodeFinish")
  private String validateCodeFinish = null;
  @SerializedName("workflow")
  private String workflow = null;
  @SerializedName("font")
  private Font font = null;
  @SerializedName("acrofieldsPositions")
  private List<AcrofieldPosition> acrofieldsPositions = new ArrayList<AcrofieldPosition>() ;
  @SerializedName("readDocumentRequired")
  private Boolean readDocumentRequired = Boolean.FALSE;
  @SerializedName("allowDocumentResend")
  private Boolean allowDocumentResend = Boolean.FALSE;
  @SerializedName("autoFinalize")
  private String autoFinalize = null;
  @SerializedName("customization")
  private Customization customization = null;
  @SerializedName("callbackMailsFromForm")
  private List<String> callbackMailsFromForm = new ArrayList<String>() ;
  @SerializedName("callbackMailFilename")
  private String callbackMailFilename = null;
  @SerializedName("metadataList")
  private List<Param> metadataList = new ArrayList<Param>() ;
  @SerializedName("retryTime")
  private Long retryTime = null;
  @SerializedName("workflowReferenceCode")
  private String workflowReferenceCode = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTitleKey() {
    return titleKey;
  }
  public void setTitleKey(String titleKey) {
    this.titleKey = titleKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDescriptionKey() {
    return descriptionKey;
  }
  public void setDescriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Policy getPolicy() {
    return policy;
  }
  public void setPolicy(Policy policy) {
    this.policy = policy;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getComputec_key() {
    return computec_key;
  }
  public void setComputec_key(String computec_key) {
    this.computec_key = computec_key;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Policy> getPolicies() {
    return policies;
  }
  public void setPolicies(List<Policy> policies) {
    this.policies = policies;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackAuthorization() {
    return callbackAuthorization;
  }
  public void setCallbackAuthorization(String callbackAuthorization) {
    this.callbackAuthorization = callbackAuthorization;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackURL() {
    return callbackURL;
  }
  public void setCallbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackCheckListMails() {
    return callbackCheckListMails;
  }
  public void setCallbackCheckListMails(String callbackCheckListMails) {
    this.callbackCheckListMails = callbackCheckListMails;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMails() {
    return callbackMails;
  }
  public void setCallbackMails(String callbackMails) {
    this.callbackMails = callbackMails;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackPhones() {
    return callbackPhones;
  }
  public void setCallbackPhones(String callbackPhones) {
    this.callbackPhones = callbackPhones;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getCallbackMailsFormKeys() {
    return callbackMailsFormKeys;
  }
  public void setCallbackMailsFormKeys(List<String> callbackMailsFormKeys) {
    this.callbackMailsFormKeys = callbackMailsFormKeys;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValidateCode() {
    return validateCode;
  }
  public void setValidateCode(String validateCode) {
    this.validateCode = validateCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValidateCodeFinish() {
    return validateCodeFinish;
  }
  public void setValidateCodeFinish(String validateCodeFinish) {
    this.validateCodeFinish = validateCodeFinish;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getWorkflow() {
    return workflow;
  }
  public void setWorkflow(String workflow) {
    this.workflow = workflow;
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
   **/
  @ApiModelProperty(required = false, value = "")
  public List<AcrofieldPosition> getAcrofieldsPositions() {
    return acrofieldsPositions;
  }
  public void setAcrofieldsPositions(List<AcrofieldPosition> acrofieldsPositions) {
    this.acrofieldsPositions = acrofieldsPositions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getReadDocumentRequired() {
    return readDocumentRequired;
  }
  public void setReadDocumentRequired(Boolean readDocumentRequired) {
    this.readDocumentRequired = readDocumentRequired;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAllowDocumentResend() {
    return allowDocumentResend;
  }
  public void setAllowDocumentResend(Boolean allowDocumentResend) {
    this.allowDocumentResend = allowDocumentResend;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAutoFinalize() {
    return autoFinalize;
  }
  public void setAutoFinalize(String autoFinalize) {
    this.autoFinalize = autoFinalize;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Customization getCustomization() {
    return customization;
  }
  public void setCustomization(Customization customization) {
    this.customization = customization;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getCallbackMailsFromForm() {
    return callbackMailsFromForm;
  }
  public void setCallbackMailsFromForm(List<String> callbackMailsFromForm) {
    this.callbackMailsFromForm = callbackMailsFromForm;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCallbackMailFilename() {
    return callbackMailFilename;
  }
  public void setCallbackMailFilename(String callbackMailFilename) {
    this.callbackMailFilename = callbackMailFilename;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Param> getMetadataList() {
    return metadataList;
  }
  public void setMetadataList(List<Param> metadataList) {
    this.metadataList = metadataList;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getRetryTime() {
    return retryTime;
  }
  public void setRetryTime(Long retryTime) {
    this.retryTime = retryTime;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getWorkflowReferenceCode() {
    return workflowReferenceCode;
  }
  public void setWorkflowReferenceCode(String workflowReferenceCode) {
    this.workflowReferenceCode = workflowReferenceCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Setting {\n");
    
    sb.append("  titleKey: ").append(titleKey).append("\n");
    sb.append("  descriptionKey: ").append(descriptionKey).append("\n");
    sb.append("  policy: ").append(policy).append("\n");
    sb.append("  computec_key: ").append(computec_key).append("\n");
    sb.append("  policies: ").append(policies).append("\n");
    sb.append("  callbackAuthorization: ").append(callbackAuthorization).append("\n");
    sb.append("  callbackURL: ").append(callbackURL).append("\n");
    sb.append("  callbackCheckListMails: ").append(callbackCheckListMails).append("\n");
    sb.append("  callbackMails: ").append(callbackMails).append("\n");
    sb.append("  callbackPhones: ").append(callbackPhones).append("\n");
    sb.append("  callbackMailsFormKeys: ").append(callbackMailsFormKeys).append("\n");
    sb.append("  validateCode: ").append(validateCode).append("\n");
    sb.append("  validateCodeFinish: ").append(validateCodeFinish).append("\n");
    sb.append("  workflow: ").append(workflow).append("\n");
    sb.append("  font: ").append(font).append("\n");
    sb.append("  acrofieldsPositions: ").append(acrofieldsPositions).append("\n");
    sb.append("  readDocumentRequired: ").append(readDocumentRequired).append("\n");
    sb.append("  allowDocumentResend: ").append(allowDocumentResend).append("\n");
    sb.append("  autoFinalize: ").append(autoFinalize).append("\n");
    sb.append("  customization: ").append(customization).append("\n");
    sb.append("  callbackMailsFromForm: ").append(callbackMailsFromForm).append("\n");
    sb.append("  callbackMailFilename: ").append(callbackMailFilename).append("\n");
    sb.append("  metadataList: ").append(metadataList).append("\n");
    sb.append("  retryTime: ").append(retryTime).append("\n");
    sb.append("  workflowReferenceCode: ").append(workflowReferenceCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
