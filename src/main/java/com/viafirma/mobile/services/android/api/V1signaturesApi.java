package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Policy;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class V1signaturesApi {

  private static final V1signaturesApi INSTANCE = new V1signaturesApi();
  private V1signaturesApi(){}
  public static V1signaturesApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Policy prepareSignature (String messageCode, String policyCode, String userCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/signatures/prepare".replaceAll("\\{format\\}","json");

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
      MultipartEntityBuilder mp = MultipartEntityBuilder.create();
      mp.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      
      hasFields = true;
      mp.addPart("messageCode", new StringBody(messageCode, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("policyCode", new StringBody(policyCode, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("userCode", new StringBody(userCode, ContentType.TEXT_PLAIN));
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("messageCode", messageCode);
      formParams.put("policyCode", policyCode);
      formParams.put("userCode", userCode);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Policy) ApiInvoker.deserialize(response, "", Policy.class);
      } else {
        return null;
      }
    
  }
  
    
  public Policy registerSignature (String messageCode, String policyCode, String signatureCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v1/signatures/register".replaceAll("\\{format\\}","json");

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
      MultipartEntityBuilder mp = MultipartEntityBuilder.create();
      mp.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      
      hasFields = true;
      mp.addPart("messageCode", new StringBody(messageCode, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("policyCode", new StringBody(policyCode, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("signatureCode", new StringBody(signatureCode, ContentType.TEXT_PLAIN));
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("messageCode", messageCode);
      formParams.put("policyCode", policyCode);
      formParams.put("signatureCode", signatureCode);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Policy) ApiInvoker.deserialize(response, "", Policy.class);
      } else {
        return null;
      }
    
  }
  
}
