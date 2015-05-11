package com.viafirma.mobile.android.api;

import com.viafirma.mobile.android.ApiException;
import com.viafirma.mobile.android.ApiInvoker;

import com.viafirma.mobile.android.model.*;

import java.util.*;

import com.viafirma.mobile.android.model.TaskManager;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class V1workflowsApi {

  private static final V1workflowsApi INSTANCE = new V1workflowsApi();
  private V1workflowsApi(){}
  public static V1workflowsApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public TaskManager getWorkflowConfiguration () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/workflows/".replaceAll("\\{format\\}","json");

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
        return (TaskManager) ApiInvoker.deserialize(response, "", TaskManager.class);
      } else {
        return null;
      }
    
  }
  
}
