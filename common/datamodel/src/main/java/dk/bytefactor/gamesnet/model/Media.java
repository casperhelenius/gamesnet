package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public class Media extends Publishable {
    private String url;
    private String thumbnailUrl;
    private String linkTo;
    private boolean targetBlank;

    public Media() {
    }

    public Media(String entityId, Date created, String createdBy, String category, String gallery, Tag[] tags, Comment[] comments, Date publishDate, String url, String thumbnailUrl, String linkTo, boolean targetBlank) {
        super(entityId, created, createdBy, category, gallery, tags, comments, publishDate);
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
        this.linkTo = linkTo;
        this.targetBlank = targetBlank;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getLinkTo() {
        return linkTo;
    }

    public void setLinkTo(String linkTo) {
        this.linkTo = linkTo;
    }

    public boolean isTargetBlank() {
        return targetBlank;
    }

    public void setTargetBlank(boolean targetBlank) {
        this.targetBlank = targetBlank;
    }
}
