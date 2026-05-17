package university.services;

import university.enums.TeacherTitle;
import university.enums.ManagerType;
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

    private University university;

    public UserFactory(University university) {
        this.university = university;
    }

    public Student createStudent(String id, String login, String password,
                                  String name, String email, int year, String major) {
        return new Student(id, login, password, name, email, year, major);
    }

    public Teacher createTeacher(String id, String login, String password,
                                  String name, String email, Date hireDate, double salary,
                                  TeacherTitle title, String department) {
        Teacher teacher = new Teacher(id, login, password, name, email, hireDate, salary, title, department);
        if (title == TeacherTitle.PROFESSOR) {
            Researcher researcher = wrapAsResearcher(teacher);
            university.addResearcher(researcher);
        }
        return teacher;
    }

    public Admin createAdmin(String id, String login, String password,
                              String name, String email, AuthenticationService authService) {
        return new Admin(id, login, password, name, email, authService);
    }

    public Manager createManager(String id, String login, String password,
                                  String name, String email, ManagerType type) {
        return new Manager(id, login, password, name, email, type);
    }

    public Researcher wrapAsResearcher(User u) {
        if (u instanceof Student) {
            return new StudentResearcher(u, null);
        } else if (u instanceof Employee) {
            return new EmployeeResearcher(u);
        } else {
            throw new IllegalArgumentException("Невозможно обернуть пользователя типа: " + u.getClass().getSimpleName());
        }
    }

    public User create(UserRole role, String id, String login, String password,
                       String name, String email) {
        switch (role) {
            case STUDENT:  return createStudent(id, login, password, name, email, 1, "Undeclared");
            case TEACHER:  return createTeacher(id, login, password, name, email, new Date(), 0, TeacherTitle.LECTOR, "General");
            case ADMIN:    return createAdmin(id, login, password, name, email, new AuthenticationService());
            case MANAGER:  return createManager(id, login, password, name, email, ManagerType.values()[0]);
            default:       throw new IllegalArgumentException("Неизвестная роль: " + role);
        }
    }
}
