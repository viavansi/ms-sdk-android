package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Evidence;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V1evidencesApi {

  private static final V1evidencesApi INSTANCE = new V1evidencesApi();
  private V1evidencesApi(){}
  public static V1evidencesApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Evidence sendEvidence (String messageCode, String policyCode, String evidenceCode, String imageBase64, String metadata, String fingerID, String algorithmic) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/evidences".replaceAll("\\{format\\}","json");

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
      mp.addFormDataPart("messageCode", messageCode);
      
      
      hasFields = true;
      mp.addFormDataPart("policyCode", policyCode);
      
      
      hasFields = true;
      mp.addFormDataPart("evidenceCode", evidenceCode);
      
      
      hasFields = true;
      mp.addFormDataPart("imageBase64", imageBase64);
      
      
      hasFields = true;
      mp.addFormDataPart("metadata", metadata);
      
      
      hasFields = true;
      mp.addFormDataPart("fingerID", fingerID);
      
      
      hasFields = true;
      mp.addFormDataPart("algorithmic", algorithmic);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("messageCode", messageCode);
      formParams.put("policyCode", policyCode);
      formParams.put("evidenceCode", evidenceCode);
      formParams.put("imageBase64", imageBase64);
      formParams.put("metadata", metadata);
      formParams.put("fingerID", fingerID);
      formParams.put("algorithmic", algorithmic);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Evidence) ApiInvoker.deserialize(response, "", Evidence.class);
      } else {
        return null;
      }
    
  }
  
}
