package designpatterns5041.lab10;

public class Main {
    public static void main(String[] args) {
        TimerSetup setup = new TimerSetup();

        // Show current time
        setup.showDisplay();

        // Move to set hours
        setup.onTimerPressed();
        setup.showDisplay();

        // hours + 2
        setup.onUpPressed();
        setup.onUpPressed();
        setup.showDisplay();

        // change to minutes then - 3
        setup.onOkPressed();
        setup.onDownPressed();
        setup.onDownPressed();
        setup.onDownPressed();
        setup.showDisplay();

        // Change to completed
        setup.onOkPressed();
        setup.showDisplay();

        // Timer setup finished
        setup.onOkPressed();
        setup.showDisplay();

        System.out.println("Timer was set to " + setup.getTimerSet());
    }
}