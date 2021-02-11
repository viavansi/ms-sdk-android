package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailInformationLabel  implements Serializable {
  
  @SerializedName("textContent")
  private String textContent = null;
  @SerializedName("typeOfLabel")
  private String typeOfLabel = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTextContent() {
    return textContent;
  }
  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTypeOfLabel() {
    return typeOfLabel;
  }
  public void setTypeOfLabel(String typeOfLabel) {
    this.typeOfLabel = typeOfLabel;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailInformationLabel {\n");
    
    sb.append("  textContent: ").append(textContent).append("\n");
    sb.append("  typeOfLabel: ").append(typeOfLabel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
