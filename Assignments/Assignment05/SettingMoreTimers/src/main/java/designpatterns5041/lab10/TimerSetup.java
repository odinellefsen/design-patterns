package designpatterns5041.lab10;

import designpatterns5041.lab10.states.ConsoleColor;
import designpatterns5041.lab10.states.Display;
import designpatterns5041.lab10.states.NormalState;
import designpatterns5041.lab10.states.TimerSetupState;

import java.time.LocalTime;

public class TimerSetup {
    private TimerSetupState state;

    private LocalTime timerSet;

    public TimerSetup() {
        timerSet = LocalTime.now();
        state = new NormalState(this);
    }

    public TimerSetupState getState() {
        return state;
    }

    public void setState(TimerSetupState state) {
        this.state = state;
    }

    public LocalTime getTimerSet() {
        return timerSet;
    }

    public void setTimerSet(LocalTime timerSet) {
        this.timerSet = timerSet;
    }

    public void showDisplay() {
        Display display = state.getDisplay();
        System.out.println(display.getColor() + " " + display.getText() + ConsoleColor.ANSI_RESET);
    }

    public void onTimerPressed() {
        state.onTimerPressed();
    }

    public void onOkPressed() {
        state.onOkPressed();
    }

    public void onUpPressed() {
        state.onUpPressed();
    }

    public void onDownPressed() {
        state.onDownPressed();
    }

}
