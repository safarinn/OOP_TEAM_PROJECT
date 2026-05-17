package university.model.users;

import university.enums.UserRole;
import university.exceptions.CreditLimitException;
import university.exceptions.MaxFailsException;
import university.model.academic.Course;
import university.model.research.Researcher;

/**
 * ============================================================
 * TODO [Рамазан]: Реализовать класс Student
 * ============================================================
 * Что нужно сделать:
 *  1. registerCourse(c) — записать студента на курс
 *     - проверить: credits + c.getCredits() <= 21, иначе CreditLimitException
 *     - обновить credits после успешной записи
 *  2. rateTeacher(t, score) — добавить оценку преподавателю (TeacherRating)
 *  3. incrementFails() — увеличить fails, при fails > 3 бросить MaxFailsException
 *  4. setSupervisor(r) — назначить научного руководителя
 *     - проверить r.getHIndex() >= 3, иначе LowHIndexException
 *     - 4-курсник обязан иметь supervisor — проверку добавить здесь или в Manager
 * ============================================================
 */
public class Student extends User {

    private int year;
    private String major;
    private double gpa;
    private int credits;   // <= 21
    private int fails;     // <= 3
    private Researcher supervisor; // [0..1]

    public Student(String id, String login, String password, String name, String email,
                   int year, String major) {
        super(id, login, password, name, email, UserRole.STUDENT);
        // TODO [Рамазан]: инициализировать year, major, gpa=0, credits=0, fails=0
    }

    public void registerCourse(Course c) throws CreditLimitException {
        // TODO [Рамазан]: проверить лимит кредитов и записать на курс
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать registerCourse()");
    }

    public void rateTeacher(Teacher t, int score) {
        // TODO [Рамазан]: создать TeacherRating и добавить в систему
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать rateTeacher()");
    }

    public void incrementFails() throws MaxFailsException {
        // TODO [Рамазан]: увеличить fails; если > 3 — бросить MaxFailsException
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать incrementFails()");
    }

    public void setSupervisor(Researcher r) {
        // TODO [Рамазан]: проверить hIndex >= 3 (LowHIndexException), затем сохранить
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать setSupervisor()");
    }

    public Researcher getSupervisor() {
        return supervisor;
    }

    public int getYear()     { return year; }
    public String getMajor() { return major; }
    public double getGpa()   { return gpa; }
    public int getCredits()  { return credits; }
    public int getFails()    { return fails; }

    public void setGpa(double gpa) {
        // TODO [Рамазан]: установить gpa
        throw new UnsupportedOperationException("TODO [Рамазан]: реализовать setGpa()");
    }
}
