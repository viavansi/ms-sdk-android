package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Download;
import com.viafirma.mobile.services.android.model.TemplateList;
import com.viafirma.mobile.services.android.model.Template;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3templateApi {

  private static final V3templateApi INSTANCE = new V3templateApi();
  private V3templateApi(){}
  public static V3templateApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Download downloadFontByName (String fontName) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/template/font/{fontName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fontName" + "\\}", ApiInvoker.getInstance().escapeString(fontName.toString()));

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
        return (Download) ApiInvoker.deserialize(response, "", Download.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<TemplateList> findTemplatesByUser (String userCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/template/list/{userCode}".replaceAll("\\{format\\}","json")
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
      MultipartBody.Builder mp = new MultipartBody.Builder();
      mp.setType(MultipartBody.FORM);
      
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
  
    
  public Download downloadTemplatePdfByCode (String code) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/template/pdf/{code}".replaceAll("\\{format\\}","json")
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
        return (Download) ApiInvoker.deserialize(response, "", Download.class);
      } else {
        return null;
      }
    
  }
  
    
  public List<TemplateList> findPolicyTemplatesByUser (String userCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/template/policies/{userCode}".replaceAll("\\{format\\}","json")
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
      MultipartBody.Builder mp = new MultipartBody.Builder();
      mp.setType(MultipartBody.FORM);
      
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
    String path = "/v3/template/{code}".replaceAll("\\{format\\}","json")
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
        return (Template) ApiInvoker.deserialize(response, "", Template.class);
      } else {
        return null;
      }
    
  }
  
}
