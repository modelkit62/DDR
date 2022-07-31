package binary3_CountingBits;

import java.util.Arrays;

public class App {

    public static int[] countBits(int n) {

        int[] ans = new int[n+1];
        ans[0] = 0;

        for(int i = 1; i <= n;++i) {
            ans[i] = ans[i/2] + i % 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(7)));
    }
}
