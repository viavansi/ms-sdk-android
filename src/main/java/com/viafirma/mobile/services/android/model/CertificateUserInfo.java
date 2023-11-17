package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class CertificateUserInfo  implements Serializable {
  
  @SerializedName("autoComplete")
  private Boolean autoComplete = Boolean.FALSE;
  @SerializedName("nationalId")
  private String nationalId = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("surname")
  private String surname = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAutoComplete() {
    return autoComplete;
  }
  public void setAutoComplete(Boolean autoComplete) {
    this.autoComplete = autoComplete;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getNationalId() {
    return nationalId;
  }
  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateUserInfo {\n");
    
    sb.append("  autoComplete: ").append(autoComplete).append("\n");
    sb.append("  nationalId: ").append(nationalId).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  surname: ").append(surname).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
