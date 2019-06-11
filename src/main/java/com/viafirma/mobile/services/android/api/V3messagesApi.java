package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Message;
import com.viafirma.mobile.services.android.model.MessageBuild;
import com.viafirma.mobile.services.android.model.MessageData;
import com.viafirma.mobile.services.android.model.Download;
import com.viafirma.mobile.services.android.model.MessageList;
import com.viafirma.mobile.services.android.model.CallbackUrl;
import com.viafirma.mobile.services.android.model.NotificationResend;
import com.viafirma.mobile.services.android.model.Notification;
import com.viafirma.mobile.services.android.model.MessageStatus;
import com.viafirma.mobile.services.android.model.Document;
import com.viafirma.mobile.services.android.model.MessagePaginatedList;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3messagesApi {

  private static final V3messagesApi INSTANCE = new V3messagesApi();
  private V3messagesApi(){}
  public static V3messagesApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public String sendMessage (Message body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/messages".replaceAll("\\{format\\}","json");

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageBuild messagesBuild (Message body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/messages/build".replaceAll("\\{format\\}","json");

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
        return (MessageBuild) ApiInvoker.deserialize(response, "", MessageBuild.class);
      } else {
        return null;
      }
    
  }
  
    
  public Message sendMessageData (MessageData body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/messages/data".replaceAll("\\{format\\}","json");

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
        return (Message) ApiInvoker.deserialize(response, "", Message.class);
      } else {
        return null;
      }
    
  }
  
    
  public Message disableByCode (String messageCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/disabled/{messageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()));

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
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Message) ApiInvoker.deserialize(response, "", Message.class);
      } else {
        return null;
      }
    
  }
  
    
  public Message dispatchMessage (Message body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/messages/dispatch".replaceAll("\\{format\\}","json");

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
        return (Message) ApiInvoker.deserialize(response, "", Message.class);
      } else {
        return null;
      }
    
  }
  
    
  public Download documentBuild (Message body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/messages/document/build".replaceAll("\\{format\\}","json");

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
        return (Download) ApiInvoker.deserialize(response, "", Download.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<MessageList> getMessagesByExternalStatus (String groupCode, String requestAppCode, String templateCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/external/new".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(groupCode)))
      queryParams.put("groupCode", String.valueOf(groupCode));
    if(!"null".equals(String.valueOf(requestAppCode)))
      queryParams.put("requestAppCode", String.valueOf(requestAppCode));
    if(!"null".equals(String.valueOf(templateCode)))
      queryParams.put("templateCode", String.valueOf(templateCode));
    
    
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
        return (List<MessageList>) ApiInvoker.deserialize(response, "array", MessageList.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<MessageList> getMessagesByExternalStatus (String externalStatus, String groupCode, String requestAppCode, String templateCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/external/status/{externalStatus}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalStatus" + "\\}", ApiInvoker.getInstance().escapeString(externalStatus.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(groupCode)))
      queryParams.put("groupCode", String.valueOf(groupCode));
    if(!"null".equals(String.valueOf(requestAppCode)))
      queryParams.put("requestAppCode", String.valueOf(requestAppCode));
    if(!"null".equals(String.valueOf(templateCode)))
      queryParams.put("templateCode", String.valueOf(templateCode));
    
    
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
        return (List<MessageList>) ApiInvoker.deserialize(response, "array", MessageList.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<MessageList> getMessagesByExternalService (String externalCode, String externalStatus, String groupCode, String requestAppCode, String templateCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/external/{externalCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalCode" + "\\}", ApiInvoker.getInstance().escapeString(externalCode.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(externalStatus)))
      queryParams.put("externalStatus", String.valueOf(externalStatus));
    if(!"null".equals(String.valueOf(groupCode)))
      queryParams.put("groupCode", String.valueOf(groupCode));
    if(!"null".equals(String.valueOf(requestAppCode)))
      queryParams.put("requestAppCode", String.valueOf(requestAppCode));
    if(!"null".equals(String.valueOf(templateCode)))
      queryParams.put("templateCode", String.valueOf(templateCode));
    
    
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
        return (List<MessageList>) ApiInvoker.deserialize(response, "array", MessageList.class);
      } else {
        return null;
      }
    
  }
  
    
  public Message changeNotificationStatus (String messageCode, String status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/external/{messageCode}/status/{status}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()))
      .replaceAll("\\{" + "status" + "\\}", ApiInvoker.getInstance().escapeString(status.toString()));

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
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Message) ApiInvoker.deserialize(response, "", Message.class);
      } else {
        return null;
      }
    
  }
  
    
  public Message finalizeMessage (String messageCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/finalize".replaceAll("\\{format\\}","json");

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
      mp.addFormDataPart("messageCode", messageCode);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("messageCode", messageCode);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Message) ApiInvoker.deserialize(response, "", Message.class);
      } else {
        return null;
      }
    
  }
  
    
  public String messagesGroup (Message body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/messages/group".replaceAll("\\{format\\}","json");

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      } else {
        return null;
      }
    
  }
  
    
  public Message rejectMessageByCode (String messageCode, String comment) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/reject/{messageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()));

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
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("comment", comment);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Message) ApiInvoker.deserialize(response, "", Message.class);
      } else {
        return null;
      }
    
  }
  
    
  public Message sendCallbackUrl (CallbackUrl body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/messages/resend/callback".replaceAll("\\{format\\}","json");

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
        return (Message) ApiInvoker.deserialize(response, "", Message.class);
      } else {
        return null;
      }
    
  }
  
    
  public Notification resendNotification (NotificationResend body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/messages/resend/notification".replaceAll("\\{format\\}","json");

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
  
    
  public String retryMessage (String code) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/resend/{code}/".replaceAll("\\{format\\}","json")
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
  
    
  public String resendMessage (String code) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/restart/{code}/".replaceAll("\\{format\\}","json")
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
      MultipartBody.Builder mp = new MultipartBody.Builder();
      mp.setType(MultipartBody.FORM);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageStatus getMessageStatusByCode (String messageCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/status/{messageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()));

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
        return (MessageStatus) ApiInvoker.deserialize(response, "", MessageStatus.class);
      } else {
        return null;
      }
    
  }
  
    
  public Message updateDocument (String messageCode, Document body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/messages/updateDocument/{messageCode}".replaceAll("\\{format\\}","json")
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

      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Message) ApiInvoker.deserialize(response, "", Message.class);
      } else {
        return null;
      }
    
  }
  
    
  public Message getMessageByCode (String messageCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/{messageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()));

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
        return (Message) ApiInvoker.deserialize(response, "", Message.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<MessagePaginatedList> getMessagesByStatusAndGroup (String status, String groupCode, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/{status}/group/{groupCode}/{index}/{page_size}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "status" + "\\}", ApiInvoker.getInstance().escapeString(status.toString()))
      .replaceAll("\\{" + "groupCode" + "\\}", ApiInvoker.getInstance().escapeString(groupCode.toString()))
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
      MultipartBody.Builder mp = new MultipartBody.Builder();
      mp.setType(MultipartBody.FORM);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<MessagePaginatedList>) ApiInvoker.deserialize(response, "array", MessagePaginatedList.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<MessagePaginatedList> getMessagesByStatusAndUser (String status, String userCode, String index, String page_size) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/messages/{status}/user/{userCode}/{index}/{page_size}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "status" + "\\}", ApiInvoker.getInstance().escapeString(status.toString()))
      .replaceAll("\\{" + "userCode" + "\\}", ApiInvoker.getInstance().escapeString(userCode.toString()))
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
      MultipartBody.Builder mp = new MultipartBody.Builder();
      mp.setType(MultipartBody.FORM);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<MessagePaginatedList>) ApiInvoker.deserialize(response, "array", MessagePaginatedList.class);
      } else {
        return null;
      }
    
  }
  
}
