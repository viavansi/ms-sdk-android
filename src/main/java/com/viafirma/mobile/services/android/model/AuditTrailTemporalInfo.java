package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailTemporalInfo  implements Serializable {
  
  @SerializedName("formattedDate")
  private String formattedDate = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("status")
  private String status = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFormattedDate() {
    return formattedDate;
  }
  public void setFormattedDate(String formattedDate) {
    this.formattedDate = formattedDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailTemporalInfo {\n");
    
    sb.append("  formattedDate: ").append(formattedDate).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
