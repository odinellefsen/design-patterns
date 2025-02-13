package designpatterns5041.lab10.states;

import designpatterns5041.lab10.TimerSetup;

public abstract class TimerSetupStateBase implements TimerSetupState {

    protected final TimerSetup context;

    public TimerSetupStateBase(TimerSetup context) {
        this.context = context;
    }

    @Override
    public abstract Display getDisplay();

    @Override
    public void onTimerPressed() { }

    @Override
    public void onOkPressed() { }

    @Override
    public void onUpPressed() { }

    @Override
    public void onDownPressed() { }

    protected void changeState(TimerSetupState state) {
        context.setState(state);
    }
}
