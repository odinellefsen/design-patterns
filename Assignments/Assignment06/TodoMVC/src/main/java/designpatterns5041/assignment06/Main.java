package designpatterns5041.assignment06;

public class Main {
    public static void main(String[] args) {
        JsonPlaceholderApi jsonPlaceholderApi = new JsonPlaceholderApi();
        TaskController controller = new TaskController(jsonPlaceholderApi);
        TaskView view = new TaskView(controller);
        view.start();
    }
}
