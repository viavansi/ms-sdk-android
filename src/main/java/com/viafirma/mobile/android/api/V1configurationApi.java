package com.viafirma.mobile.android.api;

import com.viafirma.mobile.android.ApiException;
import com.viafirma.mobile.android.ApiInvoker;

import com.viafirma.mobile.android.model.*;

import java.util.*;

import com.viafirma.mobile.android.model.Configuration;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

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
      MultipartEntityBuilder mp = MultipartEntityBuilder.create();
      mp.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      
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
