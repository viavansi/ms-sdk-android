package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.VerifierOidDTO;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class VerifierOidDTO  implements Serializable {
  
  @SerializedName("oid")
  private String oid = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("values")
  private List<String> values = new ArrayList<String>() ;
  @SerializedName("childOids")
  private List<VerifierOidDTO> childOids = new ArrayList<VerifierOidDTO>() ;
  @SerializedName("objectIdentifier")
  private Boolean objectIdentifier = Boolean.FALSE;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getOid() {
    return oid;
  }
  public void setOid(String oid) {
    this.oid = oid;
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
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<VerifierOidDTO> getChildOids() {
    return childOids;
  }
  public void setChildOids(List<VerifierOidDTO> childOids) {
    this.childOids = childOids;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getObjectIdentifier() {
    return objectIdentifier;
  }
  public void setObjectIdentifier(Boolean objectIdentifier) {
    this.objectIdentifier = objectIdentifier;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifierOidDTO {\n");
    
    sb.append("  oid: ").append(oid).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("  childOids: ").append(childOids).append("\n");
    sb.append("  objectIdentifier: ").append(objectIdentifier).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
