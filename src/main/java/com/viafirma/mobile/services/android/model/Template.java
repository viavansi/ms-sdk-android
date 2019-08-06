package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Form;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Template  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("creationDate")
  private Date creationDate = null;
  @SerializedName("form")
  private Form form = null;
  @SerializedName("version")
  private String version = null;
  public enum TypeEnum {
     docx,  odt,  url,  pdf,  base64,  message, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

  
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
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Form getForm() {
    return form;
  }
  public void setForm(Form form) {
    this.form = form;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  creationDate: ").append(creationDate).append("\n");
    sb.append("  form: ").append(form).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
