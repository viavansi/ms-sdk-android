package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.SignerWorkflow;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3signerWorkflowApi {

  private static final V3signerWorkflowApi INSTANCE = new V3signerWorkflowApi();
  private V3signerWorkflowApi(){}
  public static V3signerWorkflowApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public SignerWorkflow save (SignerWorkflow body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/signerWorkflow".replaceAll("\\{format\\}","json");

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
        return (SignerWorkflow) ApiInvoker.deserialize(response, "", SignerWorkflow.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<SignerWorkflow> getSignerWorkflowByUser (String userCode, String groupCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/signerWorkflow/list/{userCode}/{groupCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userCode" + "\\}", ApiInvoker.getInstance().escapeString(userCode.toString()))
      .replaceAll("\\{" + "groupCode" + "\\}", ApiInvoker.getInstance().escapeString(groupCode.toString()));

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
        return (List<SignerWorkflow>) ApiInvoker.deserialize(response, "array", SignerWorkflow.class);
      } else {
        return null;
      }
    
  }
  
    
  public String removeSignerWorkflow (String code, String userCode, String groupCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/signerWorkflow/remove/{code}/{userCode}/{groupCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", ApiInvoker.getInstance().escapeString(code.toString()))
      .replaceAll("\\{" + "userCode" + "\\}", ApiInvoker.getInstance().escapeString(userCode.toString()))
      .replaceAll("\\{" + "groupCode" + "\\}", ApiInvoker.getInstance().escapeString(groupCode.toString()));

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

      String response = ApiInvoker.getInstance().invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      } else {
        return null;
      }
    
  }
  
}
