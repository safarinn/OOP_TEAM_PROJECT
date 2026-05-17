package university.model.users;

import university.enums.ManagerType;
import university.enums.UserRole;
import university.model.academic.Course;
import university.model.academic.News;
import university.services.Report;

/**
 * ============================================================
 * TODO [Рамазан]: Реализовать класс Manager
 * ============================================================
 * Что нужно сделать:
 *  1. approveRegistration(s, c) — подтвердить запись студента на курс
 *  2. addCourse(c) — добавить новый курс в систему
 *  3. assignTeacher(c, t) — назначить преподавателя на курс
 *  4. generateReports() — сформировать отчёты (Report)
 *  5. manageNews(n) — опубликовать / изменить новость
 * ============================================================
 */
public class Manager extends User {

    private ManagerType type;

    public Manager(String id, String login, String password, String name, String email, ManagerType type) {
        super(id, login, password, name, email, UserRole.MANAGER);
        // TODO [Рамазан]: инициализировать type
    }

    public ManagerType getType() {
        // TODO [Рамазан]: вернуть type
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать getType()");
    }

    public void approveRegistration(Student s, Course c) {
        // TODO [Рамазан]: подтвердить регистрацию студента s на курс c
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать approveRegistration()");
    }

    public void addCourse(Course c) {
        // TODO [Рамазан]: добавить курс c в систему
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать addCourse()");
    }

    public void assignTeacher(Course c, Teacher t) {
        // TODO [Рамазан]: назначить преподавателя t на курс c
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать assignTeacher()");
    }

    public void generateReports() {
        // TODO [Рамазан]: создать и вывести отчёт Report
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать generateReports()");
    }

    public void manageNews(News n) {
        // TODO [Рамазан]: добавить или обновить новость n
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать manageNews()");
    }
}
