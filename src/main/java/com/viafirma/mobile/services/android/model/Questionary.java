package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.QuestionaryQuestion;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class Questionary  implements Serializable {
  
  @SerializedName("regCuestionario")
  private String regCuestionario = null;
  @SerializedName("getiDCuestionario")
  private String getiDCuestionario = null;
  @SerializedName("questions")
  private List<QuestionaryQuestion> questions = new ArrayList<QuestionaryQuestion>() ;

  
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
  public String getGetiDCuestionario() {
    return getiDCuestionario;
  }
  public void setGetiDCuestionario(String getiDCuestionario) {
    this.getiDCuestionario = getiDCuestionario;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Questionary {\n");
    
    sb.append("  regCuestionario: ").append(regCuestionario).append("\n");
    sb.append("  getiDCuestionario: ").append(getiDCuestionario).append("\n");
    sb.append("  questions: ").append(questions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
