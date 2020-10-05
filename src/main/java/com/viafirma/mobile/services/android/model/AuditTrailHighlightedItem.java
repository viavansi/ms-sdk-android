package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.AuditTrailImage;
import com.viafirma.mobile.services.android.model.AuditTrailLabelValueInfo;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailHighlightedItem  implements Serializable {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("logo")
  private AuditTrailImage logo = null;
  @SerializedName("labelValueInfoList")
  private List<AuditTrailLabelValueInfo> labelValueInfoList = new ArrayList<AuditTrailLabelValueInfo>() ;

  
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
  public AuditTrailImage getLogo() {
    return logo;
  }
  public void setLogo(AuditTrailImage logo) {
    this.logo = logo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<AuditTrailLabelValueInfo> getLabelValueInfoList() {
    return labelValueInfoList;
  }
  public void setLabelValueInfoList(List<AuditTrailLabelValueInfo> labelValueInfoList) {
    this.labelValueInfoList = labelValueInfoList;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailHighlightedItem {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  logo: ").append(logo).append("\n");
    sb.append("  labelValueInfoList: ").append(labelValueInfoList).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
