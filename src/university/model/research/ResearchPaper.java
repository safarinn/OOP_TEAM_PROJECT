package university.model.research;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class ResearchPaper implements Comparable<ResearchPaper>, Serializable {

    private static final long serialVersionUID = 301L;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResearchPaper that = (ResearchPaper) o;
        return Objects.equals(doi, that.doi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doi);
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
        Calendar cal = Calendar.getInstance();
        cal.setTime(publishDate);
        return title + ". "
        		+ String.join(", ", authors) + ". "
        		+ journal + ", "
        		+ cal.get(Calendar.YEAR) + ". "
        		+ doi + ".";
    }
}
