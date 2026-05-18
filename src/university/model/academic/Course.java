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
        throw new UnsupportedOperationException(" реализовать конструктор Course");
    }

    public void addInstructor(Teacher t) {
        if (t != null && !instructors.contains(t)) {
            instructors.add(t);
        } else {
            throw new UnsupportedOperationException("Преподаватель не может быть null или уже добавлен");
        }
        
    }

    public void addStudent(Student s) {
        if (s == null) return;
        if (students.size() >= maxStudents) {
            throw new UnsupportedOperationException("Course is full");
        }
        if (!students.contains(s)) {
            students.add(s);
        } else {
            throw new UnsupportedOperationException("Студент уже добавлен");
        }
     
    }

    public void addLesson(Lesson l) {
        if (l != null && !lessons.contains(l)) {
            lessons.add(l);
        } else {
            throw new UnsupportedOperationException("Урок не может быть null или уже добавлен");
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

