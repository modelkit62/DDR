package DynamicProgramming2_CoinChange;

public class App {

    public static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5};
        System.out.println(coinChange(array, 7));
    }
}
