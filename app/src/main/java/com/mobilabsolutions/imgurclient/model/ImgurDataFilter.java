package com.mobilabsolutions.imgurclient.model;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ImgurDataFilter {

    private Section section;
    private Sort sort;
    private Window window;

    private boolean showViral;

    @Inject
    public ImgurDataFilter() {
        section = Section.HOT;
        sort = Sort.VIRAL;
        window = Window.DAY;
        showViral = false;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public boolean isShowViral() {
        return showViral;
    }

    public void setShowViral(boolean showViral) {
        this.showViral = showViral;
    }

    @Override
    public String toString() {
        return "ImgurDataFilter{" +
                "section=" + section +
                ", sort=" + sort +
                ", window=" + window +
                ", showViral=" + showViral +
                '}';
    }
}
