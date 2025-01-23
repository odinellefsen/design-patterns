package designpatterns5041.assignment02;

import designpatterns5041.assignment02.loggerfactories.*;

public class Main {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = null; // Remove this line after the ConsoleLoggerFactory is built
        //LoggerFactory loggerFactory = new ConsoleLoggerFactory();

        ApiService apiService = new ApiService(loggerFactory);

        apiService.getStuff1();
        apiService.getStuff2();
        apiService.getStuff3();
    }
}