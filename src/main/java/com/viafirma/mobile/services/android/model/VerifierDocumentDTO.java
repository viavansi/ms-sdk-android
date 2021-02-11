package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.SignatureCodeDTO;
import com.viafirma.mobile.services.android.model.VerifierEvidenceDTO;
import com.viafirma.mobile.services.android.model.VerifierSignatureDTO;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class VerifierDocumentDTO  implements Serializable {
  
  @SerializedName("signatureCode")
  private SignatureCodeDTO signatureCode = null;
  @SerializedName("validationTime")
  private Date validationTime = null;
  @SerializedName("signaturesCount")
  private Integer signaturesCount = null;
  @SerializedName("validSignaturesCount")
  private Integer validSignaturesCount = null;
  @SerializedName("evidencesCount")
  private Integer evidencesCount = null;
  @SerializedName("validEvidencesCount")
  private Integer validEvidencesCount = null;
  @SerializedName("signatures")
  private List<VerifierSignatureDTO> signatures = new ArrayList<VerifierSignatureDTO>() ;
  @SerializedName("evidences")
  private List<VerifierEvidenceDTO> evidences = new ArrayList<VerifierEvidenceDTO>() ;
  @SerializedName("pagesHashes")
  private List<String> pagesHashes = new ArrayList<String>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public SignatureCodeDTO getSignatureCode() {
    return signatureCode;
  }
  public void setSignatureCode(SignatureCodeDTO signatureCode) {
    this.signatureCode = signatureCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getValidationTime() {
    return validationTime;
  }
  public void setValidationTime(Date validationTime) {
    this.validationTime = validationTime;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getSignaturesCount() {
    return signaturesCount;
  }
  public void setSignaturesCount(Integer signaturesCount) {
    this.signaturesCount = signaturesCount;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getValidSignaturesCount() {
    return validSignaturesCount;
  }
  public void setValidSignaturesCount(Integer validSignaturesCount) {
    this.validSignaturesCount = validSignaturesCount;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getEvidencesCount() {
    return evidencesCount;
  }
  public void setEvidencesCount(Integer evidencesCount) {
    this.evidencesCount = evidencesCount;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getValidEvidencesCount() {
    return validEvidencesCount;
  }
  public void setValidEvidencesCount(Integer validEvidencesCount) {
    this.validEvidencesCount = validEvidencesCount;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<VerifierSignatureDTO> getSignatures() {
    return signatures;
  }
  public void setSignatures(List<VerifierSignatureDTO> signatures) {
    this.signatures = signatures;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<VerifierEvidenceDTO> getEvidences() {
    return evidences;
  }
  public void setEvidences(List<VerifierEvidenceDTO> evidences) {
    this.evidences = evidences;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getPagesHashes() {
    return pagesHashes;
  }
  public void setPagesHashes(List<String> pagesHashes) {
    this.pagesHashes = pagesHashes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifierDocumentDTO {\n");
    
    sb.append("  signatureCode: ").append(signatureCode).append("\n");
    sb.append("  validationTime: ").append(validationTime).append("\n");
    sb.append("  signaturesCount: ").append(signaturesCount).append("\n");
    sb.append("  validSignaturesCount: ").append(validSignaturesCount).append("\n");
    sb.append("  evidencesCount: ").append(evidencesCount).append("\n");
    sb.append("  validEvidencesCount: ").append(validEvidencesCount).append("\n");
    sb.append("  signatures: ").append(signatures).append("\n");
    sb.append("  evidences: ").append(evidences).append("\n");
    sb.append("  pagesHashes: ").append(pagesHashes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
