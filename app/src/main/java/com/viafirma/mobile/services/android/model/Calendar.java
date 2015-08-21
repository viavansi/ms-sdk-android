package com.viafirma.mobile.services.android.model;

import java.util.Date;
import com.viafirma.mobile.services.android.model.TimeZone;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Calendar  implements Serializable {
  
  @SerializedName("lenient")
  private Boolean lenient = Boolean.FALSE;
  @SerializedName("firstDayOfWeek")
  private Integer firstDayOfWeek = null;
  @SerializedName("minimalDaysInFirstWeek")
  private Integer minimalDaysInFirstWeek = null;
  @SerializedName("weekYear")
  private Integer weekYear = null;
  @SerializedName("weeksInWeekYear")
  private Integer weeksInWeekYear = null;
  @SerializedName("weekDateSupported")
  private Boolean weekDateSupported = Boolean.FALSE;
  @SerializedName("time")
  private Date time = null;
  @SerializedName("timeZone")
  private TimeZone timeZone = null;
  @SerializedName("timeInMillis")
  private Long timeInMillis = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getLenient() {
    return lenient;
  }
  public void setLenient(Boolean lenient) {
    this.lenient = lenient;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getFirstDayOfWeek() {
    return firstDayOfWeek;
  }
  public void setFirstDayOfWeek(Integer firstDayOfWeek) {
    this.firstDayOfWeek = firstDayOfWeek;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getMinimalDaysInFirstWeek() {
    return minimalDaysInFirstWeek;
  }
  public void setMinimalDaysInFirstWeek(Integer minimalDaysInFirstWeek) {
    this.minimalDaysInFirstWeek = minimalDaysInFirstWeek;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getWeekYear() {
    return weekYear;
  }
  public void setWeekYear(Integer weekYear) {
    this.weekYear = weekYear;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getWeeksInWeekYear() {
    return weeksInWeekYear;
  }
  public void setWeeksInWeekYear(Integer weeksInWeekYear) {
    this.weeksInWeekYear = weeksInWeekYear;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getWeekDateSupported() {
    return weekDateSupported;
  }
  public void setWeekDateSupported(Boolean weekDateSupported) {
    this.weekDateSupported = weekDateSupported;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public TimeZone getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getTimeInMillis() {
    return timeInMillis;
  }
  public void setTimeInMillis(Long timeInMillis) {
    this.timeInMillis = timeInMillis;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calendar {\n");
    
    sb.append("  lenient: ").append(lenient).append("\n");
    sb.append("  firstDayOfWeek: ").append(firstDayOfWeek).append("\n");
    sb.append("  minimalDaysInFirstWeek: ").append(minimalDaysInFirstWeek).append("\n");
    sb.append("  weekYear: ").append(weekYear).append("\n");
    sb.append("  weeksInWeekYear: ").append(weeksInWeekYear).append("\n");
    sb.append("  weekDateSupported: ").append(weekDateSupported).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  timeZone: ").append(timeZone).append("\n");
    sb.append("  timeInMillis: ").append(timeInMillis).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
