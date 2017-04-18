package com.mobilabsolutions.imgurclient.remote;


import com.mobilabsolutions.imgurclient.model.ImgurResults;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface Service {

    @GET("gallery/{section}/{sort}/{window}/{page}.json")
    Observable<ImgurResults>  fetchImgurImagesWith(@Path("section") String section,
                                                   @Path("sort") String sort,
                                                   @Path("window") String window,
                                                   @Path("page") Integer page,
                                                   @Query("showViral") boolean bool);}
