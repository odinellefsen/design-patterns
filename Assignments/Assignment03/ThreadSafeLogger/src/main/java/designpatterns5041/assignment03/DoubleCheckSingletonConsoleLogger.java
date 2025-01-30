package designpatterns5041.assignment03;

public class DoubleCheckSingletonConsoleLogger {
    private static volatile DoubleCheckSingletonConsoleLogger instance;
    private int linesLogged;
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    
    private DoubleCheckSingletonConsoleLogger() {}
    
    public static DoubleCheckSingletonConsoleLogger getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingletonConsoleLogger.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingletonConsoleLogger();
                }
            }
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