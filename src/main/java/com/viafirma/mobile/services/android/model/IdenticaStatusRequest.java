package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class IdenticaStatusRequest  implements Serializable {
  
  @SerializedName("requestId")
  private String requestId = null;
  @SerializedName("identicaServer")
  private String identicaServer = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIdenticaServer() {
    return identicaServer;
  }
  public void setIdenticaServer(String identicaServer) {
    this.identicaServer = identicaServer;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdenticaStatusRequest {\n");
    
    sb.append("  requestId: ").append(requestId).append("\n");
    sb.append("  identicaServer: ").append(identicaServer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
