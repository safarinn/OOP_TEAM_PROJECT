package university.model.users;

import university.enums.UserRole;
import university.model.academic.Complaint;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee extends User implements Serializable {

    protected Date hireDate;
    protected double salary;
    private List<Complaint> complaints = new ArrayList<>();

    public Employee(String id, String login, String password, String name, String email,
                UserRole role, Date hireDate, double salary) {
        super(id, login, password, name, email, role);
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void sendComplaint(Complaint c) {
        complaints.add(c);
    }

    public List<Complaint> getComplaints() {
        return complaints;
    }
}
