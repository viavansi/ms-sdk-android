package com.viafirma.mobile.services.android.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class SetListUserGroup  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("userCode")
  private String userCode = null;
  @SerializedName("recipients")
  private String recipients = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("associatedMessageNum")
  private Integer associatedMessageNum = null;
  @SerializedName("associatedMessageCode")
  private String associatedMessageCode = null;
  @SerializedName("associatedUserCode")
  private String associatedUserCode = null;
  @SerializedName("creationDate")
  private Date creationDate = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUserCode() {
    return userCode;
  }
  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRecipients() {
    return recipients;
  }
  public void setRecipients(String recipients) {
    this.recipients = recipients;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getAssociatedMessageNum() {
    return associatedMessageNum;
  }
  public void setAssociatedMessageNum(Integer associatedMessageNum) {
    this.associatedMessageNum = associatedMessageNum;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAssociatedMessageCode() {
    return associatedMessageCode;
  }
  public void setAssociatedMessageCode(String associatedMessageCode) {
    this.associatedMessageCode = associatedMessageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAssociatedUserCode() {
    return associatedUserCode;
  }
  public void setAssociatedUserCode(String associatedUserCode) {
    this.associatedUserCode = associatedUserCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetListUserGroup {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  recipients: ").append(recipients).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  associatedMessageNum: ").append(associatedMessageNum).append("\n");
    sb.append("  associatedMessageCode: ").append(associatedMessageCode).append("\n");
    sb.append("  associatedUserCode: ").append(associatedUserCode).append("\n");
    sb.append("  creationDate: ").append(creationDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
