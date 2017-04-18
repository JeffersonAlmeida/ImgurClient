package com.mobilabsolutions.imgurclient.base;

public interface MvpPresenter <T extends MvpView> {

    void attachView(T view);
    void detachView();

}
