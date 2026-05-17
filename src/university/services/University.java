package university.services;

import university.model.research.ResearchPaper;
import university.model.research.Researcher;

import java.util.Comparator;
import java.util.List;

/**
 * ============================================================
 * TODO [Артем]: Реализовать класс University (паттерн Facade)
 * ============================================================
 * Паттерн: Facade
 * University — единая точка входа для операций на уровне всей системы.
 * Что нужно сделать:
 *  1. Конструктор — инициализировать пустые списки schools и researchers
 *  2. addSchool(s) — добавить школу в список
 *  3. addResearcher(r) — добавить исследователя в список
 *  4. topCitedOfSchool(s) — найти Researcher с наибольшим суммарным числом цитирований
 *     среди участников школы s
 *  5. topCitedOfYear(year) — найти Researcher с наибольшим h-index среди тех,
 *     кто опубликовал статью в заданном году
 *  6. printAllPapers(comparator) — вывести все статьи всех исследователей,
 *     отсортированные по comparator
 * ============================================================
 */
public class University {

    private List<School> schools;
    private List<Researcher> researchers;

    public University() {
        // TODO [Артем]: инициализировать пустые списки schools и researchers
        throw new UnsupportedOperationException("TODO [Артем]: реализовать конструктор University");
    }

    public void addSchool(School s) {
        // TODO [Артем]: добавить s в schools
        throw new UnsupportedOperationException("TODO [Артем]: реализовать addSchool()");
    }

    public void addResearcher(Researcher r) {
        // TODO [Артем]: добавить r в researchers
        throw new UnsupportedOperationException("TODO [Артем]: реализовать addResearcher()");
    }

    public Researcher topCitedOfSchool(School s) {
        // TODO [Артем]: среди members школы s найти того, кто реализует Researcher
        //  и у кого наибольшая суммарная сумма citations по всем статьям
        throw new UnsupportedOperationException("TODO [Артем]: реализовать topCitedOfSchool()");
    }

    public Researcher topCitedOfYear(int year) {
        // TODO [Артем]: среди всех researchers найти того, у кого наибольший hIndex
        //  и у кого есть хотя бы одна статья, опубликованная в году year
        throw new UnsupportedOperationException("TODO [Артем]: реализовать topCitedOfYear()");
    }

    public void printAllPapers(Comparator<ResearchPaper> comparator) {
        // TODO [Артем]: собрать все статьи всех researchers, отсортировать, вывести
        throw new UnsupportedOperationException("TODO [Артем]: реализовать printAllPapers()");
    }

    public List<School> getSchools()           { return schools; }
    public List<Researcher> getResearchers()   { return researchers; }
}
