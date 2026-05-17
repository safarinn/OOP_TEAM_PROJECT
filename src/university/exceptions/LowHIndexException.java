package university.exceptions;

// TODO [Нурали]: бросать если supervisor.getHIndex() < 3 при назначении руководителя
public class LowHIndexException extends Exception {
    public LowHIndexException(String message) {
        super(message);
    }
}
