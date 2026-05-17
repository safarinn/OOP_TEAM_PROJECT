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
        // TODO [Артем]: инициализировать users = new HashMap<>(), currentUser = null
        throw new UnsupportedOperationException("TODO [Артем]: реализовать конструктор AuthenticationService");
    }

    public User login(String login, String pw) throws AuthenticationException {
        // TODO [Артем]: найти пользователя по login, проверить пароль, сохранить currentUser
        throw new UnsupportedOperationException("TODO [Артем]: реализовать login()");
    }

    public void logout() {
        // TODO [Артем]: вызвать currentUser.logout(), обнулить currentUser
        throw new UnsupportedOperationException("TODO [Артем]: реализовать logout()");
    }

    public void registerUser(User u) {
        // TODO [Артем]: добавить u в users по ключу u.getLogin()
        throw new UnsupportedOperationException("TODO [Артем]: реализовать registerUser()");
    }

    public void removeUser(String id) {
        // TODO [Артем]: удалить пользователя из users по id (users.values().removeIf(u -> u.getId().equals(id)))
        throw new UnsupportedOperationException("TODO [Артем]: реализовать removeUser()");
    }

    public void updateUser(User u) {
        // TODO [Артем]: обновить пользователя: users.put(u.getLogin(), u)
        throw new UnsupportedOperationException("TODO [Артем]: реализовать updateUser()");
    }

    public Map<String, User> getUsers() {
        // TODO [Артем]: вернуть users
        throw new UnsupportedOperationException("TODO [Артем]: реализовать getUsers()");
    }

    public User getCurrentUser() { return currentUser; }
}
