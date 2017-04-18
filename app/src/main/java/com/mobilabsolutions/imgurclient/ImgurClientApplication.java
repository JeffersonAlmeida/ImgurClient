package com.mobilabsolutions.imgurclient;


import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.mobilabsolutions.imgurclient.di.components.DaggerRestApiComponent;
import com.mobilabsolutions.imgurclient.di.components.RestApiComponent;

public class ImgurClientApplication extends Application {

    private RestApiComponent restApiComponent;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        restApiComponent = DaggerRestApiComponent.builder().build();
    }

    public RestApiComponent components() {
        return restApiComponent;
    }
}
