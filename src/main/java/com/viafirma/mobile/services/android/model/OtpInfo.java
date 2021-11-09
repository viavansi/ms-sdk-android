package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class OtpInfo  implements Serializable {
  
  @SerializedName("groupCode")
  private String groupCode = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("recipient")
  private String recipient = null;
  @SerializedName("groupTitle")
  private String groupTitle = null;
  @SerializedName("groupDesc")
  private String groupDesc = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getGroupCode() {
    return groupCode;
  }
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRecipient() {
    return recipient;
  }
  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getGroupTitle() {
    return groupTitle;
  }
  public void setGroupTitle(String groupTitle) {
    this.groupTitle = groupTitle;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getGroupDesc() {
    return groupDesc;
  }
  public void setGroupDesc(String groupDesc) {
    this.groupDesc = groupDesc;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpInfo {\n");
    
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  recipient: ").append(recipient).append("\n");
    sb.append("  groupTitle: ").append(groupTitle).append("\n");
    sb.append("  groupDesc: ").append(groupDesc).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
