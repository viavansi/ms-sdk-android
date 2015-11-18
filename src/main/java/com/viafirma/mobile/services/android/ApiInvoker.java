package com.viafirma.mobile.services.android;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.conn.*;
import org.apache.http.conn.scheme.*;
import org.apache.http.conn.ssl.*;
import org.apache.http.entity.*;
import org.apache.http.entity.mime.*;
import org.apache.http.entity.mime.content.*;
import org.apache.http.impl.client.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.*;
import org.apache.http.impl.conn.*;
import org.apache.http.params.*;
import org.apache.http.util.EntityUtils;
import org.apache.http.protocol.HTTP;

import java.io.File;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.URLEncoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import android.util.Log;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthException;

public class ApiInvoker {
  private static ApiInvoker INSTANCE = new ApiInvoker();
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  private boolean isDebug = false;

  private HttpClient client = null;

  private boolean ignoreSSLCertificates = false;

  private ClientConnectionManager ignoreSSLConnectionManager;

  String basePath = null;
  String consumerKey = null;
  String consumerSecret = null;
  String token = null;
  String tokenSecret = null;
  long timeoutSeconds = 120;
  
  public void setTimeoutSeconds(long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public long getTimeoutSeconds() {
    return timeoutSeconds;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }
    
  public void setConsumerKey(String consumerKey) {
     this.consumerKey = consumerKey;
  }

  public String getConsumerKey() {
    return consumerKey;
  }

  public void setConsumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
  }

  public String getConsumerSecret() {
    return consumerSecret;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getTokenSecret() {
    return tokenSecret;
  }

  public void setTokenSecret(String tokenSecret) {
    this.tokenSecret = tokenSecret;
  }

  public void enableDebug() {
    isDebug = true;
  }

  public ApiInvoker() {
    initConnectionManager();
  }

  public static ApiInvoker getInstance() {
    return INSTANCE;
  }

  public void ignoreSSLCertificates(boolean ignoreSSLCertificates) {
    this.ignoreSSLCertificates = ignoreSSLCertificates;
  }

  public void addDefaultHeader(String key, String value) {
    defaultHeaderMap.put(key, value);
  }

  public String escapeString(String str) {
    try{
      return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }
    catch(UnsupportedEncodingException e) {
      return str;
    }
  }

  public static Object deserialize(String json, String containerType, Class cls) throws ApiException {
    if(null != containerType) {
        containerType = containerType.toLowerCase();
    }
    try{
      if("list".equals(containerType) || "array".equals(containerType)) {
		Type type = new ListParameterizedType(cls);
		List list = new Gson().fromJson(json, type);
        return list;
      }
      else if(String.class.equals(cls)) {
        if(json != null && json.startsWith("\"") && json.endsWith("\"") && json.length() > 1)
          return json.substring(1, json.length() - 1);
        else
          return json;
      }
      else if (Void.class.equals(cls)) {
          return null;
      }
      else {
          // Creates the json object which will manage the information received
          GsonBuilder builder = new GsonBuilder();

          // Register an adapter to manage the date types as long values
          builder.registerTypeAdapter(Date.class, new JsonDeserializer() {
              public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                  return new Date(json.getAsJsonPrimitive().getAsLong());
              }
          });

          Gson gson = builder.create();
          return gson.fromJson(json, cls);
      }
    }
    catch (Exception e) {
      if (e instanceof ApiException) {
        throw (ApiException)e;
      } else {
        throw new ApiException(0, e);
      }
    }
  }

  public static String serialize(Object obj) throws ApiException {
    try {
      if (obj != null)
        return new Gson().toJson(obj);
      else
        return null;
    }
    catch (Exception e) {
      if (e instanceof ApiException) {
        throw (ApiException)e;
      } else {
        throw new ApiException(0, e);
      }
    }
  }

