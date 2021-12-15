package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class RecipientLink  implements Serializable {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("link")
  private String link = null;
  @SerializedName("token")
  private String token = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientLink {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
