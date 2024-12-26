import java.util.*;

public class MaxSumNonAdjEle {
    public static int solve(int arr[], int ind, int[] dp) {
        if (ind >= arr.length) {
            return 0;
        }

        if (dp[ind] != -1)
            return dp[ind];

        int ans1 = solve(arr, ind + 1, dp);
        int ans2 = arr[ind] + solve(arr, ind + 2, dp);

        int finalans = Math.max(ans1, ans2);
        dp[ind] = finalans;
        return dp[ind];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 9, 9, 8, 2 };  // You can take user input for given array too.
        int dp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            dp[i] = -1;
        }

        System.out.println(solve(arr, 0, dp));
    }
}
