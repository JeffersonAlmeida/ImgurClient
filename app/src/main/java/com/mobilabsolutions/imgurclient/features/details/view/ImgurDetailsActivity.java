package com.mobilabsolutions.imgurclient.features.details.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mobilabsolutions.imgurclient.R;
import com.mobilabsolutions.imgurclient.model.ImgurData;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.mobilabsolutions.imgurclient.util.Constants.IMGUR_DATA;

public class ImgurDetailsActivity extends AppCompatActivity {

    @BindView(R.id.image)
    ImageView image;

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.description)
    TextView description;

    @BindView(R.id.up)
    TextView up;

    @BindView(R.id.down)
    TextView down;

    @BindView(R.id.score)
    TextView score;

    public static void start(Context context, ImgurData imgurData) {
        Intent starter = new Intent(context, ImgurDetailsActivity.class);
        starter.putExtra(IMGUR_DATA, imgurData);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imgur_details);
        ButterKnife.bind(this);

        ImgurData imgurData = (ImgurData) getIntent().getSerializableExtra(IMGUR_DATA);

        Glide.with(this)
                .load(imgurData.getLink())
                .centerCrop()
                .crossFade()
                .into(image);

        title.setText(imgurData.getTitle());
        description.setText(imgurData.getDescription());

        up.setText(imgurData.getUps());
        down.setText(imgurData.getDowns());
        score.setText(imgurData.getScore());

    }
}
