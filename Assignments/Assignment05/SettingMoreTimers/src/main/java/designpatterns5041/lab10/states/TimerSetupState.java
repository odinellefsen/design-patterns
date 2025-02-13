package designpatterns5041.lab10.states;

public interface TimerSetupState {
    public Display getDisplay();
    public void onTimerPressed();
    public void onOkPressed();
    public void onUpPressed();
    public void onDownPressed();
}
