package com.viafirma.mobile.services.android;

public interface OAuth2TokenProvider {
    String getRefreshToken() throws ApiException;
}
