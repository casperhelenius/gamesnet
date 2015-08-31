package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public class Gallery extends Publishable {
    private String name;
    private Media[] media;

    public Gallery() {
    }

    public Gallery(String entityId, Date created, String createdBy, String category, String gallery, Tag[] tags, Comment[] comments, Date publishDate, String name, Media[] media) {
        super(entityId, created, createdBy, category, gallery, tags, comments, publishDate);
        this.name = name;
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Media[] getMedia() {
        return media;
    }

    public void setMedia(Media[] media) {
        this.media = media;
    }
}
