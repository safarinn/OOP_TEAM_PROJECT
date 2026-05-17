package university.services;

import university.model.users.User;

import java.util.List;

/**
 * ============================================================
 * TODO [Артем]: Реализовать класс School
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать name и пустой список members
 *  2. addMember(u) — добавить User u в members
 *  3. removeMember(u) — удалить User u из members
 *  4. Геттеры getName(), getMembers()
 * ============================================================
 */
public class School {

    private String name;
    private List<User> members;

    public School(String name) {
        // TODO [Артем]: инициализировать name и пустой список members
        throw new UnsupportedOperationException("TODO [Артем]: реализовать конструктор School");
    }

    public void addMember(User u) {
        // TODO [Артем]: добавить u в members
        throw new UnsupportedOperationException("TODO [Артем]: реализовать addMember()");
    }

    public void removeMember(User u) {
        // TODO [Артем]: удалить u из members
        throw new UnsupportedOperationException("TODO [Артем]: реализовать removeMember()");
    }

    public String getName()       { return name; }
    public List<User> getMembers() { return members; }
}
