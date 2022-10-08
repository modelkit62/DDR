package v1_3_Strategy_2;

public abstract class Duck {

    Flyable flyable;

    public void vuelaHijoPuta(){
        flyable.fly();
    }
    abstract void display();

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
}
