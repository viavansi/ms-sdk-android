package com.viafirma.mobile.android.api;

import com.viafirma.mobile.android.ApiException;
import com.viafirma.mobile.android.ApiInvoker;

import com.viafirma.mobile.android.model.*;

import java.util.*;

import com.viafirma.mobile.android.model.TemplateList;
import com.viafirma.mobile.android.model.Template;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class V1templateApi {

  private static final V1templateApi INSTANCE = new V1templateApi();
  private V1templateApi(){}
  public static V1templateApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public List<TemplateList> findTemplatesByUser (String userCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/template/list/{userCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userCode" + "\\}", ApiInvoker.getInstance().escapeString(userCode.toString()));

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
        return (List<TemplateList>) ApiInvoker.deserialize(response, "array", TemplateList.class);
      } else {
        return null;
      }
    
  }
  
    
  public Template findTemplateByCode (String code) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/template/{code}".replaceAll("\\{format\\}","json")
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
        return (Template) ApiInvoker.deserialize(response, "", Template.class);
      } else {
        return null;
      }
    
  }
  
}
