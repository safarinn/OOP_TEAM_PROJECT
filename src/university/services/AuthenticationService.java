package university.services;

import university.exceptions.AuthenticationException;
import university.model.users.User;

import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * TODO [Артем]: Реализовать класс AuthenticationService
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать users (Map<String, User>), currentUser = null
 *  2. login(login, pw) — найти пользователя по login в users,
 *     вызвать user.login(pw), если неверно — бросить AuthenticationException
 *     Сохранить currentUser и вернуть его
 *  3. logout() — вызвать currentUser.logout(), обнулить currentUser
 *  4. registerUser(u) — добавить пользователя в users по ключу u.getLogin()
 *  5. getCurrentUser() — геттер
 *
 * ДОБАВИТЬ [Артем] — нужно для Admin:
 *  6. removeUser(id) — удалить пользователя из users по id
 *  7. updateUser(u) — обновить пользователя в users (ключ u.getLogin())
 *  8. getUsers() — вернуть всю Map<String, User>
 * ============================================================
 */
public class AuthenticationService {

    private User currentUser;
    private Map<String, User> users;

    public AuthenticationService() {
        users = new HashMap<>();
        currentUser = null;
    }

    public User login(String login, String pw) throws AuthenticationException {
        User user = users.get(login);
        if (user == null) {
            throw new AuthenticationException("User not found: " + login);
        }
        if (!user.login(pw)) {
            throw new AuthenticationException("Wrong password for user: " + login);
        }
        currentUser = user;
        return currentUser;
    }

    public void logout() {
        if (currentUser != null) {
            currentUser.logout();
            currentUser = null;
        }
    }

    public void registerUser(User u) {
        users.put(u.getLogin(), u);
    }

    public void removeUser(String id) {
        users.values().removeIf(u -> u.getId().equals(id));
    }

    public void updateUser(User u) {
        users.put(u.getLogin(), u);
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public User getCurrentUser() { return currentUser; }
}
