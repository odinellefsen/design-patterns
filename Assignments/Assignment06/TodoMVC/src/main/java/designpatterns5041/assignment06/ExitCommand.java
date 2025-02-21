package designpatterns5041.assignment06;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Exiting application...");
        System.exit(0);
    }
}
