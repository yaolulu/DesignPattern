package strategy.middle;

public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public String category() {
        return "Red head Duck";
    }

    @Override
    public String fly() {
        return "fly with wings";
    }

    @Override
    public String quack() {
        return "quack RED RED RED";
    }
}
