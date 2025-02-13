package designpatterns5041.lab10.states;

public class ConsoleColor {

    public static final ConsoleColor ANSI_RESET = new ConsoleColor("\u001B[0m");
    public static final ConsoleColor ANSI_BLACK = new ConsoleColor("\u001B[30m");
    public static final ConsoleColor ANSI_RED = new ConsoleColor("\u001B[31m");
    public static final ConsoleColor ANSI_GREEN = new ConsoleColor("\u001B[32m");
    public static final ConsoleColor ANSI_YELLOW = new ConsoleColor("\u001B[33m");
    public static final ConsoleColor ANSI_BLUE = new ConsoleColor("\u001B[34m");
    public static final ConsoleColor ANSI_PURPLE = new ConsoleColor("\u001B[35m");
    public static final ConsoleColor ANSI_CYAN = new ConsoleColor( "\u001B[36m");
    public static final ConsoleColor ANSI_WHITE = new ConsoleColor("\u001B[37m");

    private String value;

    private ConsoleColor(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return value;
    }
}
