package university.services;

import java.util.Date;

/**
 * ============================================================
 * TODO [Артем]: Реализовать класс Report
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать name; generatedAt = null (заполняется при generate())
 *  2. generate() — установить generatedAt = new Date(), сформировать содержимое отчёта
 *     (вывести в консоль или сохранить в строку)
 *  3. Геттеры getName(), getGeneratedAt()
 * ============================================================
 */
public class Report {

    private String name;
    private Date generatedAt;

    public Report(String name) {
        // TODO [Артем]: инициализировать name
        throw new UnsupportedOperationException("TODO [Артем]: реализовать конструктор Report");
    }

    public void generate() {
        // TODO [Артем]: установить generatedAt = new Date(), вывести/сформировать отчёт
        throw new UnsupportedOperationException("TODO [Артем]: реализовать generate()");
    }

    public String getName()        { return name; }
    public Date getGeneratedAt()   { return generatedAt; }
}
