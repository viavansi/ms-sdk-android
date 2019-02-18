package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.EvidencePoint;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class EvidenceStroke  implements Serializable {
  
  @SerializedName("points")
  private List<EvidencePoint> points = new ArrayList<EvidencePoint>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<EvidencePoint> getPoints() {
    return points;
  }
  public void setPoints(List<EvidencePoint> points) {
    this.points = points;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceStroke {\n");
    
    sb.append("  points: ").append(points).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
