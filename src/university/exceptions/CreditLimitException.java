package university.exceptions;

// Бросается в Student.registerCourse() если credits > 21
public class CreditLimitException extends Exception {
    private static final long serialVersionUID = 502L;
    public CreditLimitException(String message) {
        super(message);
    }
}
