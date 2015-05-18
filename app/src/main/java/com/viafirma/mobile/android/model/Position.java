package com.viafirma.mobile.android.model;

import com.viafirma.mobile.android.model.Rectangle;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Position  implements Serializable {
  
  @SerializedName("rectangle")
  private Rectangle rectangle = null;
  @SerializedName("page")
  private Integer page = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Rectangle getRectangle() {
    return rectangle;
  }
  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("  rectangle: ").append(rectangle).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
