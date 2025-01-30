package designpatterns5041.lab06;

public class SetCommand implements Command {
    private Unit unit;
    private int intensity;

    public SetCommand(Unit unit, int intensity) {
        this.unit = unit;
        this.intensity = intensity;
    }

    @Override
    public void execute() {
        unit.setIntensity(intensity);
    }

    @Override
    public String toString() {
        return String.format("Set %s to intensity %d%%", unit, intensity);
    }
}
