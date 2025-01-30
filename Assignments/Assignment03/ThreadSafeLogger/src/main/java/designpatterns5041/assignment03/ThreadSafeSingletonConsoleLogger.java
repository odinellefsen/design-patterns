package designpatterns5041.assignment03;

public class ThreadSafeSingletonConsoleLogger {
    private static ThreadSafeSingletonConsoleLogger instance;
    private int linesLogged;
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    
    private ThreadSafeSingletonConsoleLogger() {}
    
    public static synchronized ThreadSafeSingletonConsoleLogger getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingletonConsoleLogger();
        }
        return instance;
    }
    
    public void log(String line) {
        log(line, false);
    }
    
    public int getLinesLogged() {
        return linesLogged;
    }
    
    public void log(String line, boolean error) {
        if(error) {
            System.out.println(ANSI_RED + line + ANSI_RESET);
        } else {
            System.out.println(line);
        }
        linesLogged++;
    }
} 