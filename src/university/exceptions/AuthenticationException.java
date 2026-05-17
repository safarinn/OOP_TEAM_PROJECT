package university.exceptions;

// TODO [Артем]: бросать в AuthenticationService.login(), если логин/пароль неверны
public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
