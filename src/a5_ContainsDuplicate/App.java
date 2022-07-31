package a5_ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> box = new HashSet<>();

        for(int i = 0; i < nums.length ;  i++){
            if(!box.add(nums[i])){
                return true;
            }
        }
        return false;
    }

    /*public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }*/

    public boolean containsDuplicate3(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for(int n : nums){
            if(!numsSet.add(n)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

}
