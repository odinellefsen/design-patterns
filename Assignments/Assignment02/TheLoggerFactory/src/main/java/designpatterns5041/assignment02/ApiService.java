package designpatterns5041.assignment02;

import designpatterns5041.assignment02.loggerfactories.LoggerFactory;
import designpatterns5041.assignment02.loggers.Logger;

public class ApiService {

    private Logger logger;

    public ApiService(LoggerFactory loggerFactory) {
        logger = loggerFactory.create();
    }

    public void getStuff1() {
        long start = System.currentTimeMillis();

        logger.log("getStuff1 called");

        try {

            logger.log("Doing work");

            // Simulate doing some work
            Thread.sleep((long)(Math.random() * 2000));

            logger.log("Work done");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        logger.log("getStuff1 is done and took " + (end - start) + "ms");
    }

    public void getStuff2() {
        long start = System.currentTimeMillis();

        logger.log("getStuff2 called");

        try {

            logger.log("Doing work");

            // Simulate doing some work
            Thread.sleep((long)(Math.random() * 2000));

            logger.log("Work done");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        logger.log("getStuff2 is done and took " + (end - start) + "ms");

    }

    public void getStuff3() {

        long start = System.currentTimeMillis();
        logger.log("getStuff3 called");

        try {

            logger.log("Doing work");

            // Simulate doing some work
            Thread.sleep((long)(Math.random() * 2000));

            logger.log("Work done");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        logger.log("getStuff3 is done and took " + (end - start) + "ms");
    }
}
