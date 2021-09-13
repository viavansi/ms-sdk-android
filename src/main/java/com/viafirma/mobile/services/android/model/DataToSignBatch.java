package com.viafirma.mobile.services.android.model;

import java.util.*;
import com.viafirma.mobile.services.android.model.DataToSign;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class DataToSignBatch  implements Serializable {
  
  @SerializedName("dataToSignList")
  private List<DataToSign> dataToSignList = new ArrayList<DataToSign>() ;

  
  /**
   * (since 3.7.10) data to sign list
   **/
  @ApiModelProperty(required = true, value = "(since 3.7.10) data to sign list")
  public List<DataToSign> getDataToSignList() {
    return dataToSignList;
  }
  public void setDataToSignList(List<DataToSign> dataToSignList) {
    this.dataToSignList = dataToSignList;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataToSignBatch {\n");
    
    sb.append("  dataToSignList: ").append(dataToSignList).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
