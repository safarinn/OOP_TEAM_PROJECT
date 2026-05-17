package university.exceptions;

// TODO [Рамазан]: бросать в Student.registerCourse(), если credits > 21
public class CreditLimitException extends Exception {
    public CreditLimitException(String message) {
        super(message);
    }
}
