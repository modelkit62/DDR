package DynamicProgramming3_LongestIncreasingSubsequence_X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static int lengthOfLIS(int[] array) {

        List<Integer> list = new ArrayList<>();

        for (int number : array) {
            if (list.size() == 0 || list.get(list.size() - 1) < number) {
                list.add(number);
            } else {
                int index = Collections.binarySearch(list, number);
                if (index < 0) list.set(Math.abs(index) - 1, number);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        int[] array = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(array));
    }
}
