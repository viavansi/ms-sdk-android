package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.IdenticaRequest;
import com.viafirma.mobile.services.android.model.IdenticaRequestResult;
import com.viafirma.mobile.services.android.model.IdenticaStatusRequest;
import com.viafirma.mobile.services.android.model.IdenticaStatusResult;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3identicaApi {

  private static final V3identicaApi INSTANCE = new V3identicaApi();
  private V3identicaApi(){}
  public static V3identicaApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public IdenticaRequestResult requestFingerprint (IdenticaRequest body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/identica/request".replaceAll("\\{format\\}","json");

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
        return (IdenticaRequestResult) ApiInvoker.deserialize(response, "", IdenticaRequestResult.class);
      } else {
        return null;
      }
    
  }
  
    
  public IdenticaStatusResult requestFingerprintStatus (IdenticaStatusRequest body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/identica/status".replaceAll("\\{format\\}","json");

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
        return (IdenticaStatusResult) ApiInvoker.deserialize(response, "", IdenticaStatusResult.class);
      } else {
        return null;
      }
    
  }
  
}
