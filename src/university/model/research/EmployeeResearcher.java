package university.model.research;

import university.model.users.Student;

import university.model.users.User;
import java.util.ArrayList;
import java.util.List;


public class EmployeeResearcher extends ResearcherDecorator {

    private List<Student> supervisees;

    public EmployeeResearcher(User user) {
        super(user);
        supervisees = new ArrayList<>();
    }

    public void addSupervisee(Student s) {
        supervisees.add(s);
    }

    public List<Student> getSupervisees() {
        return supervisees;
    }
}
