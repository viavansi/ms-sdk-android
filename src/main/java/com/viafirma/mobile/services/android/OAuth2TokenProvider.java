package com.viafirma.mobile.services.android;

import java.io.IOException;

public interface OAuth2TokenProvider {
    String getRefreshToken() throws IOException;
}
