package university.model.academic;

import university.model.users.Manager;
import java.io.Serializable;
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
public class News implements Serializable {

    private static final long serialVersionUID = 213L;

    private String title;
    private String body;
    private Manager author;
    private Date date;

    public News(String title, String body, Manager author) {
        this.title = title;
        this.body = body;
        this.author = author;
        this.date = new Date();
    }

    public String getTitle()       { return title; }
    public String getBody()        { return body; }
    public Manager getAuthor()     { return author; }
    public Date getDate()          { return date; }
    public void setTitle(String t) { this.title = t; }
    public void setBody(String b)  { this.body = b; }

    @Override
    public String toString() {
        return String.format("News{title='%s', author='%s'}", title, author.getName());
    }
}
