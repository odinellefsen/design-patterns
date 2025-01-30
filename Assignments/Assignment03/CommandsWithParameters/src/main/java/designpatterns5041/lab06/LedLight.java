package designpatterns5041.lab06;

public class LedLight implements Unit {

    private int currentIntensity;

    private ConsoleColor consoleColor;

    public LedLight(ConsoleColor consoleColor) {
        this.consoleColor = consoleColor;
    }

    @Override
    public void setIntensity(int intensityPercentage) {

        if (intensityPercentage < 0)
        {
            intensityPercentage = 0;
        }
        else if (intensityPercentage > 100)
        {
            intensityPercentage = 100;
        }

        currentIntensity = intensityPercentage;

        displayState();
    }

    private void displayState()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(consoleColor.toString());
        sb.append("LED Intensity: ");
        sb.append(currentIntensity);
        sb.append("% ");
        sb.append("*".repeat(Math.max(0, currentIntensity / 5)));
        sb.append(ConsoleColor.ANSI_RESET);

        System.out.println(sb);
    }
}
