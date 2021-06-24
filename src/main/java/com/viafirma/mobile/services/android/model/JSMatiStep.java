package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Number;
import com.viafirma.mobile.services.android.model.JSMatiStepError;
import com.viafirma.mobile.services.android.model.JSMatiVerifData;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class JSMatiStep  implements Serializable {
  
  @SerializedName("status")
  private Number status = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("data")
  private JSMatiVerifData data = null;
  @SerializedName("error")
  private JSMatiStepError error = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Number getStatus() {
    return status;
  }
  public void setStatus(Number status) {
    this.status = status;
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
  public JSMatiVerifData getData() {
    return data;
  }
  public void setData(JSMatiVerifData data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public JSMatiStepError getError() {
    return error;
  }
  public void setError(JSMatiStepError error) {
    this.error = error;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSMatiStep {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
