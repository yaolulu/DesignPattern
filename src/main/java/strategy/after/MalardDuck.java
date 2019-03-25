package strategy.after;

public class MalardDuck extends Duck {
    public MalardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("l'm a real Mallard duck");
    }
}
