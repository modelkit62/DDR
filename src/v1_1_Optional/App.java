package v1_1_Optional;

import java.util.*;

public class App {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("B");
        list.add("A");


        list.sort((s1, s2) -> s1.compareTo(s2));
        list.forEach(System.out::println);

        Operacion op = ((x, y) -> x + y);
        System.out.println(op.metodo(2, 3));


        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hola");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

    }
}
