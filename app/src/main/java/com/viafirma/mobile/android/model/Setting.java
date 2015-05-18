package com.viafirma.mobile.android.model;

import com.viafirma.mobile.android.model.Policy;
import java.util.*;

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
  @SerializedName("callbackURL")
  private String callbackURL = null;
  @SerializedName("callbackMails")
  private String callbackMails = null;
  @SerializedName("callbackMailsFormKeys")
  private List<String> callbackMailsFormKeys = new ArrayList<String>() ;
  @SerializedName("validateCode")
  private String validateCode = null;
  @SerializedName("workflow")
  private String workflow = null;

  
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
  public String getCallbackURL() {
    return callbackURL;
  }
  public void setCallbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
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
  public String getWorkflow() {
    return workflow;
  }
  public void setWorkflow(String workflow) {
    this.workflow = workflow;
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
    sb.append("  callbackURL: ").append(callbackURL).append("\n");
    sb.append("  callbackMails: ").append(callbackMails).append("\n");
    sb.append("  callbackMailsFormKeys: ").append(callbackMailsFormKeys).append("\n");
    sb.append("  validateCode: ").append(validateCode).append("\n");
    sb.append("  workflow: ").append(workflow).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
