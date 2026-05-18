package university.model.academic;

import university.model.users.Student;
import university.model.users.Teacher;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Course implements Serializable{
    private static final long serialVersionUID = 210L;

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
        if (t == null) throw new IllegalArgumentException("Teacher cannot be null");
        if (!instructors.contains(t)) instructors.add(t);
    }

    public void addStudent(Student s) {
        if (s == null) throw new IllegalArgumentException("Student cannot be null");
        if (students.size() >= maxStudents) throw new IllegalStateException("Course is full: " + name);
        if (!students.contains(s)) students.add(s);
    }

    public void addLesson(Lesson l) {
        if (l == null) throw new IllegalArgumentException("Lesson cannot be null");
        if (!lessons.contains(l)) lessons.add(l);
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

    @Override
    public String toString() {
        return "Course{code='" + code + "', name='" + name +
               "', credits=" + credits + ", students=" + students.size() +
               "/" + maxStudents + "}";
    }
}

