package strategy.before;

public class MallardDuck extends Duck {

    private static final int LEG_NUMBER = 2;
    private int number;
    private String name;

    public MallardDuck(int no) {
        number = no;
    }

    public MallardDuck(int no, String name) {
        number = no;
        this.name = name;
    }

    @Override
    public String category() {
        return "Mallard Duck, in Chinese 野鸭";
    }

    public int tellMeYourNumber() {
        return number;
    }

    public String tellMeYourName() {
        return name;
    }

}
