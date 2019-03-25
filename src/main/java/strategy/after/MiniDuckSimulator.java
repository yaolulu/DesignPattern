package strategy.after;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MalardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
