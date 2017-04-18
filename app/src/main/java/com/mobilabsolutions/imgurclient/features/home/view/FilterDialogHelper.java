package com.mobilabsolutions.imgurclient.features.home.view;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.mobilabsolutions.imgurclient.ImgurClientApplication;
import com.mobilabsolutions.imgurclient.R;
import com.mobilabsolutions.imgurclient.model.ImgurDataFilter;
import com.mobilabsolutions.imgurclient.model.Section;
import com.mobilabsolutions.imgurclient.model.Sort;
import com.mobilabsolutions.imgurclient.model.Window;

import javax.inject.Inject;

public class FilterDialogHelper {

    private Context context;

    @Inject
    ImgurDataFilter imgurDataFilter;

    private FilterListener listener;

    public FilterDialogHelper(Context context, FilterListener listener) {

        ((ImgurClientApplication) context.getApplicationContext()).components().inject(this);

        this.context = context;
        this.listener = listener;
    }

    public void show() {
        MaterialDialog dialog = new MaterialDialog.Builder(context)
                .title(R.string.filter_dialog_title)
                .customView(R.layout.dialog_custom_view, true)
                .positiveText(R.string.filter_dialog_go)
                .negativeText(R.string.filter_dialog_cancel)
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        listener.onFilterChoosed(imgurDataFilter);
                    }
                })
                .build();

        registerFieldsListener(dialog);

        dialog.show();
    }

    private void registerFieldsListener(MaterialDialog dialog) {
        final RadioGroup sectionRg = (RadioGroup) dialog.getCustomView().findViewById(R.id.section_rg);
        sectionRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                setImgurDataFilterSection(checkedId);
            }
        });

        final RadioGroup sortRg = (RadioGroup) dialog.getCustomView().findViewById(R.id.sort_rg);
        sortRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                setImgurDataFilterSort(checkedId);
            }
        });

        final RadioGroup windowRg = (RadioGroup) dialog.getCustomView().findViewById(R.id.window_rg);
        windowRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                setImgurDataFilterWindow(checkedId);
            }
        });

        CheckBox checkBox = (CheckBox) dialog.getCustomView().findViewById(R.id.checkbox_show_viral);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                imgurDataFilter.setShowViral(isChecked);
            }
        });
    }

    private void setImgurDataFilterWindow(int checkedId) {
        if ( checkedId == R.id.window_day ) {
            imgurDataFilter.setWindow(Window.DAY);
        }else if ( checkedId == R.id.window_week ) {
            imgurDataFilter.setWindow(Window.WEEK);
        } else if ( checkedId == R.id.window_month ) {
            imgurDataFilter.setWindow(Window.MONTH);
        }
    }

    private void setImgurDataFilterSort(int checkedId) {
        if ( checkedId == R.id.sort_viral ) {
            imgurDataFilter.setSort(Sort.VIRAL);
        }else if ( checkedId == R.id.sort_top ) {
            imgurDataFilter.setSort(Sort.TOP);
        } else if ( checkedId == R.id.sort_time ) {
            imgurDataFilter.setSort(Sort.TIME);
        }
    }

    private void setImgurDataFilterSection(@IdRes int checkedId) {
        if ( checkedId == R.id.section_hot ) {
            imgurDataFilter.setSection(Section.HOT);
        }else if( checkedId == R.id.section_top ) {
            imgurDataFilter.setSection(Section.TOP);
        }else if ( checkedId == R.id.section_user ) {
            imgurDataFilter.setSection(Section.USER);
        }
    }

    interface FilterListener {
        void onFilterChoosed(ImgurDataFilter imgurDataFilter);
    }
}
