package v1_2_Strategy;

public class MyPato extends Duck {


    public MyPato() {
        flyable = new NoFly();
    }

    @Override
    void display() {
        System.out.println("Soy el pato de goma!");
    }
}
