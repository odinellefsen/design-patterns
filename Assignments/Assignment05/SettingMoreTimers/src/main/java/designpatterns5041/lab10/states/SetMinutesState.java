package designpatterns5041.lab10.states;

import designpatterns5041.lab10.TimerSetup;

public class SetMinutesState extends TimerSetupStateBase {

    private final SetMinutesPayload payload;
    private int timerMinutes;

    public SetMinutesState(TimerSetup context, SetMinutesPayload payload) {
        super(context);

        this.payload = payload;
        this.timerMinutes = context.getTimerSet().getMinute();
    }

    @Override
    public void onTimerPressed() {
        changeState(new NormalState(context));
    }

    @Override
    public void onOkPressed() {
        changeState(new SetSecondState(context, new SetSecondPayload(payload.getTimerHours(), timerMinutes)));
    }

    @Override
    public Display getDisplay() {
        String currentSeconds = String.format("%02d", context.getTimerSet().getSecond());
        return new Display(ConsoleColor.ANSI_RED, 
            String.format("%02d:%02d:%s", payload.getTimerHours(), timerMinutes, currentSeconds));
    }

    @Override
    public void onUpPressed() {
        timerMinutes = (timerMinutes + 1) % 60;
        if (timerMinutes == 0) {  // Rolled over
            int newHours = (payload.getTimerHours() + 1) % 24;
            changeState(new SetMinutesState(context, new SetMinutesPayload(newHours)));
        }
    }

    @Override
    public void onDownPressed() {
        timerMinutes = (timerMinutes - 1 + 60) % 60;
        if (timerMinutes == 59) {  // Rolled under
            int newHours = (payload.getTimerHours() - 1 + 24) % 24;
            changeState(new SetMinutesState(context, new SetMinutesPayload(newHours)));
        }
    }
}
