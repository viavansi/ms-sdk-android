package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.AuditTrailSummaryBlock;
import com.viafirma.mobile.services.android.model.AuditTrailConfig;
import com.viafirma.mobile.services.android.model.AuditTrailDownload;
import java.util.*;
import com.viafirma.mobile.services.android.model.AuditTrailHeader;
import com.viafirma.mobile.services.android.model.AuditTrailTableBlock;
import com.viafirma.mobile.services.android.model.AuditTrailFooter;
import com.viafirma.mobile.services.android.model.AuditTrailHighlightedBlock;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class AuditTrail  implements Serializable {
  
  @SerializedName("header")
  private AuditTrailHeader header = null;
  @SerializedName("summaryBlock")
  private AuditTrailSummaryBlock summaryBlock = null;
  @SerializedName("highlightedBlock")
  private AuditTrailHighlightedBlock highlightedBlock = null;
  @SerializedName("tableBlocks")
  private List<AuditTrailTableBlock> tableBlocks = new ArrayList<AuditTrailTableBlock>() ;
  @SerializedName("footer")
  private AuditTrailFooter footer = null;
  @SerializedName("config")
  private AuditTrailConfig config = null;
  @SerializedName("downloads")
  private AuditTrailDownload downloads = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public AuditTrailHeader getHeader() {
    return header;
  }
  public void setHeader(AuditTrailHeader header) {
    this.header = header;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public AuditTrailSummaryBlock getSummaryBlock() {
    return summaryBlock;
  }
  public void setSummaryBlock(AuditTrailSummaryBlock summaryBlock) {
    this.summaryBlock = summaryBlock;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public AuditTrailHighlightedBlock getHighlightedBlock() {
    return highlightedBlock;
  }
  public void setHighlightedBlock(AuditTrailHighlightedBlock highlightedBlock) {
    this.highlightedBlock = highlightedBlock;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<AuditTrailTableBlock> getTableBlocks() {
    return tableBlocks;
  }
  public void setTableBlocks(List<AuditTrailTableBlock> tableBlocks) {
    this.tableBlocks = tableBlocks;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public AuditTrailFooter getFooter() {
    return footer;
  }
  public void setFooter(AuditTrailFooter footer) {
    this.footer = footer;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public AuditTrailConfig getConfig() {
    return config;
  }
  public void setConfig(AuditTrailConfig config) {
    this.config = config;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public AuditTrailDownload getDownloads() {
    return downloads;
  }
  public void setDownloads(AuditTrailDownload downloads) {
    this.downloads = downloads;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrail {\n");
    
    sb.append("  header: ").append(header).append("\n");
    sb.append("  summaryBlock: ").append(summaryBlock).append("\n");
    sb.append("  highlightedBlock: ").append(highlightedBlock).append("\n");
    sb.append("  tableBlocks: ").append(tableBlocks).append("\n");
    sb.append("  footer: ").append(footer).append("\n");
    sb.append("  config: ").append(config).append("\n");
    sb.append("  downloads: ").append(downloads).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
