package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.XMLPdfPageHash;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class XMLPdfPageHashes  implements Serializable {
  
  @SerializedName("pages")
  private List<XMLPdfPageHash> pages = new ArrayList<XMLPdfPageHash>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<XMLPdfPageHash> getPages() {
    return pages;
  }
  public void setPages(List<XMLPdfPageHash> pages) {
    this.pages = pages;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XMLPdfPageHashes {\n");
    
    sb.append("  pages: ").append(pages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
