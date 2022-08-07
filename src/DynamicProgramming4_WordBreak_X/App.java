package DynamicProgramming4_WordBreak_X;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static boolean wordBreak(String string, List<String> strings) {
        Set<String> set = new HashSet<>(strings);
        boolean[] dp = new boolean[string.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= string.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(string.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[string.length()];
    }

    public static void main(String[] args) {
        String string = "leetcode";
        List<String> strings = Arrays.asList("leet", "code");
        System.out.println(wordBreak(string, strings));
    }
}
