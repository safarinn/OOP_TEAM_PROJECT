package university.model.users;

import university.enums.UserRole;
import university.services.AuthenticationService;
import university.services.Log;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {

    private AuthenticationService authService;
    private List<Log> logs = new ArrayList<>();

    public Admin(String id, String login, String password, String name, String email,
                 AuthenticationService authService) {
        super(id, login, password, name, email, UserRole.ADMIN);
        this.authService = authService;
    }

    public void addUser(User u) {
        authService.registerUser(u);
        logs.add(new Log(this, "Added user: " + u.getLogin()));
    }

    public void removeUser(String id) {
        authService.removeUser(id);
        logs.add(new Log(this, "Removed user with id: " + id));
    }

    public void updateUser(User u) {
        authService.updateUser(u);
        logs.add(new Log(this, "Updated user: " + u.getLogin()));
    }

    public List<Log> viewLogs() {
        return logs;
    }
}
