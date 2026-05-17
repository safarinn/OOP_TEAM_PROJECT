package university.model.users;

import university.enums.UserRole;
import university.services.Log;

import java.util.List;

/**
 * ============================================================
 * TODO [Рамазан]: Реализовать класс Admin
 * ============================================================
 * Что нужно сделать:
 *  1. Реализовать addUser(u) — добавить пользователя в систему
 *  2. Реализовать removeUser(id) — удалить пользователя по id
 *  3. Реализовать updateUser(u) — обновить данные пользователя
 *  4. Реализовать viewLogs() — вернуть список всех логов системы
 * ============================================================
 */
public class Admin extends User {

    public Admin(String id, String login, String password, String name, String email) {
        super(id, login, password, name, email, UserRole.ADMIN);
        // TODO [Рамазан]: дополнительная инициализация если нужна
    }

    public void addUser(User u) {
        // TODO [Рамазан]: добавить пользователя в DataManager / хранилище
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать addUser()");
    }

    public void removeUser(String id) {
        // TODO [Рамазан]: удалить пользователя по id из хранилища
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать removeUser()");
    }

    public void updateUser(User u) {
        // TODO [Рамазан]: обновить существующего пользователя в хранилище
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать updateUser()");
    }

    public List<Log> viewLogs() {
        // TODO [Рамазан]: вернуть список логов из DataManager / Log-хранилища
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать viewLogs()");
    }
}
