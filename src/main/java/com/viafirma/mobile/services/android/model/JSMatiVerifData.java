package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.JSMatiVerificationFieldData;
import com.viafirma.mobile.services.android.model.Number;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class JSMatiVerifData  implements Serializable {
  
  @SerializedName("score")
  private Number score = null;
  @SerializedName("data")
  private List<JSMatiVerificationFieldData> data = new ArrayList<JSMatiVerificationFieldData>() ;
  @SerializedName("videoUrl")
  private String videoUrl = null;
  @SerializedName("spriteUrl")
  private String spriteUrl = null;
  @SerializedName("selfieUrl")
  private String selfieUrl = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Number getScore() {
    return score;
  }
  public void setScore(Number score) {
    this.score = score;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<JSMatiVerificationFieldData> getData() {
    return data;
  }
  public void setData(List<JSMatiVerificationFieldData> data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getVideoUrl() {
    return videoUrl;
  }
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSpriteUrl() {
    return spriteUrl;
  }
  public void setSpriteUrl(String spriteUrl) {
    this.spriteUrl = spriteUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSelfieUrl() {
    return selfieUrl;
  }
  public void setSelfieUrl(String selfieUrl) {
    this.selfieUrl = selfieUrl;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSMatiVerifData {\n");
    
    sb.append("  score: ").append(score).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  videoUrl: ").append(videoUrl).append("\n");
    sb.append("  spriteUrl: ").append(spriteUrl).append("\n");
    sb.append("  selfieUrl: ").append(selfieUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
