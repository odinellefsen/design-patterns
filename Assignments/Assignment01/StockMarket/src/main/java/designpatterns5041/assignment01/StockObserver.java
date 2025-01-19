package designpatterns5041.assignment01;

public class StockObserver implements Observer {
    private final StockMarket stockMarket;
    private final String symbol;
    private final double threshold;
    private boolean hasNotSold = true;
    
    public StockObserver(StockMarket stockMarket, String symbol, double threshold) {
        this.stockMarket = stockMarket;
        this.symbol = symbol;
        this.threshold = threshold;
    }
    
    @Override
    public void update(String symbol, double price) {
        if (this.symbol.equals(symbol) && price > threshold && hasNotSold) {
            System.out.println("StockObserver - Selling " + symbol + " position");
            hasNotSold = false;
        }
    }
} 