package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.CertificateDTO;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ConfigTsaDTO  implements Serializable {
  
  public enum TypeEnum {
     URL,  USER,  CERTIFICATE,  CERTIFICATE_TLS,  LOCAL, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("user")
  private String user = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("policyId")
  private String policyId = null;
  @SerializedName("localCert")
  private CertificateDTO localCert = null;
  public enum TimestampAlgorithmEnum {
     SHA1,  SHA224,  SHA256,  SHA384,  SHA512,  RIPEMD160,  MD2,  MD5, 
  };
  @SerializedName("timestampAlgorithm")
  private TimestampAlgorithmEnum timestampAlgorithm = null;
  @SerializedName("extensionOid")
  private String extensionOid = null;
  @SerializedName("extensionValue")
  private String extensionValue = null;

  
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
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPolicyId() {
    return policyId;
  }
  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public CertificateDTO getLocalCert() {
    return localCert;
  }
  public void setLocalCert(CertificateDTO localCert) {
    this.localCert = localCert;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TimestampAlgorithmEnum getTimestampAlgorithm() {
    return timestampAlgorithm;
  }
  public void setTimestampAlgorithm(TimestampAlgorithmEnum timestampAlgorithm) {
    this.timestampAlgorithm = timestampAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getExtensionOid() {
    return extensionOid;
  }
  public void setExtensionOid(String extensionOid) {
    this.extensionOid = extensionOid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getExtensionValue() {
    return extensionValue;
  }
  public void setExtensionValue(String extensionValue) {
    this.extensionValue = extensionValue;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigTsaDTO {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  policyId: ").append(policyId).append("\n");
    sb.append("  localCert: ").append(localCert).append("\n");
    sb.append("  timestampAlgorithm: ").append(timestampAlgorithm).append("\n");
    sb.append("  extensionOid: ").append(extensionOid).append("\n");
    sb.append("  extensionValue: ").append(extensionValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
