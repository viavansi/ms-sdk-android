package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Client  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("userName")
  private String userName = null;
  @SerializedName("surname")
  private String surname = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("smsProvider")
  private String smsProvider = null;
  @SerializedName("smsApiKey")
  private String smsApiKey = null;
  @SerializedName("smsUrl")
  private String smsUrl = null;
  @SerializedName("demo")
  private Boolean demo = Boolean.FALSE;
  @SerializedName("configCountry")
  private String configCountry = null;
  @SerializedName("logo")
  private String logo = null;
  @SerializedName("mainColor")
  private String mainColor = null;
  @SerializedName("fortressUrl")
  private String fortressUrl = null;
  @SerializedName("fortressClientId")
  private String fortressClientId = null;
  @SerializedName("fortressClientSecret")
  private String fortressClientSecret = null;
  @SerializedName("sendMail")
  private Boolean sendMail = Boolean.FALSE;
  @SerializedName("developer")
  private Boolean developer = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
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
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
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
  @ApiModelProperty(required = false, value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSmsProvider() {
    return smsProvider;
  }
  public void setSmsProvider(String smsProvider) {
    this.smsProvider = smsProvider;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSmsApiKey() {
    return smsApiKey;
  }
  public void setSmsApiKey(String smsApiKey) {
    this.smsApiKey = smsApiKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSmsUrl() {
    return smsUrl;
  }
  public void setSmsUrl(String smsUrl) {
    this.smsUrl = smsUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getDemo() {
    return demo;
  }
  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getConfigCountry() {
    return configCountry;
  }
  public void setConfigCountry(String configCountry) {
    this.configCountry = configCountry;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLogo() {
    return logo;
  }
  public void setLogo(String logo) {
    this.logo = logo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMainColor() {
    return mainColor;
  }
  public void setMainColor(String mainColor) {
    this.mainColor = mainColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFortressUrl() {
    return fortressUrl;
  }
  public void setFortressUrl(String fortressUrl) {
    this.fortressUrl = fortressUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFortressClientId() {
    return fortressClientId;
  }
  public void setFortressClientId(String fortressClientId) {
    this.fortressClientId = fortressClientId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFortressClientSecret() {
    return fortressClientSecret;
  }
  public void setFortressClientSecret(String fortressClientSecret) {
    this.fortressClientSecret = fortressClientSecret;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getSendMail() {
    return sendMail;
  }
  public void setSendMail(Boolean sendMail) {
    this.sendMail = sendMail;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getDeveloper() {
    return developer;
  }
  public void setDeveloper(Boolean developer) {
    this.developer = developer;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  surname: ").append(surname).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  smsProvider: ").append(smsProvider).append("\n");
    sb.append("  smsApiKey: ").append(smsApiKey).append("\n");
    sb.append("  smsUrl: ").append(smsUrl).append("\n");
    sb.append("  demo: ").append(demo).append("\n");
    sb.append("  configCountry: ").append(configCountry).append("\n");
    sb.append("  logo: ").append(logo).append("\n");
    sb.append("  mainColor: ").append(mainColor).append("\n");
    sb.append("  fortressUrl: ").append(fortressUrl).append("\n");
    sb.append("  fortressClientId: ").append(fortressClientId).append("\n");
    sb.append("  fortressClientSecret: ").append(fortressClientSecret).append("\n");
    sb.append("  sendMail: ").append(sendMail).append("\n");
    sb.append("  developer: ").append(developer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
