package a7_MaximumSubarray_X;

public class App {

    public static int maxSubArray(int[] nums) {
        int cur = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            max = Math.max(cur, max);
            if (cur < 0) {
                cur = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public int maxSubArray_2(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
/*
algorithm that operates on arrays: it starts at the left end (element A[1])
        and scans through to the right end (element A[n]), keeping track of
        the maximum sum subvector seen so far. The maximum is initially A[0].
        Suppose we've solved the problem for A[1 .. i - 1]; how can we extend
        that to A[1 .. i]? The maximum sum in the first I elements is either the
        maximum sum in the first i - 1 elements (which we'll call MaxSoFar),
        or it is that of a subvector that ends in position i (which we'll call MaxEndingHere).*/
