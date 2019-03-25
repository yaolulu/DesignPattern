package strategy.before;

public abstract class Duck {

    public abstract String category();

    public String fly() {
        return "fly with wings";
    }

    public String quack() {
        return "quack like a normal duck";
    }

}
