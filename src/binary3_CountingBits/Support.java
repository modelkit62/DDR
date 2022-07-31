package binary3_CountingBits;

import java.util.Arrays;

public class Support {
    public static int[] method(int number){
        int[] array = new int[number+1];
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i/2] + i % 2;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(method(7)));
    }
}
