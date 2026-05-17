package university.model.users;

import university.enums.UserRole;
import university.exceptions.CreditLimitException;
import university.exceptions.LowHIndexException;
import university.exceptions.MaxFailsException;
import university.model.academic.Course;
import university.model.academic.TeacherRating;
import university.model.research.Researcher;


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
        this.year = year;
        this.major = major;
        this.gpa = 0;
        this.credits = 0;
        this.fails = 0;
    }

    public void registerCourse(Course c) throws CreditLimitException {
        if(c.getCredits() + credits > 21) throw new CreditLimitException(email + " Превысил лиимт кредитов");
        c.addStudent(this);
        this.credits += c.getCredits();
    }

    public void rateTeacher(Teacher t, int score) {
        t.addRating(new TeacherRating(t, this, score));
    }

    public void incrementFails() throws MaxFailsException {
        fails += 1;
        if(fails > 3) throw new MaxFailsException(email + " превысил лимит фейлов");
    }

    public void setSupervisor(Researcher r) throws LowHIndexException {
        if (r.getHIndex() < 3) throw new LowHIndexException("Supervisor h-index must be >= 3");
        this.supervisor = r;
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
        this.gpa = gpa;
    }
}
