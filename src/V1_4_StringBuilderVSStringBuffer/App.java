package V1_4_StringBuilderVSStringBuffer;


import java.util.Arrays;
import java.util.List;

public class App {


    public static void main(String[] args) {
        /*int number = 77777777;

        StringBuffer sb2 = new StringBuffer();
        long l2 = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            sb2.append("");
        }
        System.out.println(System.currentTimeMillis() - l2);
        StringBuilder sb1 = new StringBuilder();
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            sb1.append("");
        }
        System.out.println(System.currentTimeMillis() - l1);
*/

        List<Integer> integers = List.of(1, 2, 3);
        for(Integer i : integers){
            System.out.print(i);
        }
        System.out.println("");
        integers.forEach(System.out::print);
        System.out.println("");
        integers.forEach(i -> System.out.print(i));
        System.out.println("");

    }

}
