package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public class Tag extends BaseEntity {
    private String tag;

    public Tag() {
    }

    public Tag(String entityId, Date created, String createdBy, String tag) {
        super(entityId, created, createdBy);
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
