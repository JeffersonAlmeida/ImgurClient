package com.mobilabsolutions.imgurclient.features.home.presenter;

import com.mobilabsolutions.imgurclient.base.BasePresenter;
import com.mobilabsolutions.imgurclient.datamanager.DataManager;
import com.mobilabsolutions.imgurclient.features.home.contract.HomeContract.HomePresenter;
import com.mobilabsolutions.imgurclient.features.home.contract.HomeContract.HomeView;
import com.mobilabsolutions.imgurclient.model.ImgurDataFilter;
import com.mobilabsolutions.imgurclient.model.ImgurResults;

import javax.inject.Inject;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class HomePresenterImpl
        extends BasePresenter<HomeView> implements HomePresenter {

    private final DataManager dataManager;

    @Inject
    public HomePresenterImpl(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public void loadImages(ImgurDataFilter filter) {
        getView().showProgressBar();
        dataManager.fetchImgurData(filter)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<ImgurResults>() {
                    @Override
                    public void onCompleted() {
                        getView().hideProgressBar();
                    }

                    @Override
                    public void onError(Throwable e) {
                        getView().hideProgressBar();
                    }

                    @Override
                    public void onNext(ImgurResults imgurResults) {
                        getView().showList(imgurResults);
                    }
                });
    }

    @Override
    public void loadImages(ImgurDataFilter filter, Integer page) {
        getView().showProgressBar();
        dataManager.fetchImgurData(filter, page)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<ImgurResults>() {
                    @Override
                    public void onCompleted() {
                        getView().hideProgressBar();
                    }

                    @Override
                    public void onError(Throwable e) {
                        getView().hideProgressBar();
                    }

                    @Override
                    public void onNext(ImgurResults imgurResults) {
                        getView().addList(imgurResults);
                    }
                });
    }

}
