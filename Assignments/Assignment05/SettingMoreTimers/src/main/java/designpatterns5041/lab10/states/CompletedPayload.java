package designpatterns5041.lab10.states;

public class CompletedPayload {
    private final int timerHours;
    private final int timerMinutes;
    private final int timerSeconds;

    public CompletedPayload(int timerHours, int timerMinutes, int timerSeconds) {
        this.timerHours = timerHours;
        this.timerMinutes = timerMinutes;
        this.timerSeconds = timerSeconds;
    }

    public int getTimerHours() {
        return timerHours;
    }

    public int getTimerMinutes() {
        return timerMinutes;
    }

    public int getTimerSeconds() {
        return timerSeconds;
    }
}
