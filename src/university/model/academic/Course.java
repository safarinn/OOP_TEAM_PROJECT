package university.model.academic;

import university.model.users.Student;
import university.model.users.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Course
 * ============================================================
 * Что нужно сделать:
 *  1. addInstructor(t) — добавить преподавателя в список instructors
 *  2. addStudent(s) — добавить студента; проверить, что студентов < maxStudents
 *  3. Геттеры: getCode(), getName(), getCredits(), getMaxStudents(),
 *              getInstructors(), getStudents(), getLessons()
 * ============================================================
 */
public class Course {

    private String code;
    private String name;
    private int credits;
    private int maxStudents;
    private List<Teacher> instructors;
    private List<Student> students;
    private List<Lesson> lessons;

    public Course(String code, String name, int credits, int maxStudents) {
        // TODO [Нур]: инициализировать поля, создать пустые списки
        throw new UnsupportedOperationException("TODO [Нур]: реализовать конструктор Course");
    }

    public void addInstructor(Teacher t) {
        // TODO [Нур]: добавить t в instructors
        throw new UnsupportedOperationException("TODO [Нур]: реализовать addInstructor()");
    }

    public void addStudent(Student s) {
        // TODO [Нур]: проверить students.size() < maxStudents, затем добавить
        throw new UnsupportedOperationException("TODO [Нур]: реализовать addStudent()");
    }

    public void addLesson(Lesson l) {
        // TODO [Нур]: добавить урок в lessons
        throw new UnsupportedOperationException("TODO [Нур]: реализовать addLesson()");
    }

    public String getCode()        { return code; }
    public String getName()        { return name; }
    public int getCredits()        { return credits; }
    public int getMaxStudents()    { return maxStudents; }
    public List<Teacher> getInstructors() { return instructors; }
    public List<Student> getStudents()    { return students; }
    public List<Lesson> getLessons()      { return lessons; }
}

