package university.model.academic;

import university.exceptions.RoomBookedException;
import university.model.users.Student;
import university.model.users.Teacher;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Schedule (бонус)
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать semester и пустой список lessons
 *  2. generate() — автоматически заполнить расписание уроками курсов
 *  3. checkConflicts() — проверить конфликты: одна аудитория, одно время
 *     → если конфликт — бросить RoomBookedException
 *  4. addLesson(l) — добавить урок с проверкой на конфликт
 *  5. forStudent(s) — вернуть расписание только для студента s
 *  6. forTeacher(t) — вернуть расписание только для учителя t
 * ============================================================
 */
public class Schedule implements Serializable {

    private static final long serialVersionUID = 215L;

    private String semester;
    private List<Lesson> lessons;

    public Schedule(String semester) {
        this.semester = semester;
        this.lessons = new ArrayList<>();
    }

    public void generate() {
       
    }

    public void checkConflicts() throws RoomBookedException {
        for (int i = 0; i < lessons.size(); i++) {
            for (int j = i + 1; j < lessons.size(); j++) {
                Lesson l1 = lessons.get(i);
                Lesson l2 = lessons.get(j);
                
                if (l1.getRoom() != null && l2.getRoom() != null && l1.getTime() != null && l2.getTime() != null) {
                    if (l1.getRoom().getNumber().equals(l2.getRoom().getNumber()) && l1.getTime().equals(l2.getTime())) {
                        throw new RoomBookedException("Conflict detected: Room " + l1.getRoom().getNumber() + " is booked at " + l1.getTime());
                    }
                }
            }
        }
      }

    public void addLesson(Lesson l) throws RoomBookedException {
       if (l == null) return;
        
        // Временная проверка добавляемого урока со всеми имеющимися в расписании
        if (l.getRoom() != null && l.getTime() != null) {
            for (Lesson existing : lessons) {
                if (existing.getRoom() != null && existing.getTime() != null) {
                    if (existing.getRoom().getNumber().equals(l.getRoom().getNumber()) && existing.getTime().equals(l.getTime())) {
                        throw new RoomBookedException("Conflict detected: Room " + l.getRoom().getNumber() + " is already booked at " + l.getTime());
                    }
                }
            }
        }
        lessons.add(l);
    }

    public Schedule forStudent(Student s) {
        Schedule studentSchedule = new Schedule(this.semester);
        if (s == null || s.getRegisteredCourses() == null) return studentSchedule;

        for (Lesson l : this.lessons) {
            // Проверяем все курсы, на которые зарегистрирован студент
            for (Course c : s.getRegisteredCourses()) {
                if (c.getLessons() != null && c.getLessons().contains(l)) {
                    studentSchedule.lessons.add(l);
                    break;
                }
            }
        }
        return studentSchedule;
    }

    public Schedule forTeacher(Teacher t) {
        Schedule teacherSchedule = new Schedule(this.semester);
        if (t == null || t.getAssignedCourses() == null) return teacherSchedule;

        for (Lesson l : this.lessons) {
            // Проверяем все курсы, закрепленные за преподавателем
            for (Course c : t.getAssignedCourses()) {
                if (c.getLessons() != null && c.getLessons().contains(l)) {
                    teacherSchedule.lessons.add(l);
                    break;
                }
            }
        }
        return teacherSchedule;
    }

    public String getSemester()        { return semester; }
    public List<Lesson> getLessons()   { return lessons; }
}
