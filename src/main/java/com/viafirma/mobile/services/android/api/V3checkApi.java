package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Check;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3checkApi {

  private static final V3checkApi INSTANCE = new V3checkApi();
  private V3checkApi(){}
  public static V3checkApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Check confirmCheck (String messageCode, String checkCode, String validateCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/check/confirm/{messageCode}/{checkCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()))
      .replaceAll("\\{" + "checkCode" + "\\}", ApiInvoker.getInstance().escapeString(checkCode.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartBody.Builder mp = new MultipartBody.Builder();
      mp.setType(MultipartBody.FORM);
      
      hasFields = true;
      mp.addFormDataPart("validateCode", validateCode);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("validateCode", validateCode);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Check) ApiInvoker.deserialize(response, "", Check.class);
      } else {
        return null;
      }
    
  }
  
    
  public Check rejectCheck (String messageCode, String checkCode, String comment, String validateCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/check/reject/{messageCode}/{checkCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()))
      .replaceAll("\\{" + "checkCode" + "\\}", ApiInvoker.getInstance().escapeString(checkCode.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartBody.Builder mp = new MultipartBody.Builder();
      mp.setType(MultipartBody.FORM);
      
      hasFields = true;
      mp.addFormDataPart("comment", comment);
      
      
      hasFields = true;
      mp.addFormDataPart("validateCode", validateCode);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("comment", comment);
      formParams.put("validateCode", validateCode);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Check) ApiInvoker.deserialize(response, "", Check.class);
      } else {
        return null;
      }
    
  }
  
}
