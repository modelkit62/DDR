package v1_3_Strategy_2;

public class App {


    static Duck myPato = new MyPato();

    public static void main(String[] args) {
        myPato.vuelaHijoPuta();
        myPato.display();
        myPato.setFlyable(new NoPuedoVolar());
        myPato.vuelaHijoPuta();
    }


}
