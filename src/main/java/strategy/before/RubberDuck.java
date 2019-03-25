package strategy.before;

public class RubberDuck extends Duck {
    @Override
    public String category() {
        return "Rubber duck";
    }

    @Override
    public String quack() {
        return "Quack like a rubber duck";
    }

    @Override
    public String fly() {
        return "Cannot fly";
    }
}
