package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.AuditTrailDownloadInfo;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrailDownload  implements Serializable {
  
  @SerializedName("downloads")
  private List<AuditTrailDownloadInfo> downloads = new ArrayList<AuditTrailDownloadInfo>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<AuditTrailDownloadInfo> getDownloads() {
    return downloads;
  }
  public void setDownloads(List<AuditTrailDownloadInfo> downloads) {
    this.downloads = downloads;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailDownload {\n");
    
    sb.append("  downloads: ").append(downloads).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
