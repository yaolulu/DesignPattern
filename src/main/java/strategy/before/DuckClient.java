package strategy.before;

public class DuckClient {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck(123);
        Duck mallardDuck2 = new MallardDuck(124, "I HAVE NAME");
        Duck redHeadDuck = new RedHeadDuck();

        describeDuck(mallardDuck);
        describeDuck(redHeadDuck);

    }

    public static void describeDuck(Duck duck) {
        System.out.println(duck.category());
        System.out.println(duck.fly());
        System.out.println(duck.quack());

        System.out.println("------------------");
    }
}
