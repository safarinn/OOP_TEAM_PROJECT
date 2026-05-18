package university.services;

import university.model.users.User;

import java.io.Serializable;
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
public class Log implements Serializable {

    private static final long serialVersionUID = 403L;

    private User user;
    private String action;
    private Date timestamp;

    public Log(User user, String action) {
        this.user = user;
        this.action = action;
        this.timestamp = new Date();
    }

    public User getUser()       { return user; }
    public String getAction()   { return action; }
    public Date getTimestamp()  { return timestamp; }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + user.getName() + " → " + action;
    }
}
