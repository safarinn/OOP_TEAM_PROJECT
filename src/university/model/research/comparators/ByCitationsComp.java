package university.model.research.comparators;

import university.model.research.ResearchPaper;

import java.util.Comparator;

/**
 * ============================================================
 * TODO [Нурали]: Реализовать компаратор ByCitationsComp (паттерн Strategy)
 * ============================================================
 * Что нужно сделать:
 *  1. compare(a, b) — сортировка по citations по убыванию
 *     (больше цитирований = статья "важнее")
 * ============================================================
 */
public class ByCitationsComp implements Comparator<ResearchPaper> {

    @Override
    public int compare(ResearchPaper a, ResearchPaper b) {
        // TODO [Нурали]: вернуть b.getCitations() - a.getCitations()
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать compare() в ByCitationsComp");
    }
}
