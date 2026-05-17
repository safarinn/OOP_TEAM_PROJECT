package university.model.academic;

import university.model.users.Student;
import university.model.users.Teacher;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс TeacherRating
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать teacher, student, score
 *  2. Проверить: score в диапазоне [1..5], иначе выбросить IllegalArgumentException
 *  3. Геттеры для всех полей
 *  4. Опционально: статический метод getAverageRating(teacher, ratings) — средний балл
 * ============================================================
 */
public class TeacherRating {

    private Teacher teacher;
    private Student student;
    private int score; // 1..5

    public TeacherRating(Teacher teacher, Student student, int score) {
        // TODO [Нур]: проверить score в [1..5], затем инициализировать поля
        throw new UnsupportedOperationException("TODO [Нур]: реализовать конструктор TeacherRating");
    }

    public Teacher getTeacher() { return teacher; }
    public Student getStudent() { return student; }
    public int getScore()       { return score; }
}
