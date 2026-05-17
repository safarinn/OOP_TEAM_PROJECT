package university.model.academic;

import university.model.users.Manager;

import java.util.Date;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс News (бонус)
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать title, body, author; date = new Date()
 *  2. Геттеры и сеттеры для title и body
 *  3. Геттеры для author и date
 * ============================================================
 */
public class News {

    private String title;
    private String body;
    private Manager author;
    private Date date;

    public News(String title, String body, Manager author) {
        // TODO [Нур]: инициализировать title, body, author; date = new Date()
        throw new UnsupportedOperationException("TODO [Нур]: реализовать конструктор News");
    }

    public String getTitle()       { return title; }
    public String getBody()        { return body; }
    public Manager getAuthor()     { return author; }
    public Date getDate()          { return date; }
    public void setTitle(String t) {
        // TODO [Нур]: установить title
        throw new UnsupportedOperationException("TODO [Нур]: реализовать setTitle()");
    }
    public void setBody(String b)  {
        // TODO [Нур]: установить body
        throw new UnsupportedOperationException("TODO [Нур]: реализовать setBody()");
    }
}
