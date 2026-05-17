import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {
    private static final long serialVersionUID = 201L;

    private String code;
    private String name;
    private int credits;
    private int maxStudents;
    private List<Teacher> instructors = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();

    public Course(String code, String name, int credits, int maxStudents) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.maxStudents = maxStudents;
    }

    public void addInstructor(Teacher t) {
        if (t != null && !instructors.contains(t)) {
            instructors.add(t);
        }
    }

    public void addStudent(Student s) throws Exception {
        if (s == null) return;
        if (students.size() >= maxStudents) {
            throw new Exception("Course is full");
        }
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public List<Teacher> getInstructors() {
        return instructors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }
}