package com.viafirma.mobile.android.api;

import com.viafirma.mobile.android.ApiException;
import com.viafirma.mobile.android.ApiInvoker;

import com.viafirma.mobile.android.model.*;

import java.util.*;

import com.viafirma.mobile.android.model.Token;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class V1oauthApi {

  private static final V1oauthApi INSTANCE = new V1oauthApi();
  private V1oauthApi(){}
  public static V1oauthApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Token accessToken (String x_auth_mode, String x_auth_username, String x_auth_password) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/oauth/accessToken".replaceAll("\\{format\\}","json");

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
      MultipartEntityBuilder mp = MultipartEntityBuilder.create();
      mp.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      
      hasFields = true;
      mp.addPart("x_auth_mode", new StringBody(x_auth_mode, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("x_auth_username", new StringBody(x_auth_username, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("x_auth_password", new StringBody(x_auth_password, ContentType.TEXT_PLAIN));
      
      
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
    String path = "/v1/oauth/requestToken".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder mp = MultipartEntityBuilder.create();
      mp.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      
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
