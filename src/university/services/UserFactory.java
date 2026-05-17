package university.services;

import university.enums.TeacherTitle;
import university.enums.UserRole;
import university.model.research.EmployeeResearcher;
import university.model.research.Researcher;
import university.model.research.StudentResearcher;
import university.model.users.*;

import java.util.Date;

/**
 * ============================================================
 * TODO [Артем]: Реализовать класс UserFactory (паттерн Factory)
 * ============================================================
 * Паттерн: Factory
 * Что нужно сделать:
 *  1. createStudent(id, login, pw, name, email, year, major)
 *     → вернуть new Student(...)
 *  2. createTeacher(id, login, pw, name, email, hireDate, salary, title, dept)
 *     → вернуть new Teacher(...)
 *     → если title == PROFESSOR, АВТОМАТИЧЕСКИ обернуть через wrapAsResearcher()
 *  3. wrapAsResearcher(u) — обернуть User в Researcher:
 *     → если u instanceof Student → new StudentResearcher(u, null)
 *     → если u instanceof Employee → new EmployeeResearcher(u)
 *     → иначе выбросить IllegalArgumentException
 *  4. create(role, ...) — универсальный метод: по UserRole создать нужный подкласс
 *     (можно делегировать createStudent / createTeacher и т.д.)
 * ============================================================
 */
public class UserFactory {

    public Student createStudent(String id, String login, String password,
                                 String name, String email, int year, String major) {
        // TODO [Артем]: вернуть new Student(...)
        throw new UnsupportedOperationException("TODO [Артем]: реализовать createStudent()");
    }

    public Teacher createTeacher(String id, String login, String password,
                                 String name, String email, Date hireDate, double salary,
                                 TeacherTitle title, String department) {
        // TODO [Артем]: вернуть new Teacher(...); если PROFESSOR — вызвать wrapAsResearcher()
        throw new UnsupportedOperationException("TODO [Артем]: реализовать createTeacher()");
    }

    public Admin createAdmin(String id, String login, String password, String name, String email) {
        // TODO [Артем]: вернуть new Admin(...)
        throw new UnsupportedOperationException("TODO [Артем]: реализовать createAdmin()");
    }

    public Manager createManager(String id, String login, String password,
                                 String name, String email,
                                 university.enums.ManagerType type) {
        // TODO [Артем]: вернуть new Manager(...)
        throw new UnsupportedOperationException("TODO [Артем]: реализовать createManager()");
    }

    public Researcher wrapAsResearcher(User u) {
        // TODO [Артем]: Student → StudentResearcher; Employee → EmployeeResearcher; иначе ошибка
        throw new UnsupportedOperationException("TODO [Артем]: реализовать wrapAsResearcher()");
    }

    public User create(UserRole role, String id, String login, String password,
                       String name, String email) {
        // TODO [Артем]: switch(role) → вызвать нужный create*() метод
        throw new UnsupportedOperationException("TODO [Артем]: реализовать create()");
    }
}
