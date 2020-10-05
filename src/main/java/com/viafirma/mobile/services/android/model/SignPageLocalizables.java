package com.viafirma.mobile.services.android.model;

import java.util.*;
import java.util.Map;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class SignPageLocalizables  implements Serializable {
  
  @SerializedName("translations")
  private Map<String, String> translations = new HashMap<String, String>() ;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getTranslations() {
    return translations;
  }
  public void setTranslations(Map<String, String> translations) {
    this.translations = translations;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignPageLocalizables {\n");
    
    sb.append("  translations: ").append(translations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
