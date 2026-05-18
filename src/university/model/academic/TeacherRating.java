package university.model.academic;

import university.model.users.Student;
import university.model.users.Teacher;
import java.io.Serializable;
import java.util.List;
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
public class TeacherRating implements Serializable {

    private static final long serialVersionUID = 301L;

    private Teacher teacher;
    private Student student;
    private int score; // 1..5

    public TeacherRating(Teacher teacher, Student student, int score) {
        if (score < 1 || score > 5) {
            throw new IllegalArgumentException("Score must be between 1 and 5");
        }
        this.teacher = teacher;
        this.student = student;
        this.score = score;
    }

    public static double getAverageRating(Teacher teacher, List<TeacherRating> ratings) {
        if (teacher == null || ratings == null || ratings.isEmpty()) {
            return 0.0;
        }
        
        double sum = 0;
        int count = 0;
        
        for (TeacherRating r : ratings) {
            if (r != null && r.getTeacher() != null && r.getTeacher().equals(teacher)) {
                sum += r.getScore();
                count++;
            }
        }
        
        return count == 0 ? 0.0 : sum / count;
    }



    public Teacher getTeacher() { return teacher; }
    public Student getStudent() { return student; }
    public int getScore()       { return score; }
}
