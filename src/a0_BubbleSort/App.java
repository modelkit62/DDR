package a0_BubbleSort;

import java.util.Arrays;

public class App {

    private static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 18, 45, 32, 42, 17};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
