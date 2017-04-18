package com.mobilabsolutions.imgurclient.features.home.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobilabsolutions.imgurclient.R;
import com.mobilabsolutions.imgurclient.model.ImgurResults;

public class ImgurDataStaggeredAdapter extends ImgurAbstractDataAdapter {

    public ImgurDataStaggeredAdapter(HomeActivity homeActivity, ImgurResults imgurResults) {
        super(homeActivity, imgurResults);
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.acitivity_main_imgur_item_staggered, parent, false);

        return new MovieViewHolder(view);
    }

}
