package com.mobilabsolutions.imgurclient.di;


import com.mobilabsolutions.imgurclient.ImgurClientApplication;
import com.mobilabsolutions.imgurclient.di.components.RestApiComponent;

public class MockImgurClientApplication extends ImgurClientApplication {

    @Override
    public RestApiComponent components() {
        return DaggerTestRestApiComponent.builder().build();
    }
}
