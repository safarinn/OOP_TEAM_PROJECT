package university.services;

import university.model.users.Employee;

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
public class Message {

    private Employee from;
    private Employee to;
    private String subject;
    private String body;
    private Date date;

    public Message(Employee from, Employee to, String subject, String body) {
        // TODO [Артем]: инициализировать from, to, subject, body; date = new Date()
        throw new UnsupportedOperationException("TODO [Артем]: реализовать конструктор Message");
    }

    public Employee getFrom()   { return from; }
    public Employee getTo()     { return to; }
    public String getSubject()  { return subject; }
    public String getBody()     { return body; }
    public Date getDate()       { return date; }

    @Override
    public String toString() {
        // TODO [Артем]: вернуть читаемое представление сообщения
        throw new UnsupportedOperationException("TODO [Артем]: реализовать toString()");
    }
}
