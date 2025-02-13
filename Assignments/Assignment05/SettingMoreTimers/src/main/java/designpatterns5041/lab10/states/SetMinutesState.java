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
        return new Display(ConsoleColor.ANSI_RED, String.format("%02d:%02d", payload.getTimerHours(), timerMinutes));
    }

    @Override
    public void onUpPressed() {
        timerMinutes = (timerMinutes + 1) % 60;
    }

    @Override
    public void onDownPressed() {
        timerMinutes = (timerMinutes - 1 + 60) % 60;
    }
}
