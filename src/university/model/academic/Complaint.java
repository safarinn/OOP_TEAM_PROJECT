package university.model.academic;

import university.model.users.Employee;

import java.util.Date;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Complaint
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать from, text, date
 *  2. Геттеры для всех полей
 * ============================================================
 */
public class Complaint {

    private Employee from;
    private String text;
    private Date date;

    public Complaint(Employee from, String text) {
        // TODO [Нур]: инициализировать from, text; date = new Date() (текущее время)
        throw new UnsupportedOperationException("TODO [Нур]: реализовать конструктор Complaint");
    }

    public Employee getFrom() { return from; }
    public String getText()   { return text; }
    public Date getDate()     { return date; }
}
