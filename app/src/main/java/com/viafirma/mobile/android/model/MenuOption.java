package com.viafirma.mobile.android.model;

import com.viafirma.mobile.android.model.Mail;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MenuOption  implements Serializable {
  
  @SerializedName("className")
  private String className = null;
  @SerializedName("automatic")
  private Boolean automatic = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("icon")
  private String icon = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("email")
  private Mail email = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getClassName() {
    return className;
  }
  public void setClassName(String className) {
    this.className = className;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getAutomatic() {
    return automatic;
  }
  public void setAutomatic(Boolean automatic) {
    this.automatic = automatic;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIcon() {
    return icon;
  }
  public void setIcon(String icon) {
    this.icon = icon;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Mail getEmail() {
    return email;
  }
  public void setEmail(Mail email) {
    this.email = email;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuOption {\n");
    
    sb.append("  className: ").append(className).append("\n");
    sb.append("  automatic: ").append(automatic).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  icon: ").append(icon).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
