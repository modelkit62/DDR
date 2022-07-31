package LinkedList1_reverse_linkedList;

import java.util.Arrays;

public class ArrayReverse {

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
    public static void main (String[]args){
        int[] array = {4,3,2,1};
        System.out.println(Arrays.toString(reverse(array)));
    }
}
