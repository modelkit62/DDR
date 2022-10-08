package v1_2_Strategy;

public abstract class Duck {

    Flyable flyable;

    public Duck() {
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    abstract void display();

    public void performFly() {
        flyable.fly();
    }

}
