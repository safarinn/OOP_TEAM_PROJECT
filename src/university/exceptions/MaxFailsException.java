package university.exceptions;

// Бросается в Student.incrementFails() если fails > 3
public class MaxFailsException extends Exception {
    private static final long serialVersionUID = 504L;
    public MaxFailsException(String message) {
        super(message);
    }
}
