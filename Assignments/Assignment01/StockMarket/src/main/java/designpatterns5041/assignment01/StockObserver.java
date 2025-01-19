package designpatterns5041.assignment01;

public class StockObserver implements Observer {
    private StockMarket stockMarket;
    private String symbol;
    private double threshold;
    private boolean hasNotSold = true;
    
    public StockObserver(StockMarket stockMarket, String symbol, double threshold) {
        this.stockMarket = stockMarket;
        this.symbol = symbol;
        this.threshold = threshold;
    }
    
    @Override
    public void update() {
        double currentPrice = stockMarket.getPrice(symbol);
        if (currentPrice > threshold && hasNotSold) {
            System.out.println("StockObserver - Selling " + symbol + " position at " + currentPrice);
            hasNotSold = false;
        }
    }
}