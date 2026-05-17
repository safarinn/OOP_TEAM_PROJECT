package university.model.academic;

import university.enums.RoomType;
import university.exceptions.RoomBookedException;

import java.util.Date;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Room (бонус)
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать number, type, capacity
 *  2. Геттеры для всех полей
 *  3. isFree(time) — вернуть true если аудитория свободна в это время
 *  4. book(lesson) — забронировать аудиторию под урок;
 *     если уже занята — бросить RoomBookedException
 * ============================================================
 */
public class Room {

    private String number;
    private RoomType type;
    private int capacity;

    public Room(String number, RoomType type, int capacity) {
        // TODO [Нур]: инициализировать поля
        throw new UnsupportedOperationException("TODO [Нур]: реализовать конструктор Room");
    }

    public boolean isFree(Date time) {
        // TODO [Нур]: проверить нет ли урока в это время в этой аудитории
        throw new UnsupportedOperationException("TODO [Нур]: реализовать isFree()");
    }

    public void book(Lesson lesson) throws RoomBookedException {
        // TODO [Нур]: если isFree(lesson.getTime()) — забронировать, иначе RoomBookedException
        throw new UnsupportedOperationException("TODO [Нур]: реализовать book()");
    }

    public String getNumber()  { return number; }
    public RoomType getType()  { return type; }
    public int getCapacity()   { return capacity; }
}
