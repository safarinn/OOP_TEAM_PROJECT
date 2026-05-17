package university.model.academic;

import university.exceptions.RoomBookedException;

import java.util.List;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Schedule (бонус)
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать пустой список lessons
 *  2. generate() — автоматически заполнить расписание уроками курсов
 *  3. checkConflicts() — проверить конфликты: одна аудитория, одно время
 *     → если конфликт — бросить RoomBookedException
 *  4. addLesson(l) — добавить урок с проверкой на конфликт
 * ============================================================
 */
public class Schedule {

    private List<Lesson> lessons;

    public Schedule() {
        // TODO [Нур]: инициализировать пустой список lessons
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

    public List<Lesson> getLessons() { return lessons; }
}
