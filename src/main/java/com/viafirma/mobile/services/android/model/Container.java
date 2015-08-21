package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Row;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Container  implements Serializable {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("rows")
  private List<Row> rows = new ArrayList<Row>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
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
  public List<Row> getRows() {
    return rows;
  }
  public void setRows(List<Row> rows) {
    this.rows = rows;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Container {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  rows: ").append(rows).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
