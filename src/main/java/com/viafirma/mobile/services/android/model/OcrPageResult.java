package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.JSOcrFieldExtractionResult;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class OcrPageResult  implements Serializable {
  
  @SerializedName("fieldExtractionResults")
  private List<JSOcrFieldExtractionResult> fieldExtractionResults = new ArrayList<JSOcrFieldExtractionResult>() ;
  @SerializedName("pageKey")
  private String pageKey = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<JSOcrFieldExtractionResult> getFieldExtractionResults() {
    return fieldExtractionResults;
  }
  public void setFieldExtractionResults(List<JSOcrFieldExtractionResult> fieldExtractionResults) {
    this.fieldExtractionResults = fieldExtractionResults;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPageKey() {
    return pageKey;
  }
  public void setPageKey(String pageKey) {
    this.pageKey = pageKey;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrPageResult {\n");
    
    sb.append("  fieldExtractionResults: ").append(fieldExtractionResults).append("\n");
    sb.append("  pageKey: ").append(pageKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
