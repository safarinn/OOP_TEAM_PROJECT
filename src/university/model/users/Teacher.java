package university.model.users;

import university.enums.TeacherTitle;
import university.enums.UserRole;
import university.model.academic.Course;
import university.model.academic.Mark;
import university.model.academic.TeacherRating;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teacher extends Employee {

    private TeacherTitle title;
    private String department;
    private List<Course> courses = new ArrayList<>();
    private List<TeacherRating> ratings = new ArrayList<>();
    private List<Mark> marks = new ArrayList<>();

    public Teacher(String id, String login, String password, String name, String email,
                   Date hireDate, double salary, TeacherTitle title, String department) {
        super(id, login, password, name, email, UserRole.TEACHER, hireDate, salary);
        this.title = title;
        this.department = department;
    }

    public TeacherTitle getTitle()   { return title; }
    public String getDepartment()    { return department; }

    public List<Course> viewCourses() {
        return courses;
    }

    public List<Course> getAssignedCourses() {
        return courses;
    }

    public void manageCourse(Course c) {
        if (!courses.contains(c)) courses.add(c);
    }

    public void putMark(Student s, Course c, Mark m) {
        marks.add(m);
    }

    public List<Student> viewStudents(Course c) {
        return c.getStudents();
    }

    public void addCourse(Course c) {
        if (!courses.contains(c)) courses.add(c);
    }


    public void addRating(TeacherRating r) {
        ratings.add(r);
    }

    public List<TeacherRating> getRatings() { return ratings; }
    public List<Mark> getMarks()            { return marks; }
}
