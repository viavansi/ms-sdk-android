package com.viafirma.mobile.services.android.api;

import com.viafirma.mobile.services.android.ApiException;
import com.viafirma.mobile.services.android.ApiInvoker;

import com.viafirma.mobile.services.android.model.*;

import java.util.*;

import com.viafirma.mobile.services.android.model.Evidence;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

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
      MultipartEntityBuilder mp = MultipartEntityBuilder.create();
      mp.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      
      hasFields = true;
      mp.addPart("messageCode", new StringBody(messageCode, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("policyCode", new StringBody(policyCode, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("evidenceCode", new StringBody(evidenceCode, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("imageBase64", new StringBody(imageBase64, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("metadata", new StringBody(metadata, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("fingerID", new StringBody(fingerID, ContentType.TEXT_PLAIN));
      
      
      hasFields = true;
      mp.addPart("algorithmic", new StringBody(algorithmic, ContentType.TEXT_PLAIN));
      
      
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
