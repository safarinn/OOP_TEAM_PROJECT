package university.model.research;

import university.exceptions.NotResearcherException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class ResearchProject {

    private String id;
    private String topic;
    private Date startDate;
    private Date endDate;
    private List<Researcher> participants;
    private List<ResearchPaper> papers;

    public ResearchProject(String id, String topic, Date startDate, Date endDate) {
        
    	this.id = id;
    	this.topic = topic;
    	this.startDate = startDate;
    	this.endDate = endDate;
    	
    	participants = new ArrayList<>();
    	papers = new ArrayList<>();
    }

    public void addParticipant(Researcher r) throws NotResearcherException {
        
    	if (r == null) {
    		throw new NotResearcherException("Participant must implement Researcher");
    	}
    	
    	participants.add(r);
    }

    public void addPaper(ResearchPaper p) {
        papers.add(p);
    }

    public String getId()                       { return id; }
    public String getTopic()                    { return topic; }
    public Date getStartDate()                  { return startDate; }
    public Date getEndDate()                    { return endDate; }
    public List<Researcher> getParticipants()   { return participants; }
    public List<ResearchPaper> getPapers()      { return papers; }
}
