package com.viafirma.mobile.services.android.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class VerifierOcspDTO  implements Serializable {
  
  @SerializedName("responseDate")
  private Date responseDate = null;
  @SerializedName("responseOcsp")
  private String responseOcsp = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getResponseDate() {
    return responseDate;
  }
  public void setResponseDate(Date responseDate) {
    this.responseDate = responseDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getResponseOcsp() {
    return responseOcsp;
  }
  public void setResponseOcsp(String responseOcsp) {
    this.responseOcsp = responseOcsp;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifierOcspDTO {\n");
    
    sb.append("  responseDate: ").append(responseDate).append("\n");
    sb.append("  responseOcsp: ").append(responseOcsp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
