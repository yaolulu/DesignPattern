package strategy.middle;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public String category() {
        return "Mallard Duck";
    }

    @Override
    public String fly() {
        return "fly with wings";
    }

    @Override
    public String quack() {
        return "quack like a normal duck";
    }
}
