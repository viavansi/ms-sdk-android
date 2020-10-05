package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class CallbackMail  implements Serializable {
  
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("mails")
  private String mails = null;
  @SerializedName("phones")
  private String phones = null;

  
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
  public String getMails() {
    return mails;
  }
  public void setMails(String mails) {
    this.mails = mails;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPhones() {
    return phones;
  }
  public void setPhones(String phones) {
    this.phones = phones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackMail {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  mails: ").append(mails).append("\n");
    sb.append("  phones: ").append(phones).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
