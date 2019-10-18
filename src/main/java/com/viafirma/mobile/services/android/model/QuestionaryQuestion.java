package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.QuestionaryAnswer;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class QuestionaryQuestion  implements Serializable {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("answers")
  private List<QuestionaryAnswer> answers = new ArrayList<QuestionaryAnswer>() ;
  @SerializedName("selectedAnswerCode")
  private String selectedAnswerCode = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
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
  public List<QuestionaryAnswer> getAnswers() {
    return answers;
  }
  public void setAnswers(List<QuestionaryAnswer> answers) {
    this.answers = answers;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSelectedAnswerCode() {
    return selectedAnswerCode;
  }
  public void setSelectedAnswerCode(String selectedAnswerCode) {
    this.selectedAnswerCode = selectedAnswerCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionaryQuestion {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  answers: ").append(answers).append("\n");
    sb.append("  selectedAnswerCode: ").append(selectedAnswerCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
