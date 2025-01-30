package designpatterns5041.assignment03;

public class Main {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        //ClassicSingletonConsoleLogger consoleLogger = ClassicSingletonConsoleLogger.getInstance();
        //ThreadSafeSingletonConsoleLogger consoleLogger = ThreadSafeSingletonConsoleLogger.getInstance();
        //DoubleCheckSingletonConsoleLogger consoleLogger = DoubleCheckSingletonConsoleLogger.getInstance();
        //EnumSingletonConsoleLogger consoleLogger = EnumSingletonConsoleLogger.UNIQUE_INSTANCE;
        consoleLogger.log("Six, 5, 4, 3, 2, 1, zero, all engine running. Liftoff! We have a liftoff, 32 minutes past the hour. Liftoff on Apollo 13.");

        ConsoleLogger consoleLogger2 = new ConsoleLogger();
        //ClassicSingletonConsoleLogger consoleLogger2 = ClassicSingletonConsoleLogger.getInstance();
        //ThreadSafeSingletonConsoleLogger consoleLogger2 = ThreadSafeSingletonConsoleLogger.getInstance();
        //DoubleCheckSingletonConsoleLogger consoleLogger2 = DoubleCheckSingletonConsoleLogger.getInstance();
        //EnumSingletonConsoleLogger consoleLogger2 = EnumSingletonConsoleLogger.UNIQUE_INSTANCE;
        consoleLogger2.log("Houston, we have a problem...!", true);

        System.out.println("Lines logged: " + consoleLogger.getLinesLogged());
    }
}