package designpatterns5041.lab10.states;

import designpatterns5041.lab10.TimerSetup;

public class SetHoursState extends TimerSetupStateBase{

    private int timerHours;

    public SetHoursState(TimerSetup context) {
        super(context);

        timerHours = context.getTimerSet().getHour();
    }

    @Override
    public Display getDisplay() {
        String currentMinutes = String.format("%02d", context.getTimerSet().getMinute());
        String currentSeconds = String.format("%02d", context.getTimerSet().getSecond());
        return new Display(ConsoleColor.ANSI_RED, 
            String.format("%02d:%s:%s", timerHours, currentMinutes, currentSeconds));
    }

    @Override
    public void onTimerPressed() {
        changeState(new NormalState(context));
    }

    @Override
    public void onOkPressed() {
        changeState(new SetMinutesState(context, new SetMinutesPayload(timerHours)));
    }

    @Override
    public void onUpPressed() {
        timerHours = (timerHours + 1) % 24;
    }

    @Override
    public void onDownPressed() {
        timerHours = (timerHours - 1 + 24) % 24;
    }
}
