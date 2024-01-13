package a1_array_sequence;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class GameOfLife {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int index = 0;
        for (int arr : array) {
            if (arr == sequence.get(index)) {
                index++;
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

    @Test
    public void testApp(){
        List<Integer> array = Arrays.asList(1, 2, 3, 4);
        List<Integer> sequence = Arrays.asList(3, 4);
        assertTrue(isValidSubsequence(array, sequence));
    }
}
