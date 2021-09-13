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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpInfo {\n");
    
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  recipient: ").append(recipient).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
