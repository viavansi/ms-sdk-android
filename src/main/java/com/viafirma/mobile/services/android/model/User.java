package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Group;
import com.viafirma.mobile.services.android.model.Param;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class User  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("nationalId")
  private String nationalId = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("surname")
  private String surname = null;
  @SerializedName("rol")
  private String rol = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("viafirmaKey")
  private String viafirmaKey = null;
  @SerializedName("viafirmaPassword")
  private String viafirmaPassword = null;
  @SerializedName("viafirmaCertificate")
  private String viafirmaCertificate = null;
  @SerializedName("region")
  private String region = null;
  @SerializedName("pos")
  private String pos = null;
  @SerializedName("confirmToken")
  private String confirmToken = null;
  @SerializedName("changePassToken")
  private String changePassToken = null;
  @SerializedName("logDevice")
  private Boolean logDevice = Boolean.FALSE;
  @SerializedName("status")
  private String status = null;
  @SerializedName("groups")
  private List<String> groups = new ArrayList<String>() ;
  @SerializedName("groupsInfo")
  private List<Group> groupsInfo = new ArrayList<Group>() ;
  @SerializedName("properties")
  private List<Param> properties = new ArrayList<Param>() ;
  @SerializedName("mobile")
  private String mobile = null;
  @SerializedName("channel")
  private String channel = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getNationalId() {
    return nationalId;
  }
  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRol() {
    return rol;
  }
  public void setRol(String rol) {
    this.rol = rol;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getViafirmaKey() {
    return viafirmaKey;
  }
  public void setViafirmaKey(String viafirmaKey) {
    this.viafirmaKey = viafirmaKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getViafirmaPassword() {
    return viafirmaPassword;
  }
  public void setViafirmaPassword(String viafirmaPassword) {
    this.viafirmaPassword = viafirmaPassword;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getViafirmaCertificate() {
    return viafirmaCertificate;
  }
  public void setViafirmaCertificate(String viafirmaCertificate) {
    this.viafirmaCertificate = viafirmaCertificate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getPos() {
    return pos;
  }
  public void setPos(String pos) {
    this.pos = pos;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getConfirmToken() {
    return confirmToken;
  }
  public void setConfirmToken(String confirmToken) {
    this.confirmToken = confirmToken;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getChangePassToken() {
    return changePassToken;
  }
  public void setChangePassToken(String changePassToken) {
    this.changePassToken = changePassToken;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getLogDevice() {
    return logDevice;
  }
  public void setLogDevice(Boolean logDevice) {
    this.logDevice = logDevice;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getGroups() {
    return groups;
  }
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Group> getGroupsInfo() {
    return groupsInfo;
  }
  public void setGroupsInfo(List<Group> groupsInfo) {
    this.groupsInfo = groupsInfo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Param> getProperties() {
    return properties;
  }
  public void setProperties(List<Param> properties) {
    this.properties = properties;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMobile() {
    return mobile;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getChannel() {
    return channel;
  }
  public void setChannel(String channel) {
    this.channel = channel;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  nationalId: ").append(nationalId).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  surname: ").append(surname).append("\n");
    sb.append("  rol: ").append(rol).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  viafirmaKey: ").append(viafirmaKey).append("\n");
    sb.append("  viafirmaPassword: ").append(viafirmaPassword).append("\n");
    sb.append("  viafirmaCertificate: ").append(viafirmaCertificate).append("\n");
    sb.append("  region: ").append(region).append("\n");
    sb.append("  pos: ").append(pos).append("\n");
    sb.append("  confirmToken: ").append(confirmToken).append("\n");
    sb.append("  changePassToken: ").append(changePassToken).append("\n");
    sb.append("  logDevice: ").append(logDevice).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  groups: ").append(groups).append("\n");
    sb.append("  groupsInfo: ").append(groupsInfo).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("  mobile: ").append(mobile).append("\n");
    sb.append("  channel: ").append(channel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
