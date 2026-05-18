package university.services;

import university.model.users.User;

import java.io.Serializable;
import java.util.ArrayList;
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
public class School implements Serializable {

    private static final long serialVersionUID = 402L;

    private String name;
    private List<User> members;

    public School(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(User u) {
        members.add(u);
    }

    public void removeMember(User u) {
        members.remove(u);
    }
    public String getName()       { return name; }
    public List<User> getMembers() { return members; }
}
