package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.FortressCertificate;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class FortressAccessToken  implements Serializable {
  
  @SerializedName("access_token")
  private String access_token = null;
  @SerializedName("token_type")
  private String token_type = null;
  @SerializedName("expires_in")
  private Long expires_in = null;
  @SerializedName("user_code")
  private String user_code = null;
  @SerializedName("certificate")
  private FortressCertificate certificate = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAccess_token() {
    return access_token;
  }
  public void setAccess_token(String access_token) {
    this.access_token = access_token;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getToken_type() {
    return token_type;
  }
  public void setToken_type(String token_type) {
    this.token_type = token_type;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getExpires_in() {
    return expires_in;
  }
  public void setExpires_in(Long expires_in) {
    this.expires_in = expires_in;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUser_code() {
    return user_code;
  }
  public void setUser_code(String user_code) {
    this.user_code = user_code;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public FortressCertificate getCertificate() {
    return certificate;
  }
  public void setCertificate(FortressCertificate certificate) {
    this.certificate = certificate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FortressAccessToken {\n");
    
    sb.append("  access_token: ").append(access_token).append("\n");
    sb.append("  token_type: ").append(token_type).append("\n");
    sb.append("  expires_in: ").append(expires_in).append("\n");
    sb.append("  user_code: ").append(user_code).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
