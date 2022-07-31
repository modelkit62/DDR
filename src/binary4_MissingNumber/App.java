package binary4_MissingNumber;

import java.util.HashSet;

public class App {

    public static int missingNumber(int[] nums) {

        /*HashSet hashSet = new HashSet();
        for (int i : nums) {
            hashSet.add(i);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (hashSet.add(i)) {
                return i;
            }
        }
        return -1;*/

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length + 1;
        return (n * (n-1) / 2) - sum;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 3};
        System.out.println(missingNumber(array));
    }
}
