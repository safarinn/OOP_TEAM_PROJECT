package university.model.research.comparators;

import university.model.research.ResearchPaper;

import java.util.Comparator;

public class ByPagesComp implements Comparator<ResearchPaper> {

    @Override
    public int compare(ResearchPaper a, ResearchPaper b) {
        
    	int pagesA = parsePageCount(a.getPages());
    	int pagesB = parsePageCount(b.getPages());
    	
    	return Integer.compare(pagesB, pagesA);
    }

    private int parsePageCount(String pages) {
    	String[] parts = pages.split("-"); // pages хранится как String (например "1-15")
    	
    	int start = Integer.parseInt(parts[0]);
    	int end = Integer.parseInt(parts[1]);
    	
    	return end - start + 1;
    }
}

