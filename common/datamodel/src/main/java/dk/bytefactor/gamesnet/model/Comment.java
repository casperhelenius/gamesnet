package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public class Comment extends BaseEntity {
    private String replyTo;
    private String content;
    private boolean moderated;
    private String moderatedBy;

    public Comment() {
    }

    public Comment(String entityId, Date created, String createdBy, String replyTo, String content, boolean moderated, String moderatedBy) {
        super(entityId, created, createdBy);
        this.replyTo = replyTo;
        this.content = content;
        this.moderated = moderated;
        this.moderatedBy = moderatedBy;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isModerated() {
        return moderated;
    }

    public void setModerated(boolean moderated) {
        this.moderated = moderated;
    }

    public String getModeratedBy() {
        return moderatedBy;
    }

    public void setModeratedBy(String moderatedBy) {
        this.moderatedBy = moderatedBy;
    }
}
