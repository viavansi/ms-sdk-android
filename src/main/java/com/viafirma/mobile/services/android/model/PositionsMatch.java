package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class PositionsMatch  implements Serializable {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("xoffset")
  private Integer xoffset = null;
  @SerializedName("yoffset")
  private Integer yoffset = null;
  @SerializedName("width")
  private Integer width = null;
  @SerializedName("height")
  private Integer height = null;
  @SerializedName("forEvidence")
  private Boolean forEvidence = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getXoffset() {
    return xoffset;
  }
  public void setXoffset(Integer xoffset) {
    this.xoffset = xoffset;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getYoffset() {
    return yoffset;
  }
  public void setYoffset(Integer yoffset) {
    this.yoffset = yoffset;
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

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getForEvidence() {
    return forEvidence;
  }
  public void setForEvidence(Boolean forEvidence) {
    this.forEvidence = forEvidence;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionsMatch {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  xoffset: ").append(xoffset).append("\n");
    sb.append("  yoffset: ").append(yoffset).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  forEvidence: ").append(forEvidence).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
