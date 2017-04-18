package com.mobilabsolutions.imgurclient.features.home.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.mobilabsolutions.imgurclient.BuildConfig;
import com.mobilabsolutions.imgurclient.ImgurClientApplication;
import com.mobilabsolutions.imgurclient.R;
import com.mobilabsolutions.imgurclient.features.home.contract.HomeContract;
import com.mobilabsolutions.imgurclient.features.home.presenter.HomePresenterImpl;
import com.mobilabsolutions.imgurclient.model.ImgurDataFilter;
import com.mobilabsolutions.imgurclient.model.ImgurResults;
import com.mobilabsolutions.imgurclient.util.EndlessRecyclerViewScrollListener;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.mobilabsolutions.imgurclient.util.Constants.NAVIGATION_VIEW;

public class HomeActivity extends AppCompatActivity
        implements HomeContract.HomeView, FilterDialogHelper.FilterListener {

    @Inject
    HomePresenterImpl homePresenter;

    @Inject
    ImgurDataFilter imgurDataFilter;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.navigation)
    BottomNavigationView bottomNavigationView;

    private ImgurAbstractDataAdapter adapter;

    private ImgurResults imgurResults;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.linear:
                    onClickLinearItem();
                    return true;
                case R.id.grid:
                    onClickGridItem();
                    return true;
                case R.id.staggered:
                    onClickStaggeredItem();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        ((ImgurClientApplication) getApplication()).components().inject(this);

        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        adapter = new ImgurDataLinearAdapter(HomeActivity.this);
        recyclerView.setAdapter(adapter);

        if ( savedInstanceState != null ) {
            int navigationViewSelectedItem = (int) savedInstanceState.get(NAVIGATION_VIEW);
            bottomNavigationView.setSelectedItemId(navigationViewSelectedItem);
        }else {
            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            scrollListener.setmLayoutManager(layoutManager);
            recyclerView.addOnScrollListener(scrollListener);
            recyclerView.setLayoutManager(layoutManager);
        }

        homePresenter.attachView(this);
        homePresenter.loadImages(imgurDataFilter);

    }

    private EndlessRecyclerViewScrollListener scrollListener = new EndlessRecyclerViewScrollListener() {
        @Override
        public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
            homePresenter.loadImages(imgurDataFilter, page);
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        homePresenter.detachView();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        int selectedItemId = bottomNavigationView.getSelectedItemId();
        outState.putInt(NAVIGATION_VIEW, selectedItemId);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if ( itemId == R.id.action_filter ){
            openFilterDialog();
        }else if ( itemId == R.id.action_about ){
            openAboutDialog();
        }
        return super.onOptionsItemSelected(item);
    }

    private void openAboutDialog() {

        String versionName = BuildConfig.VERSION_NAME;
        String developer = getString(R.string.dev);
        String aboutString = getString(R.string.about);
        String about = String.format(aboutString, developer, versionName);

        MaterialDialog dialog = new MaterialDialog.Builder(this)
                .title(R.string.home_activity_about)
                .content(about)
                .positiveText(R.string.home_activity_nice)
                .build();

        dialog.show();
    }

    private void openFilterDialog() {
        new FilterDialogHelper(this, this).show();
    }


    private void onClickStaggeredItem() {
        adapter = new ImgurDataStaggeredAdapter(HomeActivity.this, imgurResults);
        recyclerView.setAdapter(adapter);
        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        scrollListener.setmLayoutManager(staggeredGridLayoutManager);
        scrollListener.resetState();
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
    }

    private void onClickGridItem() {
        adapter = new ImgurDataGridAdapter(HomeActivity.this, imgurResults);
        recyclerView.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(HomeActivity.this, 2);
        scrollListener.setmLayoutManager(layoutManager);
        scrollListener.resetState();
        recyclerView.setLayoutManager(layoutManager);
    }

    private void onClickLinearItem() {
        adapter = new ImgurDataLinearAdapter(HomeActivity.this, imgurResults);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(HomeActivity.this);
        scrollListener.setmLayoutManager(layoutManager);
        scrollListener.resetState();
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void showList(ImgurResults imgurResults) {
        this.imgurResults = imgurResults;
        adapter.setImgurResults(this.imgurResults);
    }

    @Override
    public void addList(ImgurResults imgurResults) {
        this.imgurResults.getData().addAll(imgurResults.getData());
        adapter.setImgurResults(this.imgurResults);
    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onFilterChoosed(ImgurDataFilter imgurDataFilter) {
        homePresenter.loadImages(imgurDataFilter);
    }
}
