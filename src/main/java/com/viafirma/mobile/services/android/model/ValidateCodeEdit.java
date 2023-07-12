package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ValidateCodeEdit  implements Serializable {
  
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("setCode")
  private String setCode = null;
  @SerializedName("recipientKey")
  private String recipientKey = null;
  @SerializedName("validateCode")
  private String validateCode = null;
  public enum ValidateCodeTypeEnum {
     NO,  PASSWORD,  OTP_SMS,  OTP_MAIL, 
  };
  @SerializedName("validateCodeType")
  private ValidateCodeTypeEnum validateCodeType = null;
  @SerializedName("validateOtpSubject")
  private String validateOtpSubject = null;
  @SerializedName("validateOtpText")
  private String validateOtpText = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSetCode() {
    return setCode;
  }
  public void setSetCode(String setCode) {
    this.setCode = setCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRecipientKey() {
    return recipientKey;
  }
  public void setRecipientKey(String recipientKey) {
    this.recipientKey = recipientKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValidateCode() {
    return validateCode;
  }
  public void setValidateCode(String validateCode) {
    this.validateCode = validateCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public ValidateCodeTypeEnum getValidateCodeType() {
    return validateCodeType;
  }
  public void setValidateCodeType(ValidateCodeTypeEnum validateCodeType) {
    this.validateCodeType = validateCodeType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValidateOtpSubject() {
    return validateOtpSubject;
  }
  public void setValidateOtpSubject(String validateOtpSubject) {
    this.validateOtpSubject = validateOtpSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValidateOtpText() {
    return validateOtpText;
  }
  public void setValidateOtpText(String validateOtpText) {
    this.validateOtpText = validateOtpText;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateCodeEdit {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  setCode: ").append(setCode).append("\n");
    sb.append("  recipientKey: ").append(recipientKey).append("\n");
    sb.append("  validateCode: ").append(validateCode).append("\n");
    sb.append("  validateCodeType: ").append(validateCodeType).append("\n");
    sb.append("  validateOtpSubject: ").append(validateOtpSubject).append("\n");
    sb.append("  validateOtpText: ").append(validateOtpText).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
