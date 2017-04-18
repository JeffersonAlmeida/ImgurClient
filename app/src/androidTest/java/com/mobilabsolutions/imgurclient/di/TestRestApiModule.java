package com.mobilabsolutions.imgurclient.di;

import com.mobilabsolutions.imgurclient.mocks.MockService;
import com.mobilabsolutions.imgurclient.remote.Service;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class TestRestApiModule {

    @Provides
    @Singleton
    Service service(){
        return new MockService();
    }
}
