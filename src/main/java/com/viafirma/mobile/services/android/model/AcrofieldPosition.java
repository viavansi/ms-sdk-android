package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Rectangle;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AcrofieldPosition  implements Serializable {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("page")
  private Integer page = null;
  @SerializedName("rectangle")
  private Rectangle rectangle = null;
  @SerializedName("positionMatchId")
  private String positionMatchId = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
  @ApiModelProperty(required = false, value = "")
  public String getPositionMatchId() {
    return positionMatchId;
  }
  public void setPositionMatchId(String positionMatchId) {
    this.positionMatchId = positionMatchId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcrofieldPosition {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  rectangle: ").append(rectangle).append("\n");
    sb.append("  positionMatchId: ").append(positionMatchId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
