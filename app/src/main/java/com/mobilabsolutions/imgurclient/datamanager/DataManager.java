package com.mobilabsolutions.imgurclient.datamanager;


import com.mobilabsolutions.imgurclient.model.ImgurData;
import com.mobilabsolutions.imgurclient.model.ImgurDataFilter;
import com.mobilabsolutions.imgurclient.model.ImgurResults;
import com.mobilabsolutions.imgurclient.remote.Service;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.functions.Func0;
import rx.functions.Func1;

public class DataManager {

    private final Service service;

    private final Integer page = 0 ;

    @Inject
    public DataManager(Service service) {
        this.service = service;
    }

    public Observable<ImgurResults> fetchImgurData(final ImgurDataFilter filter){
        return fetchImgurData(filter, page);
    }

    public Observable<ImgurResults> fetchImgurData(final ImgurDataFilter filter, final Integer page){
        return Observable.defer(new Func0<Observable<ImgurResults>>() {
            @Override
            public Observable<ImgurResults> call() {
                String section = filter.getSection().getValue();
                String sort = filter.getSort().getValue();
                String window = filter.getWindow().getValue();
                boolean showViral = filter.isShowViral();
                return service.fetchImgurImagesWith(section, sort, window, page, showViral)
                        .flatMapIterable(new Func1<ImgurResults, Iterable<ImgurData>>() {
                            @Override
                            public Iterable<ImgurData> call(ImgurResults imgurResults) {
                                return imgurResults.getData();
                            }
                        })
                        .filter(new Func1<ImgurData, Boolean>() {
                            @Override
                            public Boolean call(ImgurData imgurData) {
                                return !imgurData.isAlbum();
                            }
                        })
                        .toList()
                        .map(new Func1<List<ImgurData>, ImgurResults>() {
                            @Override
                            public ImgurResults call(List<ImgurData> imgurDataList) {
                                ImgurResults imgurResults = new ImgurResults();
                                imgurResults.setData(imgurDataList);
                                return imgurResults;
                            }
                        });
            }
        });
    }




}