  public String invokeAPI(String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType) throws ApiException {
    
    HttpParams httpParameters = new BasicHttpParams();
    // Set the timeout in milliseconds until a connection is established.
    // The default value is zero, that means the timeout is not used.
    int timeoutConnection = (int)timeoutSeconds * 1000;
    HttpConnectionParams.setConnectionTimeout(httpParameters, timeoutConnection);
    // Set the default socket timeout (SO_TIMEOUT)
    // in milliseconds which is the timeout for waiting for data.
    int timeoutSocket = (int)timeoutSeconds * 1000;
    HttpConnectionParams.setSoTimeout(httpParameters, timeoutSocket);

	HttpClient client = new DefaultHttpClient(httpParameters);

    StringBuilder b = new StringBuilder();

    for(String key : queryParams.keySet()) {
      String value = queryParams.get(key);
      if (value != null){
        if(b.toString().length() == 0)
          b.append("?");
        else
          b.append("&");
        b.append(escapeString(key)).append("=").append(escapeString(value));
      }
    }
    String url = basePath + path + b.toString();

    HashMap<String, String> headers = new HashMap<String, String>();

    for(String key : headerParams.keySet()) {
      headers.put(key, headerParams.get(key));
    }
    
    for(String key : defaultHeaderMap.keySet()) {
      if(!headerParams.containsKey(key)) {
        headers.put(key, defaultHeaderMap.get(key));
      }
    }
    // headers.put("Accept", "application/json");

	HttpRequestBase request = null;
    HttpResponse response = null;
    try{
      	if("GET".equals(method)) {
        	request = new HttpGet(url);
        	request.addHeader("Accept", "application/json");
        	for(String key : headers.keySet()) {
        	  	request.setHeader(key, headers.get(key));
        	}
      	} else if ("POST".equals(method)) {
        	HttpPost post = new HttpPost(url);

			for(String key : headers.keySet()) {
				post.setHeader(key, headers.get(key));
	        }

			AbstractHttpEntity se;
	        if (body != null && !(body instanceof MultipartEntityBuilder)) { // body JSON
				se = new StringEntity(serialize(body), "UTF-8");
				BasicHeader basicHeader = new BasicHeader(HTTP.CONTENT_TYPE, "application/json;charset=UTF-8");
				se.setContentType(basicHeader);
				post.setEntity(se);
	        } else if (body != null && body instanceof MultipartEntityBuilder) { // body MULTIPART
	        	HttpEntity httpEntity = ((MultipartEntityBuilder)body).build();
	        	post.setEntity(httpEntity);
	        } else if (formParams != null && "application/x-www-form-urlencoded".equals(contentType)) { // body FORM
	       		List<NameValuePair> nameValuePairs = new LinkedList<NameValuePair>();
	       		for (Map.Entry<String, String> param : formParams.entrySet())
				{
    				nameValuePairs.add(new BasicNameValuePair(param.getKey(), param.getValue()));
				}
	        	se = new UrlEncodedFormEntity(nameValuePairs, "UTF-8");
	            BasicHeader basicHeader = new BasicHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");
	            se.setContentType(basicHeader);
	            post.setEntity(se);
	        }

			request = post;
	        
		} else if ("PUT".equals(method)) {
	        HttpPut put = new HttpPut(url);
	        
	        for(String key : headers.keySet()) {
				put.setHeader(key, headers.get(key));
	        }

			AbstractHttpEntity se;
	        if (body != null && !(body instanceof MultipartEntityBuilder)) { // body JSON
				se = new StringEntity(serialize(body), "UTF-8");
				BasicHeader basicHeader = new BasicHeader(HTTP.CONTENT_TYPE, "application/json;charset=UTF-8");
				se.setContentType(basicHeader);
				put.setEntity(se);
	        } else if (body != null && body instanceof MultipartEntityBuilder) { // body MULTIPART
	        	HttpEntity httpEntity = ((MultipartEntityBuilder)body).build();
	        	put.setEntity(httpEntity);
	        } else if (formParams != null && "application/x-www-form-urlencoded".equals(contentType)) { // body FORM
	       		List<NameValuePair> nameValuePairs = new LinkedList<NameValuePair>();
	       		for (Map.Entry<String, String> param : formParams.entrySet())
				{
    				nameValuePairs.add(new BasicNameValuePair(param.getKey(), param.getValue()));
				}
	        	se = new UrlEncodedFormEntity(nameValuePairs, "UTF-8");
	            BasicHeader basicHeader = new BasicHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");
	            se.setContentType(basicHeader);
	            put.setEntity(se);
	        }

			request = put;
	        
      	} else if ("DELETE".equals(method)) {
        	HttpDelete delete = new HttpDelete(url);
	        for(String key : headers.keySet()) {
	          delete.setHeader(key, headers.get(key));
	        }
	        request = delete;
      	} else if ("PATCH".equals(method)) {
        	HttpPatch patch = new HttpPatch(url);

	        for(String key : headers.keySet()) {
				patch.setHeader(key, headers.get(key));
	        }

			AbstractHttpEntity se;
	        if (body != null) { // body JSON
				se = new StringEntity(serialize(body), "UTF-8");
				//BasicHeader basicHeader = new BasicHeader(HTTP.CONTENT_TYPE, "application/json;charset=UTF-8");
				//se.setContentType(basicHeader);
				patch.setEntity(se);
	        } else if (body != null && body instanceof MultipartEntityBuilder) { // body MULTIPART
	        	HttpEntity httpEntity = ((MultipartEntityBuilder)body).build();
	        	patch.setEntity(httpEntity);
	        } else if (formParams != null && "application/x-www-form-urlencoded".equals(contentType)) { // body FORM
	       		List<NameValuePair> nameValuePairs = new LinkedList<NameValuePair>();
	       		for (Map.Entry<String, String> param : formParams.entrySet())
				{
    				nameValuePairs.add(new BasicNameValuePair(param.getKey(), param.getValue()));
				}
	        	se = new UrlEncodedFormEntity(nameValuePairs, "UTF-8");
	            BasicHeader basicHeader = new BasicHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");
	            se.setContentType(basicHeader);
	            patch.setEntity(se);
	        }
	        
	        request = patch;
      	}
      
      	if (consumerKey != null && consumerSecret != null) {
      		OAuthConsumer oAuthConsumer = new CommonsHttpOAuthConsumer(consumerKey, consumerSecret);
			if (token != null && tokenSecret != null) {
		    	oAuthConsumer.setTokenWithSecret(token, tokenSecret);
			}
	  		oAuthConsumer.sign(request);
		}
		
	  	response = client.execute(request);

      	int code = response.getStatusLine().getStatusCode();
      	String responseString = null;
      	if(code == 204) { 
        	responseString = "";
		} else if(code >= 200 && code < 300) {
        	if(response.getEntity() != null) {
          		HttpEntity resEntity = response.getEntity();
          		responseString = EntityUtils.toString(resEntity, HTTP.UTF_8);
        	}
      	} else {
        	if(response.getEntity() != null) {
          		HttpEntity resEntity = response.getEntity();
          		responseString = EntityUtils.toString(resEntity, HTTP.UTF_8);
          		throw new ApiException(code, responseString);
        	}
        	else {
          		responseString = "no data";
        		throw new ApiException(code, responseString);
      		}
		}
		return responseString;		
		
	} catch (Exception e) {
	  if (e instanceof ApiException) {
	    throw (ApiException)e;
	  } else {
	    throw new ApiException(0, e);
	  }
    }
  }

