package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class BatchLinkRequest  implements Serializable {
  
  @SerializedName("userCode")
  private String userCode = null;
  @SerializedName("groupCode")
  private String groupCode = null;
  @SerializedName("redirectURL")
  private String redirectURL = null;
  @SerializedName("index")
  private Integer index = null;
  @SerializedName("max")
  private Integer max = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUserCode() {
    return userCode;
  }
  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getGroupCode() {
    return groupCode;
  }
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRedirectURL() {
    return redirectURL;
  }
  public void setRedirectURL(String redirectURL) {
    this.redirectURL = redirectURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getMax() {
    return max;
  }
  public void setMax(Integer max) {
    this.max = max;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchLinkRequest {\n");
    
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  redirectURL: ").append(redirectURL).append("\n");
    sb.append("  index: ").append(index).append("\n");
    sb.append("  max: ").append(max).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
