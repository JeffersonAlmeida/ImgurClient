package com.mobilabsolutions.imgurclient.di.components;

import com.mobilabsolutions.imgurclient.di.modules.RestApiModule;
import com.mobilabsolutions.imgurclient.features.home.view.FilterDialogHelper;
import com.mobilabsolutions.imgurclient.features.home.view.HomeActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component ( modules = RestApiModule.class )
public interface RestApiComponent {

    void inject(HomeActivity homeActivity);
    void inject(FilterDialogHelper filterDialogHelper);

}
