package university.model.academic;

import university.model.users.Employee;

import java.util.Date;
import java.io.Serializable;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Complaint
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать from, text, date
 *  2. Геттеры для всех полей
 * ============================================================
 */ 
public class Complaint implements Serializable {

    private static final long serialVersionUID = 209L;

    private Employee from;
    private String text;
    private Date date;

    public Complaint(Employee from, String text) {
        this.from = from;
        this.text = text;
        this.date = new Date();
        
    }

    public Employee getFrom() { return from; }
    public String getText()   { return text; }
    public Date getDate()     { return date; }

    @Override
    public String toString() {
        return String.format("Complaint{from='%s', text='%s'}", from.getName(), text);
    }
}
