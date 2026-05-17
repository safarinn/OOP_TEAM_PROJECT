package university.model.users;

import university.enums.UserRole;

/**
 * ============================================================
 * TODO [Рамазан]: Реализовать абстрактный класс User
 * ============================================================
 * Что нужно сделать:
 *  1. Реализовать метод login(pw) — сравнивает pw с this.password
 *  2. Реализовать метод logout() — сбрасывает текущую сессию
 *  3. Переопределить equals() и hashCode() по полю id
 *  4. Реализовать getId(), getLogin(), getName(), getEmail(), getRole()
 * ============================================================
 */
public abstract class User {

    protected String id;
    protected String login;
    protected String password;
    protected String name;
    protected String email;
    protected UserRole role;

    public User(String id, String login, String password, String name, String email, UserRole role) {
        // TODO [Рамазан]: инициализировать поля
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать конструктор User");
    }

    public boolean login(String pw) {
        // TODO [Рамазан]: вернуть true если pw совпадает с this.password
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать login()");
    }

    public void logout() {
        // TODO [Рамазан]: реализовать выход из системы
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать logout()");
    }

    public String getId() {
        // TODO [Рамазан]: вернуть id
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать getId()");
    }

    public String getLogin() {
        // TODO [Рамазан]: вернуть login
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать getLogin()");
    }

    public String getName() {
        // TODO [Рамазан]: вернуть name
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать getName()");
    }

    public String getEmail() {
        // TODO [Рамазан]: вернуть email
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать getEmail()");
    }

    public UserRole getRole() {
        // TODO [Рамазан]: вернуть role
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать getRole()");
    }

    @Override
    public boolean equals(Object o) {
        // TODO [Рамазан]: сравнивать по полю id
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать equals()");
    }

    @Override
    public int hashCode() {
        // TODO [Рамазан]: хэш по полю id
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать hashCode()");
    }

    @Override
    public String toString() {
        // TODO [Рамазан]: вернуть читаемое представление пользователя
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать toString()");
    }
}
