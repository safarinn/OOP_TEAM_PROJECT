package university.model.users;

import university.enums.ManagerType;
import university.enums.UserRole;
import university.exceptions.CreditLimitException;
import university.model.academic.Course;
import university.model.academic.News;
import university.services.Report;

import java.util.ArrayList;
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

    public List<Course> getCourses()  { return courses; }
    public List<News> getNewsList()   { return newsList; }
}
