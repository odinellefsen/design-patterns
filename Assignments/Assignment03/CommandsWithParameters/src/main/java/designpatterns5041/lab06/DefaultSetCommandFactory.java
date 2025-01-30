package designpatterns5041.lab06;

public class DefaultSetCommandFactory implements SetCommandFactory {

    private final Unit light1;
    private final Unit light2;
    private final Unit light3;

    public DefaultSetCommandFactory(Unit light1, Unit light2, Unit light3) {
        this.light1 = light1;
        this.light2 = light2;
        this.light3 = light3;
    }

    @Override
    public Command createCommand(int index, int intensity) {
        Unit targetLight = switch (index) {
            case 1 -> light1;
            case 2 -> light2;
            case 3 -> light3;
            default -> throw new IllegalArgumentException("Invalid light number");
        };
        
        return new SetCommand(targetLight, intensity);
    }
}

