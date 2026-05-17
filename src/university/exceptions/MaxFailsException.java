package university.exceptions;

// TODO [Рамазан]: бросать в Student, если fails > 3
public class MaxFailsException extends Exception {
    public MaxFailsException(String message) {
        super(message);
    }
}
