package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.NotificationResponse;
import com.viafirma.mobile.services.android.model.Notification;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3notificationsApi {

  private static final V3notificationsApi INSTANCE = new V3notificationsApi();
  private V3notificationsApi(){}
  public static V3notificationsApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public NotificationResponse sendNotification (Notification body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/notifications".replaceAll("\\{format\\}","json");

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
        return (NotificationResponse) ApiInvoker.deserialize(response, "", NotificationResponse.class);
      } else {
        return null;
      }
    
  }
  
    
  public Notification findNotificationsByCode (String code) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/code/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", ApiInvoker.getInstance().escapeString(code.toString()));

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
        return (Notification) ApiInvoker.deserialize(response, "", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public Notification changeNotificationStatus (String code, String status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/code/{code}/status/{status}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", ApiInvoker.getInstance().escapeString(code.toString()))
      .replaceAll("\\{" + "status" + "\\}", ApiInvoker.getInstance().escapeString(status.toString()));

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
    String path = "/v3/notifications/completed/app/{app_code}/user/{user_code}/device/{device_code}/{index}/{page_size}".replaceAll("\\{format\\}","json")
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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findCompletedNotificationsByUser (String app_code, String user_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/completed/app/{app_code}/user/{user_code}/{index}/{page_size}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "app_code" + "\\}", ApiInvoker.getInstance().escapeString(app_code.toString()))
      .replaceAll("\\{" + "user_code" + "\\}", ApiInvoker.getInstance().escapeString(user_code.toString()))
      .replaceAll("\\{" + "index" + "\\}", ApiInvoker.getInstance().escapeString(index.toString()))
      .replaceAll("\\{" + "page_size" + "\\}", ApiInvoker.getInstance().escapeString(page_size.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findCallbackErrors (String groupCode, String type, String status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/group/{groupCode}/type/{type}/status/{status}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupCode" + "\\}", ApiInvoker.getInstance().escapeString(groupCode.toString()))
      .replaceAll("\\{" + "type" + "\\}", ApiInvoker.getInstance().escapeString(type.toString()))
      .replaceAll("\\{" + "status" + "\\}", ApiInvoker.getInstance().escapeString(status.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findInboxNotificationsByDevice (String app_code, String user_code, String device_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/inbox/app/{app_code}/user/{user_code}/device/{device_code}/{index}/{page_size}".replaceAll("\\{format\\}","json")
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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findInboxNotificationsByUser (String app_code, String user_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/inbox/app/{app_code}/user/{user_code}/{index}/{page_size}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "app_code" + "\\}", ApiInvoker.getInstance().escapeString(app_code.toString()))
      .replaceAll("\\{" + "user_code" + "\\}", ApiInvoker.getInstance().escapeString(user_code.toString()))
      .replaceAll("\\{" + "index" + "\\}", ApiInvoker.getInstance().escapeString(index.toString()))
      .replaceAll("\\{" + "page_size" + "\\}", ApiInvoker.getInstance().escapeString(page_size.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findNotificationsByMessage (String code) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/message/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", ApiInvoker.getInstance().escapeString(code.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findNotificationsByMessageCode (String code) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/messageCode/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", ApiInvoker.getInstance().escapeString(code.toString()));

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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<NotificationResponse> findNotificationsBySetCode (String code) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/set/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", ApiInvoker.getInstance().escapeString(code.toString()));

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
        return (List<NotificationResponse>) ApiInvoker.deserialize(response, "array", NotificationResponse.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findNotificationsByUserAndStatusAndDevice (String status, String app_code, String user_code, String device_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/status/{status}/app/{app_code}/user/{user_code}/device/{device_code}/{index}/{page_size}".replaceAll("\\{format\\}","json")
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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<Notification> findNotificationsByUserStatus (String status, String app_code, String user_code, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/status/{status}/app/{app_code}/user/{user_code}/{index}/{page_size}".replaceAll("\\{format\\}","json")
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
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
    
  public String findNotificationsByToken (String push_token) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/token/{push_token}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "push_token" + "\\}", ApiInvoker.getInstance().escapeString(push_token.toString()));

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      } else {
        return null;
      }
    
  }
  
    
  public String findNotificationsByTokenStatus (String push_token, String status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/notifications/token/{push_token}/status/{status}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "push_token" + "\\}", ApiInvoker.getInstance().escapeString(push_token.toString()))
      .replaceAll("\\{" + "status" + "\\}", ApiInvoker.getInstance().escapeString(status.toString()));

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      } else {
        return null;
      }
    
  }
  
}
