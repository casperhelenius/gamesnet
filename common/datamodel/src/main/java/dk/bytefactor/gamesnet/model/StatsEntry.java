package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public class StatsEntry extends BaseEntity {
    private String item;
    private String itemType;
    private String action;

    public StatsEntry() {
    }

    public StatsEntry(String entityId, Date created, String createdBy, String item, String itemType, String action) {
        super(entityId, created, createdBy);
        this.item = item;
        this.itemType = itemType;
        this.action = action;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
