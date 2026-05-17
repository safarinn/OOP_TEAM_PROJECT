package university.exceptions;

// Бросается в Student.setSupervisor() если supervisor.getHIndex() < 3
public class LowHIndexException extends Exception {
    public LowHIndexException(String message) {
        super(message);
    }
}
