package designpatterns5041.assignment01;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String symbol;
    private double price;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void tradeStock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        System.out.printf("StockMarket - %s traded at USD %.2f%n", symbol, price);
        notifyObservers();
    }

    public double getPrice(String symbol) {
        return this.symbol.equals(symbol) ? this.price : 0.0;
    }
}