package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Device;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class V1devicesApi {

  private static final V1devicesApi INSTANCE = new V1devicesApi();
  private V1devicesApi(){}
  public static V1devicesApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Device registerDevice (Device body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v1/devices".replaceAll("\\{format\\}","json");

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
      MultipartEntityBuilder mp = MultipartEntityBuilder.create();
      mp.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Device) ApiInvoker.deserialize(response, "", Device.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Device> findDeviceByUser (String userCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/devices/user/{userCode}".replaceAll("\\{format\\}","json")
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
      MultipartEntityBuilder mp = MultipartEntityBuilder.create();
      mp.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Device>) ApiInvoker.deserialize(response, "array", Device.class);
      } else {
        return null;
      }
    
  }
  
    
  public Device findDeviceByIdentifier (String identifier) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/devices/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", ApiInvoker.getInstance().escapeString(identifier.toString()));

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
        return (Device) ApiInvoker.deserialize(response, "", Device.class);
      } else {
        return null;
      }
    
  }
  
}
