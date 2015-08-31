package dk.bytefactor.gamesnet.model;

import java.util.Date;

/**
 * Created by Casper on 31-08-2015.
 */
public class User extends BaseEntity {
    private String login;
    private String password;
    private String email;
    private Date activated;
    private UserRole role;

    public User() {
    }

    public User(String entityId, Date created, String createdBy, String login, String password, String email, Date activated, UserRole role) {
        super(entityId, created, createdBy);
        this.login = login;
        this.password = password;
        this.email = email;
        this.activated = activated;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getActivated() {
        return activated;
    }

    public void setActivated(Date activated) {
        this.activated = activated;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
