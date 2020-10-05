package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailTableRow  implements Serializable {
  
  @SerializedName("column1Value")
  private String column1Value = null;
  @SerializedName("column2Value")
  private String column2Value = null;
  @SerializedName("column3Value")
  private String column3Value = null;
  @SerializedName("includePDFLink")
  private Boolean includePDFLink = Boolean.FALSE;
  @SerializedName("pdfLinkURL")
  private String pdfLinkURL = null;
  @SerializedName("includeModalPopup")
  private Boolean includeModalPopup = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getColumn1Value() {
    return column1Value;
  }
  public void setColumn1Value(String column1Value) {
    this.column1Value = column1Value;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getColumn2Value() {
    return column2Value;
  }
  public void setColumn2Value(String column2Value) {
    this.column2Value = column2Value;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getColumn3Value() {
    return column3Value;
  }
  public void setColumn3Value(String column3Value) {
    this.column3Value = column3Value;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getIncludePDFLink() {
    return includePDFLink;
  }
  public void setIncludePDFLink(Boolean includePDFLink) {
    this.includePDFLink = includePDFLink;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPdfLinkURL() {
    return pdfLinkURL;
  }
  public void setPdfLinkURL(String pdfLinkURL) {
    this.pdfLinkURL = pdfLinkURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getIncludeModalPopup() {
    return includeModalPopup;
  }
  public void setIncludeModalPopup(Boolean includeModalPopup) {
    this.includeModalPopup = includeModalPopup;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailTableRow {\n");
    
    sb.append("  column1Value: ").append(column1Value).append("\n");
    sb.append("  column2Value: ").append(column2Value).append("\n");
    sb.append("  column3Value: ").append(column3Value).append("\n");
    sb.append("  includePDFLink: ").append(includePDFLink).append("\n");
    sb.append("  pdfLinkURL: ").append(pdfLinkURL).append("\n");
    sb.append("  includeModalPopup: ").append(includeModalPopup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
