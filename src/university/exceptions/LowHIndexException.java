package university.exceptions;

// Бросается в Student.setSupervisor() если supervisor.getHIndex() < 3
public class LowHIndexException extends Exception {
    private static final long serialVersionUID = 503L;
    public LowHIndexException(String message) {
        super(message);
    }
}
