package bookstore;
import java.util.Currency;

import javax.swing.colorchooser.ColorSelectionModel;

public class ShoppingCart extends BookCollection implements ShoppingCartInterface {
    private Catalog catalog;

    public ShoppingCart(Catalog catinit){ 
        this.catalog = catinit;
        Catalog shoppingCart = new Catalog();
        for (StockInterface stock : shoppingCart.collection){
            stock.removeCopies(stock.numberOfCopies());
            collection.add(stock);
        }
    }
    

    @Override
    public double totalPrice() {
        double total = 0;
        for (StockInterface stock : collection){
            total += stock.numberOfCopies()*stock.totalPrice();
        }
        return total;
    }

    @Override
    public String checkout() {
        Payment payment = new Payment();
        int VISANumber = 47229456;
        String cardHolder = new String("John Smith");
        Currency currency = Currency.getInstance("EUR");
        payment.doPayment(VISANumber, cardHolder, totalPrice(), currency);
        return null;
    }

    @Override
    public void addCopies(int numberOfCopies, String booktitle){
        StockInterface stock = catalog.getStock( booktitle );
		if(stock.numberOfCopies() >= numberOfCopies){
            StockInterface cart = getStock(booktitle);
            cart.addCopies(numberOfCopies);
            stock.removeCopies(numberOfCopies);
        }
    }
    @Override
    public void removeCopies(int numberOfCopies, String booktitle){
        StockInterface cart = getStock( booktitle );
		if(cart.numberOfCopies() >= numberOfCopies){
            StockInterface stock = catalog.getStock(booktitle);
            stock.addCopies(numberOfCopies);
            cart.removeCopies(numberOfCopies);
        }
    }
        
}
