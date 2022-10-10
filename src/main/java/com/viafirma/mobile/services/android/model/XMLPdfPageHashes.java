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
  @SerializedName("hash")
  private String hash = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<XMLPdfPageHash> getPages() {
    return pages;
  }
  public void setPages(List<XMLPdfPageHash> pages) {
    this.pages = pages;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XMLPdfPageHashes {\n");
    
    sb.append("  pages: ").append(pages).append("\n");
    sb.append("  hash: ").append(hash).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
