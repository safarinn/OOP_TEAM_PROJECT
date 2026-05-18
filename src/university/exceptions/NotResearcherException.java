package university.exceptions;

// TODO [Нурали]: бросать в ResearchProject.addParticipant() если участник не реализует Researcher
public class NotResearcherException extends Exception {
    private static final long serialVersionUID = 505L;
    public NotResearcherException(String message) {
        super(message);
    }
}
