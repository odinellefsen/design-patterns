package designpatterns5041.lab10.states;

import designpatterns5041.lab10.TimerSetup;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CompletedState extends TimerSetupStateBase {
    LocalTime timeSet;

    public CompletedState(TimerSetup context, CompletedPayload payload) {
        super(context);

        timeSet = LocalTime.of(payload.getTimerHours(), payload.getTimerMinutes());
    }

    @Override
    public Display getDisplay() {
        return new Display(ConsoleColor.ANSI_GREEN, timeSet.format(DateTimeFormatter.ofPattern("HH:mm")));
    }

    @Override
    public void onTimerPressed() {
        changeState(new NormalState(context));
    }

    @Override
    public void onOkPressed() {
        context.setTimerSet(timeSet);
        changeState(new NormalState(context));
    }
}
