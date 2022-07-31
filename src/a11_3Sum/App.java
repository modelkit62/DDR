package a11_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int target = -nums[i];
            int start = i + 1;
            int end = n - 1;
            while (start < end) {
                int sum = nums[start] + nums[end];
                if (sum < target) {
                    start++;
                } else if (sum > target) {
                    end--;
                } else {
                    List<Integer> a = new ArrayList<Integer>();
                    a.add(nums[i]);
                    a.add(nums[start]);
                    a.add(nums[end]);
                    ans.add(a);
                    while (start < end && nums[start] == nums[start + 1])
                        start++;
                    start++;
                    while (start < end && nums[end] == nums[end - 1])
                        end--;
                    end--;
                }
            }
            while (i < n - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        for(List<Integer> i: lists){
            for(Integer j : i){
                System.out.println(j);
            }
        }
    }
}
