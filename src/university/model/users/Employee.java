package university.model.users;

import university.enums.UserRole;
import university.model.academic.Complaint;
import university.services.Message;
import university.services.MessageService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee extends User {

    private static final long serialVersionUID = 105L;

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

    public void sendMessage(MessageService ms, Message m) {
        ms.send(m);
    }

    public List<Complaint> getComplaints() {
        return complaints;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
