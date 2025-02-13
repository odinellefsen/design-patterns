package designpatterns5041.lab10.states;

public class SetMinutesPayload {

    private final int timerHours;

    public SetMinutesPayload(int timerHours) {
        this.timerHours = timerHours;
    }

    public int getTimerHours() {
        return timerHours;
    }
}
