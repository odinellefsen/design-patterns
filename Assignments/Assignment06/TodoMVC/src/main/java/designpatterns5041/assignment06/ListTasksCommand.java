package designpatterns5041.assignment06;

public class ListTasksCommand implements Command {
    private TaskController controller;

    public ListTasksCommand(TaskController controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        controller.listAllTasks();
    }
}
