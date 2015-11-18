package com.viafirma.mobile.services.android;

public class ApiException extends Exception {
  int code = 0;
  String message = null;

  public ApiException() {}

    public ApiException(int code, String message) {
    super(message);
    this.code = code;
    this.message = cause.getMessage();
  }
  
  public ApiException(int code, Throwable cause) {
    super(cause);
    this.code = code;
    this.message = cause.getMessage();
  }

  public ApiException(int code, String message, Throwable cause) {
    super(message, cause);
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }
  
  public void setCode(int code) {
    this.code = code;
  }
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
}