package com.mobilabsolutions.imgurclient.model;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ImgurData implements Serializable {

    private String id;
    private String title;
    private String description;
    private String link;

    @SerializedName("is_album")
    private boolean isAlbum;

    @SerializedName("ups")
    private String ups;

    @SerializedName("downs")
    private String downs;

    @SerializedName("score")
    private String score;

    public ImgurData(String link) {
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isAlbum() {
        return isAlbum;
    }

    public void setAlbum(boolean album) {
        isAlbum = album;
    }

    public String getUps() {
        return ups;
    }

    public void setUps(String ups) {
        this.ups = ups;
    }

    public String getDowns() {
        return downs;
    }

    public void setDowns(String downs) {
        this.downs = downs;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
