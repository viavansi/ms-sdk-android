package com.viafirma.mobile.android.model;

import com.viafirma.mobile.android.model.Item;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Row  implements Serializable {
  
  @SerializedName("items")
  private List<Item> items = new ArrayList<Item>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Row {\n");
    
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
