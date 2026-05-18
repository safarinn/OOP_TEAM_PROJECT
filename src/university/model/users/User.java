package university.model.users;

import university.enums.UserRole;

import java.io.Serializable;
import java.util.Objects;

public abstract class User implements Serializable {

    private static final long serialVersionUID = 100L;
    
    protected String id;
    protected String login;
    protected String password;
    protected String name;
    protected String email;
    protected UserRole role;

    public User(String id, String login, String password, String name, String email, UserRole role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public boolean login(String pw) {
        return pw.equals(password);
    }

    public void logout() {
        // сессия управляется в AuthenticationService
    }

    public String getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public UserRole getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(name, user.name) && Objects.equals(email, user.email) && role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, name, email, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
