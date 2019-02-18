package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Token;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3oauthApi {

  private static final V3oauthApi INSTANCE = new V3oauthApi();
  private V3oauthApi(){}
  public static V3oauthApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Token accessToken (String x_auth_mode, String x_auth_username, String x_auth_password) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/oauth/accessToken".replaceAll("\\{format\\}","json");

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
      mp.addFormDataPart("x_auth_mode", x_auth_mode);
      
      
      hasFields = true;
      mp.addFormDataPart("x_auth_username", x_auth_username);
      
      
      hasFields = true;
      mp.addFormDataPart("x_auth_password", x_auth_password);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("x_auth_mode", x_auth_mode);
      formParams.put("x_auth_username", x_auth_username);
      formParams.put("x_auth_password", x_auth_password);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Token) ApiInvoker.deserialize(response, "", Token.class);
      } else {
        return null;
      }
    
  }
  
    
  public Token requestToken () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/oauth/requestToken".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
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
        return (Token) ApiInvoker.deserialize(response, "", Token.class);
      } else {
        return null;
      }
    
  }
  
}
