package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public abstract class Publishable extends BaseEntity {
    private String category;
    private String gallery;
    private Tag[] tags;
    private Comment[] comments;
    private Date publishDate;

    public Publishable() {
    }

    public Publishable(String entityId, Date created, String createdBy, String category, String gallery, Tag[] tags, Comment[] comments, Date publishDate) {
        super(entityId, created, createdBy);
        this.category = category;
        this.gallery = gallery;
        this.tags = tags;
        this.comments = comments;
        this.publishDate = publishDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public Tag[] getTags() {
        return tags;
    }

    public void setTags(Tag[] tags) {
        this.tags = tags;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
