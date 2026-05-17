package university.exceptions;

// TODO [Нур]: бросать в Schedule, если аудитория уже занята в это время (бонус)
public class RoomBookedException extends Exception {
    public RoomBookedException(String message) {
        super(message);
    }
}
