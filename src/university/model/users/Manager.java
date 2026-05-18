package university.model.users;

import university.enums.ManagerType;
import university.enums.UserRole;
import university.exceptions.CreditLimitException;
import university.model.academic.Complaint;
import university.model.academic.Course;
import university.model.academic.News;
import university.services.Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager extends User {

    private ManagerType type;
    private List<Course> courses = new ArrayList<>();
    private List<News> newsList = new ArrayList<>();

    public Manager(String id, String login, String password, String name, String email, ManagerType type) {
        super(id, login, password, name, email, UserRole.MANAGER);
        this.type = type;
    }

    public ManagerType getType() {
        return type;
    }

    public void approveRegistration(Student s, Course c) {
        try {
            s.registerCourse(c);
        } catch (CreditLimitException e) {
            System.out.println("Registration denied: " + e.getMessage());
        }
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void assignTeacher(Course c, Teacher t) {
        c.addInstructor(t);
        t.addCourse(c);
    }

    public void generateReports() {
        Report report = new Report("Manager Report");
        report.generate();
    }

    public void manageNews(News n) {
        newsList.add(n);
    }

    public List<Complaint> viewComplaints(List<Employee> employees) {
        List<Complaint> all = new ArrayList<>();
        for (Employee e : employees) {
            all.addAll(e.getComplaints());
        }
        return all;
    }

    public List<Student> viewStudentsSortedByGpa(List<Student> students) {
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        return sorted;
    }

    public List<Student> viewStudentsSortedByName(List<Student> students) {
        List<Student> sorted = new ArrayList<>(students);
        Collections.sort(sorted);
        return sorted;
    }

    public List<Teacher> viewTeachersSortedByName(List<Teacher> teachers) {
        List<Teacher> sorted = new ArrayList<>(teachers);
        sorted.sort(Comparator.comparing(Teacher::getName));
        return sorted;
    }

    public List<Course> getCourses()  { return courses; }
    public List<News> getNewsList()   { return newsList; }

    @Override
    public String toString() {
        return "Manager{name='" + name + "', type=" + type + "}";
    }
}
