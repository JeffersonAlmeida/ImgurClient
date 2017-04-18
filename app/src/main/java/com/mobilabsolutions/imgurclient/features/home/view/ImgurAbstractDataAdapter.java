package com.mobilabsolutions.imgurclient.features.home.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mobilabsolutions.imgurclient.R;
import com.mobilabsolutions.imgurclient.features.details.view.ImgurDetailsActivity;
import com.mobilabsolutions.imgurclient.model.ImgurData;
import com.mobilabsolutions.imgurclient.model.ImgurResults;

import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class ImgurAbstractDataAdapter
        extends RecyclerView.Adapter<ImgurAbstractDataAdapter.MovieViewHolder> {

    private ImgurResults imgurResults;

    private Context context;

    public ImgurAbstractDataAdapter(Context context) {
        imgurResults = new ImgurResults();
        this.context = context;
    }

    public ImgurAbstractDataAdapter(Context context, ImgurResults imgurResults) {
        this.context = context;
        this.imgurResults = imgurResults;
    }

    public void setImgurResults(ImgurResults imgurResults) {
        this.imgurResults = imgurResults;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {

        final ImgurData imgurData = imgurResults.getData().get(position);

        String link = imgurData.getLink();
        Glide.with(context)
                .load(link)
                .centerCrop()
                .crossFade()
                .into(holder.imageItem);

        String title = imgurData.getTitle();
        holder.text.setText(title);

        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImgurDetailsActivity.start(context, imgurData);
            }
        });

    }

    @Override
    public int getItemCount() {
        return imgurResults != null &&
                imgurResults.getData() != null ? imgurResults.getData().size() : 0;
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.container_item)
        View container;

        @BindView(R.id.image_item)
        ImageView imageItem;

        @BindView(R.id.text)
        TextView text;

        public MovieViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
