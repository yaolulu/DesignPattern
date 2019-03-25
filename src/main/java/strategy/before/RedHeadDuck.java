package strategy.before;

public class RedHeadDuck extends Duck {

    @Override
    public String category() {
        return "Red head duck";
    }

    @Override
    public String quack() {
        return "Quack with RED RED RED";
    }
}