  private HttpClient getClient(String host) {
    if (client == null) {
      if (ignoreSSLCertificates && ignoreSSLConnectionManager != null) {
        // Trust self signed certificates
        client = new DefaultHttpClient(ignoreSSLConnectionManager, new BasicHttpParams());
      } else {
        client = new DefaultHttpClient();
      }
    }
    return client;
  }

  private void initConnectionManager() {
    try {
      final SSLContext sslContext = SSLContext.getInstance("SSL");

      // set up a TrustManager that trusts everything
      TrustManager[] trustManagers = new TrustManager[] {
        new X509TrustManager() {
          public X509Certificate[] getAcceptedIssuers() {
            return null;
          }
          public void checkClientTrusted(X509Certificate[] certs, String authType) {}
          public void checkServerTrusted(X509Certificate[] certs, String authType) {}
      }};

      sslContext.init(null, trustManagers, new SecureRandom());

      SSLSocketFactory sf = new SSLSocketFactory((KeyStore)null) {
        private javax.net.ssl.SSLSocketFactory sslFactory = sslContext.getSocketFactory();

        public Socket createSocket(Socket socket, String host, int port, boolean autoClose)
          throws IOException, UnknownHostException {
          return sslFactory.createSocket(socket, host, port, autoClose);
        }

        public Socket createSocket() throws IOException {
          return sslFactory.createSocket();
        }
      };

      sf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
      Scheme httpsScheme = new Scheme("https", sf, 443);
      SchemeRegistry schemeRegistry = new SchemeRegistry();
      schemeRegistry.register(httpsScheme);
      schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));

