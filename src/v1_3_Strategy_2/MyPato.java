package v1_3_Strategy_2;

public class MyPato extends Duck {

    public MyPato() {
        flyable = new PuedoVolar();
    }

    @Override
    void display() {
        System.out.println("Soy el pato amarillo");
    }
}
