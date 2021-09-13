package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.OtpInfo;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class OtpList  implements Serializable {
  
  @SerializedName("otpGroupEvidences")
  private List<OtpInfo> otpGroupEvidences = new ArrayList<OtpInfo>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<OtpInfo> getOtpGroupEvidences() {
    return otpGroupEvidences;
  }
  public void setOtpGroupEvidences(List<OtpInfo> otpGroupEvidences) {
    this.otpGroupEvidences = otpGroupEvidences;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpList {\n");
    
    sb.append("  otpGroupEvidences: ").append(otpGroupEvidences).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
