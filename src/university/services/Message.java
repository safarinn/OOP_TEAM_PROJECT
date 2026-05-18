package university.services;

import university.model.users.Employee;

import java.io.Serializable;
import java.util.Date;

/**
 * ============================================================
 * TODO [Артем]: Реализовать класс Message
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать from, to, subject, body; date = new Date()
 *  2. Геттеры для всех полей
 *  3. toString() — читаемый вывод: "От: X → Кому: Y | Тема: subject"
 * ============================================================
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 404L;

    private Employee from;
    private Employee to;
    private String subject;
    private String body;
    private Date date;

    public Message(Employee from, Employee to, String subject, String body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.date = new Date();
    }

    public Employee getFrom()   { return from; }
    public Employee getTo()     { return to; }
    public String getSubject()  { return subject; }
    public String getBody()     { return body; }
    public Date getDate()       { return date; }

    @Override
    public String toString() {
        return "From: " + from.getName() + " → To: " + to.getName() + " | Subject: " + subject;
    }
}
