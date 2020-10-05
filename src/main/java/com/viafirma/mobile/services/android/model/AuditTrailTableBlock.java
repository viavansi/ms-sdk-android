package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.AuditTrailTableRow;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailTableBlock  implements Serializable {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("column1Title")
  private String column1Title = null;
  @SerializedName("column2Title")
  private String column2Title = null;
  @SerializedName("column3Title")
  private String column3Title = null;
  @SerializedName("rows")
  private List<AuditTrailTableRow> rows = new ArrayList<AuditTrailTableRow>() ;

  
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
  public String getColumn1Title() {
    return column1Title;
  }
  public void setColumn1Title(String column1Title) {
    this.column1Title = column1Title;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getColumn2Title() {
    return column2Title;
  }
  public void setColumn2Title(String column2Title) {
    this.column2Title = column2Title;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getColumn3Title() {
    return column3Title;
  }
  public void setColumn3Title(String column3Title) {
    this.column3Title = column3Title;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<AuditTrailTableRow> getRows() {
    return rows;
  }
  public void setRows(List<AuditTrailTableRow> rows) {
    this.rows = rows;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailTableBlock {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  column1Title: ").append(column1Title).append("\n");
    sb.append("  column2Title: ").append(column2Title).append("\n");
    sb.append("  column3Title: ").append(column3Title).append("\n");
    sb.append("  rows: ").append(rows).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
