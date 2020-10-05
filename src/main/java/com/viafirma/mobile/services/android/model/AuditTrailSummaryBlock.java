package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.AuditTrailLabelValueInfo;
import com.viafirma.mobile.services.android.model.AuditTrailTemporalInfo;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailSummaryBlock  implements Serializable {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("labelValueFields")
  private List<AuditTrailLabelValueInfo> labelValueFields = new ArrayList<AuditTrailLabelValueInfo>() ;
  @SerializedName("temporalInfoFields")
  private List<AuditTrailTemporalInfo> temporalInfoFields = new ArrayList<AuditTrailTemporalInfo>() ;

  
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
  public List<AuditTrailLabelValueInfo> getLabelValueFields() {
    return labelValueFields;
  }
  public void setLabelValueFields(List<AuditTrailLabelValueInfo> labelValueFields) {
    this.labelValueFields = labelValueFields;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<AuditTrailTemporalInfo> getTemporalInfoFields() {
    return temporalInfoFields;
  }
  public void setTemporalInfoFields(List<AuditTrailTemporalInfo> temporalInfoFields) {
    this.temporalInfoFields = temporalInfoFields;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailSummaryBlock {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  labelValueFields: ").append(labelValueFields).append("\n");
    sb.append("  temporalInfoFields: ").append(temporalInfoFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
