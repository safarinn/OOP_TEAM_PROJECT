package university.model.academic;

import university.enums.LessonType;
import java.io.Serializable;
import java.util.Date;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Lesson
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать все поля
 *  2. getType() — вернуть type
 *  3. Геттеры для всех полей: getId(), getTopic(), getRoom(), getTime()
 * ============================================================
 */
public class Lesson implements Serializable {

    private static final long serialVersionUID = 211L;

    private String id;
    private LessonType type;
    private String topic;
    private Room room;
    private Date time;

    public Lesson(String id, LessonType type, String topic, Room room, Date time) {
        this.id = id;
        this.type = type;
        this.topic = topic;
        this.room = room;
        this.time = time;
    }

    public LessonType getType() {
        return type;
    }

    public String getId()   { return id; }
    public String getTopic() { return topic; }
    public Room getRoom()   { return room; }
    public Date getTime()   { return time; }
}
