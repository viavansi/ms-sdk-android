package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Param;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Attachment  implements Serializable {
  
  public enum TypeEnum {
     PDF,  JPG,  PNG, 
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
    sb.append("}\n");
    return sb.toString();
  }
}