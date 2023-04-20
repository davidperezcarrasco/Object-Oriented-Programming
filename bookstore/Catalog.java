package bookstore;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.LinkedList;

public class Catalog extends BookCollection{
    public Catalog(){
        super();
        LinkedList< String[]> store = new LinkedList<>();
        store = BookCollection.readCatalog("bookstore\\books.xml");
        for(String[] s:store){
            Date date = new Date();
            try{ date = new SimpleDateFormat().parse( s[2]); }
            catch(Exception e){}
            long isbn = Long.parseLong(s[4]);
            double price = Double.parseDouble(s[5]);
            Currency currency = Currency.getInstance(s[6]);
            int copies = Integer.parseInt(s[7]);
            Book book = new Book(s[0], s[1], date, s[3], isbn);
            StockInterface stock = new Stock(book, price, currency, copies);
            super.collection.add(stock);
        }
        /*for(StockInterface stock:collection){
            System.out.printf("Book %s, price %f, copies %d", stock.getBooktitle(),stock.totalPrice(), stock.numberOfCopies());

        }*/
    }
}
