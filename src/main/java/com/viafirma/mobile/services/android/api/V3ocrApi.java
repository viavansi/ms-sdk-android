package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.OcrMaskImage;
import com.viafirma.mobile.services.android.model.OcrScanImageCustom;
import com.viafirma.mobile.services.android.model.OcrPageResult;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class V3ocrApi {

  private static final V3ocrApi INSTANCE = new V3ocrApi();
  private V3ocrApi(){}
  public static V3ocrApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public OcrMaskImage mask (String template, String width) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/ocr/mask/{template}/{width}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "template" + "\\}", ApiInvoker.getInstance().escapeString(template.toString()))
      .replaceAll("\\{" + "width" + "\\}", ApiInvoker.getInstance().escapeString(width.toString()));

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
        return (OcrMaskImage) ApiInvoker.deserialize(response, "", OcrMaskImage.class);
      } else {
        return null;
      }
    
  }
  
    
  public OcrPageResult parse (OcrScanImageCustom body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/ocr/parse".replaceAll("\\{format\\}","json");

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
        return (OcrPageResult) ApiInvoker.deserialize(response, "", OcrPageResult.class);
      } else {
        return null;
      }
    
  }
  
}
