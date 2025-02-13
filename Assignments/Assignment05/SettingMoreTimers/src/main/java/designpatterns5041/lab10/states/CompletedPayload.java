package designpatterns5041.lab10.states;

public class CompletedPayload {
    private final int timerHours;
    private final int timerMinutes;

    public CompletedPayload(int timerHours, int timerMinutes) {
        this.timerHours = timerHours;
        this.timerMinutes = timerMinutes;
    }

    public int getTimerHours() {
        return timerHours;
    }

    public int getTimerMinutes() {
        return timerMinutes;
    }
}
