package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.PrivateKey;
import java.util.*;
import com.viafirma.mobile.services.android.model.X509Certificate;
import com.viafirma.mobile.services.android.model.Certificate;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class CertificateDTO  implements Serializable {
  
  @SerializedName("privateKey")
  private PrivateKey privateKey = null;
  @SerializedName("chain")
  private List<Certificate> chain = new ArrayList<Certificate>() ;
  @SerializedName("certificate")
  private X509Certificate certificate = null;
  @SerializedName("provider")
  private String provider = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public PrivateKey getPrivateKey() {
    return privateKey;
  }
  public void setPrivateKey(PrivateKey privateKey) {
    this.privateKey = privateKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Certificate> getChain() {
    return chain;
  }
  public void setChain(List<Certificate> chain) {
    this.chain = chain;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public X509Certificate getCertificate() {
    return certificate;
  }
  public void setCertificate(X509Certificate certificate) {
    this.certificate = certificate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateDTO {\n");
    
    sb.append("  privateKey: ").append(privateKey).append("\n");
    sb.append("  chain: ").append(chain).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  provider: ").append(provider).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
