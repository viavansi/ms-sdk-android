package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.XMLEvidenceDTO;
import com.viafirma.mobile.services.android.model.VerifierSignatureDTO;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class VerifierEvidenceDTO  implements Serializable {
  
  public enum ValidationStatusEnum {
     VALID,  UNKNOWN,  INVALID, 
  };
  @SerializedName("validationStatus")
  private ValidationStatusEnum validationStatus = null;
  @SerializedName("evidenceInfo")
  private XMLEvidenceDTO evidenceInfo = null;
  @SerializedName("evidenceName")
  private String evidenceName = null;
  @SerializedName("signatureInfo")
  private VerifierSignatureDTO signatureInfo = null;
  @SerializedName("validationMessages")
  private List<String> validationMessages = new ArrayList<String>() ;
  @SerializedName("validationErrors")
  private List<String> validationErrors = new ArrayList<String>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ValidationStatusEnum getValidationStatus() {
    return validationStatus;
  }
  public void setValidationStatus(ValidationStatusEnum validationStatus) {
    this.validationStatus = validationStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public XMLEvidenceDTO getEvidenceInfo() {
    return evidenceInfo;
  }
  public void setEvidenceInfo(XMLEvidenceDTO evidenceInfo) {
    this.evidenceInfo = evidenceInfo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getEvidenceName() {
    return evidenceName;
  }
  public void setEvidenceName(String evidenceName) {
    this.evidenceName = evidenceName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public VerifierSignatureDTO getSignatureInfo() {
    return signatureInfo;
  }
  public void setSignatureInfo(VerifierSignatureDTO signatureInfo) {
    this.signatureInfo = signatureInfo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getValidationMessages() {
    return validationMessages;
  }
  public void setValidationMessages(List<String> validationMessages) {
    this.validationMessages = validationMessages;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getValidationErrors() {
    return validationErrors;
  }
  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifierEvidenceDTO {\n");
    
    sb.append("  validationStatus: ").append(validationStatus).append("\n");
    sb.append("  evidenceInfo: ").append(evidenceInfo).append("\n");
    sb.append("  evidenceName: ").append(evidenceName).append("\n");
    sb.append("  signatureInfo: ").append(signatureInfo).append("\n");
    sb.append("  validationMessages: ").append(validationMessages).append("\n");
    sb.append("  validationErrors: ").append(validationErrors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
