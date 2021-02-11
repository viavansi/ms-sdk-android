package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.JSMatiDocumentExpired;
import com.viafirma.mobile.services.android.model.JSMatiAge;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class JSMatiDetails  implements Serializable {
  
  @SerializedName("age")
  private JSMatiAge age = null;
  @SerializedName("isDocumentExpired")
  private JSMatiDocumentExpired isDocumentExpired = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public JSMatiAge getAge() {
    return age;
  }
  public void setAge(JSMatiAge age) {
    this.age = age;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public JSMatiDocumentExpired getIsDocumentExpired() {
    return isDocumentExpired;
  }
  public void setIsDocumentExpired(JSMatiDocumentExpired isDocumentExpired) {
    this.isDocumentExpired = isDocumentExpired;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSMatiDetails {\n");
    
    sb.append("  age: ").append(age).append("\n");
    sb.append("  isDocumentExpired: ").append(isDocumentExpired).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
