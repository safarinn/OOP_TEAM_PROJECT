package university.exceptions;

// TODO [Артем]: бросать в AuthenticationService.login() если логин/пароль неверны
public class AuthenticationException extends Exception {
    private static final long serialVersionUID = 501L;
    public AuthenticationException(String message) {
        super(message);
    }
}
