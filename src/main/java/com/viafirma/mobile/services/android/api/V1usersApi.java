package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.User;
import com.viafirma.mobile.services.android.model.Template;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V1usersApi {

  private static final V1usersApi INSTANCE = new V1usersApi();
  private V1usersApi(){}
  public static V1usersApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public User registerUser (User body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v1/users".replaceAll("\\{format\\}","json");

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
        return (User) ApiInvoker.deserialize(response, "", User.class);
      } else {
        return null;
      }
    
  }
  
    
  public User loginUser (String code, String password) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/users/login".replaceAll("\\{format\\}","json");

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
      
      hasFields = true;
      mp.addFormDataPart("code", code);
      
      
      hasFields = true;
      mp.addFormDataPart("password", password);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("code", code);
      formParams.put("password", password);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (User) ApiInvoker.deserialize(response, "", User.class);
      } else {
        return null;
      }
    
  }
  
    
  public User reactivateUserByCode (String userCode, String email) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/users/reactivate/{userCode}/email/{email}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userCode" + "\\}", ApiInvoker.getInstance().escapeString(userCode.toString()))
      .replaceAll("\\{" + "email" + "\\}", ApiInvoker.getInstance().escapeString(email.toString()));

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

      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (User) ApiInvoker.deserialize(response, "", User.class);
      } else {
        return null;
      }
    
  }
  
    
  public User findUserByCode (String userCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/users/{userCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userCode" + "\\}", ApiInvoker.getInstance().escapeString(userCode.toString()));

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
        return (User) ApiInvoker.deserialize(response, "", User.class);
      } else {
        return null;
      }
    
  }
  
    
  public Template putUserTemplateByCode (String userCode, String templateCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/users/{userCode}/templates/{templateCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userCode" + "\\}", ApiInvoker.getInstance().escapeString(userCode.toString()))
      .replaceAll("\\{" + "templateCode" + "\\}", ApiInvoker.getInstance().escapeString(templateCode.toString()));

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

      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Template) ApiInvoker.deserialize(response, "", Template.class);
      } else {
        return null;
      }
    
  }
  
}
