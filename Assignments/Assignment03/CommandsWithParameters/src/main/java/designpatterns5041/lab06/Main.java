package designpatterns5041.lab06;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LedLight light1 = new LedLight(ConsoleColor.ANSI_CYAN);
        LedLight light2 = new LedLight(ConsoleColor.ANSI_RED);
        LedLight light3 = new LedLight(ConsoleColor.ANSI_YELLOW);

        SetCommandFactory factory = new DefaultSetCommandFactory(light1, light2, light3);
        // LoggingSwitch invoker = new LoggingSwitch();

        Random random = new Random();
        int timesToRun = random.nextInt(1, 6);
        for(int i = 0; i < timesToRun; i++)
        {
            // TODO
            // Command command = factory.createCommand ... ; <--- Create a SetCommand with random parameters
            // Execute the command using the invoker

            Thread.sleep(random.nextInt(5000));
        }

        // Print out execution history from the Invoker here
    }
}