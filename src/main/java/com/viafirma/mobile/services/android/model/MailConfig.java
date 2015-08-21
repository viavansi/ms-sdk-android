package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MailConfig  implements Serializable {
  
  @SerializedName("required")
  private Boolean required = Boolean.FALSE;
  @SerializedName("visible")
  private Boolean visible = Boolean.FALSE;
  @SerializedName("default_value")
  private String default_value = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDefault_value() {
    return default_value;
  }
  public void setDefault_value(String default_value) {
    this.default_value = default_value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailConfig {\n");
    
    sb.append("  required: ").append(required).append("\n");
    sb.append("  visible: ").append(visible).append("\n");
    sb.append("  default_value: ").append(default_value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
