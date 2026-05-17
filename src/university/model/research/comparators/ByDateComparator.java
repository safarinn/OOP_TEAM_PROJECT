package university.model.research.comparators;

import university.model.research.ResearchPaper;


import java.util.Comparator;

public class ByDateComparator implements Comparator<ResearchPaper> {

    @Override
    public int compare(ResearchPaper a, ResearchPaper b) {
        
    	return b.getPublishDate().compareTo(a.getPublishDate());
    }
}
