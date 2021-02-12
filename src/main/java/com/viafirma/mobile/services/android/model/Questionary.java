package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.QuestionaryQuestion;
import com.viafirma.mobile.services.android.model.Param;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Questionary  implements Serializable {
  
  @SerializedName("regCuestionario")
  private String regCuestionario = null;
  @SerializedName("params")
  private List<Param> params = new ArrayList<Param>() ;
  @SerializedName("questions")
  private List<QuestionaryQuestion> questions = new ArrayList<QuestionaryQuestion>() ;
  @SerializedName("idcuestionario")
  private String idcuestionario = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getRegCuestionario() {
    return regCuestionario;
  }
  public void setRegCuestionario(String regCuestionario) {
    this.regCuestionario = regCuestionario;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Param> getParams() {
    return params;
  }
  public void setParams(List<Param> params) {
    this.params = params;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<QuestionaryQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<QuestionaryQuestion> questions) {
    this.questions = questions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getIdcuestionario() {
    return idcuestionario;
  }
  public void setIdcuestionario(String idcuestionario) {
    this.idcuestionario = idcuestionario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Questionary {\n");
    
    sb.append("  regCuestionario: ").append(regCuestionario).append("\n");
    sb.append("  params: ").append(params).append("\n");
    sb.append("  questions: ").append(questions).append("\n");
    sb.append("  idcuestionario: ").append(idcuestionario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
