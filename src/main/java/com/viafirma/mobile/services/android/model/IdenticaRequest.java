package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class IdenticaRequest  implements Serializable {
  
  @SerializedName("identicaServer")
  private String identicaServer = null;
  @SerializedName("clientId")
  private String clientId = null;
  @SerializedName("userId")
  private String userId = null;
  @SerializedName("serialId")
  private String serialId = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIdenticaServer() {
    return identicaServer;
  }
  public void setIdenticaServer(String identicaServer) {
    this.identicaServer = identicaServer;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSerialId() {
    return serialId;
  }
  public void setSerialId(String serialId) {
    this.serialId = serialId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdenticaRequest {\n");
    
    sb.append("  identicaServer: ").append(identicaServer).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  serialId: ").append(serialId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
