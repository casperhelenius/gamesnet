package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public class LogEntry extends BaseEntity {
    private String event;
    private String details;
    private String severity;

    public LogEntry() {
    }

    public LogEntry(String entityId, Date created, String createdBy, String event, String details, String severity) {
        super(entityId, created, createdBy);
        this.event = event;
        this.details = details;
        this.severity = severity;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
