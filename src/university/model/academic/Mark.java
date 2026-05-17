package university.model.academic;

import university.model.users.Student;

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
public class Mark {

    private double attestation1;
    private double attestation2;
    private double finalExam;
    private Student student;
    private Course course;

    public Mark(double attestation1, double attestation2, double finalExam,
                Student student, Course course) {
        // TODO [Нур]: инициализировать поля
        throw new UnsupportedOperationException("TODO [Нур]: реализовать конструктор Mark");
    }

    public double getTotal() {
        // TODO [Нур]: вернуть attestation1 + attestation2 + finalExam
        throw new UnsupportedOperationException("TODO [Нур]: реализовать getTotal()");
    }

    public double getAttestation1() { return attestation1; }
    public double getAttestation2() { return attestation2; }
    public double getFinalExam()    { return finalExam; }
    public Student getStudent()     { return student; }
    public Course getCourse()       { return course; }
}
