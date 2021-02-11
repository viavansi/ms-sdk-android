package com.viafirma.mobile.services.android.model;

import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ConfigXadesDTO  implements Serializable {
  
  @SerializedName("signedInfoCanonicalizationMethod")
  private String signedInfoCanonicalizationMethod = null;
  @SerializedName("signedPropertiesCanonicalizationMethod")
  private String signedPropertiesCanonicalizationMethod = null;
  @SerializedName("trustAnchorBPPolicy")
  private Boolean trustAnchorBPPolicy = Boolean.FALSE;
  @SerializedName("claimedSignerRoles")
  private List<String> claimedSignerRoles = new ArrayList<String>() ;
  @SerializedName("commitmentTypeIndication")
  private List<String> commitmentTypeIndication = new ArrayList<String>() ;
  @SerializedName("transformAlgorithms")
  private List<String> transformAlgorithms = new ArrayList<String>() ;
  @SerializedName("dssReferenceUri")
  private String dssReferenceUri = null;
  @SerializedName("useSigningCertificateV2")
  private Boolean useSigningCertificateV2 = Boolean.FALSE;
  @SerializedName("xpathLocationString")
  private String xpathLocationString = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignedInfoCanonicalizationMethod() {
    return signedInfoCanonicalizationMethod;
  }
  public void setSignedInfoCanonicalizationMethod(String signedInfoCanonicalizationMethod) {
    this.signedInfoCanonicalizationMethod = signedInfoCanonicalizationMethod;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSignedPropertiesCanonicalizationMethod() {
    return signedPropertiesCanonicalizationMethod;
  }
  public void setSignedPropertiesCanonicalizationMethod(String signedPropertiesCanonicalizationMethod) {
    this.signedPropertiesCanonicalizationMethod = signedPropertiesCanonicalizationMethod;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getTrustAnchorBPPolicy() {
    return trustAnchorBPPolicy;
  }
  public void setTrustAnchorBPPolicy(Boolean trustAnchorBPPolicy) {
    this.trustAnchorBPPolicy = trustAnchorBPPolicy;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getClaimedSignerRoles() {
    return claimedSignerRoles;
  }
  public void setClaimedSignerRoles(List<String> claimedSignerRoles) {
    this.claimedSignerRoles = claimedSignerRoles;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getCommitmentTypeIndication() {
    return commitmentTypeIndication;
  }
  public void setCommitmentTypeIndication(List<String> commitmentTypeIndication) {
    this.commitmentTypeIndication = commitmentTypeIndication;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getTransformAlgorithms() {
    return transformAlgorithms;
  }
  public void setTransformAlgorithms(List<String> transformAlgorithms) {
    this.transformAlgorithms = transformAlgorithms;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDssReferenceUri() {
    return dssReferenceUri;
  }
  public void setDssReferenceUri(String dssReferenceUri) {
    this.dssReferenceUri = dssReferenceUri;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getUseSigningCertificateV2() {
    return useSigningCertificateV2;
  }
  public void setUseSigningCertificateV2(Boolean useSigningCertificateV2) {
    this.useSigningCertificateV2 = useSigningCertificateV2;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getXpathLocationString() {
    return xpathLocationString;
  }
  public void setXpathLocationString(String xpathLocationString) {
    this.xpathLocationString = xpathLocationString;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigXadesDTO {\n");
    
    sb.append("  signedInfoCanonicalizationMethod: ").append(signedInfoCanonicalizationMethod).append("\n");
    sb.append("  signedPropertiesCanonicalizationMethod: ").append(signedPropertiesCanonicalizationMethod).append("\n");
    sb.append("  trustAnchorBPPolicy: ").append(trustAnchorBPPolicy).append("\n");
    sb.append("  claimedSignerRoles: ").append(claimedSignerRoles).append("\n");
    sb.append("  commitmentTypeIndication: ").append(commitmentTypeIndication).append("\n");
    sb.append("  transformAlgorithms: ").append(transformAlgorithms).append("\n");
    sb.append("  dssReferenceUri: ").append(dssReferenceUri).append("\n");
    sb.append("  useSigningCertificateV2: ").append(useSigningCertificateV2).append("\n");
    sb.append("  xpathLocationString: ").append(xpathLocationString).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
