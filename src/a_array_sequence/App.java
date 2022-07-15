package a_array_sequence;

import java.util.Arrays;
import java.util.List;

public class App {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int index = 0;
        for (int arr : array) {
            if (arr == sequence.get(index)) {
                ++index;
            }
            if (index == sequence.size()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4);
        List<Integer> sequence = Arrays.asList(3, 4, 7);
        System.out.println(isValidSubsequence(array, sequence));
    }
}
