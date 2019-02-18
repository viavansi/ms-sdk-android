package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Configuration;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V1configurationApi {

  private static final V1configurationApi INSTANCE = new V1configurationApi();
  private V1configurationApi(){}
  public static V1configurationApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Configuration getDeviceConfiguration (String appIdentifier) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/application/{appIdentifier}/config".replaceAll("\\{format\\}","json")
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
  
}
