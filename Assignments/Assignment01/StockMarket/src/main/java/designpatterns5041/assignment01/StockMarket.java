package designpatterns5041.assignment01;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<StockObserver> observers = new ArrayList<>();
    
    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }
    
    public void tradeStock(String symbol, double price) {
        System.out.printf("StockMarket - %s traded at USD %.2f%n", symbol, price);
        // Notify all observers about the trade
        for (StockObserver observer : observers) {
            observer.update(symbol, price);
        }
    }
}