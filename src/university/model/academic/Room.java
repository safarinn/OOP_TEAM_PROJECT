package university.model.academic;

import university.enums.RoomType;
import university.exceptions.RoomBookedException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class Room implements Serializable {

    private static final long serialVersionUID = 204L;

    private String number;
    private RoomType type;
    private int capacity;
    private List<Lesson> bookedLessons = new ArrayList<>();


    public Room(String number, RoomType type, int capacity) {
        this.number = number;
        this.type = type;
        this.capacity = capacity;
    }

    public boolean isFree(Date time) {
        if (time == null) return true;
        for (Lesson l : bookedLessons) {
            if (l.getTime() != null && l.getTime().equals(time)) {
                return false;
            }
        }
        return true;
    }

    public void book(Lesson lesson) throws RoomBookedException {
       if (lesson == null) return;
        if (!isFree(lesson.getTime())) {
            throw new RoomBookedException("Room " + number + " is already booked for " + lesson.getTime());
        }
        bookedLessons.add(lesson);
    }

    public String getNumber()  { return number; }
    public RoomType getType()  { return type; }
    public int getCapacity()   { return capacity; }
    public List<Lesson> getBookedLessons() { return bookedLessons; }
}

