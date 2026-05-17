package university.model.research;

import university.exceptions.NotResearcherException;

import java.util.Date;
import java.util.List;

/**
 * ============================================================
 * TODO [Нурали]: Реализовать класс ResearchProject
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать id, topic, startDate, endDate, пустые списки
 *  2. addParticipant(r) — добавить участника; если r не реализует Researcher
 *     → бросить NotResearcherException
 *     (Подсказка: проверить instanceof Researcher)
 *  3. addPaper(p) — добавить статью в список papers проекта
 *  4. Геттеры для всех полей
 * ============================================================
 */
public class ResearchProject {

    private String id;
    private String topic;
    private Date startDate;
    private Date endDate;
    private List<Researcher> participants;
    private List<ResearchPaper> papers;

    public ResearchProject(String id, String topic, Date startDate, Date endDate) {
        // TODO [Нурали]: инициализировать поля, создать пустые списки
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать конструктор ResearchProject");
    }

    public void addParticipant(Researcher r) throws NotResearcherException {
        // TODO [Нурали]: добавить r в participants; r должен реализовывать Researcher,
        //  иначе NotResearcherException (тип уже гарантирован интерфейсом — но проверить
        //  что r != null и не является "голым" User без обёртки)
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать addParticipant()");
    }

    public void addPaper(ResearchPaper p) {
        // TODO [Нурали]: добавить статью p в papers
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать addPaper()");
    }

    public String getId()                       { return id; }
    public String getTopic()                    { return topic; }
    public Date getStartDate()                  { return startDate; }
    public Date getEndDate()                    { return endDate; }
    public List<Researcher> getParticipants()   { return participants; }
    public List<ResearchPaper> getPapers()      { return papers; }
}
