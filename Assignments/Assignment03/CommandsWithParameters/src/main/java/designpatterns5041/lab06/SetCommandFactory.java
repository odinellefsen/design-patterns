package designpatterns5041.lab06;

public interface SetCommandFactory {
    Command createCommand(int index, int intensityPercentage);
}
