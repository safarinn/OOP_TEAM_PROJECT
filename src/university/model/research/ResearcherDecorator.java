package university.model.research;

import university.model.users.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class ResearcherDecorator implements Researcher, Serializable {

    private static final long serialVersionUID = 303L;

    protected User user;
    protected int hindex;
    protected List<ResearchPaper> papers;
    protected List<ResearchProject> projects;

    public ResearcherDecorator(User user) {
        this.user = user;
        this.hindex = 0;
        this.papers = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    @Override
    public int getHIndex() {
        return hindex;
    }

    @Override
    public void addPaper(ResearchPaper p) {
        papers.add(p);
        hindex = calculateHIndex();
    }

    @Override
    public void addProject(ResearchProject p) {
        projects.add(p);
    }

    @Override
    public void printPapers(Comparator<ResearchPaper> comparator) {
        papers.sort(comparator);
        
        for (ResearchPaper paper : papers) {
        	System.out.println(paper);
        }
    }

    @Override
    public List<ResearchPaper> getPapers() {
        return papers;
    }

    @Override
    public List<ResearchProject> getProjects() {
        return projects;
    }

    public User getUser() { return user; }

    protected int calculateHIndex() {
        List<ResearchPaper> sortedPapers = new ArrayList<>(papers);
        
        sortedPapers.sort(new Comparator<ResearchPaper>() {
        	@Override
        	public int compare(ResearchPaper p1, ResearchPaper p2) {
        		return Integer.compare(p2.getCitations(), p1.getCitations());
        	}
        });
        
        int h = 0;
        
        for (int i = 0; i < sortedPapers.size(); i++) {
        	if (sortedPapers.get(i).getCitations() >= i + 1) {
        		h = i + 1;
        	} else {
        		break;
        	}
        }
        
        return h;
    }
}
