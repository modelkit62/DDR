package a0_arraySum;

public class App {
    public static void sum(int[] array){
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            c += array[i];
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        sum(array);
    }
}
