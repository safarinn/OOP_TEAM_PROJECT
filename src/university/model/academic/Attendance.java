package university.model.academic;

import university.model.users.Student;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Attendance (бонус)
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать student, lesson, present
 *  2. Геттеры для всех полей
 *  3. mark(present) — отметить присутствие/отсутствие студента
 * ============================================================
 */
public class Attendance {

    private Student student;
    private Lesson lesson;
    private boolean present;

    public Attendance(Student student, Lesson lesson, boolean present) {
        // TODO [Нур]: инициализировать поля
        throw new UnsupportedOperationException("TODO [Нур]: реализовать конструктор Attendance");
    }

    public void mark(boolean present) {
        // TODO [Нур]: установить present
        throw new UnsupportedOperationException("TODO [Нур]: реализовать mark()");
    }

    public Student getStudent() { return student; }
    public Lesson getLesson()   { return lesson; }
    public boolean isPresent()  { return present; }
}
