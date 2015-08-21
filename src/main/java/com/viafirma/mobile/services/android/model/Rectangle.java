package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Rectangle  implements Serializable {
  
  @SerializedName("x")
  private Integer x = null;
  @SerializedName("y")
  private Integer y = null;
  @SerializedName("width")
  private Integer width = null;
  @SerializedName("height")
  private Integer height = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getX() {
    return x;
  }
  public void setX(Integer x) {
    this.x = x;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getY() {
    return y;
  }
  public void setY(Integer y) {
    this.y = y;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rectangle {\n");
    
    sb.append("  x: ").append(x).append("\n");
    sb.append("  y: ").append(y).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
