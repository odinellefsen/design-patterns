package designpatterns5041.assignment06.models;

public class Task {
    private int id;
    private int userId;
    private String title;
    private boolean completed;

    public Task() {
    }

    public Task(int id, int userId, String title, boolean completed) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{id=" + id +  ", userId='" + userId + '\'' +  ", title='" + title + '\'' +  ", completed=" + completed + '}';
    }
}
