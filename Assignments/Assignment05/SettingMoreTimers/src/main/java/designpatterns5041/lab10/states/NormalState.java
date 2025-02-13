package designpatterns5041.lab10.states;

import designpatterns5041.lab10.TimerSetup;

import java.time.format.DateTimeFormatter;

public class NormalState extends TimerSetupStateBase{
    public NormalState(TimerSetup context) {
        super(context);
    }

    @Override
    public Display getDisplay() {
        return new Display(ConsoleColor.ANSI_PURPLE, context.getTimerSet().format(DateTimeFormatter.ofPattern("HH:mm")));
    }

    @Override
    public void onTimerPressed() {
        changeState(new SetHoursState(context));
    }
}
