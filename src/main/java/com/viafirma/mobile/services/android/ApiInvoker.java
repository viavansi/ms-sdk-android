package com.viafirma.mobile.services.android;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import org.apache.commons.lang3.StringEscapeUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Date;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;
import se.akerfeldt.okhttp.signpost.SigningInterceptor;

public class ApiInvoker {
  private static ApiInvoker INSTANCE = new ApiInvoker();
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  private boolean isDebug = false;

  ConnectionPool connectionPool = null;
  String basePath = null;

  String consumerKey = null;
  String consumerSecret = null;
  String token = null;
  String tokenSecret = null;

  OAuth2TokenProvider tokenProvider = null;

  long timeoutSeconds = 120;
  long connectTimeout = 30;
  int timeoutRetryAttempts = 0;
  SSLSocketFactory sslSocketFactory;
  Gson gsonSerializer;
  List<String[]> sslPinning = null;
  
  public void setReadTimeout(long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public long getReadTimeout() {
    return timeoutSeconds;
  }
  
  public void setConnectTimeout(long timeoutSeconds) {
  	this.connectTimeout = timeoutSeconds;
  }
  
  public long getConnectTimeout() {
    return connectTimeout;
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
  
	 public int getTimeoutRetryAttempts() {
	    return timeoutRetryAttempts;
	}
	
	public void setTimeoutRetryAttempts(int timeoutRetryAttempts) {
	    this.timeoutRetryAttempts = timeoutRetryAttempts;
	}

    public List<String[]> getSslPinning() {
        return sslPinning;
    }

    public void setSslPinning(List<String[]> sslPinning) {
        this.sslPinning = sslPinning;
    }

    public void enableDebug() {
    isDebug = true;
  }
  
	public Gson getGsonSerializer() {
	    return gsonSerializer;
	}
	
	public void setGsonSerializer(Gson gsonSerializer) {
	    this.gsonSerializer = gsonSerializer;
	}

    public OAuth2TokenProvider getTokenProvider() {
        return tokenProvider;
    }

    public void setTokenProvider(OAuth2TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

  public ApiInvoker() {
    connectionPool = new ConnectionPool(10, 5, TimeUnit.MINUTES);
  }

  public static ApiInvoker getInstance() {
    return INSTANCE;
  }
  
  public void loadKeystore(InputStream keyStore, String keystorePassword) throws GeneralSecurityException, IOException {
	    IOException e1 = null;
	    GeneralSecurityException e2 = null;

        X509TrustManager defaultTrustManager = null;
        try {
            defaultTrustManager = defaultTrustManagerForCertificates();
        } catch (IOException iex) {
            e1 = iex;
            Log.w("ApiInvoker", iex.getLocalizedMessage());
        } catch (GeneralSecurityException gex) {
            e2 = gex;
            Log.w("ApiInvoker", gex.getLocalizedMessage());
        }

        X509TrustManager trustManager = null;
        if (keyStore != null && keystorePassword != null) {
          try {
              trustManager = trustManagerForCertificates(keyStore, keystorePassword);
          } catch (IOException iex) {
              e1 = iex;
              Log.w("ApiInvoker", iex.getLocalizedMessage());
          } catch (GeneralSecurityException gex) {
              e2 = gex;
              Log.w("ApiInvoker", gex.getLocalizedMessage());
          }
        }

        SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
        if (trustManager != null && defaultTrustManager != null) {
			TrustManager compositeTrustManager = new CompositeX509TrustManager(trustManager, defaultTrustManager);
            sslContext.init(null, new TrustManager[] {compositeTrustManager}, new SecureRandom());
            sslSocketFactory = sslContext.getSocketFactory();
        } else if (trustManager != null) {
            sslContext.init(null, new TrustManager[] {trustManager}, new SecureRandom());
            sslSocketFactory = sslContext.getSocketFactory();
        } else if (defaultTrustManager != null) {
            sslContext.init(null, new TrustManager[] {defaultTrustManager}, new SecureRandom());
            sslSocketFactory = sslContext.getSocketFactory();
        }

        if (e1 != null) {
            throw e1;
        } else if (e2 != null) {
            throw e2;
        }
	}

    public CertificatePinner createCertificatePinner() {
      try {
          CertificatePinner.Builder builder = new CertificatePinner.Builder();
          if (sslPinning != null) {
              for (String[] entry : sslPinning) {
                  builder.add(entry[0], entry[1]);
              }
              return builder.build();
          } else {
              return null;
          }
      } catch (Exception e) {
          Log.e("ApiInvoker", e.getLocalizedMessage());
      }
      return null;
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

  public String serialize(Object obj) throws ApiException {
    try {
      if (obj != null) {
        if (gsonSerializer != null) {
              return gsonSerializer.toJson(obj);
          } else {
              return new Gson().toJson(obj);
          }
      } else {
        return null;
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

  public String invokeAPI(String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType) throws ApiException {
          return retryInvokeAPI(path, method, queryParams, body, headerParams, formParams, contentType, 0);
    }

    private String retryInvokeAPI(String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType, int currentAttempts) throws ApiException {
        try {
            return invokeAPI_(path, method, queryParams, body, headerParams, formParams, contentType);
        } catch (SocketTimeoutException e) {
            if (currentAttempts < timeoutRetryAttempts) {
                Log.e("ApiInvoker", "Retry "+currentAttempts+" after an error of "+e.getMessage());
                return retryInvokeAPI(path, method, queryParams, body, headerParams, formParams, contentType, currentAttempts+1);
            } else {
                throw new ApiException(0, e);
            }
        } catch (Exception e) {
            if (e instanceof ApiException) {
                throw (ApiException)e;
            } else {
                throw new ApiException(0, e);
            }
        }
    }
    
   	public InputStream download(String url) throws ApiException, IOException{
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                .readTimeout(timeoutSeconds, TimeUnit.SECONDS)
                .connectionPool(connectionPool)
                .writeTimeout(timeoutSeconds, TimeUnit.SECONDS);

        if(sslSocketFactory != null){
            clientBuilder.sslSocketFactory(sslSocketFactory);
        }
        if (sslPinning != null) {
            CertificatePinner certificatePinner = createCertificatePinner();
            clientBuilder.certificatePinner(certificatePinner);
        }

        OkHttpClient client = clientBuilder.build();
        Request request = new Request.Builder().url(url).build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException();
        }
        return response.body().byteStream();
    }
    
    public InputStream downloadSecure(String url) throws ApiException, IOException{

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                .readTimeout(timeoutSeconds, TimeUnit.SECONDS)
                .writeTimeout(timeoutSeconds, TimeUnit.SECONDS)
                .connectionPool(connectionPool);

        if (tokenProvider != null) {
            String accessToken = tokenProvider.getRefreshToken(); // Refresh token if needed
            if (accessToken != null) {
                clientBuilder.addInterceptor(new AuthorizationInterceptor(accessToken));
            }
        } else if (consumerKey != null && consumerSecret != null) {
            OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(consumerKey, consumerSecret);
            if (token != null && tokenSecret != null) {
                consumer.setTokenWithSecret(token, tokenSecret);
            }
            clientBuilder.addInterceptor(new SigningInterceptor(consumer));
        }

        if(sslSocketFactory != null){
            clientBuilder.sslSocketFactory(sslSocketFactory);
        }
        if (sslPinning != null) {
            CertificatePinner certificatePinner = createCertificatePinner();
            clientBuilder.certificatePinner(certificatePinner);
        }

        OkHttpClient client = clientBuilder.build();
        Request request = new Request.Builder().url(url).build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException();
        }
        return response.body().byteStream();
    }

  private String invokeAPI_(String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType) throws ApiException, IOException {
    
	OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
            .connectTimeout(connectTimeout, TimeUnit.SECONDS)
            .readTimeout(timeoutSeconds, TimeUnit.SECONDS)
            .writeTimeout(timeoutSeconds, TimeUnit.SECONDS)
            .connectionPool(connectionPool);

    if (tokenProvider != null) {
        String accessToken = tokenProvider.getRefreshToken(); // Refresh token if needed
        if (accessToken != null) {
            clientBuilder.addInterceptor(new AuthorizationInterceptor(accessToken));
        }
    } else if (consumerKey != null && consumerSecret != null) {
        OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(consumerKey, consumerSecret);
        if (token != null && tokenSecret != null) {
            consumer.setTokenWithSecret(token, tokenSecret);
        }
        clientBuilder.addInterceptor(new SigningInterceptor(consumer));
    }

    if(sslSocketFactory != null){
    	clientBuilder.sslSocketFactory(sslSocketFactory);
    }
      if (sslPinning != null) {
          CertificatePinner certificatePinner = createCertificatePinner();
          clientBuilder.certificatePinner(certificatePinner);
      }

    OkHttpClient client = clientBuilder.build();

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

    Request request = null;
    Response response = null;
      	if("GET".equals(method)) {
            Request.Builder builder = new Request.Builder();
            builder.url(url);
            builder.header("Accept", "application/json");
            for(String key : headers.keySet()) {
                builder.addHeader(key, headers.get(key));
            }
            request = builder.build();

        } else if ("POST".equals(method)) {

            Request.Builder builder = new Request.Builder();
            builder.url(url);
            for(String key : headers.keySet()) {
                builder.addHeader(key, headers.get(key));
            }

			RequestBody requestBody = null;
            if (body != null && !(body instanceof MultipartBody.Builder)) {
                // BODY JSON
                MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                requestBody = RequestBody.create(JSON, serialize(body));
            } else if (body != null && body instanceof MultipartBody.Builder) {
                // BODY MULTIPART
                requestBody = ((MultipartBody.Builder)body).build();
            } else if (formParams != null && "application/x-www-form-urlencoded".equals(contentType)) {
                // BODY FORM
                FormBody.Builder fbuilder = new FormBody.Builder();
                for (Map.Entry<String, String> param : formParams.entrySet())
                {
                    fbuilder.add(param.getKey(), param.getValue());
                }
                requestBody = fbuilder.build();
            } else {
                requestBody = RequestBody.create(null, new byte[0]);
            }
            
            if (requestBody != null) {
            	builder.post(requestBody);
            }
			request = builder.build();
        }
        else if ("PUT".equals(method)) {
            Request.Builder builder = new Request.Builder();
            builder.url(url);
            for(String key : headers.keySet()) {
                builder.addHeader(key, headers.get(key));
            }

			RequestBody requestBody = null;
            if (body != null && !(body instanceof MultipartBody.Builder)) {
                // BODY JSON
                MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                requestBody = RequestBody.create(JSON, serialize(body));
            } else if (body != null && body instanceof MultipartBody.Builder) {
                // BODY MULTIPART
				requestBody = ((MultipartBody.Builder)body).build();
            } else if (formParams != null && "application/x-www-form-urlencoded".equals(contentType)) {
                // BODY FORM
                FormBody.Builder fbuilder = new FormBody.Builder();
                for (Map.Entry<String, String> param : formParams.entrySet())
                {
                    fbuilder.add(param.getKey(), param.getValue());
                }
                requestBody = fbuilder.build();
            } else {
                requestBody = RequestBody.create(null, new byte[0]);
            }
            
            if (requestBody != null) {
            	builder.put(requestBody);
            }
            request = builder.build();
            
        } else if ("DELETE".equals(method)) {
            Request.Builder builder = new Request.Builder();
            builder.url(url);
            for(String key : headers.keySet()) {
                builder.addHeader(key, headers.get(key));
            }
            builder.delete();
            request = builder.build();
        } else if ("PATCH".equals(method)) {
            Request.Builder builder = new Request.Builder();
            builder.url(url);
            for(String key : headers.keySet()) {
                builder.addHeader(key, headers.get(key));
            }

            RequestBody requestBody = null;
            if (body != null && !(body instanceof MultipartBody.Builder)) {
                // BODY JSON
                MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                requestBody = RequestBody.create(JSON, serialize(body));
            } else if (body != null && body instanceof MultipartBody.Builder) {
                // BODY MULTIPART
                requestBody = ((MultipartBody.Builder)body).build();
            } else if (formParams != null && "application/x-www-form-urlencoded".equals(contentType)) {
                // BODY FORM
                FormBody.Builder fbuilder = new FormBody.Builder();
                for (Map.Entry<String, String> param : formParams.entrySet())
                {
                    fbuilder.add(param.getKey(), param.getValue());
                }
                requestBody = fbuilder.build();
            } else {
                requestBody = RequestBody.create(null, new byte[0]);
            }
            
            if (requestBody != null) {
            	builder.patch(requestBody);
            }
            request = builder.build();
        }

        response = client.newCall(request).execute();

      	int code = response.code();
      	String responseString = null;
      	if(code == 204) { 
        	responseString = "";
		} else if(code >= 200 && code < 300) {
 			responseString = response.body().string();
      	} else {
        	responseString = response.body().string();
            throw new ApiException(code, responseString);
		}
		return responseString;		
  }
  
  private X509TrustManager trustManagerForCertificates(InputStream is, String keystorePassword)
            throws GeneralSecurityException, IOException {
        // Use it to build an X509 trust manager.
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(is,keystorePassword.toCharArray());
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
                TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            throw new IllegalStateException("Unexpected default trust managers:"
                    + Arrays.toString(trustManagers));
        }
        return (X509TrustManager) trustManagers[0];
    }
    
    private X509TrustManager defaultTrustManagerForCertificates() throws GeneralSecurityException, IOException {
        // Use it to build an X509 trust manager.
        KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
        keyStore.load(null, null); //Load default system keystore
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
                TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            throw new IllegalStateException("Unexpected default trust managers:"
                    + Arrays.toString(trustManagers));
        }
        return (X509TrustManager) trustManagers[0];
    }

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
