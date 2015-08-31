package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public class Category extends BaseEntity {
    private String category;
    private String parent;

    public Category() {
    }

    public Category(String entityId, Date created, String createdBy, String category, String parent) {
        super(entityId, created, createdBy);
        this.category = category;
        this.parent = parent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
