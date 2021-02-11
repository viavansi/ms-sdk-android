package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class XMLPdfPageHash  implements Serializable {
  
  @SerializedName("pageNum")
  private Integer pageNum = null;
  @SerializedName("value")
  private String value = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getPageNum() {
    return pageNum;
  }
  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XMLPdfPageHash {\n");
    
    sb.append("  pageNum: ").append(pageNum).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
