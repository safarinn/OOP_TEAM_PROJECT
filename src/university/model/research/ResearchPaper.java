package university.model.research;

import java.util.Date;
import java.util.List;

/**
 * ============================================================
 * TODO [Нурали]: Реализовать класс ResearchPaper
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать все поля
 *  2. compareTo(o) — сравнивать по citations (по умолчанию, для Comparable)
 *  3. Геттеры для всех полей
 *  4. toString() — читаемый вывод: "Название. Авторы. Журнал, Год. DOI."
 * ============================================================
 */
public class ResearchPaper implements Comparable<ResearchPaper> {

    private String title;
    private List<String> authors;
    private String journal;
    private String pages;
    private Date publishDate;
    private int citations;
    private String doi;

    public ResearchPaper(String title, List<String> authors, String journal,
                         String pages, Date publishDate, int citations, String doi) {
        // TODO [Нурали]: инициализировать все поля
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать конструктор ResearchPaper");
    }

    @Override
    public int compareTo(ResearchPaper o) {
        // TODO [Нурали]: сравнивать по citations (убывание)
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать compareTo()");
    }

    public String getTitle()           { return title; }
    public List<String> getAuthors()   { return authors; }
    public String getJournal()         { return journal; }
    public String getPages()           { return pages; }
    public Date getPublishDate()       { return publishDate; }
    public int getCitations()          { return citations; }
    public String getDoi()             { return doi; }

    public void addCitation() {
        // TODO [Нурали]: увеличить citations на 1
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать addCitation()");
    }

    @Override
    public String toString() {
        // TODO [Нурали]: вернуть читаемое представление статьи
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать toString()");
    }
}
