package com.viafirma.mobile.services.android.model;

import java.util.*;
import com.viafirma.mobile.services.android.model.MessageList;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessagePaginatedList  implements Serializable {
  
  @SerializedName("total")
  private Integer total = null;
  @SerializedName("elements")
  private List<MessageList> elements = new ArrayList<MessageList>() ;

  
  /**
   * (since 3.4.10) total
   **/
  @ApiModelProperty(required = true, value = "(since 3.4.10) total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  
  /**
   * (since 3.4.10) elements
   **/
  @ApiModelProperty(required = true, value = "(since 3.4.10) elements")
  public List<MessageList> getElements() {
    return elements;
  }
  public void setElements(List<MessageList> elements) {
    this.elements = elements;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePaginatedList {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  elements: ").append(elements).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
