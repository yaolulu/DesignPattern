package strategy.before;

public class DecoyDuck extends Duck {
    @Override
    public String category() {
        return "Decoy";
    }

    @Override
    public String fly() {
        return "Cannot fly";
    }

    @Override
    public String quack() {
        return "Cannot quack";
    }
}
