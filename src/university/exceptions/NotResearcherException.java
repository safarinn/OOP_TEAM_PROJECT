package university.exceptions;

// TODO [Нурали]: бросать в ResearchProject.addParticipant() если участник не реализует Researcher
public class NotResearcherException extends Exception {
    public NotResearcherException(String message) {
        super(message);
    }
}
