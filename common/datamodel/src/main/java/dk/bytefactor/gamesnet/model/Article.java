package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public class Article extends Publishable {
    private String title;
    private String[] contents;
    private Media image;

    public Article() {
    }

    public Article(String entityId, Date created, String createdBy, String category, String gallery, Tag[] tags, Comment[] comments, Date publishDate, String title, String[] contents, Media image) {
        super(entityId, created, createdBy, category, gallery, tags, comments, publishDate);
        this.title = title;
        this.contents = contents;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getContents() {
        return contents;
    }

    public void setContents(String[] contents) {
        this.contents = contents;
    }

    public Media getImage() {
        return image;
    }

    public void setImage(Media image) {
        this.image = image;
    }
}
