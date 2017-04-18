package com.mobilabsolutions.imgurclient.features.home.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobilabsolutions.imgurclient.R;
import com.mobilabsolutions.imgurclient.model.ImgurResults;

public class ImgurDataLinearAdapter extends ImgurAbstractDataAdapter {

    public ImgurDataLinearAdapter(Context context) {
        super(context);
    }

    public ImgurDataLinearAdapter(Context context, ImgurResults imgurResults) {
        super(context, imgurResults);
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.acitivity_main_imgur_item_linear, parent, false);

        return new MovieViewHolder(view);
    }

}
