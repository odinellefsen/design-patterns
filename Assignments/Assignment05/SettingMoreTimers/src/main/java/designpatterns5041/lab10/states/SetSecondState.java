package designpatterns5041.lab10.states;

import designpatterns5041.lab10.TimerSetup;

public class SetSecondState extends TimerSetupStateBase {

    private final SetSecondPayload payload;
    private int timerSeconds;

    public SetSecondState(TimerSetup context, SetSecondPayload payload) {
        super(context);

        this.payload = payload;
        this.timerSeconds = context.getTimerSet().getSecond();
    }

    @Override
    public void onTimerPressed() {
        changeState(new NormalState(context));
    }

    @Override
    public void onOkPressed() {
        changeState(new CompletedState(context, new CompletedPayload(payload.getTimerHours(), payload.getTimerMinutes(), timerSeconds)));
    }

    @Override
    public Display getDisplay() {
        return new Display(ConsoleColor.ANSI_RED, String.format("%02d:%02d:%02d", payload.getTimerHours(), payload.getTimerMinutes(), timerSeconds));
    }

    @Override
    public void onUpPressed() {
        timerSeconds = (timerSeconds + 1) % 60;
    }

    @Override
    public void onDownPressed() {
        timerSeconds = (timerSeconds - 1 + 60) % 60;
    }
}
