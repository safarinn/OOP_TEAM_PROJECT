package university.model.academic;

import university.model.users.Student;
import java.io.Serializable;
import java.util.Objects;
/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Mark
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать attestation1, attestation2, finalExam, student, course
 *  2. getTotal() — вернуть сумму attestation1 + attestation2 + finalExam
 *  3. Геттеры для всех полей
 *
 * Бизнес-правило: Mark = attestation1 + attestation2 + finalExam
 * Диапазоны: attestation1 и attestation2 от 0 до 30, finalExam от 0 до 40
 * ============================================================
 */
public class Mark implements Serializable {

    private static final long serialVersionUID = 212L;

    private double attestation1;
    private double attestation2;
    private double finalExam;
    private Student student;
    private Course course;

    public Mark(double attestation1, double attestation2, double finalExam,
                Student student, Course course) {
        if (attestation1 < 0 || attestation1 > 30)
            throw new IllegalArgumentException("Attestation1 must be in [0, 30]");
        if (attestation2 < 0 || attestation2 > 30)
            throw new IllegalArgumentException("Attestation2 must be in [0, 30]");
        if (finalExam < 0 || finalExam > 40)
            throw new IllegalArgumentException("Final exam must be in [0, 40]");
        this.attestation1 = attestation1;
        this.attestation2 = attestation2;
        this.finalExam = finalExam;
        this.student = student;
        this.course = course;
    }

    public double getTotal() {
        return attestation1 + attestation2 + finalExam;
    }

    public double getAttestation1() { return attestation1; }
    public double getAttestation2() { return attestation2; }
    public double getFinalExam()    { return finalExam; }
    public Student getStudent()     { return student; }
    public Course getCourse()       { return course; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark = (Mark) o;
        return Objects.equals(student, mark.student) && Objects.equals(course, mark.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, course);
    }

    @Override
    public String toString() {
        return String.format("Mark{course='%s', att1=%.1f, att2=%.1f, final=%.1f, total=%.1f}",
                course.getName(), attestation1, attestation2, finalExam, getTotal());
    }
}
