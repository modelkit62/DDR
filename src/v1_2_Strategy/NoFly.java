package v1_2_Strategy;

public class NoFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
