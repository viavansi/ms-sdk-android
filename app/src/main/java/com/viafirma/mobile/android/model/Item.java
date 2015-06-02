package com.viafirma.mobile.android.model;

import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Item  implements Serializable {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("value")
  private String value = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("label")
  private String label = null;
  @SerializedName("placeHolder")
  private String placeHolder = null;
  @SerializedName("size")
  private String size = null;
  @SerializedName("required")
  private Boolean required = Boolean.FALSE;
  @SerializedName("validation")
  private String validation = null;
  @SerializedName("validationRegex")
  private String validationRegex = null;
  @SerializedName("refValues")
  private String refValues = null;
  @SerializedName("list")
  private String list = null;
  @SerializedName("nestedList")
  private String nestedList = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("href")
  private String href = null;
  @SerializedName("match")
  private String match = null;
  @SerializedName("update")
  private String update = null;
  @SerializedName("disabled")
  private Boolean disabled = Boolean.FALSE;
  @SerializedName("values")
  private List<String> values = new ArrayList<String>() ;
  @SerializedName("height")
  private String height = null;
  @SerializedName("format")
  private String format = null;
  @SerializedName("maxLength")
  private String maxLength = null;
  @SerializedName("minLength")
  private String minLength = null;
  @SerializedName("monthNames")
  private List<String> monthNames = new ArrayList<String>() ;
  @SerializedName("dayNames")
  private List<String> dayNames = new ArrayList<String>() ;

  
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
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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
  public String getPlaceHolder() {
    return placeHolder;
  }
  public void setPlaceHolder(String placeHolder) {
    this.placeHolder = placeHolder;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValidation() {
    return validation;
  }
  public void setValidation(String validation) {
    this.validation = validation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getValidationRegex() {
    return validationRegex;
  }
  public void setValidationRegex(String validationRegex) {
    this.validationRegex = validationRegex;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRefValues() {
    return refValues;
  }
  public void setRefValues(String refValues) {
    this.refValues = refValues;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getList() {
    return list;
  }
  public void setList(String list) {
    this.list = list;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getNestedList() {
    return nestedList;
  }
  public void setNestedList(String nestedList) {
    this.nestedList = nestedList;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMatch() {
    return match;
  }
  public void setMatch(String match) {
    this.match = match;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUpdate() {
    return update;
  }
  public void setUpdate(String update) {
    this.update = update;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
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
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMaxLength() {
    return maxLength;
  }
  public void setMaxLength(String maxLength) {
    this.maxLength = maxLength;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMinLength() {
    return minLength;
  }
  public void setMinLength(String minLength) {
    this.minLength = minLength;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getMonthNames() {
    return monthNames;
  }
  public void setMonthNames(List<String> monthNames) {
    this.monthNames = monthNames;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<String> getDayNames() {
    return dayNames;
  }
  public void setDayNames(List<String> dayNames) {
    this.dayNames = dayNames;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  label: ").append(label).append("\n");
    sb.append("  placeHolder: ").append(placeHolder).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("  validation: ").append(validation).append("\n");
    sb.append("  validationRegex: ").append(validationRegex).append("\n");
    sb.append("  refValues: ").append(refValues).append("\n");
    sb.append("  list: ").append(list).append("\n");
    sb.append("  nestedList: ").append(nestedList).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  href: ").append(href).append("\n");
    sb.append("  match: ").append(match).append("\n");
    sb.append("  update: ").append(update).append("\n");
    sb.append("  disabled: ").append(disabled).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("  maxLength: ").append(maxLength).append("\n");
    sb.append("  minLength: ").append(minLength).append("\n");
    sb.append("  monthNames: ").append(monthNames).append("\n");
    sb.append("  dayNames: ").append(dayNames).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
