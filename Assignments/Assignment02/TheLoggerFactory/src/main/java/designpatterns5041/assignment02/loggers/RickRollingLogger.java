package designpatterns5041.assignment02.loggers;

import java.util.Random;

public class RickRollingLogger implements Logger {
    private final String[] CHORUS_LINES = {
        "Never gonna give you up",
        "Never gonna let you down",
        "Never gonna run around and desert you",
        "Never gonna make you cry",
        "Never gonna say goodbye",
        "Never gonna tell a lie and hurt you"
    };
    
    private final Random random = new Random();
    
    @Override
    public void log(String message) {
        int randomIndex = random.nextInt(CHORUS_LINES.length);
        System.out.println(CHORUS_LINES[randomIndex]);
    }
} 