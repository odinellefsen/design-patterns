package designpatterns5041.lab06;

import java.util.ArrayList;
import java.util.List;

public class LoggingSwitch {
    private final List<Command> commandHistory;
    
    public LoggingSwitch() {
        this.commandHistory = new ArrayList<>();
    }
    
    public void executeCommand(Command command) {
        commandHistory.add(command);  
        command.execute();
    }
    
    // Method to view command history
    public List<Command> getCommandHistory() {
        return new ArrayList<>(commandHistory);
    }
}
