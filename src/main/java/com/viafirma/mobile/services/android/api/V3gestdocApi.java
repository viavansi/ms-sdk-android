package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.GestDocRequest;
import com.viafirma.mobile.services.android.model.Notification;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3gestdocApi {

  private static final V3gestdocApi INSTANCE = new V3gestdocApi();
  private V3gestdocApi(){}
  public static V3gestdocApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public List<Notification> sendGestdocTransactionByMsisdn (GestDocRequest body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/gestdoc/msisdn".replaceAll("\\{format\\}","json");

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

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Notification>) ApiInvoker.deserialize(response, "array", Notification.class);
      } else {
        return null;
      }
    
  }
  
}
