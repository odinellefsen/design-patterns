package designpatterns5041.lab10.states;

public class Display {
    private final ConsoleColor color;
    private final String text;

    public Display(ConsoleColor consoleColor, String text) {
        this.color = consoleColor;
        this.text = text;
    }

    public ConsoleColor getColor() {
        return color;
    }

    public String getText() {
        return text;
    }
}
