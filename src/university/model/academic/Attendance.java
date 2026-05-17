package university.model.academic;

import university.model.users.Student;

import java.util.Date;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Attendance (бонус)
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать student, lesson, present; date = new Date()
 *  2. Геттеры для всех полей
 *  3. mark(present) — отметить присутствие/отсутствие студента
 * ============================================================
 */
public class Attendance {

    private Student student;
    private Lesson lesson;
    private boolean present;
    private Date date;

    public Attendance(Student student, Lesson lesson, boolean present) {
        // TODO [Нур]: инициализировать поля; date = new Date()
        throw new UnsupportedOperationException("TODO [Нур]: реализовать конструктор Attendance");
    }

    public void mark(boolean present) {
        // TODO [Нур]: установить present
        throw new UnsupportedOperationException("TODO [Нур]: реализовать mark()");
    }

    public Student getStudent() { return student; }
    public Lesson getLesson()   { return lesson; }
    public boolean isPresent()  { return present; }
    public Date getDate()       { return date; }
}
