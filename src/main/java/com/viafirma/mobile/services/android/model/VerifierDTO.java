package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.VerifierCrlDTO;
import java.util.*;
import com.viafirma.mobile.services.android.model.VerifierOcspDTO;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class VerifierDTO  implements Serializable {
  
  @SerializedName("validRevocationSource")
  private Boolean validRevocationSource = Boolean.FALSE;
  @SerializedName("method")
  private String method = null;
  @SerializedName("ocspResponse")
  private VerifierOcspDTO ocspResponse = null;
  @SerializedName("crlResponse")
  private VerifierCrlDTO crlResponse = null;
  @SerializedName("revocationDate")
  private Date revocationDate = null;
  @SerializedName("revocationReason")
  private String revocationReason = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("info")
  private List<String> info = new ArrayList<String>() ;
  @SerializedName("revoked")
  private Boolean revoked = Boolean.FALSE;
  @SerializedName("disabled")
  private Boolean disabled = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getValidRevocationSource() {
    return validRevocationSource;
  }
  public void setValidRevocationSource(Boolean validRevocationSource) {
    this.validRevocationSource = validRevocationSource;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public VerifierOcspDTO getOcspResponse() {
    return ocspResponse;
  }
  public void setOcspResponse(VerifierOcspDTO ocspResponse) {
    this.ocspResponse = ocspResponse;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public VerifierCrlDTO getCrlResponse() {
    return crlResponse;
  }
  public void setCrlResponse(VerifierCrlDTO crlResponse) {
    this.crlResponse = crlResponse;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getRevocationDate() {
    return revocationDate;
  }
  public void setRevocationDate(Date revocationDate) {
    this.revocationDate = revocationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRevocationReason() {
    return revocationReason;
  }
  public void setRevocationReason(String revocationReason) {
    this.revocationReason = revocationReason;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getInfo() {
    return info;
  }
  public void setInfo(List<String> info) {
    this.info = info;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getRevoked() {
    return revoked;
  }
  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifierDTO {\n");
    
    sb.append("  validRevocationSource: ").append(validRevocationSource).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  ocspResponse: ").append(ocspResponse).append("\n");
    sb.append("  crlResponse: ").append(crlResponse).append("\n");
    sb.append("  revocationDate: ").append(revocationDate).append("\n");
    sb.append("  revocationReason: ").append(revocationReason).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  revoked: ").append(revoked).append("\n");
    sb.append("  disabled: ").append(disabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
