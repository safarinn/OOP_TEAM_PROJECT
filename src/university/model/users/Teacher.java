package university.model.users;

import university.enums.TeacherTitle;
import university.enums.UserRole;
import university.model.academic.Course;
import university.model.academic.Mark;

import java.util.Date;
import java.util.List;

/**
 * ============================================================
 * TODO [Рамазан]: Реализовать класс Teacher
 * ============================================================
 * Что нужно сделать:
 *  1. viewCourses() — вернуть список курсов, которые ведёт этот Teacher
 *  2. manageCourse(c) — редактировать курс (добавлять уроки, менять расписание)
 *  3. putMark(s, c, m) — выставить оценку студенту по курсу
 *  4. viewStudents(c) — вернуть список студентов на курсе c
 *
 * Бизнес-правило: если title == PROFESSOR, Teacher должен быть обёрнут
 * как EmployeeResearcher через UserFactory — это логика в UserFactory (Артем).
 * ============================================================
 */
public class Teacher extends Employee {

    private TeacherTitle title;
    private String department;

    public Teacher(String id, String login, String password, String name, String email,
                   Date hireDate, double salary, TeacherTitle title, String department) {
        super(id, login, password, name, email, UserRole.TEACHER, hireDate, salary);
        // TODO [Рамазан]: инициализировать title и department
    }

    public TeacherTitle getTitle()   { return title; }
    public String getDepartment()    { return department; }

    public List<Course> viewCourses() {
        // TODO [Рамазан]: вернуть все курсы, где этот Teacher является инструктором
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать viewCourses()");
    }

    public void manageCourse(Course c) {
        // TODO [Рамазан]: открыть курс для редактирования (добавление уроков и т.д.)
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать manageCourse()");
    }

    public void putMark(Student s, Course c, Mark m) {
        // TODO [Рамазан]: выставить оценку m студенту s по курсу c
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать putMark()");
    }

    public List<Student> viewStudents(Course c) {
        // TODO [Рамазан]: вернуть список студентов курса c
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать viewStudents()");
    }
}
