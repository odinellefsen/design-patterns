package designpatterns5041.assignment06;

import designpatterns5041.assignment06.models.Task;
import java.util.List;
import java.util.Scanner;

public class TaskView implements Observer {
    private TaskController controller;
    private Scanner scanner;

    public TaskView(TaskController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
        // Register this view as an observer of the controller
        this.controller.attach(this);
    }

    public void start() {
        while (true) {
            printMenu();
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            Command command = null;
            switch (choice) {
                case "1":
                    command = new ListTasksCommand(controller);
                    break;
                case "0":
                    command = new ExitCommand();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            command.execute();
        }
    }

    private void printMenu() {
        System.out.println("Task Management System");
        System.out.println("1. List all tasks");
        System.out.println("0. Exit");
    }

    @Override
    public void update() {
        // Called when the controller notifies that tasks have been loaded
        List<Task> tasks = controller.getTasks();
        printTasks(tasks);
    }

    private void printTasks(List<Task> tasks) {
        // Print table header
        System.out.println("+------+--------+----------------------------------------------------+------------+");
        System.out.println("| ID   | UserId | Title                                              | Completed  |");
        System.out.println("+------+--------+----------------------------------------------------+------------+");
        for (Task task : tasks) {
            String title = task.getTitle();
            // Truncate long titles for table display
            if (title.length() > 50) {
                title = title.substring(0, 47) + "...";
            }
            System.out.printf("| %-4d | %-6d | %-50s | %-10s |\n", task.getId(), task.getUserId(), title, task.isCompleted());
        }
        System.out.println("+------+--------+----------------------------------------------------+------------+");
    }
}
