package com.mobilabsolutions.imgurclient.di.modules;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mobilabsolutions.imgurclient.remote.Service;
import com.mobilabsolutions.imgurclient.util.RequestInterceptor;
import com.mobilabsolutions.imgurclient.util.RxErrorHandlingCallAdapterFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RestApiModule {

    private static final String BASE_URL = "https://api.imgur.com/3/";

    @Provides
    @Singleton
    Service service() {

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(httpLoggingInterceptor);

        httpClient.addInterceptor(new RequestInterceptor());

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .client(httpClient.build())
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .addCallAdapterFactory(RxErrorHandlingCallAdapterFactory.create())
                        .build();

        return retrofit.create(Service.class);
    }

}
