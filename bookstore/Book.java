package bookstore;
import java.util.Date;
 
public class Book {
    private String title;
    private String author;
    private Date publicationDate;
    private String publicationPlace;
    private long ISBN;


public Book(String tlinit, String auinit, Date dtinit, String plinit, long isbn){
    this.title = tlinit;
    this.author = auinit;
    this.publicationDate=dtinit;
    this.publicationPlace=plinit;
    this.ISBN=isbn;
}

public String getTitle(){
    return this.title;
}

public String getAuthor(){
    return this.author;
}

public Date getPublicationDate(){
    return this.publicationDate;
}

public String getPublicationPlace(){
    return this.publicationPlace;
}

public long getISBN(){
    return this.ISBN;
}

}
