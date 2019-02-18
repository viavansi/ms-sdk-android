package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Alive;
import com.viafirma.mobile.services.android.model.Configuration;
import com.viafirma.mobile.services.android.model.InfoSystemStatus;
import com.viafirma.mobile.services.android.model.WorkflowManager;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3systemApi {

  private static final V3systemApi INSTANCE = new V3systemApi();
  private V3systemApi(){}
  public static V3systemApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Alive isAlive () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/system/alive".replaceAll("\\{format\\}","json");

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
        return (Alive) ApiInvoker.deserialize(response, "", Alive.class);
      } else {
        return null;
      }
    
  }
  
    
  public Configuration getDeviceConfiguration (String appIdentifier) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/system/config/{appIdentifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appIdentifier" + "\\}", ApiInvoker.getInstance().escapeString(appIdentifier.toString()));

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
        return (Configuration) ApiInvoker.deserialize(response, "", Configuration.class);
      } else {
        return null;
      }
    
  }
  
    
  public InfoSystemStatus getSystemInfo () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/system/info".replaceAll("\\{format\\}","json");

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
        return (InfoSystemStatus) ApiInvoker.deserialize(response, "", InfoSystemStatus.class);
      } else {
        return null;
      }
    
  }
  
    
  public WorkflowManager getWorkflowConfiguration () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/system/workflow".replaceAll("\\{format\\}","json");

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
        return (WorkflowManager) ApiInvoker.deserialize(response, "", WorkflowManager.class);
      } else {
        return null;
      }
    
  }
  
}
