package university.model.research;

import java.util.Date;
import java.util.List;


public class ResearchPaper implements Comparable<ResearchPaper> {

    private String title;
    private List<String> authors;
    private String journal;
    private String pages;
    private Date publishDate;
    private int citations;
    private String doi;

    public ResearchPaper(String title, List<String> authors, String journal,
                         String pages, Date publishDate, int citations, String doi) {
    	this.title = title;
    	this.authors = authors;
    	this.journal = journal;
    	this.pages = pages;
    	this.publishDate = publishDate;
    	this.citations = citations;
    	this.doi = doi;
    	
    }

    @Override
    public int compareTo(ResearchPaper o) {
        return Integer.compare(o.citations, this.citations);
    }

    public String getTitle()           { return title; }
    public List<String> getAuthors()   { return authors; }
    public String getJournal()         { return journal; }
    public String getPages()           { return pages; }
    public Date getPublishDate()       { return publishDate; }
    public int getCitations()          { return citations; }
    public String getDoi()             { return doi; }

    public void addCitation() {
    	citations++;
    }

    @Override
    public String toString() {
        return title + ". "
        		+ String.join(", ", authors) + ". "
        		+ journal + ", "
        		+ publishDate.getYear() + ". "
        		+ doi + ".";
    }
}
