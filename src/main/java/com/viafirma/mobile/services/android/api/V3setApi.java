package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.MessageSet;
import com.viafirma.mobile.services.android.model.MessageSetResponse;
import com.viafirma.mobile.services.android.model.MessageSetInfo;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3setApi {

  private static final V3setApi INSTANCE = new V3setApi();
  private V3setApi(){}
  public static V3setApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public MessageSetResponse sendMessageSet (MessageSet body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/set".replaceAll("\\{format\\}","json");

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
        return (MessageSetResponse) ApiInvoker.deserialize(response, "", MessageSetResponse.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageSetInfo getInfoSetByRecipient (String setCode, String recipientKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/info/{setCode}/{recipientKey}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "setCode" + "\\}", ApiInvoker.getInstance().escapeString(setCode.toString()))
      .replaceAll("\\{" + "recipientKey" + "\\}", ApiInvoker.getInstance().escapeString(recipientKey.toString()));

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
        return (MessageSetInfo) ApiInvoker.deserialize(response, "", MessageSetInfo.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageSetResponse getMessageSetByCode (String setCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/summary/{setCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "setCode" + "\\}", ApiInvoker.getInstance().escapeString(setCode.toString()));

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
        return (MessageSetResponse) ApiInvoker.deserialize(response, "", MessageSetResponse.class);
      } else {
        return null;
      }
    
  }
  
}
