package university.model.research;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;


public interface Researcher extends Serializable {

    int getHIndex();

    void addPaper(ResearchPaper p);

    void addProject(ResearchProject p);

    void printPapers(Comparator<ResearchPaper> comparator);

    List<ResearchPaper> getPapers();

    List<ResearchProject> getProjects();
}
