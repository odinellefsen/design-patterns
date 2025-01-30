package designpatterns5041.assignment03;

public enum EnumSingletonConsoleLogger {
    UNIQUE_INSTANCE;
    
    private int linesLogged;
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    
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