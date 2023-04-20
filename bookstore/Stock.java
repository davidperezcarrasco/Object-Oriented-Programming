package bookstore;
import java.util.Currency;
 
public class Stock implements StockInterface {
    private Book book;
    private int copies;
    private double price;
    private Currency currency;
 
    public Stock(Book bookinit, double priceinit, Currency curinit, int copinit){
        this.book=bookinit;
        this.copies=copinit;
        this.price=priceinit;
        this.currency=curinit;
    }
 
    public Book getBook(){
        return this.book;
    }
 
    public String getBooktitle(){
        return this.book.getTitle();
    }
 
    public int numberOfCopies(){
        return this.copies;
    }
 
    public void addCopies(int numberOfCopies){
        this.copies+=numberOfCopies;
    }
 
    public void removeCopies(int numberOfCopies){
        this.copies-=numberOfCopies;
    }
 
    public double totalPrice(){
        return this.price;
    }
}
