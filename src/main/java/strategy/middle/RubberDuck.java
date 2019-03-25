package strategy.middle;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public String category() {
        return "Rubber duck";
    }

    @Override
    public String quack() {
        return "quack like a rubber duck";
    }
}
