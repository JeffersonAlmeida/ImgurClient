package com.mobilabsolutions.imgurclient.di;

import com.mobilabsolutions.imgurclient.di.components.RestApiComponent;
import com.mobilabsolutions.imgurclient.features.home.view.MainActivityTest;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component ( modules = TestRestApiModule.class )
public interface TestRestApiComponent extends RestApiComponent {

    void inject(MainActivityTest mainActivity);

}
