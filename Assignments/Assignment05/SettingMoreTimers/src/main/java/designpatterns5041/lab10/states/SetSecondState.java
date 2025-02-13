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
        if (timerSeconds == 0) {  // Rolled over
            int newMinutes = (payload.getTimerMinutes() + 1) % 60;
            int newHours = payload.getTimerHours();
            if (newMinutes == 0) {  // Minutes rolled over
                newHours = (newHours + 1) % 24;
            }
            changeState(new SetSecondState(context, new SetSecondPayload(newHours, newMinutes)));
        }
    }

    @Override
    public void onDownPressed() {
        timerSeconds = (timerSeconds - 1 + 60) % 60;
        if (timerSeconds == 59) {  // Rolled under
            int newMinutes = (payload.getTimerMinutes() - 1 + 60) % 60;
            int newHours = payload.getTimerHours();
            if (newMinutes == 59) {  // Minutes rolled under
                newHours = (newHours - 1 + 24) % 24;
            }
            changeState(new SetSecondState(context, new SetSecondPayload(newHours, newMinutes)));
        }
    }
}
