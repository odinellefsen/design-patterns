package designpatterns5041.assignment02;

import designpatterns5041.assignment02.loggerfactories.*;

public class Main {
    public static void main(String[] args) {
        // For normal console logging:
        // LoggerFactory loggerFactory = new ConsoleLoggerFactory();
        
        // For Rick Rolling:
        LoggerFactory loggerFactory = new RickRollingLoggerFactory();

        ApiService apiService = new ApiService(loggerFactory);

        apiService.getStuff1();
        apiService.getStuff2();
        apiService.getStuff3();
    }
}