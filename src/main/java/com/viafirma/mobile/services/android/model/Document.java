package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Item;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Document  implements Serializable {
  
  @SerializedName("templateCode")
  private String templateCode = null;
  @SerializedName("templateReference")
  private String templateReference = null;
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
  public enum TemplateTypeEnum {
     docx,  odt,  url, 
  };
  @SerializedName("templateType")
  private TemplateTypeEnum templateType = null;
  @SerializedName("formRequired")
  private Boolean formRequired = Boolean.FALSE;
  @SerializedName("formDisabled")
  private Boolean formDisabled = Boolean.FALSE;
  @SerializedName("items")
  private List<Item> items = new ArrayList<Item>() ;

  
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
  @ApiModelProperty(required = true, value = "")
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("  templateCode: ").append(templateCode).append("\n");
    sb.append("  templateReference: ").append(templateReference).append("\n");
    sb.append("  draftedCode: ").append(draftedCode).append("\n");
    sb.append("  draftedReference: ").append(draftedReference).append("\n");
    sb.append("  signedCode: ").append(signedCode).append("\n");
    sb.append("  signedID: ").append(signedID).append("\n");
    sb.append("  signedReference: ").append(signedReference).append("\n");
    sb.append("  templateType: ").append(templateType).append("\n");
    sb.append("  formRequired: ").append(formRequired).append("\n");
    sb.append("  formDisabled: ").append(formDisabled).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
