package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class ClientApp  implements Serializable {
  
  @SerializedName("typeApp")
  private String typeApp = null;
  @SerializedName("urlApp")
  private String urlApp = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getTypeApp() {
    return typeApp;
  }
  public void setTypeApp(String typeApp) {
    this.typeApp = typeApp;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUrlApp() {
    return urlApp;
  }
  public void setUrlApp(String urlApp) {
    this.urlApp = urlApp;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientApp {\n");
    
    sb.append("  typeApp: ").append(typeApp).append("\n");
    sb.append("  urlApp: ").append(urlApp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
