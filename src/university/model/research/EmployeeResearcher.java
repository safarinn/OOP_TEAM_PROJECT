package university.model.research;

import university.model.users.Student;
import university.model.users.User;

import java.util.List;

/**
 * ============================================================
 * TODO [Нурали]: Реализовать класс EmployeeResearcher
 * ============================================================
 * Паттерн: Decorator (конкретный декоратор для сотрудника-исследователя)
 * Что нужно сделать:
 *  1. Конструктор — вызвать super(user), инициализировать пустой список supervisees
 *  2. addSupervisee(s) — добавить студента в supervisees
 *  3. getSupervisees() — вернуть supervisees
 *
 * Примечание: Teacher с title=PROFESSOR оборачивается именно в этот класс
 * через UserFactory (логика в Артем → UserFactory.wrapAsResearcher())
 * ============================================================
 */
public class EmployeeResearcher extends ResearcherDecorator {

    private List<Student> supervisees;

    public EmployeeResearcher(User user) {
        super(user);
        // TODO [Нурали]: инициализировать пустой список supervisees
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать конструктор EmployeeResearcher");
    }

    public void addSupervisee(Student s) {
        // TODO [Нурали]: добавить s в supervisees
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать addSupervisee()");
    }

    public List<Student> getSupervisees() {
        // TODO [Нурали]: вернуть supervisees
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать getSupervisees()");
    }
}
