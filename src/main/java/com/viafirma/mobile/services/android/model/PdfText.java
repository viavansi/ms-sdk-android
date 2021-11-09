package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.PositionsMatch;
import com.viafirma.mobile.services.android.model.Position;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class PdfText  implements Serializable {
  
  @SerializedName("positions")
  private List<Position> positions = new ArrayList<Position>() ;
  @SerializedName("positionsMatch")
  private List<PositionsMatch> positionsMatch = new ArrayList<PositionsMatch>() ;
  @SerializedName("size")
  private Integer size = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Position> getPositions() {
    return positions;
  }
  public void setPositions(List<Position> positions) {
    this.positions = positions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<PositionsMatch> getPositionsMatch() {
    return positionsMatch;
  }
  public void setPositionsMatch(List<PositionsMatch> positionsMatch) {
    this.positionsMatch = positionsMatch;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfText {\n");
    
    sb.append("  positions: ").append(positions).append("\n");
    sb.append("  positionsMatch: ").append(positionsMatch).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
