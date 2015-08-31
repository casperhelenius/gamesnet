package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public abstract class BaseEntity {
    private String entityId;
    private Date created;
    private String createdBy;

    public BaseEntity() {
    }

    public BaseEntity(String entityId, Date created, String createdBy) {
        this.entityId = entityId;
        this.created = created;
        this.createdBy = createdBy;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
