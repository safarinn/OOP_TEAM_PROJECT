package university.model.academic;

import university.model.users.Student;

import java.io.Serializable;
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
public class Attendance implements Serializable {
    private static final long serialVersionUID = 206L;

    private Student student;
    private Lesson lesson;
    private boolean present;
    private Date date;

    public Attendance(Student student, Lesson lesson, boolean present) {
        this.student = student;
        this.lesson = lesson;
        this.present = present;
        this.date = new Date();
    }

    public void mark(boolean present) {
        this.present = present;
        this.date = new Date();
    }

    public Student getStudent() { return student; }
    public Lesson getLesson()   { return lesson; }
    public boolean isPresent()  { return present; }
    public Date getDate()       { return date; }
}
