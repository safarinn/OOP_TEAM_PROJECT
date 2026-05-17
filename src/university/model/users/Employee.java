package university.model.users;

import university.enums.UserRole;
import university.model.academic.Complaint;

import java.util.Date;

/**
 * ============================================================
 * TODO [Рамазан]: Реализовать класс Employee
 * ============================================================
 * Что нужно сделать:
 *  1. Реализовать getSalary() — вернуть salary
 *  2. Реализовать sendComplaint(c) — отправить жалобу (через MessageService или хранилище)
 * ============================================================
 */
public class Employee extends User {

    protected Date hireDate;
    protected double salary;

    public Employee(String id, String login, String password, String name, String email,
                    UserRole role, Date hireDate, double salary) {
        super(id, login, password, name, email, role);
        // TODO [Рамазан]: инициализировать hireDate и salary
    }

    public double getSalary() {
        // TODO [Рамазан]: вернуть salary
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать getSalary()");
    }

    public Date getHireDate() {
        // TODO [Рамазан]: вернуть hireDate
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать getHireDate()");
    }

    public void sendComplaint(Complaint c) {
        // TODO [Рамазан]: отправить жалобу c в систему
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать sendComplaint()");
    }
}
