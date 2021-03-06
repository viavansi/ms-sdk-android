package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Signature;
import com.viafirma.mobile.services.android.model.Param;
import com.viafirma.mobile.services.android.model.Check;
import com.viafirma.mobile.services.android.model.Evidence;
import java.util.*;
import com.viafirma.mobile.services.android.model.Attachment;
import com.viafirma.mobile.services.android.model.ErrorResponse;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Policy  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("userCode")
  private String userCode = null;
  public enum TypeFormatSignEnum {
     DIGITALIZED_SIGN,  PAdES_BASIC,  PAdES_BES,  PAdES_EPES,  PAdES_LTV,  PDF_PKCS7, 
  };
  @SerializedName("typeFormatSign")
  private TypeFormatSignEnum typeFormatSign = null;
  public enum TypeSignEnum {
     ATTACHED,  DETACHED,  ENVELOPED,  ENVELOPING, 
  };
  @SerializedName("typeSign")
  private TypeSignEnum typeSign = null;
  @SerializedName("signByServer")
  private Boolean signByServer = Boolean.FALSE;
  @SerializedName("certificateAlias")
  private String certificateAlias = null;
  @SerializedName("certificatePassword")
  private String certificatePassword = null;
  @SerializedName("idTemporal")
  private String idTemporal = null;
  @SerializedName("idSign")
  private String idSign = null;
  @SerializedName("paramList")
  private List<Param> paramList = new ArrayList<Param>() ;
  @SerializedName("evidences")
  private List<Evidence> evidences = new ArrayList<Evidence>() ;
  @SerializedName("signatures")
  private List<Signature> signatures = new ArrayList<Signature>() ;
  @SerializedName("error")
  private ErrorResponse error = null;
  @SerializedName("attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>() ;
  @SerializedName("checklist")
  private List<Check> checklist = new ArrayList<Check>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUserCode() {
    return userCode;
  }
  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TypeFormatSignEnum getTypeFormatSign() {
    return typeFormatSign;
  }
  public void setTypeFormatSign(TypeFormatSignEnum typeFormatSign) {
    this.typeFormatSign = typeFormatSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TypeSignEnum getTypeSign() {
    return typeSign;
  }
  public void setTypeSign(TypeSignEnum typeSign) {
    this.typeSign = typeSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getSignByServer() {
    return signByServer;
  }
  public void setSignByServer(Boolean signByServer) {
    this.signByServer = signByServer;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCertificateAlias() {
    return certificateAlias;
  }
  public void setCertificateAlias(String certificateAlias) {
    this.certificateAlias = certificateAlias;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCertificatePassword() {
    return certificatePassword;
  }
  public void setCertificatePassword(String certificatePassword) {
    this.certificatePassword = certificatePassword;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIdTemporal() {
    return idTemporal;
  }
  public void setIdTemporal(String idTemporal) {
    this.idTemporal = idTemporal;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIdSign() {
    return idSign;
  }
  public void setIdSign(String idSign) {
    this.idSign = idSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Param> getParamList() {
    return paramList;
  }
  public void setParamList(List<Param> paramList) {
    this.paramList = paramList;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Evidence> getEvidences() {
    return evidences;
  }
  public void setEvidences(List<Evidence> evidences) {
    this.evidences = evidences;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Signature> getSignatures() {
    return signatures;
  }
  public void setSignatures(List<Signature> signatures) {
    this.signatures = signatures;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ErrorResponse getError() {
    return error;
  }
  public void setError(ErrorResponse error) {
    this.error = error;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Attachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  
  /**
   * (since 3.4.0) checklist actions
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) checklist actions")
  public List<Check> getChecklist() {
    return checklist;
  }
  public void setChecklist(List<Check> checklist) {
    this.checklist = checklist;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  typeFormatSign: ").append(typeFormatSign).append("\n");
    sb.append("  typeSign: ").append(typeSign).append("\n");
    sb.append("  signByServer: ").append(signByServer).append("\n");
    sb.append("  certificateAlias: ").append(certificateAlias).append("\n");
    sb.append("  certificatePassword: ").append(certificatePassword).append("\n");
    sb.append("  idTemporal: ").append(idTemporal).append("\n");
    sb.append("  idSign: ").append(idSign).append("\n");
    sb.append("  paramList: ").append(paramList).append("\n");
    sb.append("  evidences: ").append(evidences).append("\n");
    sb.append("  signatures: ").append(signatures).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  attachments: ").append(attachments).append("\n");
    sb.append("  checklist: ").append(checklist).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
