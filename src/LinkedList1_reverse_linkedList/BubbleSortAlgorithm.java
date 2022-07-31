package LinkedList1_reverse_linkedList;

import java.util.Arrays;

public class BubbleSortAlgorithm {

    public static int[] bubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    //Code to swap the elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
        public static void main (String[]args){
            int[] array = {4,3,2,1};
            System.out.println(Arrays.toString(bubbleSort(array)));
        }
    }
