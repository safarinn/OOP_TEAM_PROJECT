package university.services;

import university.model.users.User;

import java.util.Date;

/**
 * ============================================================
 * TODO [Артем]: Реализовать класс Log
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать user, action; timestamp = new Date()
 *  2. Геттеры для всех полей
 *  3. toString() — читаемый вывод: "[timestamp] user.getName() → action"
 * ============================================================
 */
public class Log {

    private User user;
    private String action;
    private Date timestamp;

    public Log(User user, String action) {
        // TODO [Артем]: инициализировать user, action; timestamp = new Date()
        throw new UnsupportedOperationException("TODO [Артем]: реализовать конструктор Log");
    }

    public User getUser()       { return user; }
    public String getAction()   { return action; }
    public Date getTimestamp()  { return timestamp; }

    @Override
    public String toString() {
        // TODO [Артем]: вернуть "[timestamp] user.getName() → action"
        throw new UnsupportedOperationException("TODO [Артем]: реализовать toString()");
    }
}
