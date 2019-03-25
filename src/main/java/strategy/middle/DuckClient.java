package strategy.middle;

public class DuckClient {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        System.out.println(((MallardDuck) mallardDuck).quack());

    }
}
