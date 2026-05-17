import java.io.Serializable;

public class Mark implements Serializable {
    private static final long serialVersionUID = 203L;

    private double attestation1;
    private double attestation2;
    private double finalExam;
    private Student student;
    private Course course;

    public Mark(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public double getTotal() {
        return attestation1 + attestation2 + finalExam;
    }
    public boolean isPassed() {
        return getTotal() >= 60; // Assuming 60 is the passing grade
    }

    public double getAttestation1() { return attestation1; }
    public double getAttestation2() { return attestation2; }
    public double getFinalExam()    { return finalExam; }
    public Student getStudent()     { return student; }
    public Course getCourse()       { return course; }
}