package university.model.research;

import university.model.users.User;

import java.util.Comparator;
import java.util.List;

/**
 * ============================================================
 * TODO [Нурали]: Реализовать абстрактный класс ResearcherDecorator
 * ============================================================
 * Паттерн: Decorator
 * Что нужно сделать:
 *  1. Конструктор — принять user, инициализировать hindex=0, пустые списки
 *  2. getHIndex() — вернуть hindex
 *  3. addPaper(p) — добавить статью в papers, пересчитать hindex
 *     (h-index = максимальное h: не менее h статей имеют >= h цитирований)
 *  4. addProject(p) — добавить проект в projects
 *  5. printPapers(comparator) — отсортировать papers по comparator и вывести
 *  6. getPapers() / getProjects() — геттеры
 * ============================================================
 */
public abstract class ResearcherDecorator implements Researcher {

    protected User user;
    protected int hindex;
    protected List<ResearchPaper> papers;
    protected List<ResearchProject> projects;

    public ResearcherDecorator(User user) {
        // TODO [Нурали]: инициализировать user, hindex=0, пустые списки
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать конструктор ResearcherDecorator");
    }

    @Override
    public int getHIndex() {
        // TODO [Нурали]: вернуть hindex
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать getHIndex()");
    }

    @Override
    public void addPaper(ResearchPaper p) {
        // TODO [Нурали]: добавить p в papers, пересчитать hindex
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать addPaper()");
    }

    @Override
    public void addProject(ResearchProject p) {
        // TODO [Нурали]: добавить p в projects
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать addProject()");
    }

    @Override
    public void printPapers(Comparator<ResearchPaper> comparator) {
        // TODO [Нурали]: отсортировать papers по comparator и вывести каждую статью
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать printPapers()");
    }

    @Override
    public List<ResearchPaper> getPapers() {
        // TODO [Нурали]: вернуть papers
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать getPapers()");
    }

    @Override
    public List<ResearchProject> getProjects() {
        // TODO [Нурали]: вернуть projects
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать getProjects()");
    }

    public User getUser() { return user; }

    protected int calculateHIndex() {
        // TODO [Нурали]: алгоритм h-index:
        //  отсортировать papers по citations DESC,
        //  найти максимальное h: papers[h-1].citations >= h
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать calculateHIndex()");
    }
}
