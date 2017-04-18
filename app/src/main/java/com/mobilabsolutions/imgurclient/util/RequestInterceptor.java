package com.mobilabsolutions.imgurclient.util;

import com.mobilabsolutions.imgurclient.BuildConfig;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RequestInterceptor implements Interceptor {

    private static final String AUTHORIZATION = "Authorization";
    private static final String CLIENT_ID = " Client-Id ";

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request originalRequest = chain.request();

        Request.Builder builder = originalRequest
                .newBuilder()
                .addHeader(AUTHORIZATION,  CLIENT_ID + BuildConfig.CLIENT_ID);

        Request newRequest = builder.build();

        return chain.proceed(newRequest);
    }
}
