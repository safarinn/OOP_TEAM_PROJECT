package university.exceptions;

// TODO [Нур]: бросать в Schedule.addLesson() и Room.book() если аудитория уже занята
public class RoomBookedException extends Exception {
    private static final long serialVersionUID = 506L;
    public RoomBookedException(String message) {
        super(message);
    }
}
