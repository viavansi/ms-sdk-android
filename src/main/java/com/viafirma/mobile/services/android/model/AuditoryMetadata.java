package com.viafirma.mobile.services.android.model;


import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditoryMetadata  implements Serializable {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("label")
  private String label = null;
  @SerializedName("value")
  private String value = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditoryMetadata {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  label: ").append(label).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
