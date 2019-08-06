package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Base64;
import com.viafirma.mobile.services.android.model.Download;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3documentsApi {

  private static final V3documentsApi INSTANCE = new V3documentsApi();
  private V3documentsApi(){}
  public static V3documentsApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public void addCache (Base64 body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/documents/cache".replaceAll("\\{format\\}","json");

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
        return ;
      } else {
        return ;
      }
    
  }
  
    
  public Download downloadPreview (String messageCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/documents/download/preview/{messageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()));

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
        return (Download) ApiInvoker.deserialize(response, "", Download.class);
      } else {
        return null;
      }
    
  }
  
    
  public Download downloadSigned (String messageCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/documents/download/signed/{messageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()));

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
        return (Download) ApiInvoker.deserialize(response, "", Download.class);
      } else {
        return null;
      }
    
  }
  
    
  public Download downloadTemporal (String messageCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/documents/download/temporal/{messageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()));

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
        return (Download) ApiInvoker.deserialize(response, "", Download.class);
      } else {
        return null;
      }
    
  }
  
    
  public void getDocument (String type, String messageCode, String documentCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/documents/{type}/{messageCode}/{documentCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "type" + "\\}", ApiInvoker.getInstance().escapeString(type.toString()))
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()))
      .replaceAll("\\{" + "documentCode" + "\\}", ApiInvoker.getInstance().escapeString(documentCode.toString()));

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
        return ;
      } else {
        return ;
      }
    
  }
  
}
