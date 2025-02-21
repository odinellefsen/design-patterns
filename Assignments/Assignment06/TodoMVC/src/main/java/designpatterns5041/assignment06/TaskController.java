package designpatterns5041.assignment06;

import designpatterns5041.assignment06.models.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskController implements Subject {
    private JsonPlaceholderApi api;
    private List<Task> tasks;
    private List<Observer> observers;

    public TaskController(JsonPlaceholderApi api) {
        this.api = api;
        this.tasks = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void listAllTasks() {
        // Retrieve tasks from the API
        tasks = api.getTasks();
        // Notify observers that tasks have been updated
        notifyObservers();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
