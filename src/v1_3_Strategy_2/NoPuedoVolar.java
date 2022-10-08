package v1_3_Strategy_2;

public class NoPuedoVolar implements Flyable {
    @Override
    public void fly() {
        System.out.println("NO PUEDO VOLAR!");
    }
}
