package bookstore;
public class TestBookStore {
    public static void main(String[] args) {
     
        Catalog catalog = new Catalog();
        ShoppingCart cart = new ShoppingCart(catalog);
        for(StockInterface stock:catalog.collection){
            System.out.printf("Book %s, price %f, copies %d", stock.getBooktitle(),stock.totalPrice(), stock.numberOfCopies());

        }
        BookStore store = new BookStore(catalog, cart);
        
    }
        
}
