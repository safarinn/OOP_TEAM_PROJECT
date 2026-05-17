package university.model.research;

import java.util.Comparator;
import java.util.List;

/**
 * ============================================================
 * TODO [Нурали]: Это интерфейс — реализацию писать в ResearcherDecorator
 * ============================================================
 * Паттерн Decorator:
 *  Researcher — интерфейс (эта роль)
 *  ResearcherDecorator — абстрактный декоратор
 *  StudentResearcher / EmployeeResearcher — конкретные декораторы
 * ============================================================
 */
public interface Researcher {

    int getHIndex();

    void addPaper(ResearchPaper p);

    void addProject(ResearchProject p);

    void printPapers(Comparator<ResearchPaper> comparator);

    List<ResearchPaper> getPapers();

    List<ResearchProject> getProjects();
}
