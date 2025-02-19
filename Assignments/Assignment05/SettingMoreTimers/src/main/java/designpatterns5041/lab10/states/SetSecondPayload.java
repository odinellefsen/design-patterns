package designpatterns5041.lab10.states;

public class SetSecondPayload {

    private final int timerHours;
    private final int timerMinutes;

    public SetSecondPayload(int timerHours, int timerMinutes) {
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
