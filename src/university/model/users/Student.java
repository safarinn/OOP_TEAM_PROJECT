package university.model.users;

import university.enums.UserRole;
import university.exceptions.CreditLimitException;
import university.exceptions.LowHIndexException;
import university.exceptions.MaxFailsException;
import university.model.academic.Course;
import university.model.academic.Mark;
import university.model.academic.TeacherRating;
import university.model.research.Researcher;

import java.util.ArrayList;
import java.util.List;

public class Student extends User implements Comparable<Student> {

    private static final long serialVersionUID = 103L;

    private int year;
    private String major;
    private double gpa;
    private int credits;   // <= 21
    private int fails;     // <= 3
    private Researcher supervisor; // [0..1]
    private List<Course> registeredCourses = new ArrayList<>();
    private List<Mark> marks = new ArrayList<>();

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
        if(c.getCredits() + credits > 21) throw new CreditLimitException(email + " Превысил лимит кредитов");
        c.addStudent(this);
        this.credits += c.getCredits();
        registeredCourses.add(c);
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
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

    public void addMark(Mark m) {
        marks.add(m);
    }

    public List<Mark> viewMarks() {
        return marks;
    }

    public String getTranscript() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== TRANSCRIPT ===\n");
        sb.append("Name:    ").append(name).append("\n");
        sb.append("Major:   ").append(major).append("\n");
        sb.append("Year:    ").append(year).append("\n");
        sb.append("GPA:     ").append(gpa).append("\n");
        sb.append("Credits: ").append(credits).append("\n");
        sb.append("Marks:\n");
        for (Mark m : marks) {
            sb.append("  ").append(m.getCourse().getName())
              .append(" → ").append(m.getTotal()).append("\n");
        }
        return sb.toString();
    }

    public List<Teacher> getTeacherInfo(Course c) {
        return c.getInstructors();
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    public int getYear()     { return year; }
    public String getMajor() { return major; }
    public double getGpa()   { return gpa; }
    public int getCredits()  { return credits; }
    public int getFails()    { return fails; }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', major='" + major +
               "', year=" + year + ", gpa=" + gpa +
               ", credits=" + credits + ", fails=" + fails + "}";
    }
}
