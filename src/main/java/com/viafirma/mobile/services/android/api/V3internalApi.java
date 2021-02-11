package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;


import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3internalApi {

  private static final V3internalApi INSTANCE = new V3internalApi();
  private V3internalApi(){}
  public static V3internalApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public void health (String metrics_pass) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/_internal_/health/{metrics_pass}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "metrics_pass" + "\\}", ApiInvoker.getInstance().escapeString(metrics_pass.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "text/plain"
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
        return ;
      } else {
        return ;
      }
    
  }
  
    
  public void prometheus (String metrics_pass) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/_internal_/prometheus/{metrics_pass}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "metrics_pass" + "\\}", ApiInvoker.getInstance().escapeString(metrics_pass.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "text/plain"
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
        return ;
      } else {
        return ;
      }
    
  }
  
}
