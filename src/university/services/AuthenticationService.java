package university.services;

import university.exceptions.AuthenticationException;
import university.model.users.User;

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
 *  4. registerUser(u) — добавить пользователя в users (для Admin или при инициализации)
 *  5. getCurrentUser() — геттер
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

    public User getCurrentUser() { return currentUser; }
}
