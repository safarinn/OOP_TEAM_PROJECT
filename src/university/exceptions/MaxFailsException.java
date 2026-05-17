package university.exceptions;

// Бросается в Student.incrementFails() если fails > 3
public class MaxFailsException extends Exception {
    public MaxFailsException(String message) {
        super(message);
    }
}
