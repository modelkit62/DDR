package v1_2_Strategy;

public class App {

    public static void main(String[] args) {
        MyPato duck = new MyPato();
        duck.display();
        duck.performFly();
        duck.setFlyable(new FlyWithWings());
        duck.performFly();
    }

}
