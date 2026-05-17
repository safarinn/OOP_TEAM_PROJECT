import java.io.Serializable;
import java.util.Date;

public class Lesson implements Serializable {
    private static final long serialVersionUID = 202L;

    private String id;
    private LessonType type;
    private String topic;
    private Date time;

    public Lesson(String id, LessonType type, String topic, Date time) {
        this.id = id;
        this.type = type;
        this.topic = topic;
        this.time = time;
    }

    public LessonType getType() {
        return type;
    }

    public Room getRoom() {
        return null;
    }
}