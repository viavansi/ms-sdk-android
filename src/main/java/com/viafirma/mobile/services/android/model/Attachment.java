package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Param;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Attachment  implements Serializable {
  
  public enum TypeEnum {
     PDF,  IMAGE,  VIDEO,  AUDIO, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum ProcessTypeEnum {
     OCR, 
  };
  @SerializedName("processType")
  private ProcessTypeEnum processType = null;
  @SerializedName("processId")
  private String processId = null;
  @SerializedName("code")
  private String code = null;
  public enum StatusEnum {
     PENDING,  RECEIVED, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("helpText")
  private String helpText = null;
  @SerializedName("helpDetail")
  private String helpDetail = null;
  @SerializedName("optional")
  private Boolean optional = Boolean.FALSE;
  @SerializedName("metadataList")
  private List<Param> metadataList = new ArrayList<Param>() ;
  @SerializedName("date")
  private Long date = null;
  @SerializedName("hash")
  private String hash = null;
  @SerializedName("fileName")
  private String fileName = null;
  @SerializedName("readOnly")
  private Boolean readOnly = Boolean.FALSE;
  @SerializedName("recipientKey")
  private String recipientKey = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ProcessTypeEnum getProcessType() {
    return processType;
  }
  public void setProcessType(ProcessTypeEnum processType) {
    this.processType = processType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getProcessId() {
    return processId;
  }
  public void setProcessId(String processId) {
    this.processId = processId;
  }

  
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
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getHelpText() {
    return helpText;
  }
  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getHelpDetail() {
    return helpDetail;
  }
  public void setHelpDetail(String helpDetail) {
    this.helpDetail = helpDetail;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
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
   * epoch timestamp in milliseconds
   **/
  @ApiModelProperty(required = false, value = "epoch timestamp in milliseconds")
  public Long getDate() {
    return date;
  }
  public void setDate(Long date) {
    this.date = date;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRecipientKey() {
    return recipientKey;
  }
  public void setRecipientKey(String recipientKey) {
    this.recipientKey = recipientKey;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  processType: ").append(processType).append("\n");
    sb.append("  processId: ").append(processId).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  helpText: ").append(helpText).append("\n");
    sb.append("  helpDetail: ").append(helpDetail).append("\n");
    sb.append("  optional: ").append(optional).append("\n");
    sb.append("  metadataList: ").append(metadataList).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  hash: ").append(hash).append("\n");
    sb.append("  fileName: ").append(fileName).append("\n");
    sb.append("  readOnly: ").append(readOnly).append("\n");
    sb.append("  recipientKey: ").append(recipientKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
