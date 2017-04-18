package com.mobilabsolutions.imgurclient.features.home.contract;

import com.mobilabsolutions.imgurclient.base.MvpView;
import com.mobilabsolutions.imgurclient.model.ImgurDataFilter;
import com.mobilabsolutions.imgurclient.model.ImgurResults;

public interface HomeContract {

    interface HomeView extends MvpView {

        void showList(ImgurResults imgurResults);
        void addList(ImgurResults imgurResults);

        void showProgressBar();
        void hideProgressBar();

    }

    interface HomePresenter {

        void loadImages(ImgurDataFilter filter);
        void loadImages(ImgurDataFilter filter, Integer page);

    }
}
