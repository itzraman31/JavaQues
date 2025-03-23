import java.util.*;

public class ReducingDishes {
    public static int solve1(int arr[], int ind, int time, int dp[][]) {
        if (ind >= arr.length)
            return 0;
        if (dp[ind][time] != -1)
            return dp[ind][time];

        int inc = solve1(arr, ind + 1, time + 1, dp) + ((time + 1) * arr[ind]);
        int exc = solve1(arr, ind + 1, time, dp);

        return dp[ind][time] = Math.max(inc, exc);
    }

    public static int solve2(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n + 1][n + 1];

        for (int ind = n - 1; ind >= 0; ind--) {
            for (int time = ind; time >= 0; time--) {
                int inc = dp[ind + 1][time + 1] + ((time+1) * arr[ind]);
                int exc = dp[ind + 1][time];

                dp[ind][time] = Math.max(inc, exc);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        // int arr[]={-1,-8,0,5,-9};
        int arr[] = { 4, 3, 2 };
        int dp[][] = new int[arr.length + 1][arr.length + 1];
        for (int i = 0; i <= arr.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        Arrays.sort(arr);

        // System.out.println("Max Satisfication like is: "+solve1(arr,0,0,dp));
        System.out.println(solve2(arr));
    }
}
