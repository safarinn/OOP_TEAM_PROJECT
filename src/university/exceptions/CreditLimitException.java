package university.exceptions;

// Бросается в Student.registerCourse() если credits > 21
public class CreditLimitException extends Exception {
    public CreditLimitException(String message) {
        super(message);
    }
}
