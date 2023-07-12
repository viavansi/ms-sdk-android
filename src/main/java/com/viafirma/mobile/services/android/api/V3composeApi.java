package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.ComposeToken;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3composeApi {

  private static final V3composeApi INSTANCE = new V3composeApi();
  private V3composeApi(){}
  public static V3composeApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public ComposeToken getWriteToken (String groupCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/compose/token/{groupCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupCode" + "\\}", ApiInvoker.getInstance().escapeString(groupCode.toString()));

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
        return (ComposeToken) ApiInvoker.deserialize(response, "", ComposeToken.class);
      } else {
        return null;
      }
    
  }
  
}
