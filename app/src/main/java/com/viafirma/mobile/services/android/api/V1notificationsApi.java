package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Notification;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class V1notificationsApi {

  private static final V1notificationsApi INSTANCE = new V1notificationsApi();
  private V1notificationsApi(){}
  public static V1notificationsApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Notification sendNotification (Notification body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v1/notifications".replaceAll("\\{format\\}","json");

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
        return (Notification) ApiInvoker.deserialize(response, "", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public Notification findNotificationsByCode (String code) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/notifications/code/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", ApiInvoker.getInstance().escapeString(code.toString()));

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
        return (Notification) ApiInvoker.deserialize(response, "", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public Notification changeNotificationStatus (String code, String status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/notifications/code/{code}/status/{status}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", ApiInvoker.getInstance().escapeString(code.toString()))
      .replaceAll("\\{" + "status" + "\\}", ApiInvoker.getInstance().escapeString(status.toString()));

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

      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Notification) ApiInvoker.deserialize(response, "", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findCompletedNotificationsByDevice (String app_code, String user_code, String device_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/notifications/completed/app/{app_code}/user/{user_code}/device/{device_code}/{index}/{page_size}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "app_code" + "\\}", ApiInvoker.getInstance().escapeString(app_code.toString()))
      .replaceAll("\\{" + "user_code" + "\\}", ApiInvoker.getInstance().escapeString(user_code.toString()))
      .replaceAll("\\{" + "device_code" + "\\}", ApiInvoker.getInstance().escapeString(device_code.toString()))
      .replaceAll("\\{" + "index" + "\\}", ApiInvoker.getInstance().escapeString(index.toString()))
      .replaceAll("\\{" + "page_size" + "\\}", ApiInvoker.getInstance().escapeString(page_size.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findCompletedNotificationsByUser (String app_code, String user_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/notifications/completed/app/{app_code}/user/{user_code}/{index}/{page_size}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "app_code" + "\\}", ApiInvoker.getInstance().escapeString(app_code.toString()))
      .replaceAll("\\{" + "user_code" + "\\}", ApiInvoker.getInstance().escapeString(user_code.toString()))
      .replaceAll("\\{" + "index" + "\\}", ApiInvoker.getInstance().escapeString(index.toString()))
      .replaceAll("\\{" + "page_size" + "\\}", ApiInvoker.getInstance().escapeString(page_size.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findInboxNotificationsByDevice (String app_code, String user_code, String device_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/notifications/inbox/app/{app_code}/user/{user_code}/device/{device_code}/{index}/{page_size}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "app_code" + "\\}", ApiInvoker.getInstance().escapeString(app_code.toString()))
      .replaceAll("\\{" + "user_code" + "\\}", ApiInvoker.getInstance().escapeString(user_code.toString()))
      .replaceAll("\\{" + "device_code" + "\\}", ApiInvoker.getInstance().escapeString(device_code.toString()))
      .replaceAll("\\{" + "index" + "\\}", ApiInvoker.getInstance().escapeString(index.toString()))
      .replaceAll("\\{" + "page_size" + "\\}", ApiInvoker.getInstance().escapeString(page_size.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findInboxNotificationsByUser (String app_code, String user_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/notifications/inbox/app/{app_code}/user/{user_code}/{index}/{page_size}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "app_code" + "\\}", ApiInvoker.getInstance().escapeString(app_code.toString()))
      .replaceAll("\\{" + "user_code" + "\\}", ApiInvoker.getInstance().escapeString(user_code.toString()))
      .replaceAll("\\{" + "index" + "\\}", ApiInvoker.getInstance().escapeString(index.toString()))
      .replaceAll("\\{" + "page_size" + "\\}", ApiInvoker.getInstance().escapeString(page_size.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findNotificationsByUserAndStatusAndDevice (String status, String app_code, String user_code, String device_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/notifications/status/{status}/app/{app_code}/user/{user_code}/device/{device_code}/{index}/{page_size}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "status" + "\\}", ApiInvoker.getInstance().escapeString(status.toString()))
      .replaceAll("\\{" + "app_code" + "\\}", ApiInvoker.getInstance().escapeString(app_code.toString()))
      .replaceAll("\\{" + "user_code" + "\\}", ApiInvoker.getInstance().escapeString(user_code.toString()))
      .replaceAll("\\{" + "device_code" + "\\}", ApiInvoker.getInstance().escapeString(device_code.toString()))
      .replaceAll("\\{" + "index" + "\\}", ApiInvoker.getInstance().escapeString(index.toString()))
      .replaceAll("\\{" + "page_size" + "\\}", ApiInvoker.getInstance().escapeString(page_size.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findNotificationsByUserStatus (String status, String app_code, String user_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/notifications/status/{status}/app/{app_code}/user/{user_code}/{index}/{page_size}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "status" + "\\}", ApiInvoker.getInstance().escapeString(status.toString()))
      .replaceAll("\\{" + "app_code" + "\\}", ApiInvoker.getInstance().escapeString(app_code.toString()))
      .replaceAll("\\{" + "user_code" + "\\}", ApiInvoker.getInstance().escapeString(user_code.toString()))
      .replaceAll("\\{" + "index" + "\\}", ApiInvoker.getInstance().escapeString(index.toString()))
      .replaceAll("\\{" + "page_size" + "\\}", ApiInvoker.getInstance().escapeString(page_size.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
}
