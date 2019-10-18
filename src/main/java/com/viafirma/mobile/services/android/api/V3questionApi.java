package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Questionary;
import com.viafirma.mobile.services.android.model.Param;
import java.util.*;
import com.viafirma.mobile.services.android.model.QuestionaryValidation;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3questionApi {

  private static final V3questionApi INSTANCE = new V3questionApi();
  private V3questionApi(){}
  public static V3questionApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Questionary getQuestionary (String messageCode, String evidenceCode, List<Param> body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/question/evidence/{messageCode}/{evidenceCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()))
      .replaceAll("\\{" + "evidenceCode" + "\\}", ApiInvoker.getInstance().escapeString(evidenceCode.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/json"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartBody.Builder mp = new MultipartBody.Builder();
      mp.setType(MultipartBody.FORM);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Questionary) ApiInvoker.deserialize(response, "", Questionary.class);
      } else {
        return null;
      }
    
  }
  
    
  public QuestionaryValidation validateQuestionary (String messageCode, String evidenceCode, Questionary body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/question/evidence/{messageCode}/{evidenceCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()))
      .replaceAll("\\{" + "evidenceCode" + "\\}", ApiInvoker.getInstance().escapeString(evidenceCode.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/json"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartBody.Builder mp = new MultipartBody.Builder();
      mp.setType(MultipartBody.FORM);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (QuestionaryValidation) ApiInvoker.deserialize(response, "", QuestionaryValidation.class);
      } else {
        return null;
      }
    
  }
  
}
