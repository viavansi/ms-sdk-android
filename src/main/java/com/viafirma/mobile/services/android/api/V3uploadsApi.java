package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Upload;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3uploadsApi {

  private static final V3uploadsApi INSTANCE = new V3uploadsApi();
  private V3uploadsApi(){}
  public static V3uploadsApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Upload getDownloadLink (String token) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/uploads/download/link/{token}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "token" + "\\}", ApiInvoker.getInstance().escapeString(token.toString()));

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
        return (Upload) ApiInvoker.deserialize(response, "", Upload.class);
      } else {
        return null;
      }
    
  }
  
    
  public Upload getUploadLink (String extension) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/uploads/link/{extension}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "extension" + "\\}", ApiInvoker.getInstance().escapeString(extension.toString()));

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
        return (Upload) ApiInvoker.deserialize(response, "", Upload.class);
      } else {
        return null;
      }
    
  }
  
}
