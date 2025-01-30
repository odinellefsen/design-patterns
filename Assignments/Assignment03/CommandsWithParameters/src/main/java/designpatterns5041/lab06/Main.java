package designpatterns5041.lab06;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LedLight light1 = new LedLight(ConsoleColor.ANSI_CYAN);
        LedLight light2 = new LedLight(ConsoleColor.ANSI_RED);
        LedLight light3 = new LedLight(ConsoleColor.ANSI_YELLOW);

        SetCommandFactory factory = new DefaultSetCommandFactory(light1, light2, light3);
        LoggingSwitch invoker = new LoggingSwitch();

        Random random = new Random();
        int timesToRun = random.nextInt(1, 6);
        for(int i = 0; i < timesToRun; i++)
        {
            // Generate random light number (1-3) and intensity (0-100)
            int lightNumber = random.nextInt(1, 4);  // 1 to 3
            int intensity = random.nextInt(101);     // 0 to 100
            
            Command command = factory.createCommand(lightNumber, intensity);
            invoker.executeCommand(command);

            Thread.sleep(random.nextInt(5000));
        }

        // Print out execution history
        System.out.println("\nCommand History:");
        for (Command command : invoker.getCommandHistory()) {
            System.out.println(command);
        }
    }
}