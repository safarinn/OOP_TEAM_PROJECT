package university.exceptions;

// TODO [Нур]: бросать в Schedule.addLesson() и Room.book() если аудитория уже занята
public class RoomBookedException extends Exception {
    public RoomBookedException(String message) {
        super(message);
    }
}
