package a3_two_sum;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static int[] twoSum(int[] nums, int target) {

        // ojo con esta solucion chachi que no requere devolver nada!!!
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");*/


        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int requiredNum = target - nums[i];
            if (indexMap.containsKey(requiredNum)) {
                return new int[]{indexMap.get(requiredNum), i};
            }
            indexMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 1, 8};
        int target = 6;
        int[] array = twoSum(nums, target);
        for (int i : array) {
            System.out.println(i);
        }

    }
}
