package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.WrapSignature;
import com.viafirma.mobile.services.android.model.Signature;
import com.viafirma.mobile.services.android.model.DataToSign;
import com.viafirma.mobile.services.android.model.PrepareSignature;
import com.viafirma.mobile.services.android.model.Policy;
import com.viafirma.mobile.services.android.model.EvidenceSignature;
import com.viafirma.mobile.services.android.model.Message;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3signaturesApi {

  private static final V3signaturesApi INSTANCE = new V3signaturesApi();
  private V3signaturesApi(){}
  public static V3signaturesApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Signature finalizeClientSignature (WrapSignature body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/signatures/client/finalize".replaceAll("\\{format\\}","json");

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
        return (Signature) ApiInvoker.deserialize(response, "", Signature.class);
      } else {
        return null;
      }
    
  }
  
    
  public DataToSign prepareClientSignature (PrepareSignature body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/signatures/client/prepare".replaceAll("\\{format\\}","json");

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
        return (DataToSign) ApiInvoker.deserialize(response, "", DataToSign.class);
      } else {
        return null;
      }
    
  }
  
    
  public Policy addDigitalizedSignature (EvidenceSignature body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/signatures/digitalized".replaceAll("\\{format\\}","json");

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
        return (Policy) ApiInvoker.deserialize(response, "", Policy.class);
      } else {
        return null;
      }
    
  }
  
    
  public Signature addServerSignature (String messageCode, String signatureCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/signatures/server".replaceAll("\\{format\\}","json");

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
      mp.addFormDataPart("signatureCode", signatureCode);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("messageCode", messageCode);
      formParams.put("signatureCode", signatureCode);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Signature) ApiInvoker.deserialize(response, "", Signature.class);
      } else {
        return null;
      }
    
  }
  
    
  public Signature getSignatureByCode (String messageCode, String signatureCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/signatures/status/{messageCode}/{signatureCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()))
      .replaceAll("\\{" + "signatureCode" + "\\}", ApiInvoker.getInstance().escapeString(signatureCode.toString()));

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
        return (Signature) ApiInvoker.deserialize(response, "", Signature.class);
      } else {
        return null;
      }
    
  }
  
    
  public Message updateSignatureStatus (String messageCode, String signatureCode, String status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/signatures/update/status".replaceAll("\\{format\\}","json");

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
      mp.addFormDataPart("signatureCode", signatureCode);
      
      
      hasFields = true;
      mp.addFormDataPart("status", status);
      
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("messageCode", messageCode);
      formParams.put("signatureCode", signatureCode);
      formParams.put("status", status);
      
    }

      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Message) ApiInvoker.deserialize(response, "", Message.class);
      } else {
        return null;
      }
    
  }
  
}
