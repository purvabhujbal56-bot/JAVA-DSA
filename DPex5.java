//given coins of contains denominator and target value .determine the no. of ways to create target vale using these coins
//ex: coins are 1,5,10 & target value =12, no_ways = 4
//re 1*12 coins ,re 1*7 +rs 5*1,re 1*2 +rs 10*1,

// Example:
// Coins = {1, 5, 10}
// Target = 12
// Output = 4
//
// Ways:
// 1) 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1
// 2) 5 + 1 + 1 + 1 + 1 + 1 + 1 + 1
// 3) 10 + 1 + 1
// 4) 5 + 5 + 1 + 1

import java.util.Scanner;

public class DPex5 {

    // Method to count number of ways
    public static int countWays(int[] coins, int target) {

        int[] dp = new int[target + 1];

        // There is one way to make value 0
        dp[0] = 1;

        // Process each coin
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= target; j++) {
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coin denominations: ");
        int n = sc.nextInt();

        int[] coins = new int[n];

        System.out.println("Enter coin denominations:");
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int ways = countWays(coins, target);

        System.out.println("Number of ways = " + ways);

        sc.close();
    }
}