package university.services;

import university.model.research.ResearchPaper;
import university.model.research.Researcher;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
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
public class University implements Serializable {

    private static final long serialVersionUID = 401L;

    private List<School> schools;
    private List<Researcher> researchers;

    public University() {
        this.schools = new ArrayList<>();
        this.researchers = new ArrayList<>();
    }

    public void addSchool(School s) {
        schools.add(s);
    }

    public void addResearcher(Researcher r) {
        researchers.add(r);
    }

    public Researcher topCitedOfSchool(School s) {
        return s.getMembers().stream()
            .filter(u -> u instanceof Researcher)
            .map(u -> (Researcher) u)
            .max(Comparator.comparingInt(r ->
                r.getPapers().stream()
                    .mapToInt(ResearchPaper::getCitations)
                    .sum()
            ))
            .orElse(null);
    }

    public Researcher topCitedOfYear(int year) {
        return researchers.stream()
            .filter(r -> r.getPapers().stream().anyMatch(p -> {
                Calendar cal = Calendar.getInstance();
                cal.setTime(p.getPublishDate());
                return cal.get(Calendar.YEAR) == year;
            }))
            .max(Comparator.comparingInt(Researcher::getHIndex))
            .orElse(null);
    }

    public void printAllPapers(Comparator<ResearchPaper> comparator) {
        researchers.stream()
            .flatMap(r -> r.getPapers().stream())
            .sorted(comparator)
            .forEach(System.out::println);
    }

    public List<School> getSchools()           { return schools; }
    public List<Researcher> getResearchers()   { return researchers; }
}
