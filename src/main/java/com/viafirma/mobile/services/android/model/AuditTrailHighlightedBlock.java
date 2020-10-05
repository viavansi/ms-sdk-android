package com.viafirma.mobile.services.android.model;

import java.util.*;
import com.viafirma.mobile.services.android.model.AuditTrailHighlightedItem;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailHighlightedBlock  implements Serializable {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("items")
  private List<AuditTrailHighlightedItem> items = new ArrayList<AuditTrailHighlightedItem>() ;

  
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
  public List<AuditTrailHighlightedItem> getItems() {
    return items;
  }
  public void setItems(List<AuditTrailHighlightedItem> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailHighlightedBlock {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