      ignoreSSLConnectionManager = new SingleClientConnManager(new BasicHttpParams(), schemeRegistry);
    } catch (NoSuchAlgorithmException e) {
      // This will only be thrown if SSL isn't available for some reason.
    } catch (KeyManagementException e) {
      // This might be thrown when passing a key into init(), but no key is being passed.
    } catch (GeneralSecurityException e) {
      // This catches anything else that might go wrong.
      // If anything goes wrong we default to the standard connection manager.
    }
  }
  
  private static String convertStreamToString(InputStream is) {
	    /*
	     * To convert the InputStream to String we use the BufferedReader.readLine()
	     * method. We iterate until the BufferedReader return null which means
	     * there's no more data to read. Each line will appended to a StringBuilder
	     * and returned as String.
	     */
	    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	    StringBuilder sb = new StringBuilder();

	    String line = null;
	    try {
	        while ((line = reader.readLine()) != null) {
	            sb.append(line + "\n");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            is.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    return sb.toString();
	}
	
	/**
     * ONLY FOR TEST PURPOSES.
     */
//    class MySSLSocketFactory extends SSLSocketFactory {
//        SSLContext sslContext = SSLContext.getInstance("TLS");
//
//        public MySSLSocketFactory(KeyStore truststore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
//            super(truststore);
//
//            TrustManager tm = new X509TrustManager() {
//                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//                }
//
//                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//                }
//
//                public X509Certificate[] getAcceptedIssuers() {
//                    return null;
//                }
//            };
//
//            sslContext.init(null, new TrustManager[] { tm }, null);
//        }
//
//        @Override
//        public Socket createSocket(Socket socket, String host, int port, boolean autoClose) throws IOException, UnknownHostException {
//            return sslContext.getSocketFactory().createSocket(socket, host, port, autoClose);
//        }
//
//        @Override
//        public Socket createSocket() throws IOException {
//            return sslContext.getSocketFactory().createSocket();
//        }
//    }

    /**
     * ONLY FOR TEST PURPOSES.
     */
//    public HttpClient getNewHttpClient() {
//        try {
//            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
//            trustStore.load(null, null);
//
//            SSLSocketFactory sf = new MySSLSocketFactory(trustStore);
//            sf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
//
//            HttpParams params = new BasicHttpParams();
//            HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
//            HttpProtocolParams.setContentCharset(params, HTTP.UTF_8);
//            int timeoutSeconds = 120;
//            int timeoutConnection = timeoutSeconds * 1000;
//            HttpConnectionParams.setConnectionTimeout(params, timeoutConnection);
//            int timeoutSocket = timeoutSeconds * 1000;
//            HttpConnectionParams.setSoTimeout(params, timeoutSocket);
//
//            SchemeRegistry registry = new SchemeRegistry();
//            registry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
//            registry.register(new Scheme("https", sf, 443));
//            registry.register(new Scheme("https", sf, 8443));
//
//            ClientConnectionManager ccm = new ThreadSafeClientConnManager(params, registry);
//
//            return new DefaultHttpClient(ccm, params);
//        } catch (Exception e) {
//            return new DefaultHttpClient();
//        }
//    }

	private static class ListParameterizedType implements ParameterizedType {
	
	    private Type type;
	
	    private ListParameterizedType(Type type) {
	        this.type = type;
	    }
	
	    @Override
	    public Type[] getActualTypeArguments() {
	        return new Type[] {type};
	    }
	
	    @Override
	    public Type getRawType() {
	        return ArrayList.class;
	    }
	
	    @Override
	    public Type getOwnerType() {
	        return null;
	    }
	
	    // implement equals method too! (as per javadoc)
	}
}
