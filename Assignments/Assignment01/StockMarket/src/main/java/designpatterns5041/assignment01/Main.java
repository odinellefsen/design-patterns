package designpatterns5041.assignment01;

public class Main {
    public static void main(String[] args) {
        // Create the stock market
        StockMarket stockMarket = new StockMarket();

        // Create StockObservers that will sell when values is above threshold
        StockObserver stockObserver1 = new StockObserver(stockMarket, "MSFT", 87.5);
        StockObserver stockObserver2 = new StockObserver(stockMarket, "FB", 177);

        // Register Observers
        stockMarket.registerObserver(stockObserver1);
        stockMarket.registerObserver(stockObserver2);

        // Simulate some trades
        stockMarket.tradeStock("MSFT", 87.1);
        stockMarket.tradeStock("FB", 176.1);
        stockMarket.tradeStock("GOOG", 1234.57);
        stockMarket.tradeStock("MSFT", 87.4);
        stockMarket.tradeStock("FB", 177.0);
        stockMarket.tradeStock("MSFT", 87.6);
        stockMarket.tradeStock("FB", 176.9);
        stockMarket.tradeStock("MSFT", 87.4);
        stockMarket.tradeStock("FB", 177.2);
        stockMarket.tradeStock("MSFT", 87.7);
        stockMarket.tradeStock("FB", 176.2);
        stockMarket.tradeStock("FB", 177.9);
        stockMarket.tradeStock("GOOG", 1234.58);
    }
}