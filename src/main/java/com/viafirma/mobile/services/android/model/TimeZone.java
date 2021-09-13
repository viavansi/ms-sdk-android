package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class TimeZone  implements Serializable {
  
  @SerializedName("rawOffset")
  private Integer rawOffset = null;
  @SerializedName("dstsavings")
  private Integer dstsavings = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("displayName")
  private String displayName = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getRawOffset() {
    return rawOffset;
  }
  public void setRawOffset(Integer rawOffset) {
    this.rawOffset = rawOffset;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getDstsavings() {
    return dstsavings;
  }
  public void setDstsavings(Integer dstsavings) {
    this.dstsavings = dstsavings;
  }

  
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
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZone {\n");
    
    sb.append("  rawOffset: ").append(rawOffset).append("\n");
    sb.append("  dstsavings: ").append(dstsavings).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
