package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class TimeZone  implements Serializable {
  
  @SerializedName("displayName")
  private String displayName = null;
  @SerializedName("iD")
  private String iD = null;
  @SerializedName("rawOffset")
  private Integer rawOffset = null;
  @SerializedName("dSTSavings")
  private Integer dSTSavings = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getID() {
    return iD;
  }
  public void setID(String iD) {
    this.iD = iD;
  }

  
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
  public Integer getDSTSavings() {
    return dSTSavings;
  }
  public void setDSTSavings(Integer dSTSavings) {
    this.dSTSavings = dSTSavings;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZone {\n");
    
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  iD: ").append(iD).append("\n");
    sb.append("  rawOffset: ").append(rawOffset).append("\n");
    sb.append("  dSTSavings: ").append(dSTSavings).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
