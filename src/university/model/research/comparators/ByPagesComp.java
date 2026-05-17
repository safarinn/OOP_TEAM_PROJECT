package university.model.research.comparators;

import university.model.research.ResearchPaper;

import java.util.Comparator;

/**
 * ============================================================
 * TODO [Нурали]: Реализовать компаратор ByPagesComp (паттерн Strategy)
 * ============================================================
 * Что нужно сделать:
 *  1. compare(a, b) — сортировка по количеству страниц (по убыванию)
 *  2. pages хранится как String (например "1-15") — нужно распарсить и посчитать кол-во страниц
 *     Подсказка: pages.split("-") → [start, end] → end - start + 1
 * ============================================================
 */
public class ByPagesComp implements Comparator<ResearchPaper> {

    @Override
    public int compare(ResearchPaper a, ResearchPaper b) {
        // TODO [Нурали]: распарсить pages из обеих статей, сравнить количество страниц
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать compare() в ByPagesComp");
    }

    private int parsePageCount(String pages) {
        // TODO [Нурали]: разобрать "1-15" → 15, "5-20" → 16, etc.
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать parsePageCount()");
    }
}
