package com.mobilabsolutions.imgurclient.features.home.view;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mobilabsolutions.imgurclient.ImgurClientApplication;
import com.mobilabsolutions.imgurclient.RxSchedulersOverrideRule;
import com.mobilabsolutions.imgurclient.di.TestRestApiComponent;
import com.mobilabsolutions.imgurclient.remote.Service;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Inject
    Service service;

    @Rule
    public RxSchedulersOverrideRule rule = new RxSchedulersOverrideRule();

    @Rule
    public ActivityTestRule<HomeActivity> main =
            new ActivityTestRule<>(HomeActivity.class, true, false);

    @Before
    public void setup() throws Exception {

        ImgurClientApplication application = (ImgurClientApplication)
                InstrumentationRegistry.getTargetContext().getApplicationContext();

        TestRestApiComponent components = (TestRestApiComponent) application.components();
        components.inject(this);

    }

    @Test
    public void showList() throws Exception {

    }

}