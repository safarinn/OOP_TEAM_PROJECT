package university.model.research;

import university.model.users.Teacher;

import university.model.users.User;

public class StudentResearcher extends ResearcherDecorator {

    private static final long serialVersionUID = 304L;

    public Teacher supervisorTeacher;

    public StudentResearcher(User user, Teacher supervisorTeacher) {
        super(user);
        this.supervisorTeacher = supervisorTeacher;
    }

    public Teacher getSupervisorTeacher() {
        return supervisorTeacher;
    }

    public void setSupervisorTeacher(Teacher t) {
        supervisorTeacher = t;
    }
}
