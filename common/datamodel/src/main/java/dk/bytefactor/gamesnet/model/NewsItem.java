package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public class NewsItem extends Publishable {
    private String title;
    private String content;
    private Media image;

    public NewsItem() {
    }

    public NewsItem(String entityId, Date created, String createdBy, String category, String gallery, Tag[] tags, Comment[] comments, Date publishDate, String title, String content, Media image) {
        super(entityId, created, createdBy, category, gallery, tags, comments, publishDate);
        this.title = title;
        this.content = content;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Media getImage() {
        return image;
    }

    public void setImage(Media image) {
        this.image = image;
    }
}
