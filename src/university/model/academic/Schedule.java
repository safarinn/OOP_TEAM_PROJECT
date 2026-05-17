package university.model.academic;

import university.exceptions.RoomBookedException;
import university.model.users.Student;
import university.model.users.Teacher;

import java.util.List;

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
public class Schedule {

    private String semester;
    private List<Lesson> lessons;

    public Schedule(String semester) {
        // TODO [Нур]: инициализировать semester и пустой список lessons
        throw new UnsupportedOperationException("TODO [Нур]: реализовать конструктор Schedule");
    }

    public void generate() {
        // TODO [Нур]: алгоритм генерации расписания (бонус)
        throw new UnsupportedOperationException("TODO [Нур]: реализовать generate()");
    }

    public void checkConflicts() throws RoomBookedException {
        // TODO [Нур]: перебрать все уроки и найти совпадения по Room + Time
        throw new UnsupportedOperationException("TODO [Нур]: реализовать checkConflicts()");
    }

    public void addLesson(Lesson l) throws RoomBookedException {
        // TODO [Нур]: добавить l, предварительно проверить конфликт аудитории
        throw new UnsupportedOperationException("TODO [Нур]: реализовать addLesson()");
    }

    public Schedule forStudent(Student s) {
        // TODO [Нур]: вернуть новый Schedule с уроками курсов, на которые записан s
        throw new UnsupportedOperationException("TODO [Нур]: реализовать forStudent()");
    }

    public Schedule forTeacher(Teacher t) {
        // TODO [Нур]: вернуть новый Schedule с уроками курсов, которые ведёт t
        throw new UnsupportedOperationException("TODO [Нур]: реализовать forTeacher()");
    }

    public String getSemester()        { return semester; }
    public List<Lesson> getLessons()   { return lessons; }
}
