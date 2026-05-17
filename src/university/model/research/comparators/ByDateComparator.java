package university.model.research.comparators;

import university.model.research.ResearchPaper;

import java.util.Comparator;

/**
 * ============================================================
 * TODO [Нурали]: Реализовать компаратор ByDateComparator (паттерн Strategy)
 * ============================================================
 * Что нужно сделать:
 *  1. compare(a, b) — сортировка по publishDate (новее = раньше в списке)
 * ============================================================
 */
public class ByDateComparator implements Comparator<ResearchPaper> {

    @Override
    public int compare(ResearchPaper a, ResearchPaper b) {
        // TODO [Нурали]: b.getPublishDate().compareTo(a.getPublishDate()) — убывание по дате
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать compare() в ByDateComparator");
    }
}
