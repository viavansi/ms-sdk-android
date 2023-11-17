package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.MessageSet;
import com.viafirma.mobile.services.android.model.MessageSetResponse;
import com.viafirma.mobile.services.android.model.SetExtendPeriod;
import com.viafirma.mobile.services.android.model.MessageSetInfo;
import com.viafirma.mobile.services.android.model.SetListUserGroup;
import com.viafirma.mobile.services.android.model.SetCallbackUrl;
import com.viafirma.mobile.services.android.model.NotificationResend;
import com.viafirma.mobile.services.android.model.MessageSetStatus;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3setApi {

  private static final V3setApi INSTANCE = new V3setApi();
  private V3setApi(){}
  public static V3setApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public MessageSetResponse sendMessageSet (MessageSet body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/set".replaceAll("\\{format\\}","json");

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
        return (MessageSetResponse) ApiInvoker.deserialize(response, "", MessageSetResponse.class);
      } else {
        return null;
      }
    
  }
  
    
  public String sendBatch (MessageSet body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/set/batch".replaceAll("\\{format\\}","json");

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
  
    
  public String removeDraft (String setCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/draft/delete/{setCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "setCode" + "\\}", ApiInvoker.getInstance().escapeString(setCode.toString()));

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

      String response = ApiInvoker.getInstance().invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageSet loadDraft (String setCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/draft/load/{setCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "setCode" + "\\}", ApiInvoker.getInstance().escapeString(setCode.toString()));

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
        return (MessageSet) ApiInvoker.deserialize(response, "", MessageSet.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageSet saveDraft (MessageSet body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/set/draft/save".replaceAll("\\{format\\}","json");

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
        return (MessageSet) ApiInvoker.deserialize(response, "", MessageSet.class);
      } else {
        return null;
      }
    
  }
  
    
  public String extendSignaturePeriod_1 (SetExtendPeriod body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/set/extendSignaturePeriod".replaceAll("\\{format\\}","json");

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      } else {
        return null;
      }
    
  }
  
    
  public String finalizeMessage_1 (String setCode, String recipientKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/finalize".replaceAll("\\{format\\}","json");

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
      mp.addFormDataPart("setCode", setCode);
      
      
      hasFields = true;
      mp.addFormDataPart("recipientKey", recipientKey);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("setCode", setCode);
      formParams.put("recipientKey", recipientKey);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageSetInfo getInfoSetByRecipient (String setCode, String recipientKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/info/{setCode}/{recipientKey}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "setCode" + "\\}", ApiInvoker.getInstance().escapeString(setCode.toString()))
      .replaceAll("\\{" + "recipientKey" + "\\}", ApiInvoker.getInstance().escapeString(recipientKey.toString()));

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
        return (MessageSetInfo) ApiInvoker.deserialize(response, "", MessageSetInfo.class);
      } else {
        return null;
      }
    
  }
  
    
  public Boolean isFinalizable_1 (String setCode, String recipientKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/isFinalizable/{setCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "setCode" + "\\}", ApiInvoker.getInstance().escapeString(setCode.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(recipientKey)))
      queryParams.put("recipientKey", String.valueOf(recipientKey));
    
    
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
        return (Boolean) ApiInvoker.deserialize(response, "", Boolean.class);
      } else {
        return null;
      }
    
  }
  
    
  public SetListUserGroup getSetByUserAndOrGroup (String groupCode, Integer numPag, Integer limit, String sortBy, String sender, String status, String title, String description, String recipient, Long before, Long after) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/list/{groupCode}/{numPag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupCode" + "\\}", ApiInvoker.getInstance().escapeString(groupCode.toString()))
      .replaceAll("\\{" + "numPag" + "\\}", ApiInvoker.getInstance().escapeString(numPag.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(limit)))
      queryParams.put("limit", String.valueOf(limit));
    if(!"null".equals(String.valueOf(sortBy)))
      queryParams.put("sortBy", String.valueOf(sortBy));
    if(!"null".equals(String.valueOf(sender)))
      queryParams.put("sender", String.valueOf(sender));
    if(!"null".equals(String.valueOf(status)))
      queryParams.put("status", String.valueOf(status));
    if(!"null".equals(String.valueOf(title)))
      queryParams.put("title", String.valueOf(title));
    if(!"null".equals(String.valueOf(description)))
      queryParams.put("description", String.valueOf(description));
    if(!"null".equals(String.valueOf(recipient)))
      queryParams.put("recipient", String.valueOf(recipient));
    if(!"null".equals(String.valueOf(before)))
      queryParams.put("before", String.valueOf(before));
    if(!"null".equals(String.valueOf(after)))
      queryParams.put("after", String.valueOf(after));
    
    
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
        return (SetListUserGroup) ApiInvoker.deserialize(response, "", SetListUserGroup.class);
      } else {
        return null;
      }
    
  }
  
    
  public String callbackForm_1 (String set) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/mock/callbackForm".replaceAll("\\{format\\}","json");

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
      mp.addFormDataPart("set", set);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("set", set);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      } else {
        return null;
      }
    
  }
  
    
  public String callbackJSON_1 (MessageSetResponse body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/set/mock/callbackJSON".replaceAll("\\{format\\}","json");

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
  
    
  public MessageSetResponse rejectSetByCode (String setCode, String comment) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/reject/{setCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "setCode" + "\\}", ApiInvoker.getInstance().escapeString(setCode.toString()));

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
        return (MessageSetResponse) ApiInvoker.deserialize(response, "", MessageSetResponse.class);
      } else {
        return null;
      }
    
  }
  
    
  public Boolean sendCallbackUrl_1 (SetCallbackUrl body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/set/resend/callback".replaceAll("\\{format\\}","json");

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
        return (Boolean) ApiInvoker.deserialize(response, "", Boolean.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageSet resendNotifications (String setCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/resend/notification".replaceAll("\\{format\\}","json");

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
      mp.addFormDataPart("setCode", setCode);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("setCode", setCode);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (MessageSet) ApiInvoker.deserialize(response, "", MessageSet.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageSet resendNotificationByRecipient (NotificationResend body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/set/resend/recipient".replaceAll("\\{format\\}","json");

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
        return (MessageSet) ApiInvoker.deserialize(response, "", MessageSet.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageSetStatus getMessageSetStatus (String setCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/status/{setCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "setCode" + "\\}", ApiInvoker.getInstance().escapeString(setCode.toString()));

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
        return (MessageSetStatus) ApiInvoker.deserialize(response, "", MessageSetStatus.class);
      } else {
        return null;
      }
    
  }
  
    
  public MessageSetResponse getMessageSetByCode (String setCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/set/summary/{setCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "setCode" + "\\}", ApiInvoker.getInstance().escapeString(setCode.toString()));

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
        return (MessageSetResponse) ApiInvoker.deserialize(response, "", MessageSetResponse.class);
      } else {
        return null;
      }
    
  }
  
}
