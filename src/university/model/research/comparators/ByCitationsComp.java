package university.model.research.comparators;

import university.model.research.ResearchPaper;


import java.util.Comparator;


public class ByCitationsComp implements Comparator<ResearchPaper> {

    @Override
    public int compare(ResearchPaper a, ResearchPaper b) {
    	
        return Integer.compare(b.getCitations(), a.getCitations());
    }
}
